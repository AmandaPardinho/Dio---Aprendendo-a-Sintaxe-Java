package metodos;

public class Canal {
    private String canal;
    private String mesmoCanal;
    private String outroCanalMaior;
    private String canalAcima;
    private String canalAbaixo;

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getMesmoCanal() {
        return mesmoCanal;
    }

    public void setMesmoCanal(String mesmoCanal) {
        this.mesmoCanal = mesmoCanal;
    }

    public String getOutroCanalMaior() {
        return outroCanalMaior;
    }

    public void setOutroCanalMaior(String outroCanalMaior) {
        this.outroCanalMaior = outroCanalMaior;
    }

    public String getCanalAcima() {
        return canalAcima;
    }

    public void setCanalAcima(String canalAcima) {
        this.canalAcima = canalAcima;
    }

    public String getCanalAbaixo() {
        return canalAbaixo;
    }

    public void setCanalAbaixo(String canalAbaixo) {
        this.canalAbaixo = canalAbaixo;
    }

    public String mudarCanal(String mesmoCanal){

        switch (mesmoCanal){
            case "s":
                return canal;
            case "n":
                if(outroCanalMaior.equals("s") || outroCanalMaior.equals("S")){
                    canal = canalAcima;
                    return canalAcima;
                }else{
                    canal = canalAbaixo;
                    return canalAbaixo;
                }
            default:
                System.out.println("Insira s/n");
                break;
        }
        return canal;
    }
}
