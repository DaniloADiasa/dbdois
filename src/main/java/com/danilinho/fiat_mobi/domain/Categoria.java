package com.danilinho.fiat_mobi.domain;

import lombok.Data;

@Data
public class Categoria {
    private Integer categoriaID;
    private String categoria;
    private String descricao;

    public Categoria(){

    }
    public Categoria(Integer categoriaID, String categoria, String descricao){
        this.categoriaID = categoriaID;
        this.categoria = categoria;
        this.descricao = descricao;
    }
}
