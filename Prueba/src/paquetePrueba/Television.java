package paquetePrueba;
/**
 * Clase para los objetos de tipo Television. Clase Hija que hereda de Electrodomestico
 * @author Carlos Donoso R
 * @version 1.0
 */
public class Television extends Electrodomestico {

	// Atributos
	private float resolucion;
	private boolean sintonizadorTDT;

	// Campos de Clase
	final static float RESOLUCION = 20;
	final static boolean SINTONIZADOR_TDT = false;

	/**
	 * Constructor con todos los atributos por defecto
	 */
	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}//Fin Constructor

	/**
	 * Constructor que recibe un precio y un peso por parametro
	 * @param precio Precio asignado al objeto
	 * @param peso Peso asignado al objeto
	 * @param consumoEnergetico Valor asignado al consumo energetico
	 * @param peso Dato asignado al peso
	 */
	public Television(float precioBase, String color, char consumoEnergetico, float peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}//Fin Constructor

	/**
	 * Constructor que recibe la resolución y el tipo de sintonizador TDT 
	 * por parametro
	 * @param resolucion Corresponde a la resolución asignada
	 * @param sintonizadorTDT Es el tipo de sintonizador asignado
	 */
	public Television(float resolucion, boolean sintonizadorTDT) {
		super();
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}//Fin Constructor

	// Getter
	public float getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}//Fin Getter

	/**
	 * Metodo que calcula el precio final de un objeto Electrodomestico
	 * de tipo Television segun su resolución y tipo de sintonizador. (Heredado)
	 */
	@Override
	public float precioFinal(Electrodomestico television) {
		float porcentaje = (float) 0.3;
		float preciofinal2 = 0;
		float preciofinal3 = 0;
		float preciofinal4 = 0;
				if(television instanceof Television && this.resolucion >= 40 && this.sintonizadorTDT == (true)) {
										float preciofinal1 = Utiles.multiplica(super.precioFinal(television), porcentaje);
										preciofinal4 =super.precioFinal(television) + preciofinal1 + 50;
										return preciofinal4;
							}else {
							if (television instanceof Television && this.sintonizadorTDT == (true)) {
								preciofinal3= super.precioFinal(television) + 50;
									return preciofinal3; 
							}else {
								if(television instanceof Television && this.resolucion >= 40) {
									float preciofinal = Utiles.multiplica(super.precioFinal(television), porcentaje);
										preciofinal2 =super.precioFinal(television) + preciofinal;
											return preciofinal2;
							}
							}
				return super.precioFinal(television);
		}
}//Fin Metodo
}//Fin Clase