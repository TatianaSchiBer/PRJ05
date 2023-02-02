package model;

public class Rettangolo extends FiguraGeometrica{

	Segmento base, altezza;
	
	public Rettangolo(Segmento base, Segmento altezza) {
		super("Rettangolo");
		this.base = base;
		this.altezza = altezza;
		this.perimetro = cacolaPerimetro();
		this.superficie = calcolaSuperficie();
	}
	public double calcolaSuperficie() {
		return base.lunghezza*altezza.lunghezza;
	}
	public double cacolaPerimetro() {	
		return 2*(base.lunghezza+altezza.lunghezza);
	}
	/*@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza="
				+ altezza + "]";
	}*/
	
	
	
	
}
