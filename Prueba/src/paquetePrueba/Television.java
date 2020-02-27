package paquetePrueba;

public class Television extends Electrodomestico {

	//Atributos
	private float resolucion;
	private boolean sintonizadorTDT;
	
	//Campos de Clase
	final static float RESOLUCION = 20;
	final static boolean SINTONIZADOR_TDT = false;
	
	//Constructores
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

	//Getter
	public float getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	//Metodos
	public void precioFinal() {
		Television television = new Television();
		float porcentaje = (float) 0.3;
		if(television.getResolucion() >= 40) {
			float preciofinal = television.precioFinal(0);
			float preciofinal2 = Utiles.multiplica(preciofinal, porcentaje);
			float preciofinal3 = preciofinal - preciofinal2;
			Utiles.escribirFloat(preciofinal3);
			if(television.isSintonizadorTDT() == true) {
				preciofinal3 += 50;
				Utiles.escribirFloat(preciofinal3);
			}
		}
	}
}