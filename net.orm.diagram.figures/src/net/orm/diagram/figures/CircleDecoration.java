package net.orm.diagram.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;

public class CircleDecoration extends Ellipse implements RotatableDecoration {
	public CircleDecoration() {
		this(4);
	}

	public CircleDecoration(int radius) {
		int width = radius * 2;
		setFill(true);
		setBackgroundColor(ColorConstants.black);
		setSize(new Dimension(width, width));
		setMaximumSize(new Dimension(width, width));
	}

	public void setLocation(Point ref) {
		Dimension d = getSize();
		super.setLocation(ref.getTranslated(-d.width / 2, -d.height / 2));
	}

	public void setReferencePoint(Point ref) {
	}

}