/*
* @autor Juliano Kasmirski Zatta
* @turma 1208A
* @Disponivel em: https://github.com/jzatta/INE5402.git
*
*/

public class Principal{
  public static void main(String[] p){
    Concurso c = new Concurso();
    Apostador a;
    do{
      a = Interface.pegueApostador(c.informeNumeros());
      c.arrecade(a.informeQuantidadeApostada());
      Interface.mostreMsg(a.toString());
    }while(Interface.temOutro());
    Interface.mostreConcurso(c);
  }
}