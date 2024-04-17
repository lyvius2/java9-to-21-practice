package com.walter.api.lec12;

public class Main {
	record Point(double x, double y) {}

	record Line(Point p1, Point p2) {}

	public static void findDistanceIfPoint(Object object) {
		if (object instanceof Point(double x, double y)) {
			double distance = Math.hypot(x, y);
			System.out.printf("원점으로부터의 거리 : %.3f\n", distance);
		}

		if (object instanceof Line(Point(var x1, var y1), Point(var x2, var y2))) {
			double distance = Math.hypot(x2 - x1, y2 - y1);
			System.out.printf("두 점 사이의 거리 : %.3f\n", distance);
		}
	}

	public static void main(String[] args) {
		final Point p1 = new Point(2.2, 3.1);
		findDistanceIfPoint(p1);

		final Point p2 = new Point(4.2, 2.4);
		final Line line = new Line(p1, p2);
		findDistanceIfPoint(line);
	}
}
