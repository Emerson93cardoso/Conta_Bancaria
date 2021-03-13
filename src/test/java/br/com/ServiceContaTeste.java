package br.com;

import br.com.domain.Transacoes;
import br.com.services.ServiceConta;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.sql.SQLException;

public class ServiceContaTeste {

    @InjectMocks
    private ServiceConta serviceConta;

    @Before
    public void init(){MockitoAnnotations.initMocks(this);}

    @Test
    public void saldo(Transacoes transacoes) throws SQLException {

      Double total = serviceConta.saldo(transacoes);
      System.out.print(total);
      Assert.assertEquals(Double.valueOf("100."), total);
    }

}
