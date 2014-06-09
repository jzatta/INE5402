import javax.swing.JOptionPane;

public class Interface {
	public Interface(){}
	
	private static double pegueDouble(String msg){
		return Double.parseDouble(JOptionPane.showInputDialog(msg + "\n(separado por um ponto)"));
	}
	
	private static int pegueInt(String msg){
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	private static String pegueString(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	private static char pegueChar(String msg){
		return JOptionPane.showInputDialog(msg).charAt(0);
	}
	
	private static String pegueNome(){
		return pegueString("Informe o nome do apostador:");
	}
	
	private static char pegueSexo(){
		char vSexo;
		do{
			vSexo = Character.toUpperCase(pegueChar("Informe o sexo do funcionario:"));
		} while(vSexo != 'M' && vSexo != 'F' && vSexo != 'O');
		return vSexo;
	}
	
	private static int pegueIdade(){
		return pegueInt("Informe a idade do apostador:");
	}
	
	public static int[] pegueApostas(){
		int[] aposta;
		String[] numeros;
		String str;
		while (true){
			str = pegueString("Informe os numeros da aposta (separados por uma virgula),\nMinimo de 6 numeros, maximo de 10.");
			numeros = str.split(",",11);
			if (numeros.length < 6){
				mostreMsg("Informe pelo menos 6 numeros");
			}
			else if (numeros.length > 10){
				mostreMsg("Informe no maximo 10 numeros");
			} else {
				int i;
				aposta = new int[numeros.length];
				for (i = 0;i < numeros.length;i++){
					aposta[i] = Integer.parseInt(numeros[i]);
					if (aposta[i] < 1 || aposta[i] > 60){
						mostreMsg("Valores invalidos.");
						break;
					}
					int j;
					for (j = 0;j < i;j++){
						if (aposta[i] == Integer.parseInt(numeros[j])){
							mostreMsg("Valores repetidos.");
							break;
						}
					}
					if (j != i){
						break;
					}
				}
				if (numeros.length == i){
					return aposta;
				}
			}
		}
	}
	
	public static Apostador pegueApostador(int[] resultado){
		return new Apostador(pegueNome(),pegueSexo(),
												 pegueIdade(),pegueApostas(),resultado);
	}
	
	public static void mostreMsg(String msg){
		JOptionPane.showMessageDialog(null,msg);
	}
	
	public static void mostreConcurso(Concurso c){
		mostreMsg("Os numeros sorteados foram:\n" + c + "\n" +
		"O concurso arrecadou " + c.informeArrecadacao() + " reais");
	}
	
	public static boolean temOutro(){
		int ret = JOptionPane.showConfirmDialog(null,"Inserir mais algum apostador?");
		if(ret == JOptionPane.OK_OPTION) return true;
		return false;
	}
}

























