/**
* @author: Jimena Hernández
* @version: 21-ago-21
* Esta clase es la vista del programa.Imprime resultados y pide datos.
**/
import java.util.Scanner;
class Vista{
  Scanner scan = new Scanner(System.in);

  /**
  * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
  * @return La opción elegida por el usuario
  */
  public int menu(){
    int opcion;

    System.out.println("\n1. Nueva familia");
    System.out.println("2. Recibir perro");
    System.out.println("3. Asignar perro a familia");
    System.out.println("4. Ver listado familias");
    System.out.println("5. Salir");

    opcion = scan.nextInt();
    scan.nextLine();

    return opcion;
  }
  
  /**
  * Le pide al usuario que ingrese el appelido de la familia.
  * @return El apellido ingresado por el usuario
  */
  public String getApellido(){
    System.out.printf("\nPor favor, ingrese el apellido de su familia: \n");

    String apellido = scan.nextLine();

    return apellido;
  }
  
  /**
  * Le pide al usuario que ingrese el numero de miembros.
  * @return El numero de miembros
  */
  public String getMiembros(){
    System.out.printf("\nPor favor, ingrese el numero de miembros de su familia: \n");

    String miembros = scan.nextLine();

    return miembros ;
  }
  
  /**
  * Le pide al usuario que ingrese el numero de niños grandes.
  * @return El numero de niños grandes
  */
  public int getNiñosgra(){
    System.out.printf("\nPor favor, ingrese el numero de niños grandes en su familia: \n");

    int niñosGra = scan.nextInt();

    return niñosGra  ;
  }
  
  /**
  * Le pide al usuario que ingrese el numero de niños pequeños.
  * @return El numero de niños pequeños
  */
  public int getNiñospeq(){
    System.out.printf("\nPor favor, ingrese el numero de niños pequeños en su familia: \n");

    int niñospeq = scan.nextInt();

    return niñospeq  ;
  }
  
  /**
  * Le pide al usuario que ingrese el numero de mascotas ya asignadas.
  * @return El numero de mascotas ya asignadas
  */
  public int getMascotasasignadas(){
    System.out.printf("\nPor favor, ingrese el numero de mascotas que su familia tiene ya asignadas \n");

    int mascotas = scan.nextInt();

    return mascotas ;
  }
  
  /**
  * Le pide al usuario que ingrese el tamaño del perro.
  * @return El tamaño del perro ingresado por el usuario
  */
  public String getTamañoPerro(){
    System.out.printf("\nPor favor, ingrese el tamaño del perro (grande, mediano, pequeño): \n");

    String tamaño = scan.nextLine();

    return tamaño;
  }
  
  /**
  * Le pide al usuario que ingrese la raza del perro.
  * @return La raza del perro ingresado por el usuario
  */
  public String getRaza(){
    System.out.printf("\nPor favor, ingrese la raza del perro: \n");

    String raza = scan.nextLine();

    return raza;
  }
  
  /**
  * Le pide al usuario que ingrese la edad del perro.
  * @return La edad del perro ingresado por el usuario
  */
  public String getEdad(){
    System.out.printf("\nPor favor, ingrese la edad del perro: \n");

    String edad = scan.nextLine();

    return edad;
  }
  
  
  /**
  * Le pide al usuario que ingrese el estado de salud del perro.
  * @return La salud del perro ingresado por el usuario
  */
  public String getEstadosalud(){
    System.out.printf("\nPor favor, ingrese el estado de salud del perro de (0-100): \n");

    String salud = scan.nextLine();

    return salud;
  }
  
  /**
  * Le pide al usuario que ingrese el color del perro.
  * @return El color del perro ingresado por el usuario
  */
  public String getColor(){
    System.out.printf("\nPor favor, ingrese el color del perro: \n");

    String color = scan.nextLine();

    return color;
  }
  
  
  /**
  * Le pide al usuario que ingrese el nombre del perro.
  * @return El nombre del perro ingresado por el usuario
  */
  public String getNombrePerro(){
    System.out.printf("\nPor favor, ingrese el nombre del perro: \n");

    String nombre = scan.nextLine();

    return nombre;
  }
  
  /**
  * 
  * @return nothing
  */  
  public void mensaje(String mensaje){
	  System.out.println(mensaje);
  }
  
  public void despedida(){
	System.out.println("Adiós pues");
  }
  
  
}