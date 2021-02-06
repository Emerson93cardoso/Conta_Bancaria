package br.com.controllers;

import br.com.domain.DadosPessoasConta;
import br.com.domain.PerfilInvestidor;
import br.com.services.ServiceConta;
import br.com.services.ServicePerfilInvestidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

@RequestMapping("/conta")
@Controller
public class ContaCorrenteController {

    @Autowired
    private ServiceConta serviceConta;
    @Autowired
    private ServicePerfilInvestidor servicePerfilInvestidor;

    @GetMapping()
    public String openAccount(Model model) {
        model.addAttribute("openAccount", new DadosPessoasConta());
        return "views/abrirConta";
    }


    @PostMapping()
    public String saveCount(@Valid DadosPessoasConta dadosPessoasConta, BindingResult rs, Model model) {
        if(rs.hasErrors()) {
            return "views/abrirConta";
        }
        Long id = serviceConta.saveDate(dadosPessoasConta);
        model.addAttribute("perfilInvestidor", new PerfilInvestidor());
        model.addAttribute("id_Conta", id);

        return "views/redirect-investidor";
    }

    @GetMapping("/perfil-investidor")
    public String perfilInvestidor(Model model, Long idContas) {
        model.addAttribute("perfilInvestidor", new PerfilInvestidor());
        model.addAttribute("id_Conta", idContas);
        return "views/perfil-investidor";
    }

    @PostMapping("/perfil-investidor")
    public String perfilInvestidor(PerfilInvestidor perfilInvestidor) {
        servicePerfilInvestidor.perfilInvestidor(perfilInvestidor);
        return "views/sucesso";
    }


}

