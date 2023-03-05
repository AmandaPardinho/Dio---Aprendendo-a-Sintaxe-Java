package metodos;

public class LigaDesliga {
    STATUS statusTv;
    String simNao;

    public String getSimNao() {
        return simNao;
    }

    public void setSimNao(String simNao) {
        this.simNao = simNao;
    }

    public STATUS assitirTv(String simNao){
        if(simNao.equals("s") || simNao.equals("S")){
            statusTv = STATUS.LIGAR;
            return statusTv;
        }else{
            statusTv = STATUS.DESLIGAR;
            return statusTv;
        }
    }

}
