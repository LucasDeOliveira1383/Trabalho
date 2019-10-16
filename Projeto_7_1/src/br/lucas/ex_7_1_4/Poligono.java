package br.lucas.ex_7_1_4;

import br.lucas.ex_7_1_1.Ponto2D;

public class Poligono {
	public abstract Ponto2D centro();
	public abstract float perimetro();
	public abstract float area();
	public abstract float largura();
	public abstract float altura();
	
	public float distancia(Poligono forma) {
		return centro().distancia(forma.centro());
	}
	
	public String ObjectToString() {
		return super.toString();
	}
	
}
