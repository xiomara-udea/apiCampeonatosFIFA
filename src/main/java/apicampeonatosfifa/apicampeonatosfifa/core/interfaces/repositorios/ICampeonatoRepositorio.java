package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Campeonato;

@Repository
public interface ICampeonatoRepositorio extends JpaRepository<Campeonato, Integer>{
    
}
