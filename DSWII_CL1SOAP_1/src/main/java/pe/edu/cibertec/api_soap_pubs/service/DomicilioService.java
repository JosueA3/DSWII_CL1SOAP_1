package pe.edu.cibertec.api_soap_pubs.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_soap_pubs.convert.EstacionamientoConvert;
import pe.edu.cibertec.api_soap_pubs.model.Estacionamiento;
import pe.edu.cibertec.api_soap_pubs.repository.DomicilioRepository;
import pe.edu.cibertec.ws.objects.Estacionamiento;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DomicilioService implements  IDomicilioService {

    private DomicilioRepository domicilioRepository;
    private EstacionamientoConvert estacionamientoConvert;


    @Override
    public List<Estacionamiento> listarDomicilios() {
        return estacionamientoConvert.convertDomicilioToDomicilioWs(
                domicilioRepository.findAll());
    }

    @Override
    public Estacionamientows obtenerDomicilioxId(int id) {
        Optional<Estacionamiento> estacionamiento = domicilioRepository.findById(id);
        return estacionamiento.map(value ->
                estacionamientoConvert.convertDomicilioToDomicilioWs(value))
                .orElse(null);
    }

    @Override
    public Domiciliows registrarActualizarDomicilio(Domiciliows domiciliows) {
        Estacionamiento nuevoDomicilio = domicilioRepository.save(
                estacionamientoConvert.convertDomiciliowsToDomicilio(domiciliows));
        if(nuevoDomicilio == null)
            return  null;
        return estacionamientoConvert.convertDomicilioToDomicilioWs(nuevoDomicilio);
    }
}
