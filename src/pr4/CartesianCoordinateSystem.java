package pr4;

import java.util.ArrayList;

public class CartesianCoordinateSystem {
	private ArrayList<Area> checkedAreas = new ArrayList<>();

	public CartesianCoordinateSystem() {
	}

	public void addAreaInCheckedArea(Area area) {
		checkedAreas.add(area);
	}

	public boolean checkPointInAllChoosenAreas(TDCoordinates point) {
		for (Area area : checkedAreas) {
			if (area.checkPointInArea(point)) {
				return true;
			}
		}
		return false;
	}
}
