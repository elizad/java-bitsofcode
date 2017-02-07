import java.util.ArrayList;
import java.util.List;


public class Companie {
	
	String nume;
	List<Angajat> angajati = new ArrayList<Angajat>();
	
	public Companie(String nume) {
		this.nume = nume;
	}
	public void angajeaza(Persoana persoana) {
		int numarAngajat = angajati.size();
		Angajat angajat =new Angajat(persoana, numarAngajat);
		angajati.add(angajat);
	}

	public void afiseazaAngajati() {
		for(Angajat angajat: angajati) {
			System.out.println("Nume Angajat: " + angajat.getNumeAngajat() + 
					", Cod unic: " + angajat.getCodUnic() +
					", Departament: " + angajat.getDepartamentAngajat()
					);
		}
	}
	public class DepartamentVaznari {
      public static final String NUME = "vanzari.";
   }
	public class DepartamentProductie {
      public static final String NUME = "productie.";
   }
	
}

class Angajat {
	
	Persoana persoana;	
	String codUnic;
	
	Angajat(Persoana persoana,int codUnic) {
		this.persoana = persoana;
		this.codUnic = "" + codUnic;
	}
	
	public String getNumeAngajat() {
		return persoana.getNume();
	}

	public String getCodUnic() {
		return codUnic;
	}
	
	public String getDepartamentAngajat() {
		if (persoana instanceof Vinde) {
			return Companie.DepartamentVaznari.NUME;
		} else if (persoana instanceof Produce) {
			return Companie.DepartamentProductie.NUME;			
		} else {
			throw new RuntimeException("Persoana necalificata.");
		}
	}
}