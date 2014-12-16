package tp.pr2.logica;

public class Undo {
	
	private Tablero tablero;
	private Partida partida;
	private Ficha turno;
	public int [] arrayJugadas;
	private int contadorArrayJugadas = 0;
	
	public Undo(Partida partida) {
		this.partida = partida;
		this.tablero = partida.getTablero();
		this.turno = partida.getTurno();
		arrayJugadas = new int[10];
	}
	
	public Undo(boolean reseteada){
		boolean ok = true;
		if (turno == Ficha.BLANCA && contadorArrayJugadas == 0 && partida.getTablas() == 0){
			ok = false;
		}
		else if(reseteada) {
			ok = false;
		}
		else{
			
			//Iniciamos contador para no machacar contador original de partida
			int auxContadorArrayJugadas = 0;

			//Si contador es mayor que length de array es porque apunta a ultima direcccion
			if (contadorArrayJugadas > arrayJugadas.length - 1) {
				auxContadorArrayJugadas = arrayJugadas.length;
			}
			else {
				auxContadorArrayJugadas = contadorArrayJugadas;
			}
			if (arrayJugadas[auxContadorArrayJugadas -1] < 0) {
				ok = false;
			}
			else{
			//Sacamos la posicion Y del tablero de la última jugada
			int posicionUltimaFichaEnI = (tablero.fichaUltimaJugada(arrayJugadas[contadorArrayJugadas - 1]));
			//Pasamos X e Y a tablero para que ponga vacia en la posicion de la ultima jugada
			tablero.setCasilla(/*Pasamos la x*/arrayJugadas[contadorArrayJugadas - 1], /*Pasamos la i*/(posicionUltimaFichaEnI + 2), /*Pasamos la vacia*/Ficha.VACIA);
			//Ponemos a -1 launcher posicion del array
			arrayJugadas[contadorArrayJugadas-1] = -1;
			contadorArrayJugadas = auxContadorArrayJugadas;
			partida.disminuirContador();
			//Quitamos un movimiento en el contador de partida en tablas
			partida.setTablas();
			//Asignamos el turno
			partida.setTurno();
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
