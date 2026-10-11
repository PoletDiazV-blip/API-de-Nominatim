package com.ejemplo.geolocalizacion.exception;

public class GeolocalizacionException extends RuntimeException {

    public GeolocalizacionException(String message) {
        super(message);
    }

    public GeolocalizacionException(String message, Throwable cause) {
        super(message, cause);
    }
}