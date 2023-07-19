public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.desligar();

        System.out.println("A TV ligou? " + smartTv.ligada);
        System.out.println("Qual o canal sintonizado? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

    }
}
