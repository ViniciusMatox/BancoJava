import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Bruce Wayne";
        String tipoConta = "Conta Corrente";
        double saldo = 1500.00;
        int opcao = 0;


        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("\nTipo de conta: " + tipoConta);
        System.out.println("\nSaldo disponivel: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                Digite sua opção: 
                1- Falar com um atendente
                2- Transferir valor
                3- Receber valor
                4- Sair
                5- Vizualizar saldo disponivel
                """;

            Scanner leitura = new Scanner(System.in);

        while (opcao != 5 || opcao == 5){
            if (opcao>5) {
                System.out.println("Opção nao encontrada, escolha uma opção válida e tente novamente");
            }
            System.out.println("\n" + menu);
            opcao = leitura.nextInt();
        if (opcao == 5){
            System.out.println("Seu saldo é de " + saldo);
        } else if(opcao == 2){
            System.out.println("Insira o valor desejado para transferencia");
            double valor = leitura.nextDouble();
            if (valor > saldo){
                System.out.println("""
                        Não foi possível realizar a operação desejada.
                        Motivo: saldo insuficiente.
                        """);
            } else {
                saldo = saldo - valor;
                System.out.println("Saldo disponivel: " + saldo);
            }
        } else if(opcao == 3){
            System.out.println("Valor recebido: ");
            double valor = leitura.nextDouble();
            saldo += valor;
            System.out.println("""
                    Saldo atualizado!
                    Novo saldo: 
                    """ + saldo);
        }
        }

        }
    }


