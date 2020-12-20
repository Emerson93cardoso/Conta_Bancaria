package br.com.domain;



public class PerfilInvestidor {

    private Long id;
    private String passivo;
    private String moderado;
    private String agressivo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassivo() {
        return passivo;
    }

    public void setPassivo(String passivo) {
        this.passivo = passivo;
    }

    public String getModerado() {
        return moderado;
    }

    public void setModerado(String moderado) {
        this.moderado = moderado;
    }

    public String getAgressivo() {
        return agressivo;
    }

    public void setAgressivo(String agressivo) {
        this.agressivo = agressivo;
    }
}
