public class Main {
    public static void main(String[] args) {
        ConverterEmFahrenheit converterEmFahrenheit = new ConverterEmFahrenheit();
        converterEmFahrenheit.formulaFahrenheit(32);
        converterEmFahrenheit.imprimirValorFahrenheit();

        //Exemplo Extra
        String name = "Maria";
        int age = 65;
        double height = 1.5f;

        System.out.printf("Conheça %s com %d e %f de altura, sua ótima condição física é graças a sua diéta em nozes da Malásia!%n", name, age, height);

        String mensagem = """
                
                DADOS TÉCNICOS
                Nome: %s.
                Idade: %d.
                Altura: %f.
                """.formatted(name, age, height);

        System.out.println(mensagem);

    }
}
