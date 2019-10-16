package br.lucas.ex_16_1;

public class ListaDuplaEncadeada {
	
	private DNode inicio;
	private DNode fim;
	private int tam;
	
	public ListaDuplaEncadeada() {
		inicio = new DNode(null, null, null);
		fim = new DNode(inicio, null, null);
		inicio.setProx(fim);
		tam = 0;
	}
	
	public DNode insertFirst(Object elemento) {
		DNode novoNo = new DNode(inicio, inicio.getProx(), elemento);
		inicio.getProx().setAnt(novoNo);
		inicio.setProx(novoNo);
		tam++;
		return novoNo;
	}
	
	public DNode insertLast(Object elemento) {
		DNode novoNo = new DNode(fim.getAnt(), fim, elemento);
		fim.getAnt().setProx(novoNo);
		fim.setAnt(novoNo);
		tam++;
		return novoNo;
	}
	
	public DNode insertBefore(DNode no, Object elemento) {
		DNode novoNo = new DNode(no.getAnt(), no, elemento);
		no.getAnt().setProx(novoNo);
		no.setAnt(novoNo);
		tam++;
		return novoNo;
	}
	
	public Object getFirst() {
		if(!isEmpty()) {
			return inicio.getProx();
		} else {
			System.out.println("Lista Vazia");
			return null;
		}
	}
	
	public Object getLast() {
		if(!isEmpty()) {
			return fim.getAnt();
		} else {
			System.out.println("Lista Vazia");
			return null;
		}
	}
	
	public Object remove(DNode no) {
		Object temp = no.getElemento();
		no.getProx().setAnt(no.getAnt());
		no.getAnt().setProx(no.getProx());
		tam--;
		return temp;
	}
	
	public Object removeFirst() {
		if(!isEmpty()) {
			Object temp = inicio.getProx().getElemento();
			inicio.setProx(inicio.getProx().getProx());
			inicio.getProx().setAnt(inicio);
			tam--;
			return temp;
		} else {
			System.out.println("Lista Vazia");
			return null;
		}
	}
	
	public Object removeLast() {
		if(!isEmpty()) {
			Object temp = fim.getAnt().getElemento();
			fim.setAnt(fim.getAnt().getAnt());
			fim.getAnt().setProx(fim);
			tam--;
			return temp;
		} else {
			System.out.println("Lista Vazia");
			return null;
		}
	}
	
	public int size() {
		return tam;
	}
	
	public boolean isEmpty() {
		return tam == 0;
	}
	
	public void imprimir() {
		DNode aux = (DNode) getFirst();
		while(aux != fim) {
			System.out.print(aux.getElemento() + " ");
			aux = aux.getProx();
		}
		System.out.println();
	}
	
}
