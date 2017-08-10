/**
 * Rider POJO.
 */
package net.luisalbertogh.microservices.riders;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author loga
 *
 */
@Entity
public final class Rider {
	private String name;
	private String team;
	private String nationality;
	private int victories;
	
	/**
	 * Default constructor.
	 */
	public Rider(){
		/* EMPTY */
	}
	
	/**
	 * Constructor with params.
	 * @param name
	 * @param team
	 * @param nationality
	 * @param victories
	 */
	public Rider(String name, String team, String nationality, int victories) {
		this.name = name;
		this.team = team;
		this.nationality = nationality;
		this.victories = victories;
	}
	/**
	 * @return the name
	 */
	@Id
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}
	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return the victories
	 */
	public int getVictories() {
		return victories;
	}
	/**
	 * @param victories the victories to set
	 */
	public void setVictories(int victories) {
		this.victories = victories;
	}
}
