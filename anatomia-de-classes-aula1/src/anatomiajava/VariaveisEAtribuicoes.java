package anatomiajava;

public class VariaveisEAtribuicoes {
    public static void main(String[] args) {
        String nome = "Amanda";
        String sobrenome = "Pardinho";
        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }
}
