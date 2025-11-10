/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projetopoo.projetopoo;

/**
 *
 * @author phpup
 */
public class Livro implements Produto {
    
    // Atributos da interface Produto
    private String nome;
    private Double preco;
    private String descricao;
    private int quantidadeEstoque;
    private String id;
    
    // Atributos específicos de Livro
    private String autor;
    private String editora;
    private int numeroPaginas;
    private int anoPublicacao;
    private Destaque destaque;
    //private String idioma;
    private String capa;
    private String sinopse;
    private CategoriaLivro categoriaLivro;

    
    // Construtor
    public Livro() {}
    
    public Livro(String nome, Double preco, String autor, CategoriaLivro categoriaLivro) {
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
        this.quantidadeEstoque = 0;
        this.categoriaLivro = categoriaLivro;
    }
    
    // Implementação dos métodos da interface Produto
    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public Double getPreco() {
        return preco;
    }
    
    @Override
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    @Override
    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    
    @Override
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    

    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public void setId(String id) {
        this.id = id;
    }
    
 
    
    // getters e setters do Livro
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getEditora() {
        return editora;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }

        public CategoriaLivro getCategoria() {
        return categoriaLivro;
    }
    
    public void setCategoria(CategoriaLivro categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }
    
    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }
    
    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public Destaque getDestaque() {
        return destaque;
    }
    
    public void setDestaque(Destaque destaque) {
        this.destaque = destaque;
    }
    
    /*public String getIdioma() {
        return idioma;
    }
    
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    */
    public String getCapa() {
        return capa;
    }
    
    public void setCapa(String capa) {
        this.capa = capa;
    }
    
    
    public String getSinopse() {
        return sinopse;
    }
    
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
}