package metodos;

public class SmartTv {
    public static void main(String[] args) {
        LigaDesliga tv = new LigaDesliga();

        tv.setSimNao("S");
        System.out.println(tv.assitirTv(tv.getSimNao()) + " a TV");

        Volume volumeTV = new Volume();
        volumeTV.setVolumeIdeal("n");
        volumeTV.setVolume("15");
        volumeTV.setVolumeMaior("s");
        volumeTV.setAumentaVolume("25");
        System.out.println(volumeTV.mudarVolume(volumeTV.getVolumeIdeal()));



    }
}
