package com.ubo.modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PromotionPK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(name="CODE_FORMATION", insertable=false, updatable=false)
	private String formation;
	
	@Column(name="ANNEE_UNIVERSITAIRE")
	private String anneeUniversitaire;

	public PromotionPK() {
	}

	public PromotionPK(String anneeUniversitaire, String formation) {
		super();
		this.anneeUniversitaire = anneeUniversitaire;
		this.formation = formation;
	}

	public String getAnneeUniversitaire() {
		return anneeUniversitaire;
	}

	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anneeUniversitaire == null) ? 0 : anneeUniversitaire.hashCode());
		result = prime * result + ((formation == null) ? 0 : formation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PromotionPK other = (PromotionPK) obj;
		if (anneeUniversitaire == null) {
			if (other.anneeUniversitaire != null)
				return false;
		} else if (!anneeUniversitaire.equals(other.anneeUniversitaire))
			return false;
		if (formation == null) {
			if (other.formation != null)
				return false;
		} else if (!formation.equals(other.formation))
			return false;
		return true;
	}

	
}