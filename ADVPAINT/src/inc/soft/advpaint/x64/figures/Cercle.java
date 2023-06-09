package inc.soft.advpaint.x64.figures;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.io.Serializable;

public class Cercle extends figure implements Serializable,Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Point o;

	protected double r;
	public Cercle(String name,Point o,double r) {
		super(name);
		this.o=o;
		this.r=r;
	}
	public Cercle(String name,Point o,Point o2) {
		super(name);
		this.o = o;
		this.r = new Segment("",o,o2).getLongueur();
	}

	@Override
	public void Translate(double dx, double dy) {
		o.Translate(dx, dy);
	}
	@Override
	public void affichage() {
		System.out.println(this.tostring());
	}
	@Override
	public Point getcenter() {
		return o;
	}
	@Override
	public String tostring() {
		
		return name+o.tostring()+ "r ="+r ;
	}
	public boolean equals(Cercle c) {

		return  (o.equals(c.getcenter()) && this.getR()==c.getR()) ;
		
	}
	public void setO(Point o) {
		this.o = o;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Cercle clone() {
		Cercle c = null;
		try {
			c = (Cercle)super.clone();
			c.setR(this.r);
			c.setO(this.o.clone());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
		
	}
	@Override
	public void Paint(Graphics g) {
		this.o.Paint(g);
		g.drawOval((int)(this.o.getX()-this.r), (int)(this.o.getY()-this.r), (int)(this.r*2), (int)(this.r*2));
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		Point p = new Point("", e.getX(), e.getY());
		this.o = p;
		System.out.println("done");
		
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		Cercle c = this.clone();
		c.setR(this.o.distance(new Point("",e.getX(),e.getY())));
		System.out.println("done 2 ");
		ed.figs.add(c);
		ed.repaint();
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
