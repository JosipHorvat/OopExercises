package zadatak;

import java.time.LocalDate;

public class Program {

//Za entitet Program potrebno je definirati sljedeća svojstva: šifra (znakovni tip),
//obrisan (logička vrijednost), naziv (znakovni tip), datum (datum),
//prezime (znakovni tip) i mobitel (znakovni tip).

private String naziv;
private String prezime;
private int sifra;
private int mobitel;
private LocalDate datum;
private boolean obrisan;

public Program() {
	// TODO Auto-generated constructor stub
}

public Program(String naziv, String prezime, int sifra, int mobitel, LocalDate datum, boolean obrisan) {
	
	this.naziv = naziv;
	this.prezime = prezime;
	this.sifra = sifra;
	this.mobitel = mobitel;
	this.datum = datum;
	this.obrisan = obrisan;
}

public String getNaziv() {
	return naziv;
}

public void setNaziv(String naziv) {
	this.naziv = naziv;
}

public String getPrezime() {
	return prezime;
}

public void setPrezime(String prezime) {
	this.prezime = prezime;
}

public int getSifra() {
	return sifra;
}

public void setSifra(int sifra) {
	this.sifra = sifra;
}

public int getMobitel() {
	return mobitel;
}

public void setMobitel(int mobitel) {
	this.mobitel = mobitel;
}

public LocalDate getDatum() {
	return datum;
}

public void setDatum(LocalDate datum) {
	this.datum = datum;
}

public boolean isObrisan() {
	return obrisan;
}

public void setObrisan(boolean obrisan) {
	this.obrisan = obrisan;
}
@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	sb.append("Datum i sifra Programa: " + datum);
		return sb.toString();
	}

}
