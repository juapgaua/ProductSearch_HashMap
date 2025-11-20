package Ex01;
// Classe Produto: representa um item do e-commerce
public class Produto {

    private String codigo;
    private String nome;
    private String categoria;
    private double preco;

    public Produto(String codigo, String nome, String categoria, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public double getPreco() { return preco; }

    // Exibir informações do produto
    @Override
    public String toString() {
        return "Código: " + codigo +
               " | Nome: " + nome +
               " | Categoria: " + categoria +
               " | Preço: R$ " + preco;
    }
}
