/**
* @author: Jimena Hernández
* @version: 21-ago-21
* Esta clase representa a las familias que adoptarán perros.
**/

class Familia{
    private String apellido;
    private String miembros;
    private int niñosGra;
    private int niñospeq;
    private int mascotas;
	private boolean perroadoptado;

    /**
    * Constructor de la Familia inicial.
    */
    public Familia(){
      // Perro del amigo inicial. Basado en la imagen del PDF
      apellido = "Suarez";
      miembros = "3";
      niñosGra = 1;
      niñospeq = 2;
      mascotas = 1;
    }
	
    /**
  	  * Constructor de familia, genera cualquier familia que se ingrese.
  	  * @param apellido 
  	  * @param miembros
   	  * @param niñosGra
  	  * @param niñospeq
   	  * @param mascotas
	  
    **/
	  
    public Familia(String apellido, String miembros, int niñosGra, int niñospeq, int mascotas){
      this.apellido = apellido;
      this.miembros = miembros;
      this.niñosGra = niñosGra;
      this.niñospeq = niñospeq;
  	  this.mascotas = mascotas;
 	 }
	 
     /**
     * 
     * @return El apellido ingresado por el usuario
     */
     public String getApellido(){
       return apellido;
     }
  
     /**
     * 
     * @return El numero de miembros
     */
     public String getMiembros(){
       return miembros ;
     }
  
     /**
     * 
     * @return El numero de niños grandes
     */
     public int getNiñosgra(){
       return niñosGra  ;
     }
  
     /**
     * 
     * @return El numero de niños pequeños
     */
     public int getNiñospeq(){
       return niñospeq  ;
     }
  
     /**
     * 
     * @return El numero de mascotas ya asignadas
     */
     public int getMascotasasignadas(){
       return mascotas ;
     }
	 
	 
	 //mensaje de conocimiento para el usuario 
	 public void famniños(int niñosGra, int niñospeq){	 
		 if (niñospeq > 0){
			 System.out.println(" Le comentamos que por tener un niño pequeño, solo puede acoger perros pequeños o labradores");
		 }
		   else if (niñospeq == 0 && niñosGra > 0){
		  	 System.out.println(" Le comentamos que por tener un niño grande, solo puede acoger perros pequeños o medianos *no razas peligrosas*");
		  }else if(niñospeq == 0 && niñosGra == 0) {
 		  	 System.out.println(" Le comentamos que por no tener niños, puede ser asignado con razas peligrosas");
		  }
	  }
  


}