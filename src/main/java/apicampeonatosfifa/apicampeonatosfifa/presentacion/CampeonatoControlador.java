package apicampeonatosfifa.apicampeonatosfifa.presentacion;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.aplicacion.CampeonatoServicio;
import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Campeonato;


@RestController
@RequestMapping("api/campeonatos")
public class CampeonatoControlador {

    private CampeonatoServicio servicio;

    public CampeonatoControlador(CampeonatoServicio servicio){
        this.servicio = servicio;
    }

    @RequestMapping(value="/listar", method = RequestMethod.GET )
    public List<Campeonato> listar() {
        return servicio.listar();
    }
}
