package metodos;

import java.util.Scanner;

public class TV {
    static Scanner scanner = new Scanner(System.in);
    public int mudarCanal(int canal){
        String escolha;
        System.out.println("Quer mudar de canal? s/n");
        escolha = scanner.next();

        if(escolha == "s"){
            System.out.println("Digite o número do canal desejado:");
            canal = scanner.nextInt();
        }
        return canal;
    }




    public static void main(String[] args) {


        int ligaDesliga;

        System.out.println("""Selecione a opção:
                1- Ligar a TV;
                2- Desligar a TV;
                3- Sair; 
                """);

        ligaDesliga = scanner.nextInt();

        switch (ligaDesliga){
            case 1:
                break;
            case 2;
                break;
            case 3:
                break;
            default:
                System.out.println("Opção não disponível");
                break;

        }

    }
}
