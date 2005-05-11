package org.eclipse.draw2d.text;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A basis for implementing {@link FlowBorder}. Subclassing this class will possibly
 * guarantee compatibility with future changes to the FlowBorder interface. This class
 * also returns default values for many of the required methods as a convenience.
 * @since 3.1
 */
public abstract class AbstractFlowBorder
	extends AbstractBorder
	implements FlowBorder
{
/**
 * @see FlowBorder#getBottomMargin()
 */
public int getBottomMargin() {
	return 0;
}

/**
 * @see Border#getInsets(IFigure)
 */
public Insets getInsets(IFigure figure) {
	return IFigure.NO_INSETS;
}

/**
 * @see FlowBorder#getLeftMargin()
 */
public int getLeftMargin() {
	return 0;
}

/**
 * @see FlowBorder#getRightMargin()
 */
public int getRightMargin() {
	return 0;
}

/**
 * @see FlowBorder#getTopMargin()
 */
public int getTopMargin() {
	return 0;
}

/**
 * This method is not called on FlowBorders. For this reason it is
 * implemented here and made <code>final</code> so that clients override the correct
 * method.
 * @param figure the figure
 * @param graphics the graphics
 * @param insets the insets
 * @see FlowBorder#paint(FlowFigure, Graphics, Rectangle, int)
 */
public final void paint(IFigure figure, Graphics graphics, Insets insets) { }

/**
 * Subclasses should override this method to paint each box's border.
 * @see FlowBorder#paint(FlowFigure, Graphics, Rectangle, int)
 */
public void paint(FlowFigure figure, Graphics g, Rectangle where, int sides) { }

}