package br.com.repository.impml;


import br.com.domain.PerfilInvestidor;
import br.com.repository.InvestidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InvestidorImplRepository implements InvestidorRepository {


   @Autowired
   private JdbcTemplate jdbcTemplate;

    public void perfilInvestidor(PerfilInvestidor perfilInvestidor) {
        jdbcTemplate.update("insert into perfil_investidor(perfil, id_conta, investimento_tipo, objetivo_investimento) values (?, ?, ?, ?)",
                    perfilInvestidor.getPerfil(), perfilInvestidor.getId_Conta(), perfilInvestidor.getPriorizacaoInvestimento(),
                    perfilInvestidor.getObjetivoInvestir());

    }


}

