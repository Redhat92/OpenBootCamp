class Main {
  public static void main(String[] args) {
/*Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.*/
  var res=suma(30,85,47);
  System.out.println("Suma: "+res);

  Coche miCoche=new Coche(); //Se crea instancia
  miCoche.agregarPuerta(); 
   System.out.println("Número de puertas: "+miCoche.puertas);
  }

 public static int suma(int a,int b, int c){
    return a+b+c;
  }


 /*Segunda parte: 
-Crear una clase coche.
-Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
-Una función que incremente el número de puertas que tiene el coche.
-Crear un objeto miCoche en el main y añadirle una puerta.
-Mostrar el número de puertas que tiene el objeto.*/

  public static class Coche{
    public int puertas=1;
    
    public void agregarPuerta(){
      puertas++;
    }
  }
}
 