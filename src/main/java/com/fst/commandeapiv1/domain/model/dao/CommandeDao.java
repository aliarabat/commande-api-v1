package com.fst.commandeapiv1.domain.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fst.commandeapiv1.domain.bean.Commande;

@Repository
public interface CommandeDao extends JpaRepository<Commande, Long> {
	public Commande findByReference(String reference);
}
