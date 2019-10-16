package br.lucas.ex_3_5_1;

public class FuncionarioAumentoSalarial {
	
	private String nome;
	private String sobrenome;
	private double pagamento;
	private double convencao;
	
	public FuncionarioAumentoSalarial (String nome, String sobrenome, double pagamento, double convencao) {
		
	}
	
	public void setNome(String nome) {
		nome = Nome;
	}
	
	public void setSobrenome (String sobrenome) {
		sobrenome = Sobrenome;
	}
	
	public void setPagamento (double salario) {
		pagamento = salario;
	}
	
	public void convencao(double aumento) {
		convencao = pagamento*10/100;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public double getPagamento() {
		return pagamento;
	}
	
	public double getConvencao() {
		return convencao;
	}
	
}
