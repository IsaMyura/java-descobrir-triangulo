import java.util.Scanner;

//IF 
//AND &&
//OR ||
//IGUAL ==
//DIFERENTE !=

class CalculoIF {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
    
    		int x, y, z;
			String tipo = "Isosceles";
			
			System.out.print("Insira a medida do primeiro lado");
		    x = teclado.nextInt();
			
			System.out.print("Insira a medida do segundo lado");
		    y = teclado.nextInt();
			
			System.out.print("Insira a medida do terceiro lado");
		    z = teclado.nextInt();
			
			if ( x == y && y == z && z == x) {
				tipo = "Equilatero";
			}
			
			if ( x != y && y != z && z != x) {
				tipo = "Escaleno";
			}
			
			System.out.printf("O triangulo eh " + tipo);
			
    
	        System.exit(0);
		
	}

}
