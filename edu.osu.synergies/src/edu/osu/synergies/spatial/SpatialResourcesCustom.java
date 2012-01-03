package edu.osu.synergies.spatial;

import org.ascape.model.Agent;
import org.ascape.model.space.SpatialTemporalException;
import org.ascape.util.vis.ColorFeature;
import org.ascape.util.vis.ColorFeatureConcrete;
import org.ascape.view.vis.ChartView;
import org.ascape.view.vis.GEFView;
import org.eclipse.amp.agf.IGraphicsAdapted;
import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.time.ITimeGranularity;
import org.eclipse.amp.axf.time.TimeGranularity;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Color;

public class SpatialResourcesCustom extends SpatialResources implements
IGraphicsAdapted {

	static ColorFeature SIMPLE = new ColorFeatureConcrete("Simple") {
		@Override
		public Color getColor(Object object) {
			return LearnerCustomColorProvider.getDefault().getBackground(object);
		}
	};
	
	public void createScape() {
		setLearnerCount(200);
		try {
			setStopPeriod(3000);
		} catch (SpatialTemporalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.createScape();
	};
	
	@Override
	public void createGraphicViews() {
//		((IEngine) getRunner()).setUpdateGranularity(TimeGranularity.createFrequencyGranularity(1000));
		ChartView chart = new ChartView();
		//chart.addSeries("Count Learner Not Interested Behavior", ColorFeature.RED);
		chart.addSeries("Count Learner Seeking Resource Behavior", ColorFeature.GREEN);
		chart.addSeries("Count Learner Found Resource Behavior", ColorFeature.BLACK);
		chart.addSeries("Sum Learner Learning Interest", ColorFeature.BLUE);

		addView(chart);

		GEFView view = new GEFView();
		
		addView(view);
		
//		FixedStretchyView learnerView = new FixedStretchyView(name,
//				200, getLearnerScape().size()) {
//			public void updateScapeGraphics(Graphics graphics) {
//				graphics.setBackgroundColor(ColorFeature.WHITE);
//				super.updateScapeGraphics(graphics);
//			}
//
//			@Override
//			protected int getAgentHeight(Agent agent) {
//				Learner learner = (Learner) agent;
//				return learner.getResourceEngagements();
//			}
//		};
//		learnerView.setCellColorFeature(SIMPLE);
//		learnerView.setRemoveGaps(false);
//		learnerView.setCellSize(4);
//
//		getLearnerScape().addView(learnerView);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGraphicsAdapter getGraphicsAdapter() {
		return SpatialResourcesCustomGraphicsAdapter.getDefault();
	}
}
