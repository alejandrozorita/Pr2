package tp.pr2.logica;


public class ReglasConecta4 implements ReglasJuego {

	private final int TX = 7, TY = 6;
	
	public  ReglasConecta4() {
		ReglasConecta4 conecta4 = new ReglasConecta4();
	}
	
	@Override
	public Tablero iniciaTablero() {
		Tablero t = new Tablero(TX, TY);
		return t;
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
	
	public static void main(String[] args){
		ReglasConecta4 reglas4 = new ReglasConecta4();
		Tablero t;
		t = reglas4.iniciaTablero();
		t.pintarTablero();
	}
}
