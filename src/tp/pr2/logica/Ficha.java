package tp.pr2.logica;

public enum Ficha {
	BLANCA, NEGRA, VACIA; // FICHAS DISPONIBLES


	public char toChart()
	{
		if(this == NEGRA)
			return 'x';
	}

}