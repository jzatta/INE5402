/*
 * @autor Juliano Kasmirski Zatta
 * @turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402.git
 *
 */

public class Complexo{
	private double parteReal;
	private double parteImaginaria;
	private double modulo;
	private double angulo;
	
	public Complexo(double vReal, double vImaginaria){
		parteReal = vReal;
		parteImaginaria = vImaginaria;
		modulo = moduloComplexo();
		angulo = anguloComplexo();
	}
	
	public double informeParteReal(){
		return parteReal;
	}
	
	public double informeParteImaginaria(){
		return parteImaginaria;
	}
	
	public double informeModulo(){
		return modulo;
	}
	
	private double moduloComplexo(){
		return Math.hypot(parteReal,parteImaginaria);
	}
	
	private double anguloComplexo(){
		return Math.atan2(parteImaginaria,parteReal);
	}
	
	public String informeConjugado(){
		if (parteImaginaria > 0){
			return Double.toString(parteReal) + " - " +
				Double.toString(parteImaginaria) + "i";
		} else{
			return Double.toString(parteReal) + " + " +
				Double.toString(0.0 - parteImaginaria) + "i";
		}
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
		double real;
		double imaginaria;
		double mulModulo = this.modulo / compx.modulo;
		double somaAngulos = this.angulo - compx.angulo;
		real = mulModulo * Math.cos(somaAngulos);
		imaginaria = (mulModulo) * Math.sin(somaAngulos);
		return new Complexo(real,imaginaria);
	}
	
	public Complexo multiplicaComplexo(Complexo compx){
		double real;
		double imaginaria;
		double mulModulo = this.modulo * compx.modulo;
		double somaAngulos = this.angulo + compx.angulo;
		real = mulModulo * Math.cos(somaAngulos);
		imaginaria = (mulModulo) * Math.sin(somaAngulos);
		return new Complexo(real,imaginaria);
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


















