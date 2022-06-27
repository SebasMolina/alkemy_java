package alkemy.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import alkemy.challenge.entity.Pelicula;

public interface PeliculaRepository extends JpaRepository<Integer,Pelicula>{
    
}
