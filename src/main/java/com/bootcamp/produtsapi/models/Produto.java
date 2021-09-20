package com.bootcamp.produtsapi.models;

import lombok.Setter;

import java.math.BigDecimal;

@Setter
public class Produto {
    private String codigo;
    private String nome;
    private String modelo;
    private Double preco;
    private Double peso;

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getPreco() {
        return preco;
    }

    public Double getPeso() {
        return peso;
    }

    public Produto() {
    }

    public Produto(String codigo, String nome, String modelo, Double preco, Double peso) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.preco = preco;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Produto{" + '\n' +
                "codigo: '" + codigo + '\n' +
                ", nome: '" + nome + '\n' +
                ", modelo: '" + modelo + '\n' +
                ", preco: " + preco + '\n' +
                ", peso: " + peso +
                '}';
    }
}
