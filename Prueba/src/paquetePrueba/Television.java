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
	public float precioFinal() {
		Television television = new Television();
		float porcentaje = (float) 0.3;
		if (television.getResolucion() >= 40) {
			float preciofinal = television.precioFinal();
			float preciofinal2 = Utiles.multiplica(preciofinal, porcentaje);
			float preciofinal3 = preciofinal - preciofinal2;
			return preciofinal3;
			
			//if (television.isSintonizadorTDT() == true) 
				//float preciofinal4 = preciofinal3 += 50;
				//return preciofinal4;
		}
		return PRECIO_BASE;
	}
}