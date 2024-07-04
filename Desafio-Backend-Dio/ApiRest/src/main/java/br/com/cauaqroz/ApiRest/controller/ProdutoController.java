
package br.com.cauaqroz.ApiRest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.cauaqroz.ApiRest.model.Produto;
import br.com.cauaqroz.ApiRest.repository.ProdutoRepository;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Cadastrar um novo produto
    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    // Atualizar um produto existente
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizarProduto(@PathVariable Long id, @RequestBody Produto produtoDetalhes) {
        return produtoRepository.findById(id)
        .map(produto -> {
            produto.setNome(produtoDetalhes.getNome());
            produto.setPreco(produtoDetalhes.getPreco());
            produto.setQtd(produtoDetalhes.getQtd());
            produto.setNserie(produtoDetalhes.getNserie()); // Adicionando a atualização do nSerie
            produto.setDescricao(produtoDetalhes.getDescricao());
            produto.setCategoria(produtoDetalhes.getCategoria());
            produto.setValidade(produtoDetalhes.getValidade());
            Produto produtoAtualizado = produtoRepository.save(produto);
            return ResponseEntity.ok().body(produtoAtualizado);
        }).orElse(ResponseEntity.notFound().build());
    }

    // Buscar um produto pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProduto(@PathVariable Long id) {
        return produtoRepository.findById(id)
                .map(produto -> ResponseEntity.ok().body(produto))
                .orElse(ResponseEntity.notFound().build());
    }

    // Listar todos os produtos
    @GetMapping
    public List<Produto> listarTodosProdutos() {
        return produtoRepository.findAll();
    }

    // Deletar um produto pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProduto(@PathVariable Long id) {
        return produtoRepository.findById(id)
                .map(produto -> {
                    produtoRepository.delete(produto);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}