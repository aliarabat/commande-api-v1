package com.fst.commandeapiv1.domain.model.service;

import java.util.List;

import com.fst.commandeapiv1.domain.bean.Commande;
import com.fst.commandeapiv1.domain.bean.CommandeItem;

public interface CommandeItemService {
	public List<CommandeItem> findByCommandeReference(String reference);

	public void saveCommandeItems(Commande c, List<CommandeItem> commandeItems);
}
