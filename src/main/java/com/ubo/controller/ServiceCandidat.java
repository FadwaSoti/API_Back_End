package com.ubo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubo.modele.Candidat;
import com.ubo.repository.CandidatRepository;

@Service
public class ServiceCandidat {

	@Autowired
	CandidatRepository candidatRepository;
	

	// retourner la liste des candidats:
	public List<Candidat> ListeCandidats() {
		return candidatRepository.findAll();
	}

	// retourner un candidat par nom:
	public Candidat findCandidatByName(String nom) {
		List<Candidat> listeDesCandidat = candidatRepository.findAll();
		return listeDesCandidat.stream().filter(t -> t.getNom().equals(nom)).findFirst().get();
	}

	// retourner un candidat par id:
	public Candidat findCandidatById(String noCandidat) {
		List<Candidat> listeDesCandidat = candidatRepository.findAll();
		return listeDesCandidat.stream().filter(t -> t.getNoCandidat().equals(noCandidat)).findFirst().get();
	}

	// retourner les candidats d'une université:
	public Candidat findCandidatByUniversite(String universiteOrigine) {
		List<Candidat> listeDesCandidat = candidatRepository.findAll();
		return listeDesCandidat.stream().filter(t -> t.getUniversiteOrigine().equals(universiteOrigine)).findFirst()
				.get();
	}

	// supprimer un candidat par id:
	public void deleteCandidat(String noCandidat) {
		candidatRepository.deleteById(noCandidat);

	}

	// supprimer tous les candidats:
	public void deleteCandidats() {
		candidatRepository.deleteAll();
	}

	// ajouter un candidat:
	public void addCandidat(Candidat candidat) {
		candidatRepository.save(candidat);
	}

}
