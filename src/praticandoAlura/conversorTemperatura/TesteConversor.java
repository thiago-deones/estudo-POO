package praticandoAlura.conversorTemperatura;

public class TesteConversor {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao convesor = new ConversorTemperaturaPadrao();

        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = convesor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        temperaturaFahrenheit = 78;
        temperaturaCelsius = convesor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.printf("%.1f Fahrenheit é igual a %.1f Celsius.", temperaturaFahrenheit, temperaturaCelsius);

    }
}
