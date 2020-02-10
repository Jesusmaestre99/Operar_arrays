
public class Operar_arrays {
	
	private int array[];

	public static void main(String[] args) {
		
	}
	
	private void rellenar_array() {
		array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*20);
		}
	}

}
