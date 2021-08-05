package entities;

import entities.interfacesentities.GameEntitiy;

public class GameInfo implements GameEntitiy{
	private int id;
	private String nationality;
	private String firstName;
	private String lastName;
	private String dateofBirth;
	
	public GameInfo(){
		
	}
	public GameInfo(int id, String nationality, String firstName, String lastName, String dateofBirth) {
		super();
		this.id = id;
		this.nationality = nationality;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

}
