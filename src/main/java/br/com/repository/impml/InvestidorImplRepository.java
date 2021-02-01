package br.com.repository.impml;


import br.com.domain.IdConta;
import br.com.domain.PerfilInvestidor;
import br.com.mapper.IdRowMapper;
import br.com.repository.InvestidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;

@Repository
public class InvestidorImplRepository implements InvestidorRepository {


   @Autowired
   private JdbcTemplate jdbcTemplate;

    public void perfilInvestidor(PerfilInvestidor perfilInvestidor) {
        jdbcTemplate.update("insert into perfil_investidor(perfil, id_conta) values (?, ?)",
                    perfilInvestidor.getPerfil(), perfilInvestidor.getId_Conta());

    }


}

