package hipodromo.modelo;

public class Apuestas {
	private static int dineroApostado;
	private Jugador jugador;
	private static int apos;
	
	public Apuestas(int dinero) {
		this.dineroApostado = dinero;
		jugador = new Jugador();
		apos = jugador.apostar(3);
	}

	public static void main(String args[]) {
		calcularGanador(3, 10);
	}
	
	public static double calcularGanador(int ganador, int ganadores) {
		double resultado = 0;
		if (apos == ganador) {
			resultado = (dineroApostado * 0.75) / ganadores;
			if (dineroApostado <= resultado) {
				resultado = (dineroApostado * 1.25);
			}
		}
		return resultado;
	}
}
