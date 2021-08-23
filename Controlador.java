/**
* @author: Jimena Hernández
* @version: 21-ago-21
* Esta clase es el controlador principal del programa.
**/
class Controlador{
  /**
  * Main del programa.
  **/
  public static void main(String[] args){
      Vista vista = new Vista();
      Familia familia = new Familia();
      Perro perro = new Perro();
	  String[] perrospeligrosos = {"Pitbull terrier" ,"American staffordshire terrier", "Tosa inu" , "Dogo argentino", "Dogo guatemalteco", "Fila brasileño", "Presa canario", "Dóberman", "Gran perro japonés", "Mastín napolitano", "Presa mallorqui", "Dogo de burdeos", "Bullmastiff", "Bull terrier inglés", "Bulldog americano", "Rhodesiano", "Rottweiler"};
	  Familia listafam[] = new Familia[15];
	  Perro listaperro[]= new Perro[25];
	  Perro perrospeligro[]= new Perro[10];
	  Perro perrosnopeligro[]= new Perro[10];
		  
	  
      int opcion;

      System.out.println("Bienvenido al programa Hogares temporales para Canes (HTC)");
	  System.out.println("¿Qué desea hacer?");
      opcion = vista.menu();

  while(opcion != 5){
    switch(opcion)
    {
      case 1:
      String apellido = vista.getApellido();
      String miembros = vista.getMiembros();
      int niñosGra = vista.getNiñosgra();
	  int niñospeq = vista.getNiñospeq();
	  int mascotas = vista.getMascotasasignadas();
	  familia.famniños(niñosGra, niñospeq);
      familia = new Familia(apellido, miembros, niñosGra, niñospeq, mascotas);
	  for(int i = 0; i<15; i++){
		  if(listafam[i] == null){
			  listafam[i] = familia;
			  break; // solo en la primera posicion vacia se añade a la familia
		  }
	  }
      break;
	  
      case 2:
        String tamaño = vista.getTamañoPerro();
        String raza = vista.getRaza();
        String edad = vista.getEdad();
        String salud = vista.getEstadosalud();
        String color = vista.getColor();
		String nombre = vista.getNombrePerro();
        perro = new Perro(tamaño, raza, edad, salud, color, nombre);
  	  	for(int i = 0; i<25; i++){
  			  if(listaperro[i] == null){
  				  listaperro[i] = perro;
  			 break; // solo en la primera posicion vacia se añade a la familia
  		  }
  	  	  }
	
	  for(int i = 0; i<25 ;i++){
	 	 if(listaperro[i] != null){
		  perro = listaperro[i];
		  vista.mensaje("Perros: " + perro.getRaza() + "\n");  // Se imprime la raza de cada perro
		  vista.mensaje("tamaño: " + perro.getTamañoPerro() + "\n"); // Se imprime el tamaño de cada perro
		   break;
			}
			}
	   break;
			
       case 3:
   		boolean perropeligroso = false;
		for (int i = 0; i<17; i++){
		if (perro.getRaza().equals(perrospeligrosos[i])){
			perropeligroso = true;
			}
			}
	
		if (perropeligroso==true){
  	  	for(int i = 0; i<10; i++){
  			  if(perrospeligro[i] == null){
  				  perrospeligro[i] = perro;
				  break;
			  	  } 
  				  }
  	   }else if (perropeligroso==false) {
     	  	for(int i = 0; i<10; i++){
     			  if(perrosnopeligro[i] == null){
     				  perrosnopeligro[i] = perro;
					   break;
   			  	  } 
         		  }
  	   	   		  }
	   
	   if (familia.getNiñospeq()>0){
		   for (int i = 0; i < 10; i++) {
	  	 	 if(perrosnopeligro[i] != null & perrosnopeligro[i].getTamañoPerro().equals("pequeño")){
	  		  perro = perrosnopeligro[i];
	  		  vista.mensaje("SU PERRO ASIGNADO ES :"+ perro.getNombre()+"CON RAZA:  " + perro.getRaza() + "\n");  // Se imprime el perro que le tocó
			  break;
	  			}
		   }
	   }else if (familia.getNiñosgra()>0){
		   for (int i=0; i<10; i++){
		   	if(perrosnopeligro[i] != null & perrosnopeligro[i].getTamañoPerro().equals("mediano")){
		   		perro = perrosnopeligro[i];
			 	vista.mensaje("SU PERRO ASIGNADO ES  : " +perro.getNombre()+"CON RAZA:  " + perro.getRaza() + "\n");
				break;
		   		}
		   }  
	   }else if (familia.getNiñospeq()==0 && familia.getNiñosgra()==0){
		   for (int i = 0; i < 10; i++) {
	  	 	 if(perrospeligro[i] != null){
	  		  perro = perrospeligro[i];
	  		  vista.mensaje("SU PERRO ASIGNADO ES  : " + perro.getNombre()+ "CON RAZA:  " + perro.getRaza() + "\n");  // Se imprime el perro que le tocó
			  break;
	  			}
		   }
	   }
		   
       break;
	   
      case 4:
	  for(int i = 0; i<15 ;i++){
	 	 if(listafam[i] != null){
		  familia = listafam[i];
		  vista.mensaje("Familia: " + familia.getApellido() + "\n");  // Se imprime el apellido de cada familia, para mostrar la lista familia
			} else {
				vista.mensaje("Familia: " + familia.getApellido() + "\n");
			}
			break;
		}
        break;
    }
    opcion = vista.menu();
  }
  
}
}

