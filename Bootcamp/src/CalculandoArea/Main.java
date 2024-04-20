package CalculandoArea;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        
        Triangulo triangulo = new Triangulo(8, 6);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        
        Circulo circulo = new Circulo(Math.PI, 16);
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}