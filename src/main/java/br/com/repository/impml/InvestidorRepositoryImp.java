package br.com.repository.impml;


import br.com.domain.PerfilInvestidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import br.com.repository.RepositoryInvestidor;


@Repository
public class InvestidorRepositoryImp implements RepositoryInvestidor{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void perfilInvestidor(PerfilInvestidor perfilInvestidor) {
        jdbcTemplate.update("insert into perfil_investidor(perfil, id_conta) values (?, ?)",
                    perfilInvestidor.getPerfil(), perfilInvestidor.getId_Conta());
    }

  public Long id() {
        return jdbcTemplate.queryForObject("SELECT MAX(id) FROM conta_corrente", Long.class);
//     List <IdConta> idConta = jdbcTemplate.query("SELECT * FROM  conta_corrente WHERE id = (select max(id) from conta_corrente)", new IdRowMapper());
//        return idConta;
    }
}
