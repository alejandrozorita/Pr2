package tp.pr2.control;

public interface comando {

	/**
	 * Pregunta analiza string con los osbjetos
	 * @param cmd
	 * @return
	 */
	public boolean analiza(String cmd);
	
	public void ejecuta();
	
	public boolean terminar();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
