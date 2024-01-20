
public class AppMain {

	public static void main(String[] args) {
		
		// OPCIÓN A  Instanciar -------------------------------------------------------------- 
		Fraccion aF1 = new Fraccion(1,2);
		Fraccion aF2 = new Fraccion(1,4);
		
		// Operar
		// 1.- Suma
		System.out.println("Sumar " + aF1 + " + " + aF2 + " = "+ aF1.sumar(aF1, aF2) );
		// 2.- Resta
		System.out.println("Restar " + aF1 + " + " + aF2 + " = "+ aF1.restar(aF1, aF2) );
		// 3.- Multiplicación
		System.out.println("Mulitiplicar " + aF1 + " + " + aF2 + " = "+ aF1.multiplicar(aF1, aF2) );
		// 4.- División
		System.out.println("Dividir " + aF1 + " + " + aF2 + " = "+ aF1.dividir(aF1, aF2) );
		

		// OPCIÓN B  Instanciar --------------------------------------------------------------
		FraccionC bF1 = new FraccionC(1,2);
		FraccionC bF2 = new FraccionC(1,4);
		
		// Operar
		// 1.- Suma
		System.out.println("Sumar " + bF1 + " + " + bF2 + " = "+ bF1.mas(bF2));
		// 2.- Resta
		System.out.println("Restar " + bF1 + " - " + bF2 + " = "+ bF1.menos(bF2) );
		// 3.- Multiplicación
		System.out.println("Multiplicar " + bF1 + " * " + bF2 + " = "+ bF1.por(bF2) );
		// 4.- División
		System.out.println("Dividir " + bF1 + " / " + bF2 + " = "+ bF1.entre(bF2) );
		
	
	}

}
