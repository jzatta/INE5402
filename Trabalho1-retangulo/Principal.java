/*
 * @autor Juliano Kasmirski Zatta
 * @turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402.git
 *
 */

public class Principal{

  public static void main(String[] args){
    Interface aInterface = new Interface();
    double base = aInterface.pegueBase();
    double altura = aInterface.pegueAltura();
    Retangulo umRetangulo = new Retangulo(base,altura);
    aInterface.mostreArea(umRetangulo.informeArea());
    aInterface.mostrePerimetro(umRetangulo.informePerimetro());
  }
}