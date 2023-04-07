import java.util.Scanner;

public class Extrato extends Conta {
    private String menu = """
                1 - Consultar valores
                2 - Receber valores
                3 - Transferir valor
                4 - Sair
                """;

    private Scanner leitor = new Scanner(System.in);
    private boolean mostrarMenu = true;

    private void verificadorPositivo(double valorFornecido){
        while (valorFornecido <= 0.0) {
            System.out.println("Valor não permitido. Insira uma quantia maior que 0 reais");
            valorFornecido = leitor.nextDouble();
        }
    };
    public void montaMenu() {
        montarLoop();
    }


    private void consultaValores() {
        System.out.println("O saldo de sua conta " + tipoConta + " é: R$" + saldoConta);
    }

    private void transferirValores() {
        System.out.println("Informe o valor que deseja transferir: ");
        double valorTransferido = leitor.nextDouble();
        verificadorPositivo(valorTransferido);
        saldoConta -= valorTransferido;
        System.out.println("Saldo atualizado é: R$" + saldoConta);
    }

    private void  recebeValor() {
        System.out.println("Informe o valor a receber: ");
        double valorReceber = leitor.nextDouble();
        verificadorPositivo(valorReceber);
        saldoConta += valorReceber;
        System.out.println("Saldo atualizado é: R$" + saldoConta);
    }
    private void  sairSistema() {
        mostrarMenu = false;
    }

    private void montarLoop() {
        while (mostrarMenu) {
            System.out.println(menu);
            int opcaoDoMenu = leitor.nextInt();

            if(opcaoDoMenu == 1) {
                consultaValores();
            }

            else if(opcaoDoMenu == 2) {
                recebeValor();
            }

            else if(opcaoDoMenu == 3) {
                transferirValores();

            }
            else if(opcaoDoMenu == 4) {
                sairSistema();
            }

            else {
                System.out.println("Opção inválida.");
            }

        }
    }
}



