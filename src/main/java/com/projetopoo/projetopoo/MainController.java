/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetopoo.projetopoo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author phpup
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/ficcao")
    public String ficcao(Model model) {

        // criação de dois livros de exemplos
        Livro narnia = new Livro("As Crônicas de Nárnia", 29.90, "CS Lewis", CategoriaLivro.FICCAO);
        Livro livro1984 = new Livro("1984", 35.50, "George Orwell", CategoriaLivro.FICCAO);

        // popular as infos que aparecerão na tela
        narnia.setDescricao("Série de fantasia clássica");
        narnia.setEditora("Editora WMF Martins Fontes");
        narnia.setNumeroPaginas(768);
        narnia.setAnoPublicacao(1950);
        narnia.setDestaque(Destaque.DESTAQUE);
        narnia.setSinopse("As aventuras de crianças que descobrem o mundo mágico de Nárnia.");
        narnia.setCapa("/img/narnia.png");

        livro1984.setDescricao("Romance distópico sobre totalitarismo");
        livro1984.setEditora("Companhia das Letras");
        livro1984.setNumeroPaginas(328);
        livro1984.setAnoPublicacao(1949);
        livro1984.setDestaque(Destaque.BEST_SELLER);
        livro1984.setSinopse("Winston Smith luta contra a opressão do Estado totalitário na Oceania.");
        livro1984.setCapa("/img/1984.png"); //coloquei a imagem aqui e funcionou

        //colocar os livros em uma lista, o html vai percorrer a lista para exibi-los
        //coloquei dois livros de exemplo para cada tela
        List<Livro> livrosFiccao = Arrays.asList(narnia, livro1984);

        model.addAttribute("livros", livrosFiccao);

        return "ficcao";
    }

    @GetMapping("/romance")
    public String romance(Model model) {

        Livro comoEuEraAntes = new Livro("Como Eu Era Antes de Você", 39.90, "Jojo Moyes", CategoriaLivro.ROMANCE);
        Livro aCulpaEDasEstrelas = new Livro("A Culpa é das Estrelas", 34.90, "John Green", CategoriaLivro.ROMANCE);

        comoEuEraAntes.setDescricao("Uma história de amor");
        comoEuEraAntes.setEditora("Intrínseca");
        comoEuEraAntes.setNumeroPaginas(320);
        comoEuEraAntes.setAnoPublicacao(2012);
        comoEuEraAntes.setDestaque(Destaque.BEST_SELLER);
        comoEuEraAntes.setSinopse("Sinopse");
        comoEuEraAntes.setCapa("/img/comoEuEra.png");

        aCulpaEDasEstrelas.setDescricao("Um Romance");
        aCulpaEDasEstrelas.setEditora("Intrínseca");
        aCulpaEDasEstrelas.setNumeroPaginas(288);
        aCulpaEDasEstrelas.setAnoPublicacao(2012);
        aCulpaEDasEstrelas.setDestaque(Destaque.DESTAQUE);
        aCulpaEDasEstrelas.setSinopse("Sinopse");
        aCulpaEDasEstrelas.setCapa("/img/culpaEstrelas.png");

        List<Livro> livrosRomance = Arrays.asList(comoEuEraAntes, aCulpaEDasEstrelas);
        model.addAttribute("livros", livrosRomance);
        return "romance";
    }

    @GetMapping("/destaques")
    public String destaques(Model model) {

        Livro narnia = new Livro("As Crônicas de Nárnia", 29.90, "CS Lewis", CategoriaLivro.FICCAO);
        Livro aCulpaEDasEstrelas = new Livro("A Culpa é das Estrelas", 34.90, "John Green", CategoriaLivro.ROMANCE);

        narnia.setDescricao("Série de fantasia clássica");
        narnia.setEditora("Editora WMF Martins Fontes");
        narnia.setNumeroPaginas(768);
        narnia.setAnoPublicacao(1950);
        narnia.setDestaque(Destaque.DESTAQUE);
        narnia.setSinopse("As aventuras de crianças que descobrem o mundo mágico de Nárnia.");
        narnia.setCapa("/img/narnia.png");

        aCulpaEDasEstrelas.setDescricao("Um Romance");
        aCulpaEDasEstrelas.setEditora("Intrínseca");
        aCulpaEDasEstrelas.setNumeroPaginas(288);
        aCulpaEDasEstrelas.setAnoPublicacao(2012);
        aCulpaEDasEstrelas.setDestaque(Destaque.DESTAQUE);
        aCulpaEDasEstrelas.setSinopse("Sinopse");
        aCulpaEDasEstrelas.setCapa("/img/culpaEstrelas.png");

        List<Livro> livrosDestaques = Arrays.asList(narnia, aCulpaEDasEstrelas);
        model.addAttribute("livros", livrosDestaques);
        return "destaques";
    }

    @GetMapping("/bestSellers")
    public String bestSellers(Model model) {

        Livro comoEuEraAntes = new Livro("Como Eu Era Antes de Você", 39.90, "Jojo Moyes", CategoriaLivro.ROMANCE);
        Livro livro1984 = new Livro("1984", 35.50, "George Orwell", CategoriaLivro.FICCAO);

        comoEuEraAntes.setDescricao("Uma história de amor");
        comoEuEraAntes.setEditora("Intrínseca");
        comoEuEraAntes.setNumeroPaginas(320);
        comoEuEraAntes.setAnoPublicacao(2012);
        comoEuEraAntes.setDestaque(Destaque.BEST_SELLER);
        comoEuEraAntes.setSinopse("Sinopse");
        comoEuEraAntes.setCapa("/img/comoEuEra.png");

        livro1984.setDescricao("Romance distópico sobre totalitarismo");
        livro1984.setEditora("Companhia das Letras");
        livro1984.setNumeroPaginas(328);
        livro1984.setAnoPublicacao(1949);
        livro1984.setDestaque(Destaque.BEST_SELLER);
        livro1984.setSinopse("Winston Smith luta contra a opressão do Estado totalitário na Oceania.");
        livro1984.setCapa("/img/1984.png");

        List<Livro> livrosDestaques = Arrays.asList(comoEuEraAntes, livro1984);
        model.addAttribute("livros", livrosDestaques);
        return "bestSellers";
    }

}
