package com.fst.commandeapiv1.domain.common.util;

import java.math.BigDecimal;

public class NumberUtil {

	public static final BigDecimal ZERO_VALUE = BigDecimal.ZERO;
	public static final String CHAINE_VIDE = "";

	public static BigDecimal toBigDecimal(String value) {
		if (value == null || value.isEmpty()) {
			return ZERO_VALUE;
		} else {
			return new BigDecimal(value);
		}
	}

	public static String toString(BigDecimal value) {
		if (value == null) {
			return CHAINE_VIDE;
		} else {
			return String.valueOf(value);
		}
	}
}
