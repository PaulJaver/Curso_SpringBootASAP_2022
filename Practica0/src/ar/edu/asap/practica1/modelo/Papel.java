package ar.edu.asap.practica1.modelo;

public class Papel extends PiedraPapelTieraFactory {
	public Papel() {
		this("papel", PAPEL);
	}
	public Papel(String pNom, int pNum) {
		super(pNom,pNum);
		
	}

	@Override
	public boolean isMe(int pNum) {
		return pNum==PAPEL;
	}

	@Override
	public int comparar(PiedraPapelTieraFactory pPiedPapelTijera) {
		int resul=0;
		switch (pPiedPapelTijera.getNumero()) {
		//le gana 
		case PIEDRA:
		case SPOCK:	
			resul=1;
			this.descripcionREsultado ="Papel le gano a " + pPiedPapelTijera.getNombre();
			break ;
     //pierde con
		case TIJERA:
		case LAGARTO:	
			resul=-1;
			this.descripcionREsultado ="Papel perdió con " + pPiedPapelTijera.getNombre();
			break;
		default:			
			resul=0;
			this.descripcionREsultado = "Papel empata con " + pPiedPapelTijera.getNombre();
			break;
		}
		return resul;
	}

}
