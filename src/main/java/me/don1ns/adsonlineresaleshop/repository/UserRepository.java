package me.don1ns.adsonlineresaleshop.repository;

import me.don1ns.adsonlineresaleshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Репозиторий для пользователей (User) в онлайн-магазине вторичных товаров.
 * Этот интерфейс расширяет JpaRepository для доступа к данным объявлений в базе данных.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * Метод для поиска пользователя по адресу электронной почты.
     *
     * @param email Адрес электронной почты пользователя, которого нужно найти.
     * @return Найденный пользователь или null, если такого пользователя не существует.
     */
    User findByEmail(String email);

    /**
     * Метод для поиска пользователя по адресу электронной почты (без учета регистра).
     *
     * @param email Адрес электронной почты пользователя, которого нужно найти (без учета регистра).
     * @return Объект Optional с найденным пользователем или пустой объект, если такого пользователя не существует.
     */
    Optional<User> findByEmailIgnoreCase(String email);

    /**
     * Метод для проверки существования пользователя по адресу электронной почты (без учета регистра).
     *
     * @param email Адрес электронной почты пользователя, для которого нужно проверить существование.
     * @return true, если пользователь с указанным адресом электронной почты существует, иначе false.
     */
    boolean existsByEmailIgnoreCase(String email);
}
