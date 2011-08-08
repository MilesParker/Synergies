package edu.osu.synergies.simple.model1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import org.ascape.model.Agent;
import org.ascape.model.HostCell;
import org.ascape.util.data.UnitIntervalDataPoint;
import org.ascape.util.vis.ColorFeatureGradiated;
import org.ascape.util.vis.ColorFeatureGradiatedIndex;
import org.ascape.util.vis.DrawFeature;
import org.ascape.view.vis.ChartView;

import com.jrefinery.chart.Legend;


public class SpatialResourcesCustom extends SpatialResources {
	
	public static UnitIntervalDataPoint dataPoint = new LearnerInterestDataPoint();
	
	public static ColorFeatureGradiated colorForInterest  = new ColorFeatureGradiatedIndex("Interest Color", Color.GREEN, Color.RED, dataPoint);
	
	public void createScape() {
		setIterationsPerRedraw(48);

		setLearnerCount(200);
		setDistrictWidth(120);
		setDistrictHeight(40);
		super.createScape();
	};
	
	class LearnerInterestDrawFeature extends DrawFeature {

		/**
		 * <!-- begin-user-doc -->
		 * 
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void draw(Graphics g, Object object, int width, int height) {
			Shape shape = null;
			HostCell actionsCell = (HostCell) object;
			if (actionsCell.getOccupant() instanceof Learner) {
				Learner actions = (Learner) actionsCell.getOccupant();
				g.setColor(colorForInterest.getColor(actions));
				shape = new Ellipse2D.Double(0, 0, width - 2, height - 2);
				((Graphics2D) g).fill(shape);
			}
		}
	}
	@Override
	public void createGraphicViews() {

		org.ascape.view.vis.Overhead2DView districtView = new org.ascape.view.vis.Overhead2DView();
		districtView.setAgentSize(3);
		getDistrict().addView(districtView);
		districtView.setDrawNetwork(true);

//		org.ascape.util.vis.DrawFeature lotStyle2D = new edu.osu.synergies.simple.model1.LotStyle2D();
//		lotStyle2D.setName("Lot Style 2D");
//		getDistrict().addDrawFeature(lotStyle2D);
		org.ascape.util.vis.DrawFeature learningResourceStyle2D = new edu.osu.synergies.simple.model1.LearningResourceStyle2D();
		learningResourceStyle2D.setName("Learning Resource Style 2D");
		getDistrict().addDrawFeature(learningResourceStyle2D);
		org.ascape.util.vis.DrawFeature homeStyle2D = new edu.osu.synergies.simple.model1.HomeStyle2D();
		homeStyle2D.setName("House Style 2D");
		getDistrict().addDrawFeature(homeStyle2D);

		
		org.ascape.util.vis.DrawFeature learnerStyle2D = new LearnerInterestDrawFeature();
		learnerStyle2D.setName("Learner Style 2D");
		getDistrict().addDrawFeature(learnerStyle2D);
		districtView.getDrawSelection().setSelected(learningResourceStyle2D,
				true);
		districtView.getDrawSelection().setSelected(homeStyle2D,
				true);
		districtView.getDrawSelection().setSelected(learnerStyle2D, true);
//		districtView.getDrawSelection().setSelected(lotStyle2D, true);
		districtView.getDrawSelection().setSelected(
				districtView.agents_oval_cells_draw_feature, false);
		districtView.getDrawSelection().setSelected(
				districtView.cells_fill_draw_feature, false);
		districtView.getDrawSelection().moveToFront(
				districtView.cells_fill_draw_feature);
		districtView.setAgentSize(6);

		FixedStretchyView learnerView = new FixedStretchyView(name, 100,
				getLearnerScape().size()) {
			public void update(Graphics graphics) {
				graphics.setColor(Color.WHITE);
				super.update(graphics);
			}

			@Override
			protected int getAgentHeight(Agent agent) {
				Learner learner = (Learner) agent;
				return Math.min(100, learner.getResourceEngagements());
			}
		};
		learnerView.setCellColorFeature(colorForInterest);
		learnerView.setRemoveGaps(false);
		learnerView.setCellSize(4);

		getLearnerScape().addView(learnerView);

		ChartView chart = new ChartView();
		addView(chart);
		chart.getChart().getLegend().setAnchor(Legend.SOUTH);

		chart.addSeries("Count Learner Not Interested Behavior", Color.RED);
		chart.addSeries("Count Learner Seeking Resource Behavior", Color.GREEN);
		chart.addSeries("Count Learner Found Resource Behavior", Color.BLACK);
		chart.addSeries("Sum Learner Learning Interest", Color.BLUE);

	}

}
