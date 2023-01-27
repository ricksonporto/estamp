package br.com.alura.orgs.dao

import br.com.alura.orgs.model.Produto
import java.math.BigDecimal

class ProdutosDao {

    fun adiciona(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produto> {
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>(
            Produto(
                nome = "Caneca de Mágica",
                descricao = "Vendida para Guilherme, 30/11/22",
                valor = BigDecimal("40.00"),
                imagem = "https://socd.vteximg.com.br/arquivos/ids/172402-1310-1310/Caneca-Magica-para-Sublimacao.jpg?v=636523795113200000"
            )
        )
    }

}