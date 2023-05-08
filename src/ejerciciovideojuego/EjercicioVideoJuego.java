
package ejerciciovideojuego;

import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

/*Crear una clase llamada VideoJuego, que tenga los siguientes atributos:
codigo, titulo, consola, cantidadJugadores, categoria(tener en cuenta todos sus atributos,
constructores, métodos getters y setters).*/

public class EjercicioVideoJuego {

    public static void main(String[] args) {
        //Crear una ArrayList de tipo VideoJuego. Crear 5 videojuegos y guardarlos en la collection.
       List<VideoJuego> listaVideoJuegos = new ArrayList<>(); //Creamos una lista de video juegos de tipo Arraylist
       
       //Creamos 5 video juegos
       VideoJuego video1 = new VideoJuego (123,"Banjoo Kazooie","Nintendo 64",4,"Plataforma");
       VideoJuego video2 = new VideoJuego (389,"Mario Party 3","Nintendo 64",4,"Plataforma");
       VideoJuego video3 = new VideoJuego (101,"Age of Empire 3","Pc",1,"Estrategia");
       VideoJuego video4 = new VideoJuego (457,"Counter Sriker 1.6","Pc",1,"Shooter");
       VideoJuego video5 = new VideoJuego (369,"Mario Kart","Nintendo 64",2,"Plataforma");
       
       //Los agregamos a lista que creamos
       listaVideoJuegos.add(video1);
       listaVideoJuegos.add(video2);
       listaVideoJuegos.add(video3);
       listaVideoJuegos.add(video4);
       listaVideoJuegos.add(video5);
       
       /*Recorrer la ArrayList creada y mostrar por pantalla el titulo, consola
       y cantidad de jugadores de los video juegos almacenados.*/
        for (VideoJuego video: listaVideoJuegos) { //Por cada video juego de la lista de video juegos yo voy hacer...
            System.out.println("titulo: " + video.getTitulo() + "consola: " + video.getConsola()
            + "cantidad de jugadores: " + video.getCantJugadores());
            
        }
        
        /* Cambiar el nombre y la cantidad de jugadores de dos videojuegos. Mostrar por 
        pantalla los datos de todos los videojuegos luego del cambio.*/
        
        video1.setTitulo("Banjoo Kazooie II");
        video1.setCantJugadores(1);
        
        video5.setTitulo("Super Mario kart");
        video5.setCantJugadores(4);
        
        /*Recorrer la ArrayList y mostrar por 
        pantalla únicamente a los videojuegos que sean de la consola "Nintendo 64"*/
        
        for (VideoJuego video: listaVideoJuegos) {
            if(video.getConsola().equals("Nintendo 64")) {
                System.out.println(video.toString()); 
            }
            
        }
        
    }
    
}
