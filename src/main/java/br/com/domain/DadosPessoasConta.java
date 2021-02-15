package br.com.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class DadosPessoasConta {


    @NotEmpty(message = "Favor preencher nome")
    private String nome;
    @NotEmpty(message = "Favor preencher CPF")
    private String cpf;
    @NotNull(message = "Favor preencher idade")
    private Integer idade;
    @NotEmpty(message = "Favor preencher RG")
    private String rg;
    @NotEmpty(message = "Favor preencher Endereço")
    private String endereco;
    @NotEmpty(message = "Favor preencher CEP")
    private String cep;
    private Integer numeroConta;

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}
