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

import com.ubo.modele.Promotion;
import com.ubo.repository.PromotionRepository;

@CrossOrigin
@RestController
@RequestMapping("/promotion")
public class PromotionController {

	@Autowired
	PromotionRepository promotionrepository;

	@Autowired
	private ServicePromotion promotionservice;

	// Recuperer toutes les promotions:
	@RequestMapping("/promotions")
	public List<Promotion> promotionAll() {
		return promotionservice.recupererToutesLesPromotions();
	}

	// Recuperer les promotions a partir de l'id:
	@RequestMapping("promotions/{formation}/{anneeUniversitaire}")
	public Optional<Promotion> promotionParId(@PathVariable String formation,
			@PathVariable String anneeUniversitaire) {
		return promotionservice.recupererPromotionParId(formation, anneeUniversitaire);
	}

	// supprimer une promotion a  partir de l'id:
	@RequestMapping(method = RequestMethod.DELETE, value = "/promotions/{formation}/{anneeUniversitaire}")
	public void supprimerPromotion(@PathVariable String formation, @PathVariable String anneeUniversitaire) {
		promotionservice.supprimerPromotion(formation, anneeUniversitaire);
	}

	// Recuperer une promotion a  partir du siglePromotion:
	@RequestMapping("promotions/siglePromotion/{siglePromotion}")
	public Promotion promotionParSigle(@PathVariable String siglePromotion) {
		return promotionservice.recupererPromotionParSigle(siglePromotion);
	}

	// Supprimer toutes les promotions:
	@RequestMapping(method = RequestMethod.DELETE, value = "/promotions")
	public void supprimerPromotions() {
		promotionservice.supprimerPromotions();
	}

	// Ajouter une promotion:
	@RequestMapping(method = RequestMethod.POST, value = "/promotions")
	public void creerPromotion(@RequestBody Promotion promotion) {
		promotionservice.creerPromotion(promotion);
	}

	// Recuperer une promotion par lieu de rentree:
	@RequestMapping("promotions/lieuRentree/{lieuRentree}")
	public List<Promotion> promotionParLieuRentree(@PathVariable String lieuRentree) {
		return promotionservice.recupererPromotionParLieuRentree(lieuRentree);
	}

}
