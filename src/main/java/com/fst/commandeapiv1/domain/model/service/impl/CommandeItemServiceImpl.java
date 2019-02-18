package com.fst.commandeapiv1.domain.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.commandeapiv1.domain.bean.Commande;
import com.fst.commandeapiv1.domain.bean.CommandeItem;
import com.fst.commandeapiv1.domain.model.dao.CommandeItemDao;
import com.fst.commandeapiv1.domain.model.service.CommandeItemService;

@Service
public class CommandeItemServiceImpl implements CommandeItemService {

	@Autowired
	private CommandeItemDao commandeItemDao;

	@Override
	public List<CommandeItem> findByCommandeReference(String reference) {
		return commandeItemDao.findByCommandeReference(reference);
	}

	@Override
	public void saveCommandeItems(Commande c, List<CommandeItem> commandeItems) {
		for (CommandeItem commandeItem : commandeItems) {
			commandeItem.setCommande(c);
			commandeItemDao.save(commandeItem);
		}
	}

}
