public class SmartTv {

    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void ligar(){
        ligada = true;
    }

    
    public void desligar(){
        ligada = false;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void definirCanal(int novoCanal){
        canal = novoCanal;
            }



    public void aumentarVolume(){
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }




}
