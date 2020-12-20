package br.com.repository.impml;

import br.com.domain.DateCount;
import br.com.repository.CCRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CCRepositoryImp implements CCRepsitory {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void saveDate(DateCount dateCount) {
        jdbcTemplate.update("insert into conta_corrente(nome, cpf, idade, rg, endereco, cep) values(?, ?, ?, ?, ?, ?)",
              dateCount.getNome(), dateCount.getCpf(), dateCount.getIdade(), dateCount.getRg(), dateCount.getEndereco(), dateCount.getCep());
    }


}
