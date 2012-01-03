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

public class SpatialResourcesSweepRandom extends SpatialResources {
	public void createViews() {

		setResourceDistribution(ResourceDistributionEnum.random);

		try {
			DataOutputView output = new DataOutputView(
					new File(
							"/Users/milesparker/git/Synergies/edu.osu.synergies/output/ResourceEfficacyRandom.txt"));
			addView(output);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		SweepControlView sv = new SweepControlView();
		SweepGroup sweep = sv.getSweepGroup();
		
		SweepLink exposurePeriod = new SweepLink();
		exposurePeriod.addMember(new SweepDimension(this,
				"ResourceEfficacyMinimum", .02, .02, .01));
		exposurePeriod.addMember(new SweepDimension(this,
				"ResourceEfficacyMaximum", .09, .09, .01));
		sweep.addMember(exposurePeriod);

		sweep.setRunsPer(35);
		try {
			setStopPeriod(5000);
		} catch (SpatialTemporalException e) {
			e.printStackTrace();
		}
		addView(sv);
	}
}
