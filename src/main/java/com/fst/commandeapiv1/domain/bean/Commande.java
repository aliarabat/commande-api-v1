package com.fst.commandeapiv1.domain.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Commande implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String reference;
	private BigDecimal total;
	private BigDecimal totalPaiement;
	@OneToMany
	private List<CommandeItem> commandeItems;

	public Commande() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getTotalPaiement() {
		return totalPaiement;
	}

	public void setTotalPaiement(BigDecimal totalPaiement) {
		this.totalPaiement = totalPaiement;
	}

	public List<CommandeItem> getCommandeItems() {
		return commandeItems;
	}

	public void setCommandeItems(List<CommandeItem> commandeItems) {
		this.commandeItems = commandeItems;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commande other = (Commande) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
