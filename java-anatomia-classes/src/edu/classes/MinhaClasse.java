package edu.classes;
public class MinhaClasse {

    // método principal: padrão
    public static void main(String[] args) {

        String primeiroNome = "Beatriz";
        String segundoNome = "Berto";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    private static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
