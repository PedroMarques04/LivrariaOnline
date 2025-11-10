/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.projetopoo.projetopoo;

/**
 *
 * @author phpup
 */
public interface Produto {
    
    String getNome();
    void setNome(String nome);
    
    Double getPreco();
    void setPreco(Double preco);
    
    String getDescricao();
    void setDescricao(String descricao);
    
    int getQuantidadeEstoque();
    void setQuantidadeEstoque(int quantidadeEstoque);
    
   /* String getCategoria();
    void setCategoria(String categoria);
    
    usar isso talvez para outros tipos de produto*/
    
    String getId();
    void setId(String id);

}
