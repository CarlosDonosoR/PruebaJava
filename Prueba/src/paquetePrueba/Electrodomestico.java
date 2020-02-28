package paquetePrueba;

import java.util.*;
import java.math.*;
import java.lang.*;
/**
 * Clase que define los obejtos tipo Electrodomestico. 
 * Contiene los métodos para comprobar color, consumo energético y precio 
 * SuperClase
 * @author Carlos Donoso R
 * @version 1.0
 */
public class Electrodomestico {

	// Atributos
	private float precioBase;
	private String color;
	private char consumoEnergetico;
	private float peso;
	//Fin atributos
	
	// Campos de Clase
	final float PRECIO_BASE = 100000;
	final String COLOR = "Blanco";
	final char CONSUMO_ENERGETICO = 'F';
	final float PESO = 5;
	//Fin campos de Clase

	/**
	 * 
	 */
	public Electrodomestico() {
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
	}

	public Electrodomestico(float precioBase, float peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = peso;
	}

	public Electrodomestico(int precioBase, String color, char consumoEnergetico, float peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	// Getter
	public String getColor() {
		return color;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public float getPeso() {
		return peso;
	}

	public float getPRECIO_BASE() {
		return PRECIO_BASE;
	}

	public String getCOLOR() {
		return COLOR;
	}

	public char getCONSUMO_ENERGETICO() {
		return CONSUMO_ENERGETICO;
	}

	public float getPESO() {
		return PESO;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	// Metodos
	public float comprobarConsumoEnergetico(Electrodomestico electro){
		float valor = 0;
		if (this.consumoEnergetico == 'A') {
				return valor =  this.PRECIO_BASE + 100;
		}else {		
			if (this.consumoEnergetico == 'B') {
				return valor =  this.PRECIO_BASE + 80;
			}else {	
				if(this.consumoEnergetico == 'C') {
					return valor =  this.PRECIO_BASE + 60;
				}else {
					if(this.consumoEnergetico == 'D') {
						return valor =  this.PRECIO_BASE + 50;
					}else {
						if(this.consumoEnergetico == 'E') {
							return valor =  this.PRECIO_BASE + 30;
						}else {
							if(this.consumoEnergetico == 'F') {
								return valor =  this.PRECIO_BASE + 10;
							}
						}
					}
				}
			}
		}
		return this.PRECIO_BASE;
		} 
		
	

	public void comprobarColor(Electrodomestico electro) {
		if (this.color.equalsIgnoreCase("Blanco") || this.color.equalsIgnoreCase("Negro")
				|| this.color.equalsIgnoreCase("Azul") || this.color.equalsIgnoreCase("Gris")) {
			Utiles.escribir("Color correcto");
		} else {
			Utiles.escribir("Color no permitido");
	}
}

	public float precioFinal(Electrodomestico electro) {
			if (this.peso >= 0 && this.peso <= 19) {
				float precio = this.PRECIO_BASE + 10;
				return precio + electro.comprobarConsumoEnergetico(electro);
			}else{
				if (this.peso >= 20 && this.peso <= 49) {
					float precio2 = this.PRECIO_BASE + 50;
					return precio2 + electro.comprobarConsumoEnergetico(electro);
				}else {
					if (this.peso >= 50 && this.peso <= 79) {
						float precio3 = this.PRECIO_BASE + 80;
						return precio3 + electro.comprobarConsumoEnergetico(electro);
					}else {
						if (this.peso >= 80) {
							float precio4 = this.PRECIO_BASE + 100;
							return precio4 + electro.comprobarConsumoEnergetico(electro);
						
						}
					}
				}
			}
			return PRECIO_BASE;
		}
}