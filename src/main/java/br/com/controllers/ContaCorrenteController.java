package br.com.controllers;

import br.com.domain.DateCount;
import br.com.domain.IdConta;
import br.com.domain.PerfilInvestidor;
import br.com.services.ServiceCC;
import br.com.services.ServicePerfilInvestidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;


@Controller
public class ContaCorrenteController {

    @Autowired
    private ServiceCC serviceCC;
    @Autowired
    private ServicePerfilInvestidor servicePerfilInvestidor;

    @GetMapping("/conta")
    public String openAccount(Model model) {
        model.addAttribute("openAccount", new DateCount());
        return "views/openAccount";
    }


    @PostMapping("/conta")
    public String saveCount(@Valid DateCount dateCount, BindingResult rs) {
        if(rs.hasErrors()) {
            return "views/openAccount";
        }
        serviceCC.saveDate(dateCount);
        return "views/redirect-investidor";
    }


    @GetMapping("/perfil-investidor")
    public String perfilInvestidor(Model model, Long idContas) {
        Long idConta = serviceCC.idConta();
        model.addAttribute("perfilInvestidor", new PerfilInvestidor());
        model.addAttribute("id_Conta", idConta);
        return "views/perfil-investidor";
    }

    @PostMapping("/perfil-investidor")

    public String perfilInvestidor(PerfilInvestidor perfilInvestidor) {
        servicePerfilInvestidor.perfilInvestidor(perfilInvestidor);
        return "views/sucesso";
    }


}
