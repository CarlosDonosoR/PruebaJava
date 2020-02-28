package paquetePrueba;

public class Television extends Electrodomestico {

	// Atributos
	private float resolucion;
	private boolean sintonizadorTDT;

	// Campos de Clase
	final static float RESOLUCION = 20;
	final static boolean SINTONIZADOR_TDT = false;

	// Constructores
	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}

	public Television(float precio, float peso) {
		super(precio, peso);
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}

	public Television(float resolucion, boolean sintonizadorTDT) {
		super();
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// Getter
	public float getResolucion() {
		return resolucion;
	}
//hola
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	// Metodos
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
}
}