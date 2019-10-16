package br.lucas.ex_16_4;

public class Fila {
	
	public static void main(String[] args) {
		Fila fila = new Fila();
		
		Usuario usuario = new Usuario();
		fila.insere(usuario);
		
		Usuario usuarioRemovido = fila.remove();
		
		if(fila.vazia()) {
			System.out.println("A fila está vazia");
		}
	}
	
	private List<Usuario> usuarios = new LinkedList<Usuario>();
	
	public void insere (Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public Usuario remove() {
		return this.usuarios.remove(0);
	}
	
	public boolean vazia() {
		return this.usuarios.size() == 0;
	}
	
}
