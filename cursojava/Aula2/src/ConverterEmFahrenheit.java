public class ConverterEmFahrenheit {
    private double celsius;
    private double fahrenheit;

    public void formulaFahrenheit(double celsius) {
        this.celsius = celsius;
        fahrenheit = (this.celsius * 1.8f) + 32;
    }

    void imprimirValorFahrenheit() {
        int castingCelsius = (int) celsius;
        int castingFahrenheit = (int) fahrenheit;
        System.out.printf("Temperatura em %d Celsius convertida para %d Fahrenheit%n", castingCelsius, castingFahrenheit);
    }
}
