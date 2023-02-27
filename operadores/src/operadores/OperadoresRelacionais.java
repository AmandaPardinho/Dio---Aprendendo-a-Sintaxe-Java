package operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        //comparando inteiros usando relacionais
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println(simNao);

        //comparando strings usando relacionais
        String nome1 = "Amanda";
        String nome2 = "Amanda";

        System.out.println(nome1 == nome2);

        //comparando objetos => cada objeto ocupará um espaço diferente na memória => return = false
            //quando se compara objetos se usa o método .equals() e, se ambos tiverem o mesmo conteúdo interno =>
        //return true

        String nome3 = "Amanda";
        String nome4 = new String("Amanda");

        System.out.println(nome3 == nome4);
        System.out.println(nome3.equals(nome4));
    }
}
