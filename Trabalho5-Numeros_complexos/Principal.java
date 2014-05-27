/*
 * @autor Juliano Kasmirski Zatta
 * @turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402.git
 *
 */

public class Principal{
	public static void main(String[] p){
		Complexo cx = new Complexo(1.0,2.0);
		Complexo cx2 = new Complexo(1.0,3.0);
		Complexo CX2 = new Complexo(1.0,3.0);
		System.out.println("Real: " + cx.informeParteReal());
		System.out.println("Im:   " + cx.informeParteImaginaria());
		System.out.println("conj: " + cx.informeConjugado());
		System.out.println("soma: " + cx.somaComplexo(cx2));
		System.out.println("subtrai: " + cx.subtraiComplexo(cx2));
		System.out.println("multiplica: " + cx.multiplicaComplexo(cx2));
		System.out.println("divide: " + cx.divideComplexo(cx2));
		System.out.println("modulo: " + cx.informeModulo());
		System.out.println("igual(f): " + cx.igual(CX2));
		System.out.println("igual(t): " + cx2.igual(CX2));
	}
}