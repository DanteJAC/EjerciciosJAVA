package VeterinariaV;

//Clase Gato
class Gato extends Animal {
 @Override
  void hacerRuido() {
     System.out.println("El gato maulla: ¡Miau miau!");
 }

@Override
void volar() {
	 System.out.println("El gato no puede volar");
	
}

@Override
void picotear() {
	 System.out.println("El gato no picotea");
	
}

@Override
void comer() {
	 System.out.println("El gato si puede comer");
	
}

@Override
void moverse() {
	 System.out.println("El gato si puede moverse");
	
}
}