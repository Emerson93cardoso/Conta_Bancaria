package br.com.services;

import br.com.domain.DadosPessoasConta;
import br.com.repository.ContaRepsitory;
import br.com.repository.impml.InvestidorImplRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ServiceConta {

    @Autowired
    private ContaRepsitory contaRepsitory;


    public Long saveDate(DadosPessoasConta dadosPessoasConta) {
       return contaRepsitory.saveContaCorrente(dadosPessoasConta);


    }



}
