package dia091116;
import java.util.Scanner;

public class Desafios {

	public Desafios() {
		// TODO Auto-generated constructor stub
	    //exer1();
		exer3();
	}
	public void exer1(){
		//II
		//Exerc�cio 1
	    //O utilizador coloca 3 notas e � feita a media dessas 3 notas. Consoante o resultado da media � comparado, se � maior ou igual a 10, est� aprovado menor que 10 esta reprovado 
			
		int  [] notas = new int [3];
		System.out.println ("Introduza a 1 nota ");
		notas[0] = (new Scanner(System.in)).nextInt();
		System.out.println ("Introduza a 2 nota ");
		notas[1] = (new Scanner(System.in)).nextInt();
		System.out.println ("Introduza a 3 nota ");
		notas[2] = (new Scanner(System.in)).nextInt();
	
		int media =( notas[0]+ notas[1]+ notas[2])/3;
		
		if (media >=10)
		{
			System.out.println ("A media �: "+ media +"esta aprovado");
		}
		else 
		{
			System.out.println ("A media e  "+ media +" esta reprovado");
		}
		
	}
	public void exer2(){
		//III
		//Exerc�cio 3
	    //O utilizador coloca 3 notas a dois alunos e � feita a media dessas 3 notas. Consoante o resultado da media � comparado, se � maior ou igual a 10, est� aprovado menor que 10 esta reprovado 

		int  [][] notas = new int[3] [2];
		//Pedir as 3 notas do aluno Bruno
		System.out.println ("Introduza a 1 nota do Bruno:  ");
		notas[0][0] = (new Scanner(System.in)).nextInt();
		System.out.println ("Introduza a 2 nota do Bruno:   ");
		notas[1] [0]= (new Scanner(System.in)).nextInt();
		System.out.println ("Introduza a 3 nota do Bruno:   ");
		notas[2][0] = (new Scanner(System.in)).nextInt();
		//Pedir as 3 notas do aluno Silva
		System.out.println ("Introduza a 1 nota do aluno Silva: ");
		notas[0][1] = (new Scanner(System.in)).nextInt();
		System.out.println ("Introduza a 2 nota do aluno Silva:  ");
		notas[1] [1]= (new Scanner(System.in)).nextInt();
		System.out.println ("Introduza a 3 nota do aluno Silva:  ");
		notas[2][1] = (new Scanner(System.in)).nextInt();
		
		
		 
		int mediaBruno =( notas[0][0]+ notas[1][0]+ notas[2][0])/3;
		
			
				
			if (mediaBruno >=10)
					{
						System.out.println ("A media do aluno Bruno � "+ mediaBruno +" esta aprovado");
					}
					else 
					{
						System.out.println ("A media do aluno Bruno �  "+ mediaBruno +" esta reprovado");
					}
		
			int mediaSilva =( notas[0][1]+ notas[1][1]+ notas[2][1])/3;
		
					if (mediaSilva >=10)
					{
						System.out.println ("A media do aluno Silva �  "+ mediaSilva +"  esta aprovado");
					}
					else 
					{
						System.out.println ("A media do aluno Silva  �  "+ mediaSilva +"  esta reprovado");
					}
		}
				
	
	public void exer3(){
		
		int  [] num = new int [2];
		// I
		//Pedir 2 numeros e compara los 
		System.out.println ("Introduza um valor:  ");
		num[0] = (new Scanner(System.in)).nextInt();
		System.out.println ("Introduza um valor:  ");
		num[1] = (new Scanner(System.in)).nextInt();
		
		if (num[0] > num[1])
		{
			System.out.println ("O numero  " + num[0] + " � o maior");
		}
		else
		{
			System.out.println ("O numero  " + num[1] + " � o maior");
		}
		
	}
	}
	

	



	
	
	
	
	

