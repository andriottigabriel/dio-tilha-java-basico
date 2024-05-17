public class Usuario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("volume atual? " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(15);


        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("volume atual? " + smartTv.volume);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        System.out.println("canal atual: " + smartTv.canal);
    }
}
