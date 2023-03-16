package inc.soft.advpaint.x64.figures;

import java.io.Serializable;

public class polygon extends figure implements Cloneable,Serializable {
	protected Segment[] seg;
	public polygon(String name,Point[] p) {
		super(name);
		
		// TODO Auto-generated constructor stub
	}
	public polygon(String name,Segment[] s) {
		super(name);
		seg = s.clone();
	}
	@Override
	public void Translate(double dx, double dy) {
		for (Segment segment : seg) {
			segment.Translate(dx, dy);
		}
		
	}
	@Override
	public void affichage() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Point getcenter() {
		double[] tot = {0,0};
		for (Segment segment : seg) {
			tot[0] += segment.getP1().getX();
			tot[1] += segment.getP1().getY();
		}
		tot[0] = tot[0]/seg.length;
		tot[1] = tot[1]/seg.length;
		return new Point("cent",tot[0],tot[1]);
	}
	@Override
	public String tostring() {
		// TODO Auto-generated method stub
		return null;
	}

}
