package com.fst.commandeapiv1.domain.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fst.commandeapiv1.domain.bean.Commande;
import com.fst.commandeapiv1.domain.model.service.CommandeService;

@RestController
@RequestMapping("/commande-api-v1/commande")
public class CommandeRest {

	@Autowired
	private CommandeService commandeService;

	@GetMapping("/reference/{reference}")
	public Commande findByReference(@PathVariable("reference") String reference) {
		return commandeService.findByReference(reference);
	}

	@PostMapping("/")
	public int saveCommandeWithCommandeItem(@RequestBody Commande commande) {
		return commandeService.saveCommandeWithCommandeItem(commande);
	}

	public CommandeService getCommandeService() {
		return commandeService;
	}

	public void setCommandeService(CommandeService commandeService) {
		this.commandeService = commandeService;
	}

}
