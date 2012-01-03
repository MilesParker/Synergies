package edu.osu.synergies.social;

import org.ascape.model.Agent;
import org.ascape.model.space.Graph;
import org.ascape.util.vis.ColorFeature;
import org.ascape.util.vis.ColorFeatureConcrete;
import org.ascape.view.vis.ChartView;
import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Color;

import edu.osu.synergies.spatial.FixedStretchyView;
import edu.osu.synergies.spatial.SpatialResourcesCustomGraphicsAdapter;

public class SocialResourcesCustom extends SocialResources {

    public final static Color LIGHT_BLUE = ColorFeatureConcrete.create(200,200,255);

    public final static Color LIGHT_GREEN = ColorFeatureConcrete.create(200,255,200);

    public final static Color LIGHT_RED = ColorFeatureConcrete.create(255,200,200);

    public final static Color LIGHT_GRAY = ColorFeatureConcrete.create(200,200,200);

	ColorFeature SIMPLE = new ColorFeatureConcrete("Simple") {
		@Override
		public Color getColor(Object object) {
			Learner learner = (Learner) object;
			Graph graph = (Graph) SocialResourcesCustom.this.getGuideRelationships().getSpace();
			Guide guide = (Guide) graph.findNeighbors(learner).get(0);
			return GuideCustomColorProvider.getDefault().getBackground(guide);
		}
	};
	
	@Override
	public void createGraphicViews() {
		ChartView chart = new ChartView();
		chart.addSeries("Minimum Guide Efficacy", ColorFeature.LIGHT_GRAY);
		chart.addSeries("Maximum Guide Efficacy", ColorFeature.LIGHT_GRAY);
		chart.addSeries("Average Guide Efficacy", ColorFeature.GRAY);
		chart.addSeries("Minimum Guide Contribution Per Learner", LIGHT_BLUE);
		chart.addSeries("Maximum Guide Contribution Per Learner", LIGHT_BLUE);
		chart.addSeries("Average Guide Contribution Per Learner", ColorFeature.BLUE);
		chart.addSeries("Minimum Learner Learning Interest", LIGHT_GREEN);
		chart.addSeries("Maximum Learner Learning Interest", LIGHT_GREEN);
		chart.addSeries("Average Learner Learning Interest", ColorFeature.GREEN);
		chart.addSeries("Minimum Learner Self Contribution", LIGHT_RED);
		chart.addSeries("Maximum Learner Self Contribution", LIGHT_RED);
		chart.addSeries("Average Learner Self Contribution", ColorFeature.RED);

		addView(chart);
		
		FixedStretchyView learnerView = new FixedStretchyView(name,
				100, getLearnerScape().size()) {
			public void updateScapeGraphics(Graphics graphics) {
				graphics.setBackgroundColor(ColorFeature.WHITE);
				super.updateScapeGraphics(graphics);
			}

			@Override
			protected int getAgentHeight(Agent agent) {
				Learner learner = (Learner) agent;
				return (int) (learner.getLearningInterest() * 100);
			}
		};
		learnerView.setCellColorFeature(SIMPLE);
		learnerView.setRemoveGaps(false);
		learnerView.setCellSize(4);

		getLearnerScape().addView(learnerView);
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
