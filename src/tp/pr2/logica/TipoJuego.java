package tp.pr2.logica;

import org.omg.CORBA.PRIVATE_MEMBER;

public enum TipoJuego {

	CONECTA4(new ReglasConecta4()),
	COMPLICA(new ReglasComplica());
	
	private ReglasJuego reglas;
	
	public ReglasJuego getReglas(){
		if (this == CONECTA4) {
			return new ReglasConecta4();
		}
		else {
		{
			return new ReglasComplica();
		}
	}
		
		public TipoJuego (ReglasJuego regasJuego)
		{
			
		}
	
	public TipoJuego(RegasJuego reglas)
	{
		$this->reglas = reglas;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
