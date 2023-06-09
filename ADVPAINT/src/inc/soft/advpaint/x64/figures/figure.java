package inc.soft.advpaint.x64.figures;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;

public abstract class figure implements Cloneable,Serializable,MouseListener,MouseMotionListener	 {
	/**
	 * 
	 */
	protected editor ed;
	private static final long serialVersionUID = 1L;
	protected String name;
	public figure(String name) {
		this.name =name;
		this.ed = null;
	}
	public void setEdit(editor ed) {
		this.ed= ed;
	};
	public editor getEditor() {
		return this.ed;
	}

	public abstract void Translate(double dx,double dy);
	public abstract void affichage();
	public abstract void Paint(Graphics g);
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
