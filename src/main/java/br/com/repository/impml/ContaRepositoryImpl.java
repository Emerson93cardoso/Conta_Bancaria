package br.com.repository.impml;

import br.com.domain.DadosPessoasConta;
import br.com.domain.IdConta;
import br.com.mapper.IdRowMapper;
import br.com.repository.ContaRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class ContaRepositoryImpl implements ContaRepsitory {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @Override
//    public void saveDate(DadosPessoasConta dadosPessoasConta)  {
//        String sql = "insert into conta_corrente(nome, cpf, idade, rg, endereco, cep) values(?, ?, ?, ?, ?, ?)";
//        //jdbcInsert.executeAndReturnKey(dateCount);
//         jdbcTemplate.update(sql, dadosPessoasConta.getNome(), dadosPessoasConta.getCpf(), dadosPessoasConta.getIdade(), dadosPessoasConta.getRg(), dadosPessoasConta.getEndereco(), dadosPessoasConta.getCep());
//
//    }
//
//    public Long saveContaCorrente(String t) {
//        return Long.valueOf(t);
//    }

    @Override
    public Long saveContaCorrente(DadosPessoasConta dadosPessoasConta) {
        String sql = "insert into conta_corrente(nome, cpf, idade, rg, endereco, cep) values(?, ?, ?, ?, ?, ?)";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps =  con.prepareStatement(sql, new String[]{"ID"});
            ps.setString(1, dadosPessoasConta.getNome());
            ps.setString(2, dadosPessoasConta.getCpf());
            ps.setInt(3, dadosPessoasConta.getIdade());
            ps.setString(4, dadosPessoasConta.getRg());
            ps.setString(5, dadosPessoasConta.getEndereco());
            ps.setString(6, dadosPessoasConta.getCep());
            return ps;
        }, keyHolder);

        return keyHolder.getKey().longValue();
    }




}
