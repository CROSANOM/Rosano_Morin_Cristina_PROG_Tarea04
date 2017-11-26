package array;

/**
 * @author crosanom version1.0
 */
public class Punto {
	// Creamos los atributos privados proteger el acceso a los mismos

	/**
	 * atributos de la clase
	 */
	private double x;
	private double y;

	// Este es el contructor por defecto
	public Punto() {
	}

	// constructor con parametros de x e y

	public Punto(double x, double y) {

		this.x = 2.3; // pasar el valor 2.3 ojo todos los objetos que se deriven
						// de este constructor
		this.y = 1.3;

	}

	/**
	 * @return the x
	 */
	protected double getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	protected double getY() {
		return y;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	
	
	
}//fin class
