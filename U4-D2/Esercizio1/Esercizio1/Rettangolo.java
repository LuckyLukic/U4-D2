package Esercizio1;

public class Rettangolo {
	
	int altezza;
	int base;
	
	public Rettangolo(int _base, int _altezza) {
		
		this.base = _base;
		this.altezza = _altezza;
	}
	
	public int perimetro() {
		int perimetro = ((this.base + this.altezza)*2);
		return perimetro;

}
	
	public int area() {
		int area = this.base * this.altezza;
		return area;

}
	
}
