package inc.soft.advpaint.x64.figures;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.io.Serializable;

public class Segment extends figure implements Cloneable,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Point p1;
	protected Point p2;
	public Segment(String name,Point p1,Point p2) {
		super(name);
		this.p1=p1;
		this.p2=p2;
	}
	@Override
	public void Translate(double dx, double dy) {
		p1.Translate(dx, dy);
		p2.Translate(dx, dy);
	}
	@Override
	public void affichage() {
		System.out.println(this.tostring());
		
	}
	@Override
	public Point getcenter() {
		return new Point("center",(p1.getX()+p2.getX())/2,(p1.getY()+p2.getY())/2);
	}
	public double getLongueur() {
		return Math.sqrt(Math.pow(p1.getX()-p2.getX(),2) + Math.pow(p1.getY()-p2.getY(), 2));
	}
	@Override
	public String tostring() {
		
		return "p1("+p1.tostring()+") & p2("+p2.tostring()+")";
	}
		
	public boolean equals(Segment s) {
		return (this.p1.equals(s.getP2()) && this.p2.equals(s.getP2()));	
	}
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Segment clone() {
		Segment c = null;
		c = (Segment)super.clone();

		return c;
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	public void Paint(Graphics g) {
		g.drawLine((int)p1.getX(), (int)p1.getY(), (int)p2.getX(), (int)p2.getY());
		p1.Paint(g);
		p2.Paint(g);
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
