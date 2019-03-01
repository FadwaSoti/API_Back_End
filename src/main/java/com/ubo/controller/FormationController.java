package com.ubo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ubo.modele.Formation;

@CrossOrigin
@RestController
@RequestMapping("/formation")
public class FormationController {
	@Autowired
	private ServiceFormation serviceFormation;

	// recuperer la liste des formations:
	@RequestMapping("/formations")
	public List<Formation> FormationAll() {
		return serviceFormation.ListeFormations();
	}

	// recuperer les formations par codeFormation:
	@RequestMapping("/formations/{codeFormation}")
	public Formation FormationByCode(@PathVariable String codeFormation) {
		return serviceFormation.findFormationByCode(codeFormation);
	}

	// recuperer les formations par nom:
	@RequestMapping("/formations/nom/{nomFormation}")
	public Formation FormationByName(@PathVariable String nomFormation) {
		return serviceFormation.findFormationByName(nomFormation);
	}

	// creer une formation:
	@RequestMapping(method = RequestMethod.POST, value = "/formations")
	public void addFormation(@RequestBody Formation formation) {
		serviceFormation.addAddFormation(formation);
	}

	// supprimer une formation par codeFormation:
	@RequestMapping(method = RequestMethod.DELETE, value = "formations/{codeFormation}")
	public void deleteFormationParCode(@PathVariable String codeFormation) {
		serviceFormation.deleteFormation(codeFormation);
	}

	// supprimer toutes les formations:
	@RequestMapping(method = RequestMethod.DELETE, value = "formations")
	public void deleteAllFormations() {
		serviceFormation.deleteFormations();
	}

	// mise a jour d'une formation:
	@RequestMapping(method = RequestMethod.PUT, value = "/formations")
	public void updateFormation(@RequestBody Formation formation) {
		serviceFormation.MSJFormation(formation);
	}

}
