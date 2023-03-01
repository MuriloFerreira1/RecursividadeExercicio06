package controller;

public class Controller {
	public double somaSequenciaFatorial(int n) {
		if(n==1) {
			//Para de executar quando o valor recebido � 0
			return 1;
		}else {
			//calcula a posi��o atual e compara a posi��o anterior
			double calculo=(1/(double)fatorial(n));
			return calculo+somaSequenciaFatorial(n-1);
		}
	}
	
	public int fatorial(int entrada) {
		if(entrada>0) {
			//c�lcudo a multiplica��o do termo atual com os termos anteriores
			return entrada*fatorial(entrada-1);
		}else {
			//condi��o de parada onde entrada alcan�a 0
			return 1;
		}
	}
}
