package metodos;

public class SmartTv {
    public static void main(String[] args) {
        LigaDesliga tv = new LigaDesliga();

        tv.setSimNao("S");
        System.out.println(tv.assitirTv(tv.getSimNao()) + " a TV");
    }
}
