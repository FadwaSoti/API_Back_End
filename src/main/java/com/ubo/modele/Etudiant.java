package com.ubo.modele;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;



@Entity
@NamedQuery(name="Etudiant.findAll", query="SELECT e FROM Etudiant e")
public class Etudiant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NO_ETUDIANT")
	private String noEtudiant;

	private String adresse;

	@Column(name="ANNEE_UNIVERSITAIRE")
	private String anneeUniversitaire;

	@Column(name="CODE_FORMATION")
	private String codeFormation;

	@Column(name="CODE_POSTAL")
	private String codePostal;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_NAISSANCE")
	private Date dateNaissance;

	private String email;

	@Column(name="EMAIL_UBO")
	private String emailUbo;

	@Column(name="GROUPE_ANGLAIS")
	private double groupeAnglais;

	@Column(name="GROUPE_TP")
	private double groupeTp;

	@Column(name="LIEU_NAISSANCE")
	private String lieuNaissance;

	private String mobile;

	private String nationalite;

	private String nom;

	@Column(name="PAYS_ORIGINE")
	private String paysOrigine;

	private String prenom;

	private String sexe;

	private String telephone;

	@Column(name="UNIVERSITE_ORIGINE")
	private String universiteOrigine;

	private String ville;

	public Etudiant() {
	}

	public String getNoEtudiant() {
		return this.noEtudiant;
	}

	public void setNoEtudiant(String noEtudiant) {
		this.noEtudiant = noEtudiant;
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

	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailUbo() {
		return this.emailUbo;
	}

	public void setEmailUbo(String emailUbo) {
		this.emailUbo = emailUbo;
	}

	public double getGroupeAnglais() {
		return this.groupeAnglais;
	}

	public void setGroupeAnglais(double groupeAnglais) {
		this.groupeAnglais = groupeAnglais;
	}

	public double getGroupeTp() {
		return this.groupeTp;
	}

	public void setGroupeTp(double groupeTp) {
		this.groupeTp = groupeTp;
	}

	public String getLieuNaissance() {
		return this.lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
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

}

