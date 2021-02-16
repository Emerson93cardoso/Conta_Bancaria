package br.com.services;

import br.com.domain.DadosPessoasConta;
import br.com.domain.Transacoes;
import br.com.repository.ContaRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Random;


@Component
public class ServiceConta {

    Random random = new Random();

    private Integer numeroConta;
    @Autowired
    private ContaRepsitory contaRepsitory;


    public Long saveDate(DadosPessoasConta dadosPessoasConta) {
       return contaRepsitory.saveContaCorrente(dadosPessoasConta);

    }

    public Integer numeroConta() {

        return random.nextInt((10000 - 1000) + 1) + 1000;
    }

    public void creditar(Transacoes transacoes) {
        contaRepsitory.creditar(transacoes);
    }




}
