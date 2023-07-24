package me.don1ns.adsonlineresaleshop.repository;

import me.don1ns.adsonlineresaleshop.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Репозиторий для изображений (Image) в онлайн-магазине вторичных товаров.
 * Этот интерфейс расширяет JpaRepository для доступа к данным объявлений в базе данных.
 */
public interface ImageRepository extends JpaRepository<Image, String> {
}
