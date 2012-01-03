package edu.osu.synergies.spatial;

import org.ascape.model.Scape;
import org.ascape.model.space.Array2D;
import org.ascape.model.space.Node;

public class LearningResourceHelper {

	public static void clumpedPlacement(LearningResource learningResource) {
		SpatialResources spatialResources = learningResource.getSpatialResources();
		Scape district = spatialResources.getDistrict();
		Array2D lots = (Array2D) district.getSpace();
		int xSize = lots.getXSize();
		int ySize = lots.getYSize();
		int xMax = (int) (xSize * spatialResources.getBiasedRegionX()) - 1;
		int yMax = (int) (ySize * spatialResources.getBiasedRegionY()) - 1;
		Lot place = null;
		while (place == null) {
			int randX = learningResource.randomInRange(0, xMax);
			int randY = learningResource.randomInRange(0, yMax);
			Node node = lots.get(randX, randY);
			if (node.isAvailable()) {
				place = (Lot) node;
			}
		}
		learningResource.moveTo(place);
	}

	public static void regularPlacement(LearningResource learningResource) {
		SpatialResources spatialResources = learningResource.getSpatialResources();
		Scape district = spatialResources.getDistrict();
		Array2D lots = (Array2D) district.getSpace();
		int xSize = lots.getXSize();
		int ySize = lots.getYSize();
		int resourceCount = learningResource.getScape().getSize();
		int yCount = spatialResources.getRegularYCount();
		int xCount = resourceCount / yCount;
		Lot place = null;
		int xGap = xSize / (xCount + 1);
		int yGap = ySize / (yCount + 1);
		int xCurrent = xGap;
		int yCurrent = yGap;
		while (place == null) {
			Node node = lots.get(xCurrent, yCurrent);
			if (node.isAvailable()) {
				place = (Lot) node;
			}
			xCurrent += xGap;
			if (xCurrent >= xSize) {
				xCurrent = xGap;
				yCurrent += yGap;
			}
		}
		learningResource.moveTo(place);
	}
}
