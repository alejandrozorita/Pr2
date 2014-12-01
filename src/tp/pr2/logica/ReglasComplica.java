package tp.pr2.logica;

public class ReglasComplica implements ReglasJuego{
	
	private final int TX = 7;
	private final int TY = 4;

	@Override
	public Tablero iniciaTablero() {
		Tablero t = new Tablero(TX,TY);
		return null;
	}

	@Override
	public Ficha jugadorInicial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ficha hayGanador(Movimiento ultimoMovimiento, Tablero t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean tablas(Ficha ultimoEnPoner, Tablero t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ficha siguienteTurno(Ficha ultimoEnPoner, Tablero t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) 
	{

	}

}
