package uk.navico.exercise;

public class Player {

	private final String name;
	private int token;
	
	public Player(String name) {
		this.name = name;
		this.token = Board.initialPosition;
	}
	
	public String getName() {
		return name;
	}
	
	public int getToken() {
		return token;
	}
	
	public void setToken(int token) {
		this.token = token;
	}
	
}
