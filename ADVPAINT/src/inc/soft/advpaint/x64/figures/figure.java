package inc.soft.advpaint.x64.figures;

import java.io.Serializable;

public abstract class figure implements Cloneable,Serializable {
	protected String name;
	public figure(String name) {
		this.name =name;
	}
	public abstract void Translate(double dx,double dy);
	public abstract void affichage();
	public abstract Point getcenter();		
	public abstract String tostring();
	public figure clone() {
		figure c = null;
		try {
			c = (figure)super.clone();
		} catch (CloneNotSupportedException e) {}

		return c;
		
	}
	
}
