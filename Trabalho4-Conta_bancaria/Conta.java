/*
 * @autor Juliano Kasmirski Zatta
 * @turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402.git
 *
 */

public class Conta{
	String nomeCorrentista;
	int nConta;
	double saldo;
	double limite;
	
	public Conta(String vNomeCorrentista, int vNConta, double vSaldo, double vLimite){
		nomeCorrentista = vNomeCorrentista;
		nConta = vNConta;
		saldo = vSaldo;
		if (vLimite >= 0)
			limite = vLimite;
		else
			limite = 0;
	}
	
	public String informeNome(){
		return nomeCorrentista;
	}
	
	public int informeNConta(){
		return nConta;
	}
	
	public double informeSaldo(){
		return saldo;
	}
	
	public double informeLimite(){
		return limite;
	}
	
	public boolean efetueDeposito(double valor){
		if (valor < 0.0){
			return false;
		}
		saldo += valor;
		return true;
	}
	
	public boolean efetueSaque(double valor){
		if (valor < 0.0){
			return false;
		}
		if ((saldo + limite) < valor){
			return false;
		}
		saldo -= valor;
		return true;
	}
}