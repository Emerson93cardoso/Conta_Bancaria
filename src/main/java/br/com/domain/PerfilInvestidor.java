package br.com.domain;



public class PerfilInvestidor {

    private Long id_Conta;
    private String perfil;

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
}