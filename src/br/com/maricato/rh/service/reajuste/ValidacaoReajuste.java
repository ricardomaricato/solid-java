package br.com.maricato.rh.service.reajuste;

import br.com.maricato.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

	void validar(Funcionario funcionario, BigDecimal aumento);
}
