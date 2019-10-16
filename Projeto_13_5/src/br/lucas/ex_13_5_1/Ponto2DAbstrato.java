package br.lucas.ex_13_5_1;

public class Ponto2DAbstrato {
	
	private int x;
	private int y;
	
	public Ponto2DAbstrato() {
		x = 0;
		y = 0;
	}
	
	public Ponto2DAbstrato (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String quadrante() {
		if (x > 0 && y > 0)
			return "I Quadrante";
		if (x < 0 && y > 0)
			return "II Quadrante";
		if (x < 0 && y < 0)
			return "III Quadrante";
		if (x > 0 && y < 0)
			return "IV Quadrante";
		return "Origem";
	}
	
	public float distancia (Ponto2DAbstrato pt) {
		return (float) Math.sqrt((x-pt.x)*(x-pt.x) + (y-pt.y)*(y-pt.y));
	}
	
	public Ponto2DAbstrato centro() {
		return new Ponto2DAbstrato(x, y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(!obj.getClass().equals(Ponto2DAbstrato.class))
			return false;
		if(obj == this)
			return true;
		
		if(this.x != ((Ponto2DAbstrato)obj).x)
			return false;
		if(this.y != ((Ponto2DAbstrato)obj).y)
			return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "(" + x + ";" + y + ")";
	}
	
	public float perimetro() {
		return 0;
	}
	
	public float area() {
		return 0;
	}
	
	public float largura() {
		return 0;
	}
	
	public float altura() {
		return 0;
	}
	
}
