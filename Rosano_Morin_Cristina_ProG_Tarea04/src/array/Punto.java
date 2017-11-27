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

	// constructor que le pasamos los parametros de x e y

	public Punto(double x, double y) {

		this.x = x;
		this.y = y;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public static double distancia(Punto miPunto , Punto miOtroPunto) {
		
		double resultadoFormula = 0;
		
		// Calcular distancia entre puntos.
		double xResultante = Math.pow((miPunto.getX() - miOtroPunto.getX()) , 2);
		double yResultante = Math.pow((miPunto.getY() - miOtroPunto.getY()) , 2);
	
		resultadoFormula = Math.sqrt( xResultante + yResultante );
		
		return resultadoFormula;
	}

}// fin class
