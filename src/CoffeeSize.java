import java.util.Scanner;

public enum CoffeeSize {
    SMALL("2.50"),
    MEDIUM("3.50"),
    LARGE("4.50");

    private final String VALOR;

    CoffeeSize(String valor) {
        this.VALOR = valor;
    }

    public String getPrice() {
        return VALOR;
    }

}
