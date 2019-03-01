package com.ubo.modele;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


@Entity
@NamedQuery(name="Formation.findAll", query="SELECT f FROM Formation f")
public class Formation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_FORMATION")
	private String codeFormation;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DEBUT_ACCREDITATION")
	private Date debutAccreditation;

	private String diplome;

	@Column(name="DOUBLE_DIPLOME")
	private String doubleDiplome;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FIN_ACCREDITATION")
	private Date finAccreditation;

	@Column(name="N0_ANNEE")
	private byte n0Annee;

	@Column(name="NOM_FORMATION")
	private String nomFormation;

	//bi-directional many-to-one association to Promotion
	//@OneToMany(mappedBy="formation")
	//private List<Promotion> promotions;

	public Formation() {
	}

	public String getCodeFormation() {
		return this.codeFormation;
	}

	public void setCodeFormation(String codeFormation) {
		this.codeFormation = codeFormation;
	}

	public Date getDebutAccreditation() {
		return this.debutAccreditation;
	}

	public void setDebutAccreditation(Date debutAccreditation) {
		this.debutAccreditation = debutAccreditation;
	}

	public String getDiplome() {
		return this.diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getDoubleDiplome() {
		return this.doubleDiplome;
	}

	public void setDoubleDiplome(String doubleDiplome) {
		this.doubleDiplome = doubleDiplome;
	}

	public Date getFinAccreditation() {
		return this.finAccreditation;
	}

	public void setFinAccreditation(Date finAccreditation) {
		this.finAccreditation = finAccreditation;
	}

	public byte getN0Annee() {
		return this.n0Annee;
	}

	public void setN0Annee(byte n0Annee) {
		this.n0Annee = n0Annee;
	}

	public String getNomFormation() {
		return this.nomFormation;
	}

	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}

	/*public List<Promotion> getPromotions() {
		return this.promotions;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

	public Promotion addPromotion(Promotion promotion) {
		getPromotions().add(promotion);
		promotion.setFormation(this);

		return promotion;
	}

	public Promotion removePromotion(Promotion promotion) {
		getPromotions().remove(promotion);
		promotion.setFormation(null);

		return promotion;
	}
*/
}
