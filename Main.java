import java.util.ArrayList;
import java.util.List;

class GeneroMusical {
    private String nombre;

    public GeneroMusical(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void escuchar() {
        System.out.println("Estás escuchando música: " + nombre);
    }
}

// Clases hijas: Metal, Rock y Pop
class Metal extends GeneroMusical {
    public Metal() {
        super("Metal");
    }

    // Métodos adicionales específicos para Metal
    public void artistaMetal() {
        System.out.println("Tu banda favorita es blind guardian");
    }
}

class Rock extends GeneroMusical {
    public Rock() {
        super("Rock");
    }

    // Métodos adicionales específicos para Rock
    public void artistaRock() {
        System.out.println("tu banda favorita es nirvana");
    }
}

class Pop extends GeneroMusical {
    public Pop() {
        super("Pop");
    }

    // Métodos adicionales específicos para Pop
    public void artistaPop() {
        System.out.println("Tu artista favorito es The Weekend");
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases hijas
        Metal metal = new Metal();
        Rock rock = new Rock();
        Pop pop = new Pop();

        // Utilizar setters y getters
        metal.setNombre("Power Metal");
        System.out.println("Nombre del género metal: " + metal.getNombre());

        // Llamar a métodos personalizados
        metal.artistaMetal();
        rock.artistaRock();
        pop.artistaPop();

        // Manejo de excepciones con try-catch
        try {
            // Intentar reproducir un género musical no especificado
            GeneroMusical generoDesconocido = new GeneroMusical("Desconocido");
            generoDesconocido.escuchar();
        } catch (Exception e) {
            System.out.println("Error al reproducir música: " + e.getMessage());
        }

        // Almacenamiento en una lista
        List<GeneroMusical> listaGeneros = new ArrayList<>();
        listaGeneros.add(metal);
        listaGeneros.add(rock);
        listaGeneros.add(pop);

        // Iterar sobre la lista y llamar al método escuchar
        for (GeneroMusical genero : listaGeneros) {
            genero.escuchar();
        }
    }
}



