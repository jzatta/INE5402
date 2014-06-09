/*
* @autor Juliano Kasmirski Zatta
* @turma 1208A
* @Disponivel em: https://github.com/jzatta/INE5402.git
*
*/

public class Concurso{
  private int[] numerosSorteados;
  private int arrecadacao;
  
  public Concurso(){
    numerosSorteados = new int[6];
    for (int i = 0;i < 6;i++){
      numerosSorteados[i] = (int)(Math.random() * 60) + 1;
      for (int j = 0;j < i;){
        if (numerosSorteados[i] == numerosSorteados[j]){
          numerosSorteados[i] = (int)(Math.random() * 60) + 1;
          j = 0;
        }else{
          j++;
        }
      }
    }
    ordenaNumeros();
    arrecadacao = 0;
  }
  
  public int[] informeNumeros(){
    int[] ret = new int[6];
    for (int i = 0;i < 6;i++){
      ret[i] = numerosSorteados[i];
    }
    return ret;
  }
  
  public int informeArrecadacao(){
    return arrecadacao;
  }
  
  public void arrecade(int valor){
    arrecadacao += valor;
  }
  
  private void ordenaNumeros(){
    int menor;
    int local;
    for (int i = 0;i < 5;i++){
      menor = numerosSorteados[i];
      local = i;
      for (int j = i + 1;j < 6;j++){
        if (numerosSorteados[j] < menor){
          menor = numerosSorteados[j];
          local = j;
        }
      }
      numerosSorteados[local] = numerosSorteados[i];
      numerosSorteados[i] = menor;
    }
  }
  
  public String toString(){
    String ret = "";
    int i = 0;
    for (;i < (6 - 1);i++){
      ret += numerosSorteados[i] + ", ";
    }
    ret += numerosSorteados[i];
    return ret;
  }
}