package zadatak;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StartZadatak extends Program{

	
// Program omogućuje CRUD entitet tipa soba dok se ne prekine unos (slovo t).
//Unos svih podataka se kontrolira i onemogućen je nastavak rada dok se ne unese tražena vrijednost.
//Nakon završetka unosa aplikacija ispisuje vrijednost svojstva posuden s svih instanca unesenih entiteta tipa soba. 
//Za sve datumske tipove podataka u entitetu program pronalazi se najmanje uneseni datum na svim unesenim instancama entiteta soba. 
//Potrebno je napraviti metodu koja pri pokretanju programa unosi test slučajno 20 generiranih entiteta s svim popunjenim svojstvima.

	
	//LISTA ZA DODAVANJE NOVIH SOBA
	private List<Soba> listaSoba;
	
	// konstruktor sobe
	public StartZadatak() {
	listaSoba = new ArrayList<Soba>();
	izbornik();
}
 private void izbornik() {
	 System.out.println("************************");
	 System.out.println(" 1. Unos nove sobe ");
		System.out.println(" 2. Pregled soba ");
		System.out.println(" 3. Promjena sobe ");
		System.out.println(" 4. Brisanje sobe ");
		System.out.println("'T' IZLAZ ");
		System.out.println("*********************");
		odrediAkciju();
 }
private void odrediAkciju() {
	String akcija = Pomocno.ucitajString("Odaberite akciju:");
	switch (akcija) {
	case "1":
		unosNoveSobe();
		break;
	case "2":
		pregledSoba();
		if(listaSoba.isEmpty()) {
			System.out.println("Nema unesenih soba");
		}
		break;
	case "3":
		promjenaSobe();
		break;
	case "4":
		brisanjeSobe();
		break;
	case "t":
		
		izlaz(); // ovdje ce trebati koda
		return;
		default:
			System.out.println("Ne postojeca akcija");
		
	}
	izbornik();
}


  //UNOS ZA NOVU SOBU
private void unosNoveSobe() {//OVDJE JOS TREBA DOCI ZA PROGRAM
	for(int i =1; i<=20; i++) {
	Soba soba = new Soba();
	soba.setSifra(Pomocno.randomIntIzmedju(1, 100));
	soba.setPosudjen(Pomocno.randomDatum(100, 2020));
	soba.setKreiran(Pomocno.randomDatum(1000, 2020));
	soba.setNapravljen(Pomocno.randomDatum(1000, 2020));
	soba.setProgram(unesiPrograme());
	listaSoba.add(soba);
	System.out.println("Soba " + soba + " je uspjesno dodana");
	}
}
private void pregledSoba() {//PREGLED JOS I ZA PROGRAM
	System.out.println("#### SOBE U SUSTAVU ####");
	int i = 1;
	
	for (Soba soba : listaSoba) {
		System.out.println(i++ + ". ");
		System.out.println("sifra sobe "+ soba.getSifra());
		System.out.println("soba je posudjena " +soba.getPosudjen());
		System.out.println("soba je kreirana " + soba.getKreiran());
		System.out.println("soba je napravljena " +soba.getNapravljen());
		for (Program program : soba.getProgram()) {
			System.out.println("  Datum/mobitel programa: " + program.getDatum() + ": " + program.getMobitel());
			
		}
	}
	
	
}


private List<Program> unesiPrograme(){
	
	List<Program> programi = new ArrayList<Program>();

	for(int i =1; i<=20; i++) {
	Program program = new Program();
	program.setDatum(Pomocno.randomDatum(100, 1200));
	program.setMobitel(Pomocno.randomIntIzmedju(100000000, 999999999));;
	program.setObrisan(Pomocno.randomBoolean());
	
	programi.add(program);
	}
	return programi;
}



private void izlaz() {
	//Nakon završetka unosa aplikacija ispisuje vrijednost svojstva
	//  posuden s svih instanca unesenih entiteta tipa soba. 
	
	//Za sve datumske tipove podataka u entitetu program pronalazi se
	//najmanje uneseni datum na svim unesenim instancama entiteta soba.
	
	System.out.println("Dovidjenja");

	
	for (Soba s : listaSoba ) {
		
		System.out.println("Soba pod sifrom: " + s.getSifra()+ " posudjen: "+s.getPosudjen());
		
		s.getProgram().sort(new Comparator<Program>() {
			
			@Override
			public int compare(Program program1, Program program2) {
				// TODO Auto-generated method stub
				return program1.getDatum().compareTo(program2.getDatum());
				
			}
			
		});
		System.out.println("Program max datum: "+s.getProgram().get(s.getProgram().size()-1).getDatum());
	       System.out.println("Program min datum: "+s.getProgram().get(0).getDatum());		
	
}
	}

private void brisanjeSobe() {
	System.out.println("### BRISANJE SOBE ###");
	pregledSoba();
	
	int redniBroj = Pomocno.ucitajBroj("Unesite redni broj sobe");
	
	int index = redniBroj-1;
	if(Pomocno.ucitajBroj("1 za brisati " + 
	listaSoba.get(index) + ", ostalo za odustati" )!=1) {
		return;
	}
	listaSoba.remove(index);
}
private void promjenaSobe() {
	System.out.println("### PROMJENA SOBE ###");
	pregledSoba();
	
	int redniBroj = Pomocno.ucitajBroj("Unesite redni broj sobe");
	int index = redniBroj - 1;	
	promjenaPodatakaSobe(listaSoba.get(index));
}
private void promjenaPodatakaSobe(Soba listaSoba) {
	listaSoba.setKreiran(Pomocno.lokalDatum("Promjeni datum"));
	listaSoba.setNapravljen(Pomocno.lokalDatum("Promjeni datum"));
}


//MAIN METODA
public static void main(String[] args) {
	new StartZadatak();
}
}
