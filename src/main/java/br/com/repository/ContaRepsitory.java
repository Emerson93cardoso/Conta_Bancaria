package br.com.repository;

import br.com.domain.DadosPessoasConta;
import br.com.domain.Transacoes;

public interface ContaRepsitory {

     Long saveContaCorrente(DadosPessoasConta dadosPessoasConta);
     void creditar(Transacoes transacoes);
}
