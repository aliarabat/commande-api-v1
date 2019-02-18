package com.fst.commandeapiv1.domain.model.service;

import com.fst.commandeapiv1.domain.bean.Commande;

public interface CommandeService {
	public Commande findByReference(String reference);

	public int saveCommandeWithCommandeItem(Commande commande);
}
