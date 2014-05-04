/*
 * @autor Juliano Kasmirski Zatta
 * @turma 1208A
 * @Disponivel em: https://github.com/jzatta/INE5402.git
 *
 */

public class Relogio{
	private int hora;
	private int minuto;
	private int segundo;
	
	public Relogio(){
		hora = 0;
		minuto = 0;
		segundo = 0;
	}
	
	public Relogio(int vHora, int vMinuto, int vSegundo){
		segundo = vSegundo % 60;
		vMinuto += vSegundo / 60;
		minuto = vMinuto % 60;
		vHora += vMinuto / 60;
		hora = vHora % 24;
	}
	
	public String fornecaHorario(){
		return new String(Integer.toString(hora) + ":" +
		Integer.toString(minuto) + ":" +
		Integer.toString(segundo));
	}
	
	public boolean horarioMaior(Relogio vR){
		if (vR.hora > hora){
			return true;
		}
		else if (vR.hora < hora){
			return false;
		}
		if (vR.minuto > minuto){
			return true;
		}
		else if (vR.minuto < minuto){
			return false;
		}
		if (vR.segundo > segundo){
			return true;
		}
		return false;
	}
	
	public void tictac(){
		segundo++;
		if (segundo > 59){
			minuto++;
			if (minuto > 59){
				hora++;
				if (hora > 23){
					hora = 0;
				}
			}
		}
		return;
	}
	
	
}