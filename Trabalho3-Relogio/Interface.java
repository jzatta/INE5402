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
  
  public int pegueValor(String msg){
    return Integer.parseInt(JOptionPane.showInputDialog(null, msg));
  }
  
  public int pegueHora(){
    return pegueValor("Informe a hora do relogio:");
  }
  
  public int pegueMinuto(){
    return pegueValor("Informe o minuto do relogio:");
  }
  
  public int pegueSegundo(){
    return pegueValor("Informe o segundo do relogio:");
  }
  
  public Relogio pegueRelogio(){
		return new Relogio(pegueHora(),pegueMinuto(),pegueSegundo());
  }
  
  public boolean desejaContinuar(){
		return (JOptionPane.showConfirmDialog(null,
		"Deseja continuar?",null,
		JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
  }
  
  public void mostreMaiorHorario(String vHorario){
    JOptionPane.showMessageDialog(null,"O maior horario fornecido foi:" + vHorario);
  }
  
  public void mostreHorarioNulo(boolean vHorarioNulo){
		if (vHorarioNulo){
			JOptionPane.showMessageDialog(null,"Foi fornecido pelo menos um horario igual a 0:0:0");
		} else {
			JOptionPane.showMessageDialog(null,"Nao foi fornecido nenhum horario igual a 0:0:0");
		}
  }
}