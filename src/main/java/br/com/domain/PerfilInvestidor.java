package br.com.domain;



public class PerfilInvestidor {

    private Long id_Conta;
    private String perfil;
    private String priorizacaoInvestimento;
    private String objetivoInvestir;

    public Long getId_Conta() {
        return id_Conta;
    }

    public void setId_Conta(Long id_Conta) {
        this.id_Conta = id_Conta;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getPriorizacaoInvestimento() {
        return priorizacaoInvestimento;
    }

    public void setPriorizacaoInvestimento(String priorizacaoInvestimento) {
        this.priorizacaoInvestimento = priorizacaoInvestimento;
    }

    public String getObjetivoInvestir() {
        return objetivoInvestir;
    }

    public void setObjetivoInvestir(String objetivoInvestir) {
        this.objetivoInvestir = objetivoInvestir;
    }
}