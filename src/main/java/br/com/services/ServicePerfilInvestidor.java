package br.com.services;

import br.com.domain.PerfilInvestidor;
import br.com.repository.impml.InvestidorImplRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicePerfilInvestidor {

    @Autowired
    private InvestidorImplRepository investidorRepositoryImpl;

    public void perfilInvestidor(PerfilInvestidor perfilInvestidor) {
        investidorRepositoryImpl.perfilInvestidor(perfilInvestidor);
    }
}
