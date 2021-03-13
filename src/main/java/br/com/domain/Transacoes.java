package br.com.domain;

import java.util.Date;


public class Transacoes {

    Date date = new Date();
    private Double credito;
    private Double debito;
    private Double total;
    private Integer numeroConta;
    private String dateTime;


    public Transacoes() {

    }

    public Transacoes(Integer numeroConta, Double credito, Double debito, String dateTime) {
        this.numeroConta = numeroConta;
        this.credito = credito;
        this.debito = debito;
        this.dateTime = dateTime;
    }

    public Transacoes(Double credito, Double debito) {
        this.credito = credito;
        this.debito = debito;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

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

