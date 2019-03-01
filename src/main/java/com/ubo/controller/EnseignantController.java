package com.ubo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ubo.modele.Enseignant;

@CrossOrigin
@RestController
@RequestMapping("/enseignant")
public class EnseignantController {

	@Autowired
	private ServiceEnseignant serviceEnseignant;

	// Recuperer tous les enseignants:
	@RequestMapping("/enseignants")
	public List<Enseignant> enseignantAll() {
		return serviceEnseignant.getAllEnseignant();
	}

	// Recuperer un enseignant par id:
	@RequestMapping("enseignants/{noEnseignant}")
	public Optional<Enseignant> enseignantById(@PathVariable int noEnseignant) {
		return serviceEnseignant.getEnseignant(noEnseignant);
	}

	// recuperer un enseignant par nom:
	@RequestMapping("enseignants/nom/{nom}")
	public Enseignant enseignantByName(@PathVariable String nom) {
		return serviceEnseignant.findEnseignantByName(nom);
	}

	// recuperer un enseignant par universite:
	@RequestMapping("enseignants/emailubo/{emailUbo}")
	public Enseignant enseignantByMail(@PathVariable String emailUbo) {
		return serviceEnseignant.findEnseignantByEmailUbo(emailUbo);
	}

	// creer un enseignant:
	@RequestMapping(method = RequestMethod.POST, value = "/enseignants")
	public void addEnseignant(@RequestBody Enseignant enseignant) {
		serviceEnseignant.addEnseignant(enseignant);
	}

	// supprimer tous les enseignants:
	@RequestMapping(method = RequestMethod.DELETE, value = "/enseignants")
	public void deleteAllEnseignant() {
		serviceEnseignant.deleteAllEnseignant();
	}
}
