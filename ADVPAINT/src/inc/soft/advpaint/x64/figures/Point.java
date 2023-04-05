package inc.soft.advpaint.x64.figures;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.io.Serializable;

public class Point extends figure implements Cloneable,Serializable{

	
	private double X;
	private double Y;
	public Point(String name,double x,double y) {
		super(name);
		this.X = x;
		this.Y = y;
	}
	public Point(String name,Point p) {
		super(name);
		this.X = p.getX();
		this.Y = p.getY();
	}
	@Override
	public void Translate(double dx, double dy) {
		this.X+=dx;
		this.Y+=dy;	
		
	}
	public String tostring() {
		return "x,y :"+X +","+ Y;
		
	};
	public double distance(Point p) {
		return Math.sqrt(Math.pow(X-p.X, 2)+Math.pow(Y-p.getY(), 2));
	}
	public double getX() {
		return X;
	}
	public void setX(double x) {
		X = x;
	}
	public double getY() {
		return Y;
	}
	public void setY(double y) {
		Y = y;
	}
	@Override
	public void affichage() {
		System.out.println(this.tostring());
	}
	@Override
	public Point getcenter() {
		return this;
	}
	public boolean equals(Point obj) {
		return (this.X == obj.getX() && this.Y == obj.getY());
	}
	public Point clone() {
		Point c = null;
		c = (Point)super.clone();

		return c;
		
	}
	@Override
	public void Paint(Graphics g) {
		int size = 5;
		g.fillOval((int)this.X-size, (int)this.Y-size,size , size);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		Point cl = this.clone();
		cl.setX(e.getX());
		cl.setY(e.getY());
		ed.figs.add(cl);
		ed.repaint();
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
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
