package br.com.services;

import br.com.domain.DateCount;
import br.com.domain.IdConta;
import br.com.repository.CCRepsitory;
import br.com.repository.impml.InvestidorRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceCC {

    @Autowired
    private InvestidorRepositoryImp investidorRepositoryImp;
    @Autowired
    private CCRepsitory ccRepsitory;


    public void saveDate(DateCount dateCount) {
        ccRepsitory.saveDate(dateCount);

    }

   public Long idConta() {

        return investidorRepositoryImp.id();
    }


}
