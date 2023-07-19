public class Operadores {

    public static void main(String[] args){

        //OPERADORES ARITMÉTICOS: +, -, /, *, %

        //OBS.: (+) COMO CONCATENAÇÃO

        String concatenacao = "?";

       // concatenacao = 1+1+1+1;

        concatenacao = 1+1+1+"1";

        concatenacao = 1+"1"+1+1;
        
        concatenacao = 1+"1"+1+"1";

        concatenacao = 1+1+"1"+1;

        concatenacao = "1"+(1+1+1);
        

        //OPERADORES UNÁRIOS: INCREMENTAAR, DECREMENTAR, INVERTER VALORES NUMÉRICOS OU BOLEANOS

        int numero = 5;
        numero = -numero;

        numero = -numero;

        //numero ++ e --

        // System.out.println(numero++);
        // System.out.println(numero);
        // System.out.println(++numero);

        //boleanos
            boolean variavel = true;
            //System.out.println(!variavel);

        //OPERADORES TERNÁRIOS
        int a, b;
        a = 5;
        b = 6;
        
        String resultado;
            //  EXEMPLO USANDO IF/ELSE
        // if(a==b)
        //     resultado = "Verdade!";
        // else
        //     resultado = "Falso!";

        // EXEMPLO USANDO TERNÁRIO

        // resultado = (a==b) ? "verdadeiro." : "falso.";
        // System.out.println("a = b? - " + resultado);

        //OPERADORES RELACIONAIS

        //OPERADORES LÓGICOS
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao1){
            System.out.println("As duas condições são verdadeiras.");

        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira.");
        }
        }



        
    }
    
}
