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

public class SpatialResourcesEfficacySweep extends SpatialResources {
	public void createViews() {

		setBiasedRegionY(1.0);
		
		try {
			DataOutputView output = new DataOutputView(
					new File(
							"/Users/milesparker/git/Synergies/edu.osu.synergies/output/ResourceEfficacySweepClumpedChange.txt"));
			addView(output);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		SweepControlView sv = new SweepControlView();
		SweepGroup sweep = sv.getSweepGroup();

		SweepLink exposurePeriod = new SweepLink();
		exposurePeriod.addMember(new SweepDimension(this, "BiasedRegionX", 0.10,
				0.6, .20));
		sweep.addMember(exposurePeriod);
		
		sweep.setRunsPer(21);
		try {
			setStopPeriod(5000);
		} catch (SpatialTemporalException e) {
			e.printStackTrace();
		}
		addView(sv);
	}
}
