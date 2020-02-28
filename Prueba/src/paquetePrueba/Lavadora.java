package paquetePrueba;

public class Lavadora extends Electrodomestico {

	//Atributos
	private float carga;
	
	//Campos de Clase
	final float CARGA = 5;
	
	//Constructores
	public Lavadora() {
		super();
	}
	
	public Lavadora(int precioBase, String color, char consumoEnergetico, float peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = CARGA;
	}
	
	public Lavadora(float precio, float peso) {
		super(precio, peso);
		this.carga = CARGA;
	}
	
	public Lavadora(float carga) {
		super();
		this.carga = carga;
	}

	//Getter
	public float getCarga() {
		return carga;
	}
	
	//Metodos
	@Override
	public float precioFinal(Electrodomestico lavadora) {
		float precioFinal = 0;
		if(this.carga < 30) {
			precioFinal = super.precioFinal(lavadora);
			return precioFinal;
		}else {
			if(this.carga >= 30) {
			float precioFinal2 = super.precioFinal(lavadora) + 50;
			return precioFinal2;
		}else {
		return super.precioFinal(lavadora);
	}
}
}
}