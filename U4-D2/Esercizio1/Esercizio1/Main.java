package Esercizio1;

public class Main{
	
	public static void main(String[] args) {
		
		
		Rettangolo rettangolo0 = new Rettangolo(8,15);
		Rettangolo rettangolo1 = new Rettangolo (12,9);
		Rettangolo rettangolo2 = new Rettangolo (34, 19);
		
		
		stampaRettangolo(rettangolo0);
		stampaDueRettangoli(rettangolo1, rettangolo2);
		
	}
	
	public static void stampaRettangolo (Rettangolo rettangolo0) {
		
		
		System.out.println("Area del rettangolo è" + " " + rettangolo0.area() );
		System.out.println("Perimetro del rettangolo è" + " " + rettangolo0.perimetro());
	}
	
	
	
	public static void stampaDueRettangoli (Rettangolo rettangolo1, Rettangolo rettangolo2) {
		int perimetro1 = rettangolo1.perimetro();
		int perimetro2 = rettangolo2.perimetro();
		int area1 = rettangolo1.area();
		int area2 = rettangolo2.area();
		System.out.println("perimetro rettangolo1 =" + " " + perimetro1 + " " + ",perimetro rettangolo1 =" + " " + perimetro2);
		System.out.println("area rettangolo1 =" + " " + area1 + " " + ",area rettangolo2 =" + " " + area2);
		System.out.println("somma perimetri rettangoli =" + " " + (perimetro1 + perimetro2) + " " + ",somma perimetri rettangoli =" + " " + (perimetro1 + perimetro2));
	}
	

}
