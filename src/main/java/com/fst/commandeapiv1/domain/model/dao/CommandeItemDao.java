package com.fst.commandeapiv1.domain.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fst.commandeapiv1.domain.bean.CommandeItem;

public interface CommandeItemDao extends JpaRepository<CommandeItem, Long> {
	public List<CommandeItem> findByCommandeReference(String reference);
}
