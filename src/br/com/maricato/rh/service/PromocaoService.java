package br.com.maricato.rh.service;

import br.com.maricato.rh.ValidacaoException;
import br.com.maricato.rh.model.Cargo;
import br.com.maricato.rh.model.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if (Cargo.GERENTE == cargoAtual)
			throw new ValidacaoException("Gerentes não podem ser promovidos!");

		if (metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionario não bateu a meta!");
		}
	}
}
