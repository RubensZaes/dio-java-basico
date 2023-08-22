public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Rubens";
        String segundoNome = "Stanley";
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
//        return primeiroNome + " " + segundoNome;
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
