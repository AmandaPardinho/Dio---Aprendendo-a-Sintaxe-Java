package metodos;

import java.util.Scanner;

public class TV {
    static Scanner scanner = new Scanner(System.in);
    public mudarCanal(int canal){
        char escolha;
        System.out.println("Quer mudar de canal? s/n");
        escolha = scanner.next();
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
