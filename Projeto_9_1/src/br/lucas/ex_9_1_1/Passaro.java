package br.lucas.ex_9_1_1;

public class Passaro {
	
	int qtdPassaros;
	
	public void venda(){
		System.out.println("P�ssaros dispon�veis ");
	}
	
	public static void main(String[] args) {
		Passaro passaro = new Passaro();
		passaro.venda();
	}
	
}
