package Ex01;
import java.util.Scanner;

// Classe principal com menu
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CadastroProdutos cadastro = new CadastroProdutos();
        int opcao;

        do {
            System.out.println("\n==== SISTEMA DE PRODUTOS (HASHMAP) ====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Listar todos os produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    Produto novo = new Produto(codigo, nome, categoria, preco);
                    cadastro.adicionarProduto(novo);
                    break;

                case 2:
                    System.out.print("Digite o código do produto: ");
                    String codBusca = sc.nextLine();

                    Produto encontrado = cadastro.buscarProduto(codBusca);

                    if (encontrado != null) {
                        System.out.println("Produto encontrado:");
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o código para remover: ");
                    String codRemover = sc.nextLine();
                    cadastro.removerProduto(codRemover);
                    break;

                case 4:
                    cadastro.listarTodos();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
