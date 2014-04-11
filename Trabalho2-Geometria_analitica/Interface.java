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
  
  public double pegueBase(){
    return pegueValor("Informe a base do retangulo (separado por um ponto):");
  }
  
  public double pegueAltura(){
    return pegueValor("Informe a altura do retangulo (separado por um ponto):");
  }
  
  public void mostreArea(double vArea){
    JOptionPane.showMessageDialog(null,"A area do retangulo e de: " + vArea);
  }
  
  public void mostrePerimetro(double vPerimetro){
    JOptionPane.showMessageDialog(null,"O perimetro do retangulo e de: " + vPerimetro);
  }
}