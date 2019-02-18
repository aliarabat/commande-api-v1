package com.fst.commandeapiv1.domain.rest.converter;

import com.fst.commandeapiv1.domain.bean.Commande;
import com.fst.commandeapiv1.domain.common.util.NumberUtil;
import com.fst.commandeapiv1.domain.rest.Vo.CommandeVo;

public class CommandeConverter extends AbstractConverter<Commande, CommandeVo> {

	@Override
	public Commande toItem(CommandeVo vo) {
		if (vo==null) {
			return null;
		} else {
			Commande commande=new Commande();
			commande.setId(vo.getId());
			commande.setReference(vo.getReference());
			commande.setTotal(NumberUtil.toBigDecimal(vo.getTotal()));
			commande.setTotalPaiement(NumberUtil.toBigDecimal(vo.getTotalPaiement()));
			//commande.setCommandeItems(new CommandeItemConverter(vo.getCommandeItemVos()));
                        return commande;
		}
	}

	@Override
	public CommandeVo toVo(Commande t) {
		// TODO Auto-generated method stub
		return null;
	}

}
