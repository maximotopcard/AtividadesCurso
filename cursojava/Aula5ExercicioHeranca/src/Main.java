public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maria", "111.111.111-11", 35, "01/01/1988", 1999, 254);
        Secretaria secretaria = new Secretaria("Joana", "222.222.222-22", 35, "02/02/1988", 22, 2);
        Telefonista telefonista = new Telefonista("Dona Fifi", "333.33--3.333-33", 35, "03/03/1988", "(33) 3333-3333", 33);
        System.out.println(gerente);
        System.out.println(secretaria);
        System.out.println(telefonista);
    }
}