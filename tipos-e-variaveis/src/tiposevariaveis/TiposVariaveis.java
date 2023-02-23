package tiposevariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        //cast: pega um tipo mais abrangente e converte para um tipo mais específico, pois é o tipo correspondente
         //é um tipo de "precaução" da linguagem para quando se quer usar tipo com possível precisão maior para uma
        // precisão menor, se algo inesperado acontecer, o programador estará ciente
    }
}
