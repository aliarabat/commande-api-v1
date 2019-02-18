package com.fst.commandeapiv1.domain.rest.Vo;

import java.util.List;

public class CommandeVo {

	private Long id;
	private String reference;
	private String total;
	private String totalPaiement;
	private List<CommandeItemVo> commandeItemVos;

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

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getTotalPaiement() {
		return totalPaiement;
	}

	public void setTotalPaiement(String totalPaiement) {
		this.totalPaiement = totalPaiement;
	}

	public List<CommandeItemVo> getCommandeItemVos() {
		return commandeItemVos;
	}

	public void setCommandeItemVos(List<CommandeItemVo> commandeItemVos) {
		this.commandeItemVos = commandeItemVos;
	}

}
