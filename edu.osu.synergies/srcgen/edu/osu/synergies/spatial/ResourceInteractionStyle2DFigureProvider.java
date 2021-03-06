package edu.osu.synergies.spatial;

import org.ascape.util.vis.ColorFeature;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.ColorConstants;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.amp.agf.gef.DefaultFigureProvider;
import org.eclipse.amp.agf.gef.Shapes;

/**
 * <!-- begin-user-doc -->
 * Resource Interaction Style 2D Java Implementation.
 * 
 * Generated by AMF for model: SpatialResources.metaabm in project: edu.osu.synergies 
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceInteractionStyle2DFigureProvider
		extends
			DefaultFigureProvider {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static IFigureProvider singleton;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFigure getFigure(Object object) {
		IFigure figure = null;
		Color color = null;
		ResourceInteraction actions = (ResourceInteraction) object;
		ResourceInteraction defaultSimpleResourcesAgentStyle = actions;
		if (figure == null) {
			figure = Shapes.createOval();
		}
		color = ColorConstants.blue;

		figure.setBackgroundColor(color);
		((Shape) figure).setFill(true);
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IFigureProvider getDefault() {
		if (singleton == null) {
			singleton = new ResourceInteractionStyle2DFigureProvider();
		}
		return singleton;
	}
}
