package com.ejemplo.geolocalizacion.service;

import com.ejemplo.geolocalizacion.dto.UbicacionResponseDTO;

import java.util.List;

public interface GeolocalizacionService {

    List<UbicacionResponseDTO> buscarPorDireccion(String direccion);

    UbicacionResponseDTO buscarPorCoordenadas(Double latitud, Double longitud);
}