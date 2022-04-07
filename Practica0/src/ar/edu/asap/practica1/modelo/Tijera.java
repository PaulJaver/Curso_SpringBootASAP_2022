package ar.edu.asap.practica1.modelo;

public class Tijera extends PiedraPapelTieraFactory {
	public Tijera() {
		this("tijera",TIJERA);
	}
	
	public Tijera(String pNom, int pNum) {
		super(pNom, pNum);
	}

	@Override
	public boolean isMe(int pNum) {
		return pNum==TIJERA;
	}

	@Override
	public int comparar(PiedraPapelTieraFactory pPiedPapelTijera) {
		int resul=0;
		switch (pPiedPapelTijera.getNumero()) {
		case PAPEL:
		case LAGARTO:
			resul=1;
			this.descripcionREsultado = "tijera le gana a " + pPiedPapelTijera.getNombre();
			break;
			
        case PIEDRA:
        case SPOCK:
			resul=-1;
			this.descripcionREsultado = "tijera perdió con " + pPiedPapelTijera.getNombre();
			break;

		default:
			resul=0;
			this.descripcionREsultado = "tijera empata con " + pPiedPapelTijera.getNombre();
			break;
		}
		return resul;
	}
}
