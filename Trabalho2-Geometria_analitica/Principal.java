/*
 * @Autor Juliano Kasmirski Zatta
 * @Turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402.git
 *
 */

public class Principal{
  public static void main(String[] args){
    double x, y;
    Interface aInterface = new Interface();
    x = aInterface.pegueX();
    y = aInterface.pegueY();
    Ponto umPonto = new Ponto(x,y);
    x = aInterface.pegueX();
    y = aInterface.pegueY();
    Ponto outroPonto = new Ponto(x,y);
    aInterface.mostreDistanciaOrigem(umPonto.informeCoordenadas(),
                                     umPonto.informeDistanciaOrigem());
    aInterface.mostreDistanciaOrigem(outroPonto.informeCoordenadas(),
                                     outroPonto.informeDistanciaOrigem());
    aInterface.mostreDistanciaPontos(umPonto.informeCoordenadas(),
                                     outroPonto.informeCoordenadas(),
                                     umPonto.informeDistanciaPonto(outroPonto));
  }
}