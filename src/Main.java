public class Main {
    public static void main (String[] args) {

      System.out.println("Primera clase de 'Gato'\n".toUpperCase());
      Gato gatoUno = new Gato("Michi","Gris", 5,"Raza gato", true);
      System.out.println("El gato se llama: " + gatoUno.nombreG + "\nColor: " + gatoUno.colorG + "\nSu edad es: " + gatoUno.edadG + "\nEs raza: " + gatoUno.razaG + "\n¿Esta vivo? " + gatoUno.vivoG);

      System.out.println("\nSegunda clase de 'Perro'\n".toUpperCase());
      Perro perroUno = new Perro("Firulais","La cara",4,"Pitbull",true);
      System.out.println("El perro se llama: " + perroUno.nombreP + "\nTipo de comida: " + perroUno.tipoComidaP + "\nPaseos al dia: " + perroUno.paseosP + "\nSu raza es: " + perroUno.razaP + "\n¿Esta vivo? " + perroUno.vivoP);




    }




}

