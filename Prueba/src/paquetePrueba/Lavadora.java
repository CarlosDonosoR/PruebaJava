package paquetePrueba;
/**
 * Clase para objetos de tipo Lavadora. Clase Hija que hereda desde Electrodomestico
 * @author Carlos Donoso R
 * @version 1.0
 */
public class Lavadora extends Electrodomestico {

	//Atributos
	private float carga;
	
	//Campos de Clase
	final float CARGA = 5;
	
	/**
	 * Constructor por defecto de la Clase
	 */
	public Lavadora() {
		super();
	}//Fin Constructor
	
	/**
	 * Constructor que recibe un precio base, un color, consumo energetico
	 * y peso por parametro
	 * @param precioBase Precio base asignado al objeto
	 * @param color Color asignado al objeto
	 * @param consumoEnergetico Consumo energetico asignado al objeto
	 * @param peso Peso asignado al objeto
	 */
	public Lavadora(int precioBase, String color, char consumoEnergetico, float peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = CARGA;
	}//Fin Constructor
	
	/**
	 * Constructor que recibe un precio y un peso por parametro
	 * @param precio Es el precio asignado al objeto
	 * @param peso Es el peso asignado al objeto
	 */
	public Lavadora(float precio, float peso) {
		super(precio, peso);
		this.carga = CARGA;
	}//Fin Constructor
	
	/**
	 * Constgructor que recibe una carga por parametro
	 * @param carga Valor de carga asignado al objeto
	 */
	public Lavadora(float carga) {
		super();
		this.carga = carga;
	}//Fin Constructor

	//Getter
	public float getCarga() {
		return carga;
	}//Fin Getter
	
	/**
	 * Metodo que cacula el precio final para un objeto tipo Lavadora
	 * segun la capacidad de carga de este. (Heredado)
	 */
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
}//Fin Metodo
}//Fin Clase