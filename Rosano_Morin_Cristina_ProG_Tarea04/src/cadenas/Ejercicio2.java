/**
 * 
 */
package cadenas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.Entrada;

/**
 * @author crosanom
 *
 */

/**
 * 
 * La clase Ejercicio 2 realiza un programa que pide por teclado una matr�cula
 * espa�ola: si es correcta mostrar� los n�meros por un lado y las letras por
 * otro, de lo contrario informar� que no es v�lida. Debes utilizar expresiones
 * regulares y grupos para resolverlo. Recuerda que en las letras de las
 * matr�culas no se utilizan las vocales.
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// declara la variable mat que servir� para salir del bucle

		boolean mat = false;
		// se inicia el bucle do - while hasta que se cumpla la condici�n se
		// interara solitando y validando matriculas
		do {

			// solicitamos al usario que introduzca matricula
			System.out.println("INTRODUCE LA MATRICULA:");
			String matricula = Entrada.cadena();
			// Se declara un patron para la matricula ( empieza 
			Pattern pat = Pattern.compile("^[0-9]{4}[a-zA-Z]{3}$");
			Matcher mat1 = pat.matcher((matricula));
			// Comprueba que matricula empereja con el patron
			
			if (mat1.matches()) {
				System.out.println("La matricula es correcta");
				mat = true; // variable que se declara de manera global 

			} else {
				System.out.println("La matricula es incorrecta");
			}

		} while (!mat);// validar la condicion para salir del bucle 
	}

}
