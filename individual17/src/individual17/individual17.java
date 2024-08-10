package individual17;

import java.util.Scanner;

public class individual17 {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		String analizar = null;
		int contador = 0, contarVocales = 0, contarConsonantes = 0, contarEspacios = 0;
		
		
		while (contador < 1) {
			System.out.println("Ingrese una palabra u oración");
			analizar = scanner.nextLine();
			if(analizar.equals("")) { 
				System.out.println("## Error ## Por favor, ingrese una palabra u oración");
				
			} else {
				
		
				for (int i = 0 ; i < analizar.length() ; i++) {
					
					char resultado = analizar.charAt(i);
					
					if (resultado == 'a' || resultado == 'e' || resultado == 'i' || resultado == 'o' || resultado == 'u') {
						
						contarVocales++;
						
					} else if (Character.isLetter(resultado)) { //Te analiza solo si el caracter corresponde a una letra
						contarConsonantes++;
					} else if (resultado == ' ') {
						contarEspacios++;
					}

				}
				contador++;
			}
				
		}

		System.out.println("Tu palabra/oración posee " + contarVocales + " vocales, " + contarConsonantes + " consonantes y " + contarEspacios + " espacios.");
		
		scanner.close();
		
	}
}
		

