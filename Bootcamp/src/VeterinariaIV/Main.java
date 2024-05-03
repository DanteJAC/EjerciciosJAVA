package VeterinariaIV;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[5];
      
    //    animales[1] = new Pez();
        animales[1] = new Perro();
        animales[2] = new Gato();
        animales[3] = new Ave();
        animales[4] = new Condor();
        animales[5] = new Pinguino();

        for (Animal animal : animales) {
            animal.hacerRuido();
            animal.comer();
            animal.moverse();
            animal.picotear();
            animal.volar();
            if (animal instanceof Ave) {
                ((Condor) animal).volar();
            }
            System.out.println();
        }
    }	
}

