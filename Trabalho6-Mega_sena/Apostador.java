/*
* @autor Juliano Kasmirski Zatta
* @turma 1208A
* @Disponivel em: https://github.com/jzatta/INE5402.git
*
*/

public class Apostador extends Pessoa{
  private int[] aposta;
  private int nPontos;
  
  public Apostador(String vNome, char vSexo,
                  int vIdade, int[] vAposta, int[] resultado){
    super(vNome,vSexo,vIdade);
    aposta = new int[vAposta.length];
    for (int i = 0;i < vAposta.length;i++){
      aposta[i] = vAposta[i];
    }
    ordenaNumeros();
    nPontos = 0;
    for (int i = 0;i < aposta.length;i++){
      for (int j = 0;j < resultado.length;j++){
        if (aposta[i] == resultado[j]){
          nPontos++;
        }
      }
    }
  }
  
  public int[] informeAposta(){
    int[] retAposta = new int[aposta.length];
    for (int i = 0;i < aposta.length;i++){
      retAposta[i] = aposta[i];
    }
    return retAposta;
  }
  
  public int informeQuantidadeApostada(){
    switch(aposta.length){
      case 6:
        return 1;
      case 7:
        return 7;
      case 8:
        return 28;
      case 9:
        return 168;
      case 10:
        return 1260;
      default:
        return 1;
    }
  }
  
  public int informeNPontos(){
    return nPontos;
  }
  
  private void ordenaNumeros(){
    int menor;
    int local;
    for (int i = 0;i < 5;i++){
      menor = aposta[i];
      local = i;
      for (int j = i + 1;j < 6;j++){
        if (aposta[j] < menor){
          menor = aposta[j];
          local = j;
        }
      }
      aposta[local] = aposta[i];
      aposta[i] = menor;
    }
  }
  
  public String toString(){
    return informeNome() + " fez " + nPontos + " pontos.";
  }
}