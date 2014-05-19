/*
 * @autor Juliano Kasmirski Zatta
 * @turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402.git
 *
 */

import javax.swing.JOptionPane;

public class Interface{

  public Interface(){
    
  }
  
  public double pegueDouble(String msg){
    return Double.parseDouble(JOptionPane.showInputDialog(msg));
  }
  
  public int pegueInt(String msg){
    return Integer.parseInt(JOptionPane.showInputDialog(msg));
  }
  
  public String pegueString(String msg){
    return JOptionPane.showInputDialog(msg);
  }
  
  public String pegueNome(){
    return pegueString("Informe o nome do correntista:");
  }
  
  public int pegueNConta(){
    return pegueInt("Informe o numero da conta:");
  }
  
  public double pegueSaldo(){
    return pegueDouble("Informe o saldo do correntista (separado por um ponto):");
  }
  
  public double pegueLimite(){
    return pegueDouble("Informe o limite do correntista (separado por um ponto):");
  }
  
  public Conta pegueConta(){
		return new Conta(pegueNome(),pegueNConta(),pegueSaldo(),pegueLimite());
  }
  
  public int menu(Conta umaConta){
		return pegueInt(umaConta.informeNome() + " " + umaConta.informeNConta() + "\n" + "1 - Efetuar depósito\n2 - Efetuar saque\n3 - Consultar saldo\n4 - Sair da conta");
  }
  
  public void mostreSaldo(double vSaldo){
    JOptionPane.showMessageDialog(null,"O saldo é de :" + vSaldo);
  }
}