package edu.osu.synergies.spatial;

import org.ascape.util.vis.ColorFeature;
import org.ascape.util.vis.ColorFeatureConcrete;
import org.ascape.view.vis.ChartView;
import org.ascape.view.vis.GEFView;
import org.eclipse.amp.agf.gef.GenericEditPart;
import org.eclipse.amp.agf3d.CompositeRenderShape;
import org.eclipse.amp.agf3d.IGraphics3DAdapted;
import org.eclipse.amp.agf3d.IGraphics3DAdapter;
import org.eclipse.amp.agf3d.IShape3DProvider;
import org.eclipse.amp.agf3d.Shapes3D;
import org.eclipse.amp.escape.ascape.adapt.AscapeDefaultGraphics3DAdapter;
import org.eclipse.amp.escape.ascape.agf3d.GEF3DView;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Position3D;
import org.eclipse.draw3d.geometry.Position3DUtil;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.graphics3d.Graphics3D;
import org.eclipse.draw3d.shapes.CuboidFigureShape;
import org.eclipse.draw3d.shapes.CuboidShape;
import org.eclipse.draw3d.shapes.CylinderShape;
import org.eclipse.draw3d.shapes.CylindricFigureShape;
import org.eclipse.draw3d.shapes.PositionableShape;
import org.eclipse.draw3d.shapes.Shape;
import org.eclipse.swt.graphics.Color;

public class SpatialResourcesCustom3D extends SpatialResourcesCustom implements
		IGraphics3DAdapted {

	private static final Vector3fImpl FULL_SIZE = new Vector3fImpl(
			GenericEditPart.SCALE, GenericEditPart.SCALE, GenericEditPart.SCALE);

	private static final Vector3fImpl ORIGIN = new Vector3fImpl(0.0f, 0.0f,
			0.0f);

	public static IShape3DProvider HOUSE_SHAPE_PROVIDER = new IShape3DProvider() {
		public Shape getShape3D(Object object, IFigure3D figure) {
			CompositeRenderShape shape = new CompositeRenderShape(figure,
					object, null);

			Position3D p3 = Position3DUtil.createAbsolutePosition();
			p3.setCenter3D(new Vector3fImpl(0.5f, 0.5f, 0.0f));
			p3.setSize3D(new Vector3fImpl(1.0f, 1.0f, 1.0f));
			CuboidShape cube = new CuboidShape(p3, true);
			shape.addShape(cube);
			shape.setFill(true);
			shape.setOutline(true);
			return shape;
		}

		public IVector3f getSize3D(Object object) {
			return FULL_SIZE;
		}

		public IVector3f getRelativeLocation3D(Object object) {
			return ORIGIN;
		}
	};

	public static IShape3DProvider RESOURCE_SHAPE_PROVIDER = new IShape3DProvider() {
		public Shape getShape3D(Object object, IFigure3D figure) {
			CompositeRenderShape shape = new CompositeRenderShape(figure,
					object, null);

			Position3D p3 = Position3DUtil.createAbsolutePosition();
			p3.setCenter3D(new Vector3fImpl(0.5f, 0.5f, 0.0f));
			p3.setSize3D(new Vector3fImpl(1.0f, 1.0f, 1.0f));
			CylinderShape cube = new CylinderShape(p3, 30, 1.0f, true);
			shape.addShape(cube);
			shape.setFill(true);
			shape.setOutline(true);
			return shape;
		}

		public IVector3f getSize3D(Object object) {
			LearningResource resource = (LearningResource) object;
			// float efficacy = (float) resource.getEfficacy();
			// efficacy *= 100.0f;
			float interactions = (((float) resource.getLearnerInteractions()) / 10.0f) + 1;
			return new Vector3fImpl(GenericEditPart.SCALE,
					GenericEditPart.SCALE, interactions * GenericEditPart.SCALE);
		}

		public IVector3f getRelativeLocation3D(Object object) {
			return ORIGIN;
		}
	};

	public static IShape3DProvider HUMAN_SHAPE_PROVIDER = new IShape3DProvider() {
		public Shape getShape3D(Object object, IFigure3D figure) {

			CompositeRenderShape shape = new CompositeRenderShape(figure,
					object, null);

			float scale = 0.5f;

			float bodyWidth = 0.4f * scale;
			float bodyDepth = 0.3f * scale;
			float bodyHeight = 0.4f * scale;
			float legWidth = 0.1f * scale;
			float legHeight = 0.6f * scale;
			float headWidth = 0.3f * scale;
			float headHeight = 0.2f * scale;

			// legs
			shape.addShape(createCylinder(legHeight, new Vector3fImpl(legWidth,
					legWidth, legHeight), new Vector3fImpl(
					0.5f - 1.5f * legWidth, 0.5f - .5f * legWidth, 0)));

			// legs
			shape.addShape(createCylinder(legHeight, new Vector3fImpl(legWidth,
					legWidth, legHeight), new Vector3fImpl(
					0.5f + .5f * legWidth, 0.5f - .5f * legWidth, 0)));
			// body
			shape.addShape(createCube(bodyHeight + legHeight, new Vector3fImpl(
					bodyWidth, bodyDepth, bodyHeight), new Vector3fImpl(
					(1.0f - bodyWidth) / 2.0f, (1.0f - bodyDepth) / 2.0f,
					legHeight)));

			// head
			shape.addShape(createCylinder(headHeight, new Vector3fImpl(
					headWidth, headWidth, headHeight), new Vector3fImpl(
					0.5f - .5f * headWidth, 0.5f - .5f * headWidth,
					(legHeight + bodyHeight))));
			return shape;
		}

		public IVector3f getSize3D(Object object) {

			Learner learner = (Learner) object;
			float engagementFactor = (learner.getResourceEngagements() / 5.0f) + 1;
			float scale = engagementFactor * GenericEditPart.SCALE;
			return new Vector3fImpl(scale,
					scale, scale);
		}

		public IVector3f getRelativeLocation3D(Object object) {
			return ORIGIN;
		}
	};

	public void createGraphicViews() {
		GEF3DView view = new GEF3DView();
		addView(view);
		// addView(new GEFView());
		// addView(new ChartView());
	}

	private static final IShape3DProvider[] HUMAN_SHAPE_PROVIDERS = new IShape3DProvider[] { HUMAN_SHAPE_PROVIDER };
	private static final IShape3DProvider[] HOUSE_SHAPE_PROVIDERS = new IShape3DProvider[] { HOUSE_SHAPE_PROVIDER };
	private static final IShape3DProvider[] RESOURCE_SHAPE_PROVIDERS = new IShape3DProvider[] { RESOURCE_SHAPE_PROVIDER };

	IGraphics3DAdapter adapter = new AscapeDefaultGraphics3DAdapter() {
		public IShape3DProvider[] getShapes(Object object) {
			if (object instanceof Learner) {
				return HUMAN_SHAPE_PROVIDERS;
			}
			if (object instanceof Home) {
				return HOUSE_SHAPE_PROVIDERS;
			}
			if (object instanceof LearningResource) {
				return RESOURCE_SHAPE_PROVIDERS;
			}
			return super.getShapes(object);
		};
	};

	/**
	 * @return
	 * @see org.eclipse.amp.agf3d.IGraphics3DAdapted#getGraphics3DAdapter()
	 */
	public IGraphics3DAdapter getGraphics3DAdapter() {
		return adapter;
	}

	protected static PositionableShape createCylinder(float headHeight,
			IVector3f size, IVector3f location) {
		Position3D p3 = Position3DUtil.createAbsolutePosition();
		p3.setCenter3D(new Vector3fImpl(location.getX(), location.getY(),
				location.getZ()));
		p3.setSize3D(size);
		CylinderShape shape = new CylinderShape(p3, 30, 1.0f, true);
		shape.setFill(true);
		shape.setOutline(true);
		return shape;
	}

	protected static PositionableShape createCube(float headHeight,
			IVector3f size, IVector3f location) {
		Position3D p3 = Position3DUtil.createAbsolutePosition();
		p3.setCenter3D(new Vector3fImpl(location.getX(), location.getY(),
				location.getZ()));
		p3.setSize3D(size);
		CuboidShape shape = new CuboidShape(p3, true);
		shape.setFill(true);
		shape.setOutline(true);
		return shape;
	}
}
