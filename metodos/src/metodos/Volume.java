package metodos;

public class Volume {
    private String volume;
    private String aumentaVolume;
    private String diminuiVolume;
    private String volumeIdeal;
    private String volumeMaior;
    private String volumeMenor;
    private String volumeMantido;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getAumentaVolume() {
        return aumentaVolume;
    }

    public void setAumentaVolume(String aumentaVolume) {
        this.aumentaVolume = aumentaVolume;
    }

    public String getDiminuiVolume() {
        return diminuiVolume;
    }

    public void setDiminuiVolume(String diminuiVolume) {
        this.diminuiVolume = diminuiVolume;
    }

    public String getVolumeIdeal() {
        return volumeIdeal;
    }

    public void setVolumeIdeal(String volumeIdeal) {
        this.volumeIdeal = volumeIdeal;
    }

    public String getVolumeMaior() {
        return volumeMaior;
    }

    public void setVolumeMaior(String volumeMaior) {
        this.volumeMaior = volumeMaior;
    }

    public String getVolumeMenor() {
        return volumeMenor;
    }

    public void setVolumeMenor(String volumeMenor) {
        this.volumeMenor = volumeMenor;
    }

    public String getVolumeMantido() {
        return volumeMantido;
    }

    public void setVolumeMantido(String volumeMantido) {
        this.volumeMantido = volumeMantido;
    }

    public String mudarVolume(String volumeIdeal){

        switch(volumeIdeal){
            case "s":
                volumeMantido = volume;
                break;
            case "n":
                if(volumeMaior.equals("s") || volumeMaior.equals("S")){
                    volume = aumentaVolume;
                    return aumentaVolume;
                }else{
                    volume = diminuiVolume;
                    return diminuiVolume;
                }
            default:
                System.out.println("Insira s/n");
                break;
        }
        return volume;
    }
}
