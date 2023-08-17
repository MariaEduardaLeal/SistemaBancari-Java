import java.util.Scanner;

public class ContaTerminal {
    private double saldo = 25;

    public void deposito(double valor){
        if (valor > 18){
            saldo = valor + saldo;
            System.out.println("Novo valor depositado" +
            "\n Seu saldo atual é " + mostrarSaldo());
        }else{
            System.out.println("O valor mínimo para depósito são R$18.00");
        }
    }
    public void sacar(double valor){
        if (valor <= saldo) { // Use <= em vez de >
            saldo -= valor; // Correção para realizar o saque corretamente
            System.out.println("Valor sacado.\nSeu novo saldo é " + mostrarSaldo());
        } else {
            System.out.println("O valor que você quer sacar é maior que o existente no seu saldo.");
        }

    }
    public double mostrarSaldo(){
            return saldo;
    }
    public static void main(String[] args) {
        /*TODO: Conhecer e importar a classe Scanner
        Exibir as mensagens para nosso usuário
        Exibir a mensagem conta criada

         */

        Scanner scan = new Scanner(System.in);
        int opcao;

            ContaTerminal conta = new ContaTerminal();

            System.out.println("Digite o número da opção que deseja escolher:\n" +
                    "\n1.Depositar valor" +
                    "\n2.Sacar valor" +
                    "\n3.Ver valor existente na conta" +
                    "\n4.Sair");
             opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o valor que deseja depositar");
                    double valorDeposito = scan.nextDouble();
                    conta.deposito(valorDeposito);
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja sacar");
                    double valorSacar = scan.nextDouble();
                    conta.sacar(valorSacar);
                    break;
                case 3:
                    System.out.println(conta.mostrarSaldo());


            }



    }
}
