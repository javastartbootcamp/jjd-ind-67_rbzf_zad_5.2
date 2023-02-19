package pl.javastart.task;

public class Room {
    private final double surface;
    private double temperature;
    private final double minTemperature;
    private final boolean airCondition;

    public Room(double surface, double temperature, double minTemperature, boolean airCondition) {
        this.surface = surface;
        this.temperature = temperature;
        this.minTemperature = minTemperature;
        this.airCondition = airCondition;
    }

    String getInfo() {
        String format = "powierzchnia pomieszczenia: %.2f m.kw., aktualna temperatura: %.1f°C, " +
                "temperatura minimalna: %.1f°C, zamontowany klimatyzator: %b";
        return format.formatted(surface, temperature, minTemperature, airCondition);
    }

    boolean decreaseTemp() {
        if (airCondition && ((temperature - 1) >= minTemperature)) {
            temperature--;
            return true;
        }   else if ((temperature - 1) < minTemperature) {
            temperature = minTemperature;
            return true;

        }
        return false;
    }
}
