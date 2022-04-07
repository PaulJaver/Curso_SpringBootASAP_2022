package ar.edu.asap.practica1.modelo;

public class Lagarto extends PiedraPapelTieraFactory {
	public Lagarto() {
		this("lagarto", LAGARTO);
	}

	
	public Lagarto(String pNom, int pNum) {
		super(pNom, pNum);
	}


	@Override
	public boolean isMe(int pNum) {
		return pNum==LAGARTO;
	}

	@Override
	public int comparar(PiedraPapelTieraFactory pPiedPapelTijera) {
		// TODO Completar 
		int resul=0;
		switch (pPiedPapelTijera.getNumero()) {		
		case PAPEL:
		case SPOCK:
			resul=1;
			this.descripcionREsultado = "lagarto le gana a " + pPiedPapelTijera.getNombre();
			break;
			
        case PIEDRA:
        case TIJERA:
			resul=-1;
			this.descripcionREsultado = "lagarto perdió con " + pPiedPapelTijera.getNombre();
			break;

		default:
			resul=0;
			this.descripcionREsultado = "lagarto empata con " + pPiedPapelTijera.getNombre();
			break;
		}
		return resul;
	}

}
