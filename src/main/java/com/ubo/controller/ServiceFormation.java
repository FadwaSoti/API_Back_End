package com.ubo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubo.modele.Formation;
import com.ubo.repository.FormationRepository;

@Service
public class ServiceFormation {

	@Autowired
	FormationRepository formationRepository;

	// retourner la liste des formations:
	public List<Formation> ListeFormations() {
		return formationRepository.findAll();
	}

	// retourner la formation par code:
	public Formation findFormationByCode(String codeFormation) {

		List<Formation> listeDesFormations = formationRepository.findAll();
		return listeDesFormations.stream().filter(t -> t.getCodeFormation().equals(codeFormation)).findFirst().get();
	}

	// retourner la formation par nom:
	public Formation findFormationByName(String nomFormation) {

		List<Formation> listeDesFormationsParNom = formationRepository.findAll();
		return listeDesFormationsParNom.stream().filter(t -> t.getNomFormation().equals(nomFormation)).findFirst()
				.get();
	}

	// creer une formation:
	public void addAddFormation(Formation formation) {
		formationRepository.save(formation);

	}

	// supprimer une formation par code de formation:
	public void deleteFormation(String codeFormation) {
		formationRepository.deleteById(codeFormation);
	}

	// supprimer toutes les formations:
	public void deleteFormations() {
		formationRepository.deleteAll();
	}

	// mise a jour formation:
	public void MSJFormation(Formation formation) {
		formationRepository.save(formation);

	}

}
