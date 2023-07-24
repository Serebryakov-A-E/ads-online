package me.don1ns.adsonlineresaleshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Исключение для объявлений. Используется если объявление не было найдено в репозитории
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class AdNotFoundException extends RuntimeException{
    public AdNotFoundException(String message) {
        super(message);
    }

    public AdNotFoundException() {
    }
}
