package inc.soft.advpaint.x64.figures;

public class PointNomme extends Point implements Nomme {

	public PointNomme(String name, double x, double y) {
		super(name, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNom() {
		return this.name;
	}

}
