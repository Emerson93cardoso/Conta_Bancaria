package br.com.domain;

public class Transacoes {

    private Double credito;
    private Double debito;
    private Integer numeroConta;

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {

        this.credito = credito;
    }

    public Double getDebito() {
        return debito;
    }

    public void setDebito(Double debito) {
        this.debito = debito;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }
}

