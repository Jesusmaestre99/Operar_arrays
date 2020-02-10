
public class Operar_arrays {
	
	private static int array[];

	public static void main(String[] args) {
		rellenar_array();
		imprimir_array();
	}
	
	private static void rellenar_array() {
		array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*20);
		}
	}
	
	private static void imprimir_array() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		} 
	}

}
