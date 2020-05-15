package base;

import java.util.LinkedList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
	// creiamo una lista vuota	
	List<Paziente> lista = new LinkedList<Paziente>();
	// creo nuove istanze di pazienti
	Paziente p00 = new Paziente("mauro", "aa", "negativo", "none");
	Paziente p01 = new Paziente("luigi", "bb", "negativo", "none");
	Paziente p02 = new Paziente("mirko", "cc", "positivo", "ospedale");
	Paziente p03 = new Paziente("nicola", "aa", "positivo", "viaggio");
	Paziente p04 = new Paziente("frost", "zz", "positivo", "trauma");
	
	//inserisco gli oggetti creati nella lista
	lista.add(p00);
	lista.add(p01);
	lista.add(p02);
	lista.add(p03);
	lista.add(p04);
	
	// ciclo sulla lista
	for( int i = 0; i < lista.size(); i++) {
		System.out.println("CaseNumber: " + lista.get(i).getCaseNumber());
		System.out.println("Nome: " + lista.get(i).getNome());
		System.out.println("Blood Type: " + lista.get(i).getBloodType());
		System.out.println("Corona Virus: " + lista.get(i).getCoronaVirus());
		System.out.println("Exposure: " + lista.get(i).getExposure());
		System.out.println("-------------------------");
	}
	
	
}
}
