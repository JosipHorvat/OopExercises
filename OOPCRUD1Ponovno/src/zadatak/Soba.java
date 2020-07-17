package zadatak;

import java.time.LocalDate;
import java.util.List;

public class Soba {
	
//Za entitet soba potrebno je definirati sljedeća svojstva:
//šifra (znakovni tip), zabranjen (logička vrijednost),
//napravljen (datum),posuden (datum), poštanski broj (znakovni tip), 
//kreiran (datum) te program

private	int sifra;
private int postanskiBroj;
private boolean zabranjen;
private LocalDate napravljen;
private LocalDate kreiran;
private LocalDate posudjen;
private List<Program> program;



public Soba() {
	// TODO Auto-generated constructor stub
}


public List<Program> getProgram() {
	return program;
}


public void setProgram(List<Program> program) {
	this.program = program;
}


public Soba(int sifra, int postanskiBroj, boolean zabranjen, LocalDate napravljen, LocalDate kreiran,
	List<Program> program,	LocalDate posudjen) {
	super();
	this.sifra = sifra;
	this.postanskiBroj = postanskiBroj;
	this.zabranjen = zabranjen;
	this.napravljen = napravljen;
	this.kreiran = kreiran;
	this.posudjen = posudjen;
	this.program = program;
}

public int getSifra() {
	return sifra;
}

public void setSifra(int sifra) {
	this.sifra = sifra;
}

public int getPostanskiBroj() {
	return postanskiBroj;
}

public void setPostanskiBroj(int postanskiBroj) {
	this.postanskiBroj = postanskiBroj;
}

public boolean isZabranjen() {
	return zabranjen;
}

public void setZabranjen(boolean zabranjen) {
	this.zabranjen = zabranjen;
}

public LocalDate getNapravljen() {
	return napravljen;
}

public void setNapravljen(LocalDate napravljen) {
	this.napravljen = napravljen;
}

public LocalDate getKreiran() {
	return kreiran;
}

public void setKreiran(LocalDate kreiran) {
	this.kreiran = kreiran;
}

public LocalDate getPosudjen() {
	return posudjen;
}

public void setPosudjen(LocalDate posudjen) {
	this.posudjen = posudjen;
}

@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("pod sifrom: " +sifra + "\n");
		
		return sb.toString();
	}
	
}
