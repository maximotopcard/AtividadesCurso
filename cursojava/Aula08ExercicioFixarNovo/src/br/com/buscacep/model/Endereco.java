package br.com.buscacep.model;

import com.sun.jdi.Value;

import java.util.Scanner;

public class Endereco {
    private final String cep;
    private final String bairro;
    private final String localidade;
    private final String uf;

    public Endereco(EnderecoRecord enderecoRecord) {
        this.cep = enderecoRecord.cep();
        this.bairro = enderecoRecord.bairro();
        this.localidade = enderecoRecord.localidade();
        this.uf = enderecoRecord.uf();
    }

    @Override
    public String toString() {
        return String.format("cep %s, bairro %s, cidade %s, uf %s", cep, bairro, localidade, uf);
    }

}
