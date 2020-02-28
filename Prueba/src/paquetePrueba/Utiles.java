package paquetePrueba;
import java.util.Scanner;
/**
 * Clase que almacena metodos de utilidad para el programa
 * @author Carlos Donoso R
 * @version 1.0
 */
public class Utiles{
	
	/**
	 * Metodo que permite escribir en pantalla con salto de linea
	 * @param mensaje Mensaje a imprimir
	 */
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}//Fin Metodo
	
	/**
	 * Metodo que permite mostrar en pantalla un dato de tipo float 
	 * con salto de linea
	 * @param mensaje Numero a imprimir
	 */
	public static void escribirFloat(float numero) {
		System.out.println(numero);
	}//Fin Metodo
	
	/**
	 * Metodo que permite multiplicar dos numeros float 
	 * @param numero1 Primer numero float a multiplicar
	 * @param numero2 Segundo numero float a multiplicar
	 * @return Retorna un resultado de tipo float
	 */
	public static float multiplica(float numero1, float numero2) {
		float resultado = numero1 * numero2;
		return resultado;
	}//Fin Metodo
}//Fin Clase	