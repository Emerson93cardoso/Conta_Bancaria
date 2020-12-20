package br.com.repository.impml;

import br.com.domain.IdConta;
import br.com.domain.PerfilInvestidor;
import br.com.domain.WapperPerfilInvesidor;
import br.com.mapper.IdRowMapper;
import br.com.repository.InvestidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvestidorRepositoryImp implements InvestidorRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private WapperPerfilInvesidor wapperPerfilInvesidor;

    public void perfilInvestidor(PerfilInvestidor perfilInvestidor) {
        jdbcTemplate.update("insert into perfil_investidor(passivo, moderado, agressivo, id_conta) values (?, ?, ?, ?)",
                perfilInvestidor.getPassivo(), perfilInvestidor.getModerado(), perfilInvestidor.getAgressivo(), perfilInvestidor.getId());
    }

  public List<IdConta> id(Long id) {
     List<IdConta> idConta = jdbcTemplate.query("SELECT * FROM  conta_corrente WHERE id = (select max(id) from conta_corrente)", new IdRowMapper());
        return idConta;
    }
}
