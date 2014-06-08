/*
 * @autor Juliano Kasmirski Zatta
 * @turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402.git
 *
 */

public class Principal{
	public static void main(String[] p){
		int[] numerosSorteados = new int[6];
		for (int i = 0;i < 6;i++){
			numerosSorteados[i] = (int)(Math.random() * 60) + 1;
			for (int j = 0;j < i;){
				if (numerosSorteados[i] == numerosSorteados[j]){
					numerosSorteados[i] = (int)(Math.random() * 60) + 1;
					j = 0;
				}else{
					j++;
				}
			}
		}
		ordenaNumeros(numerosSorteados);
		System.out.println(toStr(Interface.pegueApostas()));
	}
	
	private static void ordenaNumeros(int[] numerosSorteados){
		int menor;
		int local;
		for (int i = 0;i < 5;i++){
			menor = numerosSorteados[i];
			local = i;
			for (int j = i + 1;j < 6;j++){
				if (numerosSorteados[j] < menor){
					menor = numerosSorteados[j];
					local = j;
				}
			}
			numerosSorteados[local] = numerosSorteados[i];
			numerosSorteados[i] = menor;
		}
	}
	
	public static String toStr(int[] numeros){
		String ret = "{";
		int i = 0;
		for (;i < (numeros.length - 1);i++){
			ret += numeros[i] + ", ";
		}
		ret += numeros[i] + "}";
		return ret;
	}
}