package br.lucas.ex_16_2;

public class ManipulaListaDupEncad {
	
	private ManipulaListaDupEncad proxima;
	private ManipulaListaDupEncad anterior;
	private Object elemento;
	
	public ManipulaListaDupEncad(ManipulaListaDupEncad proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
	public ManipulaListaDupEncad(Object elemento) {
		this.elemento = elemento;
	}
	
	public void setProxima(ManipulaListaDupEncad proxima) {
		this.proxima = proxima;
	}
	
	public ManipulaListaDupEncad getProxima() {
		return proxima;
	}
	
	public void setAnterior(ManipulaListaDupEncad anterior) {
		this.anterior = anterior;
	}
	
}
