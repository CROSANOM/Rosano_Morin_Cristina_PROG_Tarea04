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
 * La clase Ejercicio 2 realiza un programa que pide por teclado una matrícula
 * española: si es correcta mostrará los números por un lado y las letras por
 * otro, de lo contrario informará que no es válida. Debes utilizar expresiones
 * regulares y grupos para resolverlo. Recuerda que en las letras de las
 * matrículas no se utilizan las vocales.
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// declara la variable mat que servirá para salir del bucle

		boolean comprobarMatricula = false;
		// se inicia el bucle do - while hasta que se cumpla la condición se
		// interara solitando y validando matriculas
		do {

			// solicitamos al usario que introduzca matricula
			System.out.println("INTRODUCE LA MATRICULA:");
			String matricula = Entrada.cadena();
			// Se declara un patron para la matricula ( empieza con 4 digitos 3
			// letras sin incluir las vocales )
			// Pattern pat = Pattern.compile("^[0-9]{4}[a-zA-Z]{3}$"); No
			// incluye la restriccion de las vocales
			Pattern pat = Pattern.compile("^([0-9]{4})([A-Z&&[^AEIOIU]]{3}$)");
			// Se pasa a mat1 a traves del metodo matcher la info guarda
			// matricula
			Matcher mat = pat.matcher((matricula));
			/*
			 * Se buscan con Metodo fin los grupos , importante hay que definirlos previamente en la expresion regular
			 * haciendo uso de los  parentesis  los grupos
			 */
			String grupoNumeros;// defino una variable en la que almacenar los numeros.  
			String grupoLetras;//defino   una variable en la que se almacena las letras 
			
			// Metodo fin recuperar informacion que continen los grupos
			mat.find();

			grupoNumeros=mat.group(1);
			grupoLetras=mat.group(2);
			
			// Imprimo por separado los numeros y  las letras de mi coche 
			
			// Comprueba que matricula empereja con el patron

			if (mat.matches()) {
				System.out.println("La matricula es correcta");
				// variable que se declara de manera global
				comprobarMatricula = true;

			} else {
				System.out.println("La matricula es incorrecta");
			}

		} while (!comprobarMatricula);// validar la condicion para salir del bucle
	}

}
