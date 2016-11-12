package com.unipe.pos.sumula.enumeration;

public enum TipoCartao {

	AMARELO("Amarelo"),
	VERMELHO("Vermelho");
	
	private String descricacao;
	
	TipoCartao(String descricao) {
		this.descricacao = descricao;
	}

	public String getDescricacao() {
		return descricacao;
	}
}
