package br.com.pos.mackenzie.pizzaria;

import java.util.Collection;

public class Util {

	@SuppressWarnings("rawtypes")
	public static boolean isNullOuVazio(Collection colecao) {
		return (colecao == null || colecao.isEmpty()) ? true : false;
	}

}
