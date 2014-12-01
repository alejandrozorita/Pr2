package tp.pr2.logica;

public abstract class Movimiento {

	public Movimiento() 
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param tab
	 * @return
	 */
	public abstract boolean ejecutaMovimiento(Tablero tab);
	
	/**
	 * 
	 * @return
	 */
	public Ficha getJugador(){
		return Ficha.BLANCA;
	}
	
	/**
	 * 
	 * @param tab
	 * @return
	 */
	public abstract boolean ejecutaMovimiento(Tablero tab);
	
	/**
	 * 
	 * @param tab
	 */
	public abstract void undo (Tablero tab);
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
