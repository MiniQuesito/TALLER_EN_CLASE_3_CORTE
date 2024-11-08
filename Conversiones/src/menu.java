import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean Continuar = true;
		
		while(Continuar == true) {
			
			System.out.println("Seleccione una opcion: ");
			System.out.println("1. Convertir de pesos colombinos a dollares. ");
			System.out.println("2. Convertir de dollares a pesos colombinos. ");
			System.out.println("3. Si desea salir del programa. ");
			
			int opcion = scanner.nextInt();
			
			Conversion Conversion = new Conversion();
			
			switch (opcion) {
			
			case 1:
				System.out.println("Ingrese la cantidad en pesos colombianos");
				double pesosColombianos = scanner.nextDouble();
				 Conversion.ConversionpesosAdollar(pesosColombianos);
				 
				 break; 
			case 2:
				System.out.println("Ingrese la cantidad en dollares ");
				double dollares = scanner.nextDouble();
				 Conversion.ConversiondollarApesos(dollares);
				 
				 break;
			case 3:
				System.out.println("Gracias por usar el programa. ");
			
				 break;	 
					
			}
		}

	}
	
	

}
