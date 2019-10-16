package br.lucas.ex_8_5_1;

import java.util.Scanner;

public class Aluno {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		int nota1, nota2, nota3, nota4;
		int media, i, contAluno = 0;
		
		for (i=0; i<4; i++) {
			contAluno++;
			System.out.println("Aluno " + contAluno + ", digite a nota 1");
			nota1 = ent.nextInt();
			
			System.out.println("Aluno " + contAluno + ", digite a nota 2");
			nota2 = ent.nextInt();
			
			System.out.println("Aluno " + contAluno + ", digite a nota 3");
			nota3 = ent.nextInt();
			
			System.out.println("Aluno " + contAluno + ", digite a nota 4");
			nota4 = ent.nextInt();
			
			media = (nota1 + nota2 + nota3 + nota4) / 4;
			System.out.println("A média do aluno " + contAluno + " é " + media);
			
			if(media >= 7) {
				System.out.println("O aluno foi aprovado");
			} else if (media <= 7) {
				System.out.println("O aluno está de exame");
			} else if (media <= 4) {
				System.out.println("O aluno foi reprovado");
			}
		}
		
	}
	
}
