package alkemy.challenge.entity;

import java.util.ArrayList;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Personaje {
    private int id;
    private String imagen;
    private String nombre;
    private int edad;
    private double peso;
    private String historia;
    private ArrayList<Pelicula> peliculas;

}
