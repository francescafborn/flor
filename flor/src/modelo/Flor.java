/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Flor {
    private Double tamanho_da_setala;
    private Double tamanho_da_petala;
    private String nome_cientifico;
    private String nome_popular;
    private Integer ano;
    private Integer codigo;

    public Double getTamanho_da_setala() {
        return tamanho_da_setala;
    }

    public void setTamanho_da_setala(Double tamanho_da_setala) {
        this.tamanho_da_setala = tamanho_da_setala;
    }

    public Double getTamanho_da_petala() {
        return tamanho_da_petala;
    }

    public void setTamanho_da_petala(Double tamanho_da_petala) {
        this.tamanho_da_petala = tamanho_da_petala;
    }

    public String getNome_cientifico() {
        return nome_cientifico;
    }

    public void setNome_cientifico(String nome_cientifico) {
        this.nome_cientifico = nome_cientifico;
    }

    public String getNome_popular() {
        return nome_popular;
    }

    public void setNome_popular(String nome_popular) {
        this.nome_popular = nome_popular;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Flor{" + "nome_popular=" + nome_popular + '}';
    }

   
    
}
