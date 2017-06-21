package pr4;

public class Solution {
	private ConsoleHelper helper = new ConsoleHelper();
	private CartesianCoordinateSystem system = new CartesianCoordinateSystem();
	private double x, y;

	void start() {
		x = helper.inputUserCoordinate(DialogMessages.INPUT_X.getMess());
		y = helper.inputUserCoordinate(DialogMessages.INPUT_Y.getMess());
		system.addAreaInCheckedArea(new RectangleArea(new TDCoordinates(-4, -3), new TDCoordinates(-4, 0),
				new TDCoordinates(4, 0), new TDCoordinates(4, -3)));
		system.addAreaInCheckedArea(new RectangleArea(new TDCoordinates(-2, 0), new TDCoordinates(-2, 4),
				new TDCoordinates(2, 4), new TDCoordinates(2, 0)));
		helper.printArg(DialogMessages.RESULT.getMess(), system.checkPointInAllChoosenAreas(new TDCoordinates(x, y)));
	}
}