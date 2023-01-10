package br.com.eidiego.api.services.exceptions;

public class DataIntegratyViolationException extends RuntimeException {
    public DataIntegratyViolationException(String message) {
        super(message);
    }
}
