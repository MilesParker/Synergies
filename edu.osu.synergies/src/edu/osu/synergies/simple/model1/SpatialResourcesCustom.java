package edu.osu.synergies.simple.model1;

import org.ascape.model.Agent;
import org.ascape.model.Scape;
import org.ascape.util.data.UnitIntervalDataPoint;
import org.ascape.util.vis.ColorFeature;
import org.ascape.util.vis.ColorFeatureConcrete;
import org.ascape.util.vis.ColorFeatureGradiated;
import org.ascape.util.vis.ColorFeatureGradiatedIndex;
import org.ascape.view.vis.GEFView;
import org.eclipse.amp.agf.IGraphicsAdapted;
import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Color;

public class SpatialResourcesCustom extends SimpleResources implements
IGraphicsAdapted {

	static ColorFeature SIMPLE = new ColorFeatureConcrete("Simple") {
		@Override
		public Color getColor(Object object) {
			return LearnerCustomColorProvider.getDefault().getBackground(object);
		}
	};
	
	public void createScape() {
		setLearnerCount(200);
		super.createScape();
	};
	
	@Override
	public void createGraphicViews() {
		createChartViews();

		GEFView view = new GEFView();
		
		FixedStretchyView learnerView = new FixedStretchyView(name,
				200, getLearnerScape().size()) {
			public void updateScapeGraphics(Graphics graphics) {
				graphics.setBackgroundColor(ColorFeature.WHITE);
				super.updateScapeGraphics(graphics);
			}

			@Override
			protected int getAgentHeight(Agent agent) {
				Learner learner = (Learner) agent;
				return learner.getResourceEngagements();
			}
		};
		learnerView.setCellColorFeature(SIMPLE);
		learnerView.setRemoveGaps(false);
		learnerView.setCellSize(4);
		
		addView(view);

		getLearnerScape().addView(learnerView);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGraphicsAdapter getGraphicsAdapter() {
		return SpatialResourcesGraphicsAdapter.getDefault();
	}
}
