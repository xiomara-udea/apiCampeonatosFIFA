package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.ICampeonatoRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ICampeonatoServicio;

@Service
public class CampeonatoServicio implements ICampeonatoServicio{

    private ICampeonatoRepositorio repositorio;

    public CampeonatoServicio(ICampeonatoRepositorio repositorio){
        this.repositorio = repositorio;
    }

    @Override
    public List<Campeonato> listar() {
        return repositorio.findAll();
    }

    @Override
    public Campeonato obtener(int id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

    @Override
    public Campeonato agregar(Campeonato campeonato) {
        
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public Campeonato modificar(Campeonato campeonato) {
        
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public boolean eliminar(int id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public List<Campeonato> buscar(String nombre) {
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }
    
}
