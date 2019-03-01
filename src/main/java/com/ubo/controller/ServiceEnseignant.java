package com.ubo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubo.modele.Enseignant;
import com.ubo.repository.EnseignantRepository;

@Service
public class ServiceEnseignant {
	@Autowired
	EnseignantRepository enseignantrepository;

	// Recuperer tous les enseignants:
	public List<Enseignant> getAllEnseignant() {
		return enseignantrepository.findAll();
	}

	
	
	// recuperer un enseignant par id:
	public Optional<Enseignant> getEnseignant(int noenseignant) {
		return enseignantrepository.findById(noenseignant);
	}

	
	
	
	// retourner un enseignant par nom:
	public Enseignant findEnseignantByName(String nom) {
		List<Enseignant> listeDesCandidat = enseignantrepository.findAll();
		return listeDesCandidat.stream().filter(t -> t.getNom().equals(nom)).findFirst().get();
	}

	// retourner un enseignant par universite:
	public Enseignant findEnseignantByEmailUbo(String email) {
		List<Enseignant> listeDesCandidat = enseignantrepository.findAll();
		return listeDesCandidat.stream().filter(t -> t.getEmailUbo().equals(email)).findFirst().get();
	}
	
	
	
	// retourner un enseignant par universite:
		public Enseignant findEnseignantByNoEnseignant(int noEnseignant) {
			List<Enseignant> listeDesCandidat = enseignantrepository.findAll();
			return listeDesCandidat.stream().filter(t -> t.getNoEnseignant() == (noEnseignant)).findFirst().get();
		}
	
	//ajouter un enseignant:
	public void addEnseignant(Enseignant enseignant) {
		enseignantrepository.save(enseignant);
	}
	
	//supprimer tous les enseignants:
	public void deleteAllEnseignant() {
		enseignantrepository.deleteAll();
	}

}

