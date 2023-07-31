package it.unicam.cs.ids.LoyaltyPlatformIDS;

public class LoggedUser implements User {

	int id, livello;
	String nome, cognome, email, password;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getLivello() {
		return livello;
	}



	public void setLivello(int livello) {
		this.livello = livello;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public void checkData() {
		// TODO Auto-generated method stub

	}

}
