package br.com.services;

import br.com.domain.DadosPessoasConta;
import br.com.domain.Transacoes;
import br.com.repository.ContaRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;


@Component
public class ServiceConta {

    private Integer numeroConta;
    @Autowired
    private ContaRepsitory contaRepsitory;



    public Long saveDate(DadosPessoasConta dadosPessoasConta) {
       return contaRepsitory.saveContaCorrente(dadosPessoasConta);

    }

    public Integer numeroConta() {
        Random random = new Random();
        return random.nextInt((10000 - 1000) + 1) + 1000;
    }

    public Double operacoesConta(Transacoes transacoes) throws SQLException {
        String localDateTime =  LocalDateTime.now(ZoneId.of("America/Sao_Paulo")).format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
        transacoes.setDateTime(localDateTime);
        Double total = saldo(transacoes);
       return total;
    }

    public Double saldo(Transacoes transacoes) throws SQLException {
       List<Transacoes> transacoesList = contaRepsitory.salvarperacoesContaReturnTotal(transacoes);
       Double credito = 0.0;
       Double debito = 0.0;
       for(Transacoes listar : transacoesList) {
          credito += listar.getCredito();
          debito += listar.getDebito();
       }
        Double total = credito - debito;
       return total;
    }




}
