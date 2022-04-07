package ar.edu.asap.practica1.modelo;

public class Piedra extends PiedraPapelTieraFactory {
	public Piedra() {
		this("piedra", PIEDRA );
	}

	public Piedra(String pNom, int pNum) {
		super(pNom, pNum);		
	}

	@Override
	public boolean isMe(int pNum) {
		return pNum==PIEDRA;
	}

	@Override
	public int comparar(PiedraPapelTieraFactory pPiedPapelTijera) {
		int resul=0;
		switch (pPiedPapelTijera.getNumero()) {
		case TIJERA:
		case LAGARTO:
			resul=1;
			this.descripcionREsultado = "piedra le gana a " + pPiedPapelTijera.getNombre();
			break;
			
        case PAPEL:
        case SPOCK:
			resul=-1;
			this.descripcionREsultado = "piedra pierdió con " + pPiedPapelTijera.getNombre();
			break;

		default:
			resul=0;
			this.descripcionREsultado = "piedra empata con " + pPiedPapelTijera.getNombre();
			break;
		}
		return resul;
	}
}
