package br.com.services;

import br.com.domain.PerfilInvestidor;
import br.com.repository.InvestidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicePerfilInvestidor {

    @Autowired
    private InvestidorRepository investidorRepository;

    public void perfilInvestidor(PerfilInvestidor perfilInvestidor) {
        investidorRepository.perfilInvestidor(perfilInvestidor);
    }
}
