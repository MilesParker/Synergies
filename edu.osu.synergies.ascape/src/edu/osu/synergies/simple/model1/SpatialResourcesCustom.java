package edu.osu.synergies.simple.model1;

import java.awt.Color;
import java.awt.Graphics;

import org.ascape.model.Agent;
import org.ascape.util.data.UnitIntervalDataPoint;
import org.ascape.util.vis.ColorFeatureGradiated;
import org.ascape.util.vis.ColorFeatureGradiatedIndex;
import org.ascape.view.vis.Overhead2DView;

public class SpatialResourcesCustom extends SimpleResources {
	private ColorFeatureGradiated colorForInterest;

	
	public void createScape() {
		setLearnerCount(200);
		super.createScape();
	};
	
	@Override
	public void createGraphicViews() {
		{
			org.ascape.view.vis.Overhead2DView districtView = new org.ascape.view.vis.Overhead2DView();
			districtView.setAgentSize(3);
			getDistrict().addView(districtView);
			districtView.setDrawNetwork(true);
			org.ascape.util.vis.DrawFeature learningResourceStyle2D = new edu.osu.synergies.simple.model1.LearningResourceStyle2D();
			learningResourceStyle2D.setName("Learning Resource Style 2D");
			getDistrict().addDrawFeature(learningResourceStyle2D);
			org.ascape.util.vis.DrawFeature learnerStyle2D = new edu.osu.synergies.simple.model1.LearnerStyle2D();
			learnerStyle2D.setName("Learner Style 2D");
			getDistrict().addDrawFeature(learnerStyle2D);
			districtView.getDrawSelection().setSelected(
					learningResourceStyle2D, true);
			districtView.getDrawSelection().setSelected(learnerStyle2D, true);
			districtView.getDrawSelection().setSelected(
					districtView.agents_oval_cells_draw_feature, false);
			districtView.getDrawSelection().setSelected(
					districtView.cells_fill_draw_feature, true);
			districtView.getDrawSelection().moveToFront(
					districtView.cells_fill_draw_feature);
		}
		
		colorForInterest = new ColorFeatureGradiatedIndex(
				"Avg Output");
		colorForInterest.setDataPoint(new UnitIntervalDataPoint() {
			/**
             * 
             */
			private static final long serialVersionUID = -6033261844239803432L;

			public double getValue(Object object) {
				Learner learner = (Learner) object;
				double interest = learner.getLearningInterest();
				if (interest > 1.0) {
					return 1.0;
				}
				return interest;
			}
		});
		colorForInterest.setMaximumColor(Color.GREEN);
		colorForInterest.setMinimumColor(Color.RED);

		FixedStretchyView learnerView = new FixedStretchyView(name,
				200, getLearnerScape().size()) {
			public void update(Graphics graphics) {
				graphics.setColor(Color.WHITE);
				super.update(graphics);
			}

			@Override
			protected int getAgentHeight(Agent agent) {
				Learner learner = (Learner) agent;
				return learner.getResourceEngagements();
			}
		};
		learnerView.setCellColorFeature(colorForInterest);
		learnerView.setRemoveGaps(false);
		learnerView.setCellSize(4);

		getLearnerScape().addView(learnerView);
	}
}
