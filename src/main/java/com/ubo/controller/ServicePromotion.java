package com.ubo.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubo.modele.Promotion;
import com.ubo.modele.PromotionPK;
import com.ubo.repository.PromotionRepository;

@Service
public class ServicePromotion {
	@Autowired
	PromotionRepository promotionrepository;

	// Recuperer toutes les promotions
	public List<Promotion> recupererToutesLesPromotions() {
		return promotionrepository.findAll();
	}

	// Recuperer une promotion a  partir de lieuRentree:
	public List<Promotion> recupererPromotionParLieuRentree(String lieuRentree) {
		List<Promotion> listeDesPromotion = promotionrepository.findAll();
		return listeDesPromotion.stream().filter(t -> t.getLieuRentree().equals(lieuRentree))
				.collect(Collectors.toList());
	}

	// Recuperer une promotion a  partir de siglePromotion:
	public Promotion recupererPromotionParSigle(String siglePromotion) {
		List<Promotion> listeDesPromotion = promotionrepository.findAll();
		return listeDesPromotion.stream().filter(t -> t.getSiglePromotion().equals(siglePromotion)).findFirst().get();
	}

	// Supprimer toutes les promotions:
	public void supprimerPromotions() {
		promotionrepository.deleteAll();
	}

	// Ajouter une promotion
	public void creerPromotion(Promotion promotion) {
		promotionrepository.save(promotion);
	}

	// Recuperer les promotions a  partir de l'ID composÃ© de formation et anneeUniversitaire:
	public Optional<Promotion> recupererPromotionParId(String formation, String anneeUniversitaire) {

		return promotionrepository.findById(new PromotionPK(anneeUniversitaire, formation));
	}

	// Delete les promotions a  partir de l'ID composee de formation et anneeUniversitaire:
	public void supprimerPromotion(String formation, String anneeUniversitaire) {
		PromotionPK promotionpk = new PromotionPK();
		promotionpk.setAnneeUniversitaire(anneeUniversitaire);
		promotionpk.setFormation(formation);
		promotionrepository.deleteById(promotionpk);
	}

}
