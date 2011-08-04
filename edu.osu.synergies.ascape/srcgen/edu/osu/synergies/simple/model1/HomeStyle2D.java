package edu.osu.synergies.simple.model1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import org.ascape.util.vis.DrawFeature;

import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;

/**
 * <!-- begin-user-doc -->
 * Home Style 2D Java Implementation.
 * 
 * Generated by AMF for model: SpatialResources.metaabm in project: edu.osu.synergies.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public class HomeStyle2D extends DrawFeature {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void draw(Graphics g, Object object, int width, int height) {
		Shape shape = null;
		HostCell actionsCell = (HostCell) object;
		if (actionsCell.getOccupant() instanceof Home) {
			Home actions = (Home) actionsCell.getOccupant();
			Home defaultSimpleResourcesAgentStyle = actions;
			java.awt.Color defaultSimpleResourcesAgentColor = java.awt.Color.WHITE

			;

			g.setColor(defaultSimpleResourcesAgentColor);
			shape = new Rectangle2D.Double(0, 0, width - 1, height - 1);
			((Graphics2D) g).fill(shape);
		}
	}
}
