import java.util.Scanner;
import java.util.ArrayList;

public class Conta{

    // Inicio de looping
    boolean inciar = true;

    // Definição de Scanner
    Scanner input = new Scanner(System.in);

    // ArrayList
    ArrayList<String> historico = new ArrayList<String>();

    // Atributos
    int saldo = 5000;

    // Metódos

    void contabancaria(){
        while(inciar){
            System.out.println("=====================");
            System.out.println("Conta iniciada");
            System.out.println("1 - Histórico de transação");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            System.out.println("=====================");
            System.out.println("Você possui um saldo de: "+ saldo);
            System.out.println("=====================");
            
            System.out.println("=====================");
            System.out.println("O que você deseja?");
            int escolha = input.nextInt();
            System.out.println("=====================");

               switch (escolha) {
                    case 1:
                        if (historico.isEmpty()){
                            System.out.println("Nenhuma transação realizada!");
                        }
                        else {
                            for (int i = 0; i < historico.size(); i++) {
                                System.out.println("Transação " + (i + 1) + ": " + historico.get(i));
                            }
                        }
                        break;

                    case 2:
                        System.out.println("Quanto deseja depositar?");
                        int deposito = input.nextInt();
                        saldo += deposito;
                        historico.add("Deposito de " + deposito);
                        break;

                    case 3:
                        System.out.println("Quanto deseja sacar?");
                        int saque = input.nextInt();
                        saldo -= saque;
                        historico.add("Saque de " + saque);
                        break;

                    case 4:
                        inciar = false;
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        inciar = false;
                        break;
                }
        }
        input.close();
    }
}