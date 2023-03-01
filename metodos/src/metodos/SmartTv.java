package metodos;

import java.util.Scanner;

public class SmartTv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean ligaDesliga;
        String canalMaior;
        //boolean canalMenor;
        String mudaCanal;
        String imagem;
        int canal = 4;
        String volume1;
        int valorVolume1 = 15;
        String volume2;
        int aumentaVolume;
        int diminuiVolume;


        System.out.println("A TV está mostrando alguma imagem? s/n");
        imagem = scanner.next();

        if(imagem.equals("s")){
            System.out.println("A TV está ligada");
            ligaDesliga = true;

            if(ligaDesliga){
                System.out.println("O volume está bom? s/n");
                volume1 = scanner.next();

                if(volume1 == "s"){
                    System.out.println("Vol " + valorVolume1);
                }else{
                    System.out.println("Você quer aumentar o volume? s/n");
                    volume2 = scanner.next();

                    do{
                        aumentaVolume = valorVolume1++;
                        System.out.println("Vol " + aumentaVolume);
                    }while(volume2 == "s");

                    if(volume2 == "n"){
                        System.out.println("O volume está bom? s/n");
                        volume1 = scanner.next();

                        if(volume1 == "n"){
                            System.out.println("Vol " + valorVolume1);
                        }else{

                        }

                    }


                }


                System.out.println("Quer mudar de canal? s/n");
                mudaCanal = scanner.next();

                if(mudaCanal.equals("s")){
                    System.out.println("O número do canal é acima de 4? s/n");
                    canalMaior = scanner.next();

                    if(canalMaior.equals("s")){
                        canal++;
                    }else{
                        canal--;
                    }

                    System.out.println("O canal agora é o " + canal);
                }else{
                    System.out.println("Está no canal " + canal);
                }

            }
        }else{
            System.out.println("A TV está desligada");
        }

    }
}
