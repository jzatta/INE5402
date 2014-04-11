/*
 * @Autor Juliano Kasmirski Zatta
 * @Turma 1208A
 *
 */

public class Ponto{
	private double x;
	private double y;
	
	public Ponto(){
		x = 0.0;
		y = 0.0;
	}
	
	public Ponto(double vX, double vY){
		x = vX;
		y = vY;
	}
	
	public void recebeValorX(double vX){
		x = vX;
	}
	
	public double informeX(){
		return x;
	}
	
	public void recebeValorY(double vY){
		y = vY;
	}
	
	public double informeY(){
		return y;
	}
	
	public double informeDistanciaPonto(Ponto p){
		return Math.sqrt(Math.Pow(x - p.informeX(),2)+Math.Pow(y - p.informeY(),2));
	}
	
	public double informeDistanciaOrigem(){
		return Math.sqrt(x * x) + (y * y));
	}
}