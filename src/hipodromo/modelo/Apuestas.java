package hipodromo.modelo;

public class Apuestas {
	private static int totalDineroApostado;
	private static int dineroApostado;
	private Jugador jugador;
	private static int apos;
	/**
	 * Constructor de la clase apuestas
	 * @param dinero
	 */
	public Apuestas(int dinero) {
		this.totalDineroApostado = dinero;
		dineroApostado = 10;
		jugador = new Jugador();
		apos = jugador.apostar(3);
	}
	/**
	 * Método main para probar la aplicación
	 * @param args
	 */
	public static void main(String args[]) {
		Apuestas a = new Apuestas(50);
		System.out.println(a.calcularGanador(3, 10));
	}
	/**
	 * Método que calcula el dinero a recibir
	 * @param ganador
	 * @param ganadores
	 * @return dinero a recibir
	 */
	public static double calcularGanador(int ganador, int concursantes) {
		double resultado = 0;
		if (apos == ganador) {
			resultado = (totalDineroApostado * 0.75) / concursantes;
			if (totalDineroApostado <= resultado) {
				resultado = (dineroApostado * 1.25);
			}
		} else {
			System.out.println("Has perdido la apuesta, mas suerte la proxima vez");
		}
		return resultado;
	}
}
