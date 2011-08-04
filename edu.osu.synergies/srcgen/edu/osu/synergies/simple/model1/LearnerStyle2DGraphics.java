package edu.osu.synergies.simple.model1;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import org.ascape.model.Agent;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;

import org.ascape.util.vis.DrawFeature;

/**
 * <!-- begin-user-doc -->
 * Learner Style 2D Java Implementation.
 * 
 * Generated by AMF for model: SpatialResources.metaabm in project: edu.osu.synergies 
 * <!-- end-user-doc -->
 * @generated
 */
public class LearnerStyle2DGraphics extends DrawFeature {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	enum Shapes {
		rectangle, oval, marker
	};

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Shapes shape = Shapes.rectangle;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void draw(Graphics g, Object object, int width, int height) {

		HostCell actionsCell = (HostCell) object;
		if (actionsCell.getOccupant() instanceof Learner) {
			Learner actions = (Learner) actionsCell.getOccupant();
			Learner defaultSimpleResourcesAgentStyle = actions;
			double learnerIndexDivideLearnerCount = defaultSimpleResourcesAgentStyle
					.getLearnerIndex()
					/ defaultSimpleResourcesAgentStyle.getSimpleResources()
							.getLearnerCount();

			Color defaultSimpleResourcesAgentColor = new Color(
					Display.getCurrent(), (int) (0.5 * 255), (int) (0.6 * 255),
					(int) (learnerIndexDivideLearnerCount * 255));

			g.setForegroundColor(defaultSimpleResourcesAgentColor);
			g.setBackgroundColor(defaultSimpleResourcesAgentColor);
			shape = shape.oval;
			if (shape == Shapes.oval) {
				g.fillOval(0, 0, width, height);
			} else if (shape == Shapes.marker) {
				int d = (int) (width * .25 - 1);
				int d2 = (int) (width * .5 - 1);
				g.fillOval(d, d, d2, d2);
			} else if (shape == Shapes.rectangle) {
				g.fillRectangle(0, 0, width, height);
			}
		}
	}
}