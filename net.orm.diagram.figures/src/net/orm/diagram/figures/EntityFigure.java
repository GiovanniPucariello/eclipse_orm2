package net.orm.diagram.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class EntityFigure extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureEntityNameFigure;

	/**
	 * @generated
	 */
	public EntityFigure() {
		GridLayout layoutThis = new GridLayout();
		layoutThis.numColumns = 1;
		layoutThis.makeColumnsEqualWidth = true;
		this.setLayoutManager(layoutThis);
		this.setLineStyle(Graphics.LINE_DASH);
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureEntityNameFigure = new WrappingLabel("<...>");
		
		GridData constraintFFigureEntityNameFigure = new GridData();
		constraintFFigureEntityNameFigure.verticalAlignment = GridData.CENTER;
		constraintFFigureEntityNameFigure.horizontalAlignment = GridData.CENTER;
		constraintFFigureEntityNameFigure.horizontalIndent = 0;
		constraintFFigureEntityNameFigure.horizontalSpan = 1;
		constraintFFigureEntityNameFigure.verticalSpan = 1;
		constraintFFigureEntityNameFigure.grabExcessHorizontalSpace = true;
		constraintFFigureEntityNameFigure.grabExcessVerticalSpace = true;
		this
				.add(fFigureEntityNameFigure,
						constraintFFigureEntityNameFigure);

	}

	/**
	 * @generated
	 */
	private boolean myUseLocalCoordinates = false;

	/**
	 * @generated
	 */
	protected boolean useLocalCoordinates() {
		return myUseLocalCoordinates;
	}

	/**
	 * @generated
	 */
	protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
		myUseLocalCoordinates = useLocalCoordinates;
	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureEntityNameFigure() {
		return fFigureEntityNameFigure;
	}

}