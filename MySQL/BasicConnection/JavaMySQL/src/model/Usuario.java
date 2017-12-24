package model;

public class Usuario {
	
	private int id;
	private String nome;
	private String email;
	private String senha;
	private char conectado;
	
	public Usuario() {
		
	}
	
	public Usuario(String no, String em, String se) {
		this.id = 0;
		this.nome = no;
		this.email = em;
		this.senha = se;
		this.conectado = '0';
	}
	
	public int getId() { return this.id;};
	public String getNome() { return this.nome; }
	public String getEmail() { return this.email; }
	public String getSenha() { return this.senha; }
	public char getConectado() { return this.conectado; }
	
}