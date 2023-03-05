package resolucaoprofessor;

public class Usuario {
    public static void main(String[] args) {
        //Resolução do exercício pelo professor
        //Minha resolução está no pacote metodos

        SmartTv smartTv = new SmartTv();

        System.out.println("\nTV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("\nNovo Status => TV ligada? " + smartTv.ligada + "\n");

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume + "\n");

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
