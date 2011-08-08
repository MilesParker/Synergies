package edu.osu.synergies.simple.model2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import org.ascape.model.Agent;
import org.ascape.model.space.Graph;
import org.ascape.util.data.DataPoint;
import org.ascape.util.data.UnitIntervalDataPoint;
import org.ascape.util.vis.ColorFeatureGradiated;
import org.ascape.util.vis.ColorFeatureGradiatedIndex;
import org.ascape.view.vis.ChartView;

import com.jrefinery.chart.Legend;
import com.jrefinery.chart.XYPlot;

import edu.osu.synergies.simple.model1.FixedStretchyView;
import edu.osu.synergies.simple.model1.SpatialResourcesCustom;

public class SocialResourcesCustom extends SocialResources {

	public final static Color LIGHT_BLUE = new Color(200, 200, 255);

	public final static Color LIGHT_GREEN = new Color(200, 255, 200);

	public final static Color LIGHT_RED = new Color(255, 200, 200);

	public final static Color LIGHT_GRAY = new Color(200, 200, 200);

	UnitIntervalDataPoint guidePoint = new UnitIntervalDataPoint() {

		public double getValue(Object object) {
			Learner learner = (Learner) object;
			Graph graph = (Graph) SocialResourcesCustom.this
					.getGuideRelationships().getSpace();
			List findNeighbors = graph.findNeighbors(learner);
			if (findNeighbors.size() > 0) {
				Guide guide = (Guide) findNeighbors.get(0);
				double interest = guide.getEfficacy();
				if (interest > 1.0) {
					return 1.0;
				}
				return interest;
			}
			return 0.0;
		}
	};

	ColorFeatureGradiated guideColor = new ColorFeatureGradiatedIndex(
			"Interest Color", Color.GREEN, Color.RED, guidePoint);

	@Override
	public void createGraphicViews() {
		ChartView chart = new ChartView() {
//			@Override
//			public void updateScapeGraphics() {
//				((XYPlot) getChart().getPlot()).getDomainAxis().setTickMarksVisible(false);
//				((XYPlot) getChart().getPlot()).getDomainAxis().setTickLabelsVisible(false);
//				((XYPlot) getChart().getPlot()).getRangeAxis().setTickMarksVisible(false);
//				((XYPlot) getChart().getPlot()).getRangeAxis().setTickLabelsVisible(false);
//				super.updateScapeGraphics();
//			}
		};
		addView(chart);
		chart.addSeries("Minimum Guide Efficacy", LIGHT_GRAY);
		chart.addSeries("Maximum Guide Efficacy", LIGHT_GRAY);
		chart.addSeries("Average Guide Efficacy", Color.GRAY);
		chart.addSeries("Minimum Guide Contribution Per Learner", LIGHT_BLUE);
		chart.addSeries("Maximum Guide Contribution Per Learner", LIGHT_BLUE);
		chart.addSeries("Average Guide Contribution Per Learner", Color.BLUE);
		chart.addSeries("Minimum Learner Learning Interest", LIGHT_GREEN);
		chart.addSeries("Maximum Learner Learning Interest", LIGHT_GREEN);
		chart.addSeries("Average Learner Learning Interest", Color.GREEN);
		chart.addSeries("Minimum Learner Self Contribution", LIGHT_RED);
		chart.addSeries("Maximum Learner Self Contribution", LIGHT_RED);
		chart.addSeries("Average Learner Self Contribution", Color.RED);
		chart.getChart().getLegend().setAnchor(Legend.SOUTH);

		FixedStretchyView learnerView = new FixedStretchyView(name, 105,
				getLearnerCount()) {
			public void update(Graphics graphics) {
				graphics.setColor(Color.WHITE);
				super.update(graphics);
			}

			@Override
			protected int getAgentHeight(Agent agent) {
				Learner learner = (Learner) agent;
				return (int) (learner.getLearningInterest() * 100);
			}
		};
		learnerView.setCellColorFeature(guideColor);
		learnerView.setRemoveGaps(false);
		learnerView.setCellSize(4);

		getLearnerScape().addView(learnerView);
	}
}
