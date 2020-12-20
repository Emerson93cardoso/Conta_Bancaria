package br.com.services;

import br.com.domain.PerfilInvestidor;
import br.com.repository.impml.InvestidorRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicePerfilInvestidor {

    @Autowired
    private InvestidorRepositoryImp investidorRepositoryImp;

    public void perfilInvestidor(PerfilInvestidor perfilInvestidor) {
        investidorRepositoryImp.perfilInvestidor(perfilInvestidor);
    }
}
