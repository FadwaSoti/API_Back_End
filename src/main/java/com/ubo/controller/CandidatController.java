package com.ubo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ubo.modele.Candidat;

@CrossOrigin
@RestController
@RequestMapping("/candidat")
public class CandidatController {

	@Autowired
	private ServiceCandidat serviceCandidat;

	// recuperer la liste de tous les candidats:
	@RequestMapping("/candidats")
	public List<Candidat> all() {
		return serviceCandidat.ListeCandidats();
	}

	// recuperer un candidat par id:
	@RequestMapping("/candidats/{noCandidat}")
	public Candidat ByID(@PathVariable String noCandidat) {
		return serviceCandidat.findCandidatById(noCandidat);
	}

	// recuperer un candidat par nom:
	@RequestMapping("/candidats/nom/{nom}")
	public Candidat ByName(@PathVariable String nom) {
		return serviceCandidat.findCandidatByName(nom);
	}

	// recuperer un candidat par universite d'origine:
	@RequestMapping("/candidat/universite/{universiteOrigine}")
	public Candidat ByUniversity(@PathVariable String universiteOrigine) {
		return serviceCandidat.findCandidatByUniversite(universiteOrigine);
	}

	// supprimer un condidat par id:
	@RequestMapping(method = RequestMethod.DELETE, value = "candidats/{id}")
	public void deleteCandidat(@PathVariable String id) {
		serviceCandidat.deleteCandidat(id);
	}

	// supprimer tous les condidats:
	@RequestMapping(method = RequestMethod.DELETE, value = "candidats")
	public void deleteAllCandidats() {
		serviceCandidat.deleteCandidats();
	}

	// ajouter un candidat:
	@RequestMapping(method = RequestMethod.POST, value = "/candidats")
	public void addCandidat(@RequestBody Candidat candidat) {
		serviceCandidat.addCandidat(candidat);
	}

}
