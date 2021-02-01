package br.com.controllers;

import br.com.domain.DadosPessoasConta;
import br.com.domain.IdConta;
import br.com.domain.PerfilInvestidor;
import br.com.services.ServiceConta;
import br.com.services.ServicePerfilInvestidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class ContaCorrenteController {

    @Autowired
    private ServiceConta serviceConta;
    @Autowired
    private ServicePerfilInvestidor servicePerfilInvestidor;

    @GetMapping("/conta")
    public String openAccount(Model model) {
        model.addAttribute("openAccount", new DadosPessoasConta());
        return "views/abrirConta";
    }


    @PostMapping("/conta")
    public String saveCount(@Valid DadosPessoasConta dadosPessoasConta, BindingResult rs, Model model) {
        if(rs.hasErrors()) {
            return "views/abrirConta";
        }
        Long id = serviceConta.saveDate(dadosPessoasConta);
        model.addAttribute("perfilInvestidor", new PerfilInvestidor());
        model.addAttribute("id_Conta", id);

        return "views/perfil-investidor";
    }


//    @GetMapping("/perfil-investidor")
//    public String perfilInvestidor(Model model, Long idContas) {
//        model.addAttribute("perfilInvestidor", new PerfilInvestidor());
//        model.addAttribute("id_Conta", idConta);
//        return "views/perfil-investidor";
//    }

    @PostMapping("/perfil-investidor")
    public String perfilInvestidor(PerfilInvestidor perfilInvestidor) {
        servicePerfilInvestidor.perfilInvestidor(perfilInvestidor);
        return "views/sucesso";
    }


}

