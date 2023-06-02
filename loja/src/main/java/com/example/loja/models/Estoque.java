package com.example.loja.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="TB_ESTOQUE")
public class Estoque implements  Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "varbinary(36)")
    private UUID id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "estoque_id")
    private List<ItemEstoque> itens;

    public Estoque(){
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade){
        ItemEstoque item = new ItemEstoque();
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        itens.add(item);
    }

    public void removerProduto(Produto produto, int quantidade){
        Iterator<ItemEstoque> iterator = itens.iterator();

        while (iterator.hasNext()) {
            ItemEstoque item = iterator.next();

            if(item.getProduto().equals(produto)){
                int itemQuantidadeAtual = item.getQuantidade();
                int itemNovaQuantidade = itemQuantidadeAtual - quantidade;
                if(itemNovaQuantidade <= 0){
                    itens.remove(item);
                }else{
                    item.setQuantidade(itemNovaQuantidade);
                }
            }
        }
    }

    public int getQuantidadeProduto(Produto produto){
        for( ItemEstoque item : itens){
            if(item.getProduto().equals(produto)){
                return item.getQuantidade();
            }
        }
        return -1;
    }
}
