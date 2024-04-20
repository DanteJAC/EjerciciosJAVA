package Clase79;

public interface Moneda {

	String getSimbolo();
    double getFactorConversion();
    double convertir(double cantidad, Moneda otraMoneda);
}
