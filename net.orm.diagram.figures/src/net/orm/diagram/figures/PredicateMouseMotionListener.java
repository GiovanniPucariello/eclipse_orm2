package net.orm.diagram.figures;



import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseMotionListener;

public class PredicateMouseMotionListener implements MouseMotionListener {

	PredicateFigure predicateFigure;
	
	public PredicateFigure getPredicateFigure() {
		return predicateFigure;
	}

	public PredicateMouseMotionListener(PredicateFigure object) {
		predicateFigure = object;
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseEntered(MouseEvent me) {
		predicateFigure.setLineWidth(2);
		predicateFigure.revalidate();		
	}

	@Override
	public void mouseExited(MouseEvent me) {
		predicateFigure.setLineWidth(0);
		predicateFigure.revalidate();	
	}

	@Override
	public void mouseHover(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}
}
