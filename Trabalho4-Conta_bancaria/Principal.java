/*
 * @autor Juliano Kasmirski Zatta
 * @turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402.git
 *
 */

public class Principal{
	public static void main(String[] p){
		Interface aInterface = new Interface();
		Conta umaConta;
		int quantContas = aInterface.pegueInt("Informe a quantidade de contas:");
		boolean sairConta;
		for(;quantContas > 0; quantContas--){
			umaConta = aInterface.pegueConta();
			sairConta = true;
			while(sairConta){
				switch(aInterface.menu(umaConta)){
					case 1: // Efetuar deposito;
						umaConta.efetueDeposito(aInterface.pegueDouble("Informe o valor a ser depositado (separado por um ponto):"));
						break;
					case 2: // Efetuar saque
						umaConta.efetueSaque(aInterface.pegueDouble("Informe o valor a ser sacado (separado por um ponto):"));
						break;
					case 3:
						aInterface.mostreSaldo(umaConta.informeSaldo());
						break;
					case 4:
						sairConta = false;
						break;
				}
			}
		}
	}
}