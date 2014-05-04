/*
 * @autor Juliano Kasmirski Zatta
 * @turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402.git
 *
 */
 
import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[] p){
        Interface aInterface = new Interface();
        Relogio maiorHorario = new Relogio();
        Relogio tempRelogio;
        boolean horarioNulo = false;
				System.out.println((-10 % 3));
        do{
					tempRelogio = aInterface.pegueRelogio();
					if (maiorHorario.horarioMaior(tempRelogio)){
						maiorHorario = tempRelogio;
					}
					if (tempRelogio.fornecaHorario().equals("0:0:0")){
						horarioNulo = true;
					}
        }while (aInterface.desejaContinuar());
        aInterface.mostreMaiorHorario(maiorHorario.fornecaHorario());
        aInterface.mostreHorarioNulo(horarioNulo);
    }
}