package ar.edu.asap.practica1.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class PiedraPapelTijeraFactory {
public static final int PIEDRA =1;
public static final int PAPEL =2;
public static final int TIJERA =3;

protected String descripcionResultado;
private static List<PiedraPapelTijeraFactory> elementos;

protected String nombre;
protected int numero;

//constructor
public PiedraPapelTijeraFactory(String nombre, int numero) {
	super();
	this.nombre = nombre;
	this.numero = numero;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public String getDescripcionResultado() {
	return descripcionResultado;
}

public abstract boolean isMe(int pNUm);
public abstract int comparar(PiedraPapelTijeraFactory pPPTFact);

public static PiedraPapelTijeraFactory getInstance(int pNUm) {
	//el padre conoce a todos sus hijos
	elementos = new ArrayList<PiedraPapelTijeraFactory>();
	elementos.add(new Piedra());
	elementos.add(new Papel());
	elementos.add(new Tijera());
	
	for (PiedraPapelTijeraFactory piedraPapelTijeraFactory : elementos) {
		if (piedraPapelTijeraFactory.isMe(pNUm))
			return piedraPapelTijeraFactory;
	}
	
	
	return null;
}



}
