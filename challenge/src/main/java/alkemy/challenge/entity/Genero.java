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
public class Genero {
    private int id;
    private String nombre;
    private String imagen;
    private ArrayList<Pelicula> peliculas;

}
