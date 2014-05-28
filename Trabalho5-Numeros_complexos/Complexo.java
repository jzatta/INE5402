/*
 * @autor Juliano Kasmirski Zatta
 * @turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402.git
 *
 */

public class Complexo{
	private double parteReal;
	private double parteImaginaria;
	
	public Complexo(double vReal, double vImaginaria){
		parteReal = vReal;
		parteImaginaria = vImaginaria;
	}
	
	public double informeParteReal(){
		return parteReal;
	}
	
	public double informeParteImaginaria(){
		return parteImaginaria;
	}
	
	public Complexo informeConjugado(){
		return new Complexo(parteReal,-(parteImaginaria));
	}
	
	public Complexo somaComplexo(Complexo compx){
		return new Complexo(this.parteReal + compx.parteReal,
												this.parteImaginaria + compx.parteImaginaria);
	}
	
	public Complexo subtraiComplexo(Complexo compx){
		return new Complexo(this.parteReal - compx.parteReal,
												this.parteImaginaria - compx.parteImaginaria);
	}
	
	public Complexo divideComplexo(Complexo compx){
		Complexo numerador = multiplicaComplexo(compx.informeConjugado());
		Complexo denominador = compx.multiplicaComplexo(compx.informeConjugado());
		return new Complexo(numerador.informeParteReal() / denominador.informeParteReal(),
												numerador.informeParteImaginaria() / denominador.informeParteReal());
	}
	
	public Complexo multiplicaComplexo(Complexo compx){
		double real;
		double imaginaria;
		real = (this.parteReal * compx.parteReal) -
			(this.parteImaginaria * compx.parteImaginaria);
		imaginaria = (this.parteReal * compx.parteImaginaria) +
			(this.parteImaginaria * compx.parteReal);
		return new Complexo(real,imaginaria);
	}
	
	public double moduloComplexo(){
		return Math.hypot(parteReal,parteImaginaria);
	}
	
	public boolean igual(Complexo compx){
		if (this.parteReal == compx.parteReal &&
			this.parteImaginaria == compx.parteImaginaria){
			return true;
		}
		return false;
	}
	
	public String toString(){
		String ret = "";
		if (parteReal != 0.0){
		ret += Double.toString(parteReal);
			if (parteImaginaria > 0){
				ret += " + " + Double.toString(parteImaginaria) + "i";
			}
			else if (parteImaginaria < 0) {
				ret += " - " + Double.toString(0.0 - parteImaginaria) + "i";
			}
		}
		else if (parteImaginaria != 0.0){
			ret += Double.toString(parteImaginaria) + "i";
		} else {
			ret = "0.0";
		}
		return ret;
	}
}


















