package Ex01;

import java.util.HashMap;

// Classe responsável por gerenciar o HashMap de produtos
public class CadastroProdutos {

    // Armazenamento associativo (código → produto)
    private HashMap<String, Produto> mapa = new HashMap<>();

    // Adiciona um produto ao sistema
    public void adicionarProduto(Produto p) {
        mapa.put(p.getCodigo(), p);
        System.out.println("Produto adicionado com sucesso!");
    }

    // Busca um produto pelo código
    public Produto buscarProduto(String codigo) {
        return mapa.get(codigo);
    }

    // Remove um produto pelo código
    public void removerProduto(String codigo) {
        if (mapa.containsKey(codigo)) {
            mapa.remove(codigo);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // Lista todos os produtos cadastrados
    public void listarTodos() {
        if (mapa.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        System.out.println("\n---- LISTA DE PRODUTOS ----");
        for (Produto p : mapa.values()) {
            System.out.println(p);
        }
        System.out.println("---------------------------\n");
    }
}
