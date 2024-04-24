package VeterinariaIV;

//Clase Ave
class Ave implements Animal {
 @Override
 public void hacerRuido() {
     System.out.println("El ave canta melodiosamente.");
 }

 @Override
 public void comer() {
     System.out.println("El ave picotea semillas y gusanos.");
 }

 @Override
 public void moverse() {
     System.out.println("El ave vuela por el cielo.");
 }

 public void anidar() {
     System.out.println("El ave construye su nido en las ramas.");
 }
}