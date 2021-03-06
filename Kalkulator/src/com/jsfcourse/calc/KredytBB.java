package com.jsfcourse.calc;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@RequestScoped

public class KredytBB {
	private String kwota;
	private String oprocentowanie;
	private Double rata;

	
	public String getKwota() {
		return kwota;
	}

	public void setKwota(String kwota) {
		this.kwota = kwota;
	}

	public String getOprocentowanie() {
		return oprocentowanie;
	}

	public void setOprocentowanie(String oprocentowanie) {
		this.oprocentowanie = oprocentowanie;
	}

	
	public Double getRata() {
		return rata;
	}

	public void setRata(Double rata) {
		this.rata = rata;
	}

	
	
	public boolean doTheMath() {
		try {
			double kwota = Double.parseDouble(this.kwota);
			double oprocentowanie = Double.parseDouble(this.oprocentowanie);

			rata =( (oprocentowanie * kwota)/ 100) ;

			ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "OK", null));
			return true;
		} catch (Exception e) {
			ctx.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "B��d ", null));
			return false;
		}
	}



	@Inject
	FacesContext ctx;

	public String calc() {
		
		if (doTheMath()) {
			return "showresult";
		}
		return null;
		
	}

}
