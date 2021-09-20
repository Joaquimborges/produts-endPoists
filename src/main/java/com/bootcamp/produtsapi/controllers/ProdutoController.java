package com.bootcamp.produtsapi.controllers;


import com.bootcamp.produtsapi.models.Produto;
import com.bootcamp.produtsapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "produto/")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/create")
    public ResponseEntity<Boolean> addProduto(@RequestBody Produto produto) {
        return new ResponseEntity<>(produtoService.addProduto(produto), HttpStatus.CREATED);

    }

    @DeleteMapping("/delete/{codigo}")
    public boolean deleteProduto(@PathVariable String codigo) {
        return produtoService.deleteProduto(codigo);
    }

    @GetMapping("/getProduto/{codigo}")
    public Produto getProduto(@PathVariable String codigo) {
        return produtoService.getProduto(codigo);
    }

    @GetMapping("/listarPorPeso")
    public List<Produto> listarPorPeso() {
       return produtoService.listarPorPeso();
    }



}
