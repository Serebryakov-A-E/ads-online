package me.don1ns.adsonlineresaleshop.repository;

import me.don1ns.adsonlineresaleshop.entity.Ads;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Репозиторий для объявлений (Ads) в онлайн-магазине вторичных товаров.
 * Этот интерфейс расширяет JpaRepository для доступа к данным объявлений в базе данных.
 */
public interface AdsRepository extends JpaRepository<Ads, Integer> {

    /**
     * Метод для поиска списка объявлений по адресу электронной почты пользователя.
     *
     * @param email Адрес электронной почты пользователя, для которого нужно найти объявления.
     * @return Список объявлений, принадлежащих пользователю с указанным адресом электронной почты.
     */
    List<Ads> findAdsByUser_Email(String email);
}
