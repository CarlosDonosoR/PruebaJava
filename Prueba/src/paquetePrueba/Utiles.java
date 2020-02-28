package paquetePrueba;

import java.util.Scanner;

public class Utiles{
	

	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	public static void escribirFloat(float mensaje) {
		System.out.println(mensaje);
	}
	
	public static int leerNumeros(String mensaje) {
		escribir(mensaje);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static float multiplica(float numero1, float numero2) {
		float resultado = numero1 * numero2;
		return resultado;
	}
	
}	