package VeterinariaIV;

//Clase Pez
class Pez implements Animal {
 @Override
 public void hacerRuido() {
     System.out.println("El pez no hace ruido (glug glug).");
 }

 @Override
 public void comer() {
     System.out.println("El pez se alimenta de plancton.");
 }

 @Override
 public void moverse() {
     System.out.println("El pez nada en el agua.");
 }
}
