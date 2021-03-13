package br.com.repository;

import br.com.domain.DadosPessoasConta;
import br.com.domain.Transacoes;

import java.sql.SQLException;
import java.util.List;

public interface ContaRepsitory {

     Long saveContaCorrente(DadosPessoasConta dadosPessoasConta);
     List<Transacoes> operacoesConta() throws SQLException;
     List<Transacoes> salvarperacoesContaReturnTotal(Transacoes transacoes) throws SQLException;
}
