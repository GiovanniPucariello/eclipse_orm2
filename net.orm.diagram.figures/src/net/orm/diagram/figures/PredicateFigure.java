package net.orm.diagram.figures;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.RectangleFigure;

/**
 * @generated
 */
/**
 * @generated
 */
public class PredicateFigure extends RectangleFigure {
	private  MouseMotionListener fMouseListener = new PredicateMouseMotionListener(this);
	/**
	 * @generated
	 */
	private RectangleFigure fFigureRoleFigure;

	/**
	 * @generated
	 */
	public PredicateFigure() {

		FlowLayout layoutThis = new FlowLayout();
		layoutThis.setStretchMinorAxis(false);
		layoutThis.setMinorAlignment(FlowLayout.ALIGN_CENTER);
		layoutThis.setMajorSpacing(0);
		layoutThis.setMinorSpacing(0);
		layoutThis.setMajorAlignment(FlowLayout.ALIGN_CENTER);
		
		this.setLineWidth(0);
		this.setLayoutManager(layoutThis);
		addMouseMotionListener(fMouseListener);

		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureRoleFigure = new RectangleFigure();

		this.add(fFigureRoleFigure);

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
	public RectangleFigure getFigureRoleFigure() {
		return fFigureRoleFigure;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		removeMouseMotionListener(fMouseListener);
	}

}
