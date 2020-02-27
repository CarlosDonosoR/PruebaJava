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
	public void precioFinal() {
		Lavadora lavadora = new Lavadora();
		if(lavadora.getCarga() >= 30) {
			float precioFinal = lavadora.precioFinal(50);
		}
	}
}
