package controller;

public class Controller {
	public double somaSequenciaFatorial(int n) {
		if(n==1) {
			//Para de executar quando o valor recebido é 0
			return 1;
		}else {
			//calcula a posição atual e compara a posição anterior
			double calculo=(1/(double)fatorial(n));
			return calculo+somaSequenciaFatorial(n-1);
		}
	}
	
	public int fatorial(int entrada) {
		if(entrada>0) {
			//cálcudo a multiplicação do termo atual com os termos anteriores
			return entrada*fatorial(entrada-1);
		}else {
			//condição de parada onde entrada alcança 0
			return 1;
		}
	}
}
