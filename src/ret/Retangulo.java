package ret;

public class Retangulo {
	public double altura;
	public double largura;
	
	public double areaRet() {
		double area= altura*largura;
		return area;
	}
	public double perimetroRet() {
		double perimetro= 2*(altura+largura);
		return perimetro;
	}
	public double diagonalRet() {
		return Math.sqrt(altura*altura+largura*largura);
	}
}
