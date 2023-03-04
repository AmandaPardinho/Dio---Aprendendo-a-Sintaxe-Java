package metodos;

public class SmartTv {
    STATUS statusTv;
    String simNao;

    public String getSimNao() {
        return simNao;
    }

    public void setSimNao(String simNao) {
        this.simNao = simNao;
    }

    public String assitirTv(String simNao){
        if(simNao.equals("s") || simNao.equals("S")){
            statusTv = STATUS.LIGAR;
        }else{
            statusTv = STATUS.DESLIGAR;
        }
    }

}
