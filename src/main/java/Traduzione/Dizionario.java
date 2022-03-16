package Traduzione;

import java.util.*;

public class Dizionario {
	private String parola;
	private List <String> listaTraduzioni= new LinkedList<String>();
	public Dizionario(String parola) {
		super();
		this.parola = parola;
		
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public List<String> getListaTraduzioni() {
		return listaTraduzioni;
	}
	public void setListaTraduzioni(List<String> listaTraduzioni) {
		this.listaTraduzioni = listaTraduzioni;
	}
	
	

}
