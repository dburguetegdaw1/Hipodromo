package hipodromo.modelo;

public class Apuestas {
	private static int totalDineroApostado;
	private static int dineroApostado;
	private Jugador jugador;
	private static int apos;
	
	public Apuestas(int dinero) {
		this.totalDineroApostado = dinero;
		dineroApostado = 10;
		jugador = new Jugador();
		apos = jugador.apostar(3);
	}

	public static void main(String args[]) {
		Apuestas a = new Apuestas(50);
		a.calcularGanador(3, 10);
	}
	
	public static double calcularGanador(int ganador, int ganadores) {
		double resultado = 0;
		if (apos == ganador) {
			resultado = (totalDineroApostado * 0.75) / ganadores;
			if (totalDineroApostado <= resultado) {
				resultado = (dineroApostado * 1.25);
			}
		} else {
			System.out.println("Has perdido la apuesta, mas suerte la proxima vez");
		}
		return resultado;
	}
}
