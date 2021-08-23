/**
* @author: Jimena Hernández
* @version: 21-ago-21
* Esta clase representa al perro. Contiene información sobre el perro.
**/

class Perro{
  private String tamaño;
  private String raza;
  private String edad;
  private String salud;
  private String color;
  private String nombre;
  private boolean perropeligroso;
  String[] perrospeligrosos = {"Pitbull terrier" ,"American staffordshire terrier", "Tosa inu" , "Dogo argentino", "Dogo guatemalteco", "Fila brasileño", "Presa canario", "Dóberman", "Gran perro japonés", "Mastín napolitano", "Presa mallorqui", "Dogo de burdeos", "Bullmastiff", "Bull terrier inglés", "Bulldog americano", "Rhodesiano", "Rottweiler"};

  
  /**
  * Constructor del perro.
  */
  public Perro(){
    // Perro del amigo inicial. Basado en la imagen del PDF
    tamaño = "mediano";
    raza = "Yorshkie";
    edad = "2";
    salud = "90";
    color = "negro";
    nombre = "tofi";
  }
  

  /**
	  * Constructor del perro, genera cualquier perro que se ingrese.
	  * @param tamaño Nombre del perro
	  * @param raza La raza del perro
 	  * @param edad Edad del perro
	  * @param salud Salud del perro.
 	  * @param color El color del perro
	  * @param nombre El nombre del perro.
	  
  **/
	  
  
  public Perro(String tamaño, String raza, String edad, String salud, String color, String nombre){
	this.tamaño= tamaño;
    this.raza = raza;
    this.edad = edad;
    this.salud = salud;
    this.color = color;
	this.nombre = nombre;
	System.out.println("Perro asignado con exito!!!");
	}

    public String getRaza(){

      return raza;
    }

    public String getTamañoPerro(){

      return tamaño;
    }
	
    public String getNombre(){

      return nombre;
    }
	
	

  public static void imprimirArray (String[] lista){
	  for (int i=0; i<lista.length;i++){
		  System.out.println(lista[i]);
	  }
  }
  
  
}


	  