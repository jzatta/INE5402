/*
 * @Autor Juliano Kasmirski Zatta
 * @Turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402.git
 *
 */

import javax.swing.JOptionPane;

public class Interface{

  public Interface(){
    
  }
  
  public double pegueValor(String msg){
    return Double.parseDouble(JOptionPane.showInputDialog(null, msg));
  }
  
  public double pegueX(){
    return pegueValor("Informe o valor do ponto no eixo das abscissas\
    (separado por um ponto):");
  }
  
  public double pegueY(){
    return pegueValor("Informe o valor do ponto no eixo das ordenadas\
    (separado por um ponto):");
  }
  
  public void mostreDistanciaOrigem(String nomePonto, double distancia){
    JOptionPane.showMessageDialog(null,"A distancia do ponto " + nomePonto +
    " até a origem é de: " + distancia + " u.c.");
  }
  
  public void mostreDistanciaPontos(String nomePonto1, String nomePonto2,
                                    double distancia){
    JOptionPane.showMessageDialog(null,"A distancia entre os pontos " + nomePonto1
    + " e " + nomePonto2 + " é de: " + distancia + " u.c.");
  }
}