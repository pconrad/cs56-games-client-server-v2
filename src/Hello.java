public class Hello {

	
	
	public static void main(String [] args) {

		if (args < 1 || args[0].equals("EN")) {
			System.out.println("Hello, World!");
			return;
		}
		if (args[0].equals("DE")) {
			System.out.println("Guten Tag!");
		} else if (args[0].equals("ES")) {
			System.out.println("Hola!");
		} else {
			System.out.println("Hello, World!");
		}
	}

}
