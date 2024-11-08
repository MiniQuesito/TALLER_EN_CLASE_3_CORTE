import java.util.Scanner;


public class Conversion {
	
	double dato1; 
	double dato2;

    public void ConversionpesosAdollar (double a) {
    
    	dato1 = a;
    	dato2 = dato1 * 0.00023;
    	
    	System.out.println("La conversion de " + a + " a dollares es : " + dato2 + " USD");
    
    }

    public void ConversiondollarApesos (double a) {
    	dato1 = a;
    	dato2 = dato1 * 4359.30;
    	
    	System.out.println("La conversion de " + a + " a pesos es : " + dato2 + " pesos Colombianos");
    }



}
