package documentacao;

public class Comentarios {
    public static void main(String[] args) {
        //Comentário de uma única linha

        /* Comentário que pode ser mais detalhado
         * caso haja necessidade
         */
    }

    /**
     * Estes dois asteriscos acima servem para identificar
     * que pretendemos elaborar um comentário a nível de documentação.
     * Vai sempre fora do bloco de método.
     * Também é possível criar a documentaçãpo via javadoc: o javadoc cria, via terminal, um arquivo de
     * documentação em HTML. Este sistema é o <b>padrão de documentação de classes Java</b>.
     * Para isso, basta executar via terminal:
     * javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
     */

    public void metodo(){

    }

}
