package me.don1ns.adsonlineresaleshop.exception;

/**
 * Исключение выбрасывается если есть попытка как-то изменить, удалить объявление или комментарий, к которым нет доступа
 * у пользователя, попытавшегося сделать такой запрос
 */
public class NoAccessException extends RuntimeException {
    public NoAccessException(String message) {
        super(message);
    }

    public NoAccessException() {
    }
}
