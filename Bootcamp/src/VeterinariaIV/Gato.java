package VeterinariaIV;

//Clase Gato
class Gato implements Animal {
 @Override
 public void hacerRuido() {
     System.out.println("El gato maulla: ¡Miau miau!");
 }

 @Override
 public void comer() {
     System.out.println("El gato disfruta su comida de gato.");
 }

 @Override
 public void moverse() {
     System.out.println("El gato se desliza sigilosamente por la casa.");
 }
}