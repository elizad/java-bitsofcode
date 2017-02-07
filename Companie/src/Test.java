
public class Test {
	
	public static void main(String[] args) {
		Companie c = new Companie("Kaufland");
		
		Persoana p1 = new Vanzator("Vasile");
		c.angajeaza(p1);
		
		Persoana p2 = new Muncitor("Gheorghe");
		c.angajeaza(p2);
		
		Persoana p3 = new Vanzator("Alexandra");
		c.angajeaza(p3);
		
		c.afiseazaAngajati();;
	}

}
