/*
 * @autor Juliano Kasmirski Zatta
 * @turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402_T1.git
 *
 */

public class Retangulo{
  private double base;
  private double altura;
  
  public Retangulo(){
    base = 0.0;
    altura = 0.0;
  }
  
  public Retangulo(double vBase, double vAltura){
    base = vBase;
    altura = vAltura;
  }
  
  public double informeBase(){
    return base;
  }
  
  public void recebeValorBase(double vBase){
    base = vBase;
  }
  
  public double informeAltura(){
    return altura;
  }
  
  public void recebeValorAltura(double vAltura){
    altura = vAltura;
  }
  
  public double informeArea(){
    return (base * altura);
  }
  
  public double informePerimetro(){
    return (2 * (base + altura));
  }
}