package paquetePrueba;

public class Ejecutable {

	public static void main(String[] args) {
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		electrodomesticos[0] = new Lavadora(40);
		electrodomesticos[1] = new Television(555,80);
		electrodomesticos[2] = new Lavadora(259,68);
		electrodomesticos[3] = new Television(55,true);
		electrodomesticos[4] = new Lavadora();
		electrodomesticos[5] = new Electrodomestico(157,12);
		electrodomesticos[6] = new Electrodomestico();
		electrodomesticos[7] = new Electrodomestico(1300,"azul",'B',12);
		electrodomesticos[8] = new Television();
		electrodomesticos[9] = new Lavadora(540,"GRIS",'F',55);
		
		float precioTotal = 0;
		float precioTotalLava = 0;
		float precioTotalTele = 0;
		for (int i = 0; i < electrodomesticos.length; i++) {
			precioTotal += electrodomesticos[i].precioFinal(electrodomesticos[i]);
				if(electrodomesticos[i] instanceof Lavadora) {
				precioTotalLava += electrodomesticos[i].precioFinal(electrodomesticos[i]);	
			}else {
				if(electrodomesticos[i] instanceof Television) {
				precioTotalTele += electrodomesticos[i].precioFinal(electrodomesticos[i]);
				}
			}
		}
		System.out.println("Suma precio Televisores: $" + precioTotalTele);
		System.out.println("Suma precio lavadoras: $" + precioTotalLava);
		System.out.println("Precio por todos los electrodomesticos: $" + precioTotal);
			}
}
