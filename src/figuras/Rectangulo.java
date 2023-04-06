package figuras;

public class Rectangulo {
	private Double ancho;
	private Double alto;
	
	public Rectangulo(Double ancho, Double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public Double getPerimetro() {
		return ancho * 2 + this.alto * 2;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
	public Double getArea(){
		return this.ancho * this.alto;
	}
}
