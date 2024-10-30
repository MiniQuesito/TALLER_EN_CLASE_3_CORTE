
public class Punto_1_Arreglos {

	
	public static void main(String[]arsg) {
		
		
		//a. Hacer una matriz de 23 * 23, llenarla aleatoriamente de numeros. 
		
		//Se estable la cantidad de filas de la matriz 
		int rows = 23;
		//Se establece la cantidad de columnas de la matriz
		int columns = 23;
		
		//Ahora se crea la matriz con las condiciones anteriores 
		int [] [] matriz = new int [rows] [columns];
				
		
		//Procedemos a llenar la matriz de numeros aleatorios 
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				System.out.println("La fila: " + i );
				System.out.println("La columna: " + j);
				matriz [i] [j] = (int) (Math.random()*100);
				System.out.println("La matriz " + matriz [i] [j] + " En cada posición");
			}
			
		}
		
		 System.out.println("\n");
		 System.out.println("La matriz llena se ve asi:  ");
		 
		//Se vuelve a recorrer la matriz para poder visualizarla despues de haberla llenado
		
		for (int x = 0; x < rows; x++) {
			
			for (int y = 0; y < columns; y++) {
				
				System.out.print(matriz [x] [y] + "  ");
			}
			
			System.out.println("\n");
		}
				
				
		//b. Sumar y guardar todos los numeros en una varible de tipo float
		
		float resultado = suma(matriz);
		System.out.println("La suma de los numeros de la matriz es:  " + resultado);
		
		
		//c. Calcular el factorial del numero entero del paso b
		
		long factorial = 1;
		
		for (int i = 2; i < resultado; i++) {
			
			  factorial *= i;
			
		}
		
		
		System.out.println("EL factorial es: " + factorial);
		
		
	}
	
	public static int suma(int matriz[] []) {
		
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
           
            for(int j = 0; j < matriz.length; j++) {
            	suma += matriz[i] [j];
            }
            
        }
        return suma;
        
   
}
	
	public static int Factorial(int n) {
	    int factorial = 1;
	    for (int i = 2; i <= n; ++i) {
	      factorial *= i;
	    }
	    return factorial;
	  }
	
}
