package edu.osu.synergies.spatial;

import org.ascape.model.Agent;
import org.ascape.util.vis.ColorFeature;
import org.ascape.util.vis.ColorFeatureConcrete;
import org.ascape.view.vis.ChartView;
import org.ascape.view.vis.GEFView;
import org.eclipse.amp.agf.IGraphicsAdapted;
import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Color;

public class SpatialResourcesDemoRegular extends SpatialResourcesCustom{

	public void createScape() {
		setLearnerCount(200);
		setResourceDistribution(ResourceDistributionEnum.regular);
		setName("Regular Resources");
		super.createScape();
	};
}
