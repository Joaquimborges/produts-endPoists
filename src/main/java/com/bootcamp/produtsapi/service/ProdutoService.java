package com.bootcamp.produtsapi.service;

import com.bootcamp.produtsapi.models.Produto;
import com.bootcamp.produtsapi.models.ProdutoPesoComparator;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Setter
public class ProdutoService {

    private List<Produto> produtoList = new ArrayList<>();


    public Boolean addProduto(Produto produto) {
        return produtoList.add(produto);
    }

    public boolean deleteProduto(String codigo) {
       return produtoList.removeIf(produto -> produto.getCodigo().equals(codigo));
    }

    public Produto getProduto(String codigo) {
        for (Produto produto : produtoList) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
            return null;
    }

    public List<Produto> listarPorPeso() {
        ProdutoPesoComparator pc = new ProdutoPesoComparator();
        produtoList.sort(pc);

        return produtoList;
    }






}
