package com.ubo.modele;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the candidat database table.
 * 
 */
@Entity
@NamedQuery(name="Candidat.findAll", query="SELECT c FROM Candidat c")
public class Candidat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NO_CANDIDAT")
	private String noCandidat;

	private String adresse;

	@Column(name="ANNEE_UNIVERSITAIRE")
	private String anneeUniversitaire;

	@Column(name="CODE_FORMATION")
	private String codeFormation;

	@Column(name="CODE_POSTAL")
	private String codePostal;

	@Column(name="CONFIRMATION_CANDIDAT")
	private String confirmationCandidat;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_NAISSANCE")
	private Date dateNaissance;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_REPONSE_CANDIDAT")
	private Date dateReponseCandidat;

	private String email;

	@Column(name="LIEU_NAISSANCE")
	private String lieuNaissance;

	@Column(name="LISTE_SELECTION")
	private String listeSelection;

	private String mobile;

	private String nationalite;

	private String nom;

	@Column(name="PAYS_ORIGINE")
	private String paysOrigine;

	private String prenom;

	@Column(name="SELECTION_NO_ORDRE")
	private Double selectionNoOrdre;

	private String sexe;

	private String telephone;

	@Column(name="UNIVERSITE_ORIGINE")
	private String universiteOrigine;

	private String ville;

	public Candidat() {
	}

	public String getNoCandidat() {
		return this.noCandidat;
	}

	public void setNoCandidat(String noCandidat) {
		this.noCandidat = noCandidat;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getAnneeUniversitaire() {
		return this.anneeUniversitaire;
	}

	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	public String getCodeFormation() {
		return this.codeFormation;
	}

	public void setCodeFormation(String codeFormation) {
		this.codeFormation = codeFormation;
	}

	public String getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getConfirmationCandidat() {
		return this.confirmationCandidat;
	}

	public void setConfirmationCandidat(String confirmationCandidat) {
		this.confirmationCandidat = confirmationCandidat;
	}

	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDateReponseCandidat() {
		return this.dateReponseCandidat;
	}

	public void setDateReponseCandidat(Date dateReponseCandidat) {
		this.dateReponseCandidat = dateReponseCandidat;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLieuNaissance() {
		return this.lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	public String getListeSelection() {
		return this.listeSelection;
	}

	public void setListeSelection(String listeSelection) {
		this.listeSelection = listeSelection;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNationalite() {
		return this.nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPaysOrigine() {
		return this.paysOrigine;
	}

	public void setPaysOrigine(String paysOrigine) {
		this.paysOrigine = paysOrigine;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Double getSelectionNoOrdre() {
		return this.selectionNoOrdre;
	}

	public void setSelectionNoOrdre(Double selectionNoOrdre) {
		this.selectionNoOrdre = selectionNoOrdre;
	}

	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUniversiteOrigine() {
		return this.universiteOrigine;
	}

	public void setUniversiteOrigine(String universiteOrigine) {
		this.universiteOrigine = universiteOrigine;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Candidat(String noCandidat, Date dateNaissance) {}
	
	
	
	public Candidat(String noCandidat, String adresse, String anneeUniversitaire, String codeFormation,
			String codePostal, String confirmationCandidat, Date dateNaissance, Date dateReponseCandidat, String email,
			String lieuNaissance, String listeSelection, String mobile, String nationalite, String nom,
			String paysOrigine, String prenom, double selectionNoOrdre, String sexe, String telephone,
			String universiteOrigine, String ville) {
		super();
		this.noCandidat = noCandidat;
		this.adresse = adresse;
		this.anneeUniversitaire = anneeUniversitaire;
		this.codeFormation = codeFormation;
		this.codePostal = codePostal;
		this.confirmationCandidat = confirmationCandidat;
		this.dateNaissance = dateNaissance;
		this.dateReponseCandidat = dateReponseCandidat;
		this.email = email;
		this.lieuNaissance = lieuNaissance;
		this.listeSelection = listeSelection;
		this.mobile = mobile;
		this.nationalite = nationalite;
		this.nom = nom;
		this.paysOrigine = paysOrigine;
		this.prenom = prenom;
		this.selectionNoOrdre = selectionNoOrdre;
		this.sexe = sexe;
		this.telephone = telephone;
		this.universiteOrigine = universiteOrigine;
		this.ville = ville;
	}

	public Candidat(String s1, String s2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Candidat [noCandidat=" + noCandidat + ", adresse=" + adresse + ", anneeUniversitaire="
				+ anneeUniversitaire + ", codeFormation=" + codeFormation + ", codePostal=" + codePostal
				+ ", confirmationCandidat=" + confirmationCandidat + ", dateNaissance=" + dateNaissance
				+ ", dateReponseCandidat=" + dateReponseCandidat + ", email=" + email + ", lieuNaissance="
				+ lieuNaissance + ", listeSelection=" + listeSelection + ", mobile=" + mobile + ", nationalite="
				+ nationalite + ", nom=" + nom + ", paysOrigine=" + paysOrigine + ", prenom=" + prenom
				+ ", selectionNoOrdre=" + selectionNoOrdre + ", sexe=" + sexe + ", telephone=" + telephone
				+ ", universiteOrigine=" + universiteOrigine + ", ville=" + ville + "]";
	}

}