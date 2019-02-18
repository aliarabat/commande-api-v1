package com.fst.commandeapiv1.domain.model.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.commandeapiv1.domain.bean.Commande;
import com.fst.commandeapiv1.domain.bean.CommandeItem;
import com.fst.commandeapiv1.domain.model.dao.CommandeDao;
import com.fst.commandeapiv1.domain.model.service.CommandeItemService;
import com.fst.commandeapiv1.domain.model.service.CommandeService;

@Service
public class CommandeServiceImpl implements CommandeService {

	@Autowired
	private CommandeDao commandeDao;

	@Autowired
	private CommandeItemService commandeItemService;

	@Override
	public Commande findByReference(String reference) {
		return commandeDao.findByReference(reference);
	}

	@Override
	public int saveCommandeWithCommandeItem(Commande commande) {
		Commande c = findByReference(commande.getReference());
		if (c != null) {
			return -1;
		} else {
			c = new Commande();
			c.setReference(commande.getReference());
			calcTotal(c, commande.getCommandeItems());
			commandeDao.save(c);
			commandeItemService.saveCommandeItems(c, commande.getCommandeItems());
			return 1;
		}
	}

	private int calcTotal(Commande commande, List<CommandeItem> commandeItems) {
		if (commande == null || commandeItems.isEmpty()) {
			return -1;
		} else {
			BigDecimal total = BigDecimal.ZERO;
			for (CommandeItem commandeItem : commandeItems) {
				total=total.add(commandeItem.getPrix().multiply(commandeItem.getPrix()));
			}
			commande.setTotal(total);
			return 1;
		}
	}

	public CommandeDao getCommandeDao() {
		return commandeDao;
	}

	public void setCommandeDao(CommandeDao commandeDao) {
		this.commandeDao = commandeDao;
	}

	public CommandeItemService getCommandeItemService() {
		return commandeItemService;
	}

	public void setCommandeItemService(CommandeItemService commandeItemService) {
		this.commandeItemService = commandeItemService;
	}

}
