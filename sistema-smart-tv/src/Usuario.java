public class Usuario {
    public static void main(String[] args) throws Exception {
        // classe como se fosse um log (SmarTV)
        SmartTv smartTv = new SmartTv();

        System.out.println(" TV ligada? " + smartTv.ligada);
        System.out.println(" Canal Atual: " + smartTv.canal);
        System.out.println(" Volume Atual: " + smartTv.volume);

        System.out.println(" Volume Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println(" Volume Atual: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo Status ->  TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status ->  TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println(" Volume Atual: " + smartTv.volume);

    }
}
