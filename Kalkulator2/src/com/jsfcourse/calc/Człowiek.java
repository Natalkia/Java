package com.jsfcourse.calc;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;



@Entity
@NamedQuery(name="Człowiek.findAll", query="SELECT p FROM Człowiek p")
public class Człowiek implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idczł;

	@Temporal(TemporalType.DATE)
	private Date data_urodzenia;

	private String imie;

	private String nazwisko;

	public Person() {
	}

	public int getIdCzł() {
		return this.idczł;
	}

	public void setIdCzł(int idczł) {
		this.idczł = idczł;
	}

	public Date getDataUrodzenia() {
		return this.data_urodzenia;
	}

	public void setDataUrodzenia(Date data_urodzenia) {
		this.data_urodzenia = data_urodzenia;
	}

	public String getImie() {
		return this.imie;
	}

	public void setName(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

}