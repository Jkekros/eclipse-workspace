package inc.soft.advpaint.x64.figures;

public class SegNomme extends Segment implements Nomme {

	public SegNomme(String name, Point p1, Point p2) {
		super(name, p1, p2);
	}

	@Override
	public String getNom() {
		
		return this.name;
	}
	public void setNom(String name) {
		
		this.name = name;
	}

}
