package dia091116;

import java.util.Scanner;

public class TreinoArrays {

	public TreinoArrays() {
		         //n.golos num jogo: 
				//Porto-Benfica
				// tipo de variavel;[] array; nome de variavel; inicialização
				//tamanho de variavel
			int  [] golos = new int [2];
			
			//atribuir variaveis ao array
			golos[0] = 1;
			
			//Não valido, pois o array é de inteiros
			//	golos[]="1";
			golos[1] = 1;

			//instanciação com inicialização de variaveis 
			 int [] portoBenfica    = {1, 1};
			 
			 int [] sportingArouca = {3, 0};
			
			 int[] maritimoBraga = {1,0};
			
			int [][] jogosGrandes = new int [2][3];
			
			jogosGrandes [0][0] = portoBenfica[0];
			jogosGrandes [1][0] = portoBenfica[1];
			jogosGrandes [0][1] = sportingArouca[0];
			jogosGrandes [1][1] = sportingArouca[1];
			jogosGrandes [0][2] = maritimoBraga[0];
			jogosGrandes [1][2] = maritimoBraga[1];
			
			System.out.println(jogosGrandes[0][0]);
			
	
	}


	
	
}
