
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!");
		
		for (int i = 0; i<= 100; i = i + 4) {
			if (i % 5 != 0)
				continue;
			System.out.println("i = " + i);
		}
	}

}
