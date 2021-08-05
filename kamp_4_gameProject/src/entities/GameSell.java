package entities;

import entities.interfacesentities.GameSellEntitity;

public class GameSell implements GameSellEntitity{
	private int id;
	private String gameName;
	private int gamePrice;
	
	public GameSell(int id, String gameName, int gamePrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}
	
	public GameSell() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}

}
