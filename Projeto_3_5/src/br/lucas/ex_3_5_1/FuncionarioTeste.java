package br.lucas.ex_3_5_1;

import java.util.Scanner;

public class FuncionarioTeste {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		FuncionarioAumentoSalarial funcionario1 = new FuncionarioAumentoSalarial(null, null, 0.0, 0.0);
		
		System.out.print("Digite o nome do funcionario: \n");
		String Nome = input.nextLine();
		funcionario1.setNome(Nome);
		
		System.out.print("Digite o sobrenome do funcionario: \n");
		String Sobrenome = input.nextLine();
		funcionario1.setSobrenome(Sobrenome);
		
		System.out.print("Digite o salario do funcionario: \n");
		double salario = input.nextDouble();
		funcionario1.setPagamento(salario);
		
		System.out.print("Digite o percentual de aumento: \n");
		double aumento = input.nextDouble();
		funcionario1.setPagamento(aumento);
		
		System.out.printf("Funcionario: %s %s\n", funcionario1.getNome(), funcionario1.getSobrenome());
		System.out.printf("Salario: %.2f\n", funcionario1.getPagamento());
		System.out.printf("Salario atualizado: %.2f \n\n\n", funcionario1.getConvencao());
		
	}
	
}
