package tp.pr2.control;

import tp.pr2.logica.Partida;

public class ComandoReiniciar implements comando{
	
	private Partida p;
	
	public ComandoReiniciar (Partida p)
	{
		this.p = p;
	}

	public ComandoReiniciar() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean analiza(String cmd)
	{
		return cmd.equals("reiniciar");
	}
	
	public void ejecuta()
	{
		p.reset();
	}

	public
	
	@Override
	public boolean terminar() {
		// TODO Auto-generated method stub
		return false;
	}

}
