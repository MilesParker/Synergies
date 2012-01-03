package edu.osu.synergies.spatial;

import java.io.File;
import java.io.IOException;

import org.ascape.model.space.SpatialTemporalException;
import org.ascape.util.sweep.SweepDimension;
import org.ascape.util.sweep.SweepGroup;
import org.ascape.util.sweep.SweepLink;
import org.ascape.view.nonvis.DataOutputView;
import org.ascape.view.nonvis.SweepControlView;
import org.eclipse.amp.agf.IGraphicsAdapted;

public class SpatialResourcesPlacementSweep extends SpatialResources {
	public void createViews() {

		try {
			DataOutputView output = new DataOutputView(
					new File(
							"/Users/milesparker/git/Synergies/edu.osu.synergies/output/BiasedSweep.txt"));
			output.setPeriodFile(new File(
					"/Users/milesparker/git/Synergies/edu.osu.synergies/output/BiasedSweepPeriod.txt"));
			addView(output);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		SweepControlView sv = new SweepControlView();
		SweepGroup sweep = sv.getSweepGroup();

		SweepLink exposurePeriod = new SweepLink();
		exposurePeriod.addMember(new SweepDimension(this, "BiasedRegionX", 0.25,
				1.0, .25));
		exposurePeriod.addMember(new SweepDimension(this, "BiasedRegionY", 0.25,
				1.0, .25));
		sweep.addMember(exposurePeriod);

		sweep.setRunsPer(5);
		try {
			setStopPeriod(3000);
		} catch (SpatialTemporalException e) {
			e.printStackTrace();
		}
		addView(sv);
	}
}
