package inc.soft.advpaint.x64.figures;

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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
		
	}

}
