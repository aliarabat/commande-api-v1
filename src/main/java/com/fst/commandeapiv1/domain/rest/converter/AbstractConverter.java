package com.fst.commandeapiv1.domain.rest.converter;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConverter<T, VO> {
	public abstract T toItem(VO vo);
	public abstract VO toVo(T t);
	public List<VO> toVo(List<T> ts){
		if (ts==null || ts.isEmpty()) {
			return null;
		} else {
			List<VO> vos=new ArrayList<>();
			for (T t : ts) {
				vos.add(toVo(t));
			}
			return vos;
		}
	}
	
	public List<T> toItem(List<VO> vos){
		if (vos==null ||vos.isEmpty()) {
			return null;
		} else {
			List<T> ts=new ArrayList<>();
			for (VO vo : vos) {
				ts.add(toItem(vo));
			}
			return ts;
		}
	}
}
