package paquetePrueba;

public class Ejecutable {

	public static void main(String[] args) {
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		electrodomesticos[0] = new Lavadora(30,70);
		electrodomesticos[1] = new Television(150,20);
		electrodomesticos[2] = new Lavadora(5);
		electrodomesticos[3] = new Television(55,true);
		electrodomesticos[4] = new Lavadora(200,68);
		electrodomesticos[5] = new Electrodomestico(300,24);
		electrodomesticos[6] = new Electrodomestico();
		electrodomesticos[7] = new Electrodomestico(374,12);
		electrodomesticos[8] = new Television(80,false);
		electrodomesticos[9] = new Lavadora();
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			System.out.println(electrodomesticos[i].precioFinal());
			}
		}
	}