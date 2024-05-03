package VeterinariaV;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Condor();
        animales[3] = new Pinguino();

        for (Animal animal : animales) {
            animal.hacerRuido();
            animal.comer();
            animal.moverse();
            animal.picotear();
            animal.volar();
           if (animal instanceof Condor) {
              //  ((Condor) animal).volar();
            }
            System.out.println();
        }
    }	


}