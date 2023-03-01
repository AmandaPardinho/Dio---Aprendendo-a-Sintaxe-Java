package metodos;

import java.util.Scanner;

public class TV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
