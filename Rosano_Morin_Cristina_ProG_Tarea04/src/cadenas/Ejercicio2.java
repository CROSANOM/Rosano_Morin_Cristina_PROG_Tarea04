/**
 * 
 */
package cadenas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.Entrada;

/**
 * @author crosanom
    version 1.5
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

		boolean comprobarMatricula = false;

		/*
		 * se inicia el bucle do - while hasta que se cumpla la condici�n se
		 * interara solitando y validando matriculas
		 */
		do {
			// solicitamos al usario que introduzca matricula
			System.out.println("INTRODUCE LA MATRICULA:");
			String matricula = Entrada.cadena();

			/*
			 * Se declara un patron para la matricula ( patron empieza con 4
			 * digitos y termina 3 letras sin incluir las vocales ), se usa el
			 * m�todo compile de la clase Patter
			 */

			Pattern patron = Pattern.compile("^([0-9]{4})([A-Z&&[^AEIOIU]]{3}$)");

			/*
			 * Se pasa a a trav�s del m�todo matcher la info guarda matricula
			 */

			Matcher emparejador = patron.matcher((matricula));

			if (emparejador.find()) {
				String grupoNum = emparejador.group(1);
				String grupoLetras = emparejador.group(2);
				System.out.println("La matricula de mi coche es:" + matricula);
				System.out.println("Esta compuesta por 4 digitos:" + grupoNum + " y 3 letras " + grupoLetras);
			}

			if (emparejador.matches()) {
				// System.out.println("matricula es correcta");
				comprobarMatricula = true;

			} else {
				System.out.println("La matricula es incorrecta");
			}
		} while (!comprobarMatricula);// validar la condicion para salir

	}

}
