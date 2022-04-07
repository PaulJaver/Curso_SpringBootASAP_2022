package ar.edu.asap.practica1.modelo;

public class Spock extends PiedraPapelTieraFactory {
	public Spock() {
		this("spock", SPOCK);
	}
	public Spock(String pNom, int pNum) {
		super(pNom, pNum);
	}

	@Override
	public boolean isMe(int pNum) {
		return pNum == SPOCK;
	}

	@Override
	public int comparar(PiedraPapelTieraFactory pPiedPapelTijera) {
		// TODO completar
		int resul=0;
		switch (pPiedPapelTijera.getNumero()) {	
		
		case TIJERA:
		case PIEDRA:
			resul=1;
			this.descripcionREsultado = "spock le gana a " + pPiedPapelTijera.getNombre();
			break;
			
        case PAPEL:
        case LAGARTO:
			resul=-1;
			this.descripcionREsultado = "spock perdió con " + pPiedPapelTijera.getNombre();
			break;

		default:
			resul=0;
			this.descripcionREsultado = "spock empata con " + pPiedPapelTijera.getNombre();
			break;
		}
		return resul;
	}
}
