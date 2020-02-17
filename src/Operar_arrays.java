//Rama1
public class Operar_arrays {
	
	private static int ARRAY[];

	public static void main(String[] args) {
		rellenar_array();
		imprimir_array();
		sumar_array();
		multiplicar_array();
		restar_array();
	}
	
	private static void rellenar_array() {
		ARRAY = new int[10];
		for (int i = 0; i < ARRAY.length; i++) {
			ARRAY[i] = (int) Math.round(Math.random()*20);
		}
	}
	
	private static void imprimir_array() {
		for (int i = 0; i < ARRAY.length; i++) {
			System.out.println(ARRAY[i]);
		} 
	}
	
	private static void sumar_array() {
		int suma = 0;
		for (int i = 0; i < ARRAY.length; i++) {
			suma += ARRAY[i];
		}
		System.out.println(suma);
	}
	
	private static void multiplicar_array() {
		int multiplicacion = 1;
		for (int i = 0; i < ARRAY.length; i++) {
			multiplicacion *= ARRAY[i];
		}
		System.out.println(multiplicacion);
	}

	private static void restar_array() {
		int resta = 0;
		for (int i = 0; i < ARRAY.length; i++) {
			resta -= ARRAY[i];
		}
		System.out.println(resta);
	}
}
