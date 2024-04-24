package VeterinariaIV;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Perro();
        animales[1] = new Pez();
        animales[2] = new Gato();
        animales[3] = new Ave();

        for (Animal animal : animales) {
            animal.hacerRuido();
            animal.comer();
            animal.moverse();
            if (animal instanceof Ave) {
                ((Ave) animal).anidar();
            }
            System.out.println();
        }
    }
}