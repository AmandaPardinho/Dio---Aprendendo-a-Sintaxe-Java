package tiposevariaveis;

public class Contantes {
    public static void main(String[] args) {
        //Quando queremos declarar uma variável cujo valor não pode sofrer alteração durante o tempo de execução do
        // código, usa-se a palavra final
            //isso criará uma constante e seu valor não poderá ser alterado
                //essa constante pode ser chamada também de variável final => passa-se a considerar constante aquela
                    //que é declarada como public static final tipoDaVariavel nomeDaVariavel (divergências encontradas
                    //(????))
            //o nome da constante será sempre em caixa alta
            //erro apresentado (antes de comentar a linha 13): java: cannot assign a value to final variable VALOR

         final float VALOR = 3.14f;

        //VALOR = 5.6f;

        System.out.println(VALOR);

    }
}
