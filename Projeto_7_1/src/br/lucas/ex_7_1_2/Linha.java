package br.lucas.ex_7_1_2;

import br.lucas.ex_7_1_1.Ponto2D;

public class Linha {
	private Ponto2D a;
	private Ponto2D b;
	
	public Linha() {
		a = new Ponto2D();
		b = new Ponto2D();
	}
	
	public Linha(Ponto2D a, Ponto2D b) {
		this.a = new Ponto2D(a.getX(), a.getY());
		this.b = new Ponto2D(b.getX(), b.getY());
	}
	
	public Ponto2D getA() {
		return new Ponto2D(a.getX(), a.getY());
	}
	
	public void setA(Ponto2D a) {
		this.a = new Ponto2D (a.getX(), a.getY());
	}
	
	public Ponto2D getB() {
		return new Ponto2D(b.getX(), b.getY());
	}
	
	public void setB(Ponto2D b) {
		this.b = new Ponto2D(b.getX(), b.getY());
	}
	
	public Ponto2D centro() {
		return new Ponto2D((a.getX()+b.getX())/2, (a.getY() + b.getY())/2);
	}
	
	@Override
	public String toString() {
		return "[" + a + ";" + b + "]";
	}
	
	@Override
	public float perimetro() {
		return a.distancia(b);
	}
	
	@Override
	public float area() {
		return 0;
	}
	
	@Override
	public float largura() {
		return Math.abs(a.getX() - b.getX());
	}
	
	@Override
	public float altura() {
		return Math.abs(a.getY() - b.getY());
	}
	
}
