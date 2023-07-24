package me.don1ns.adsonlineresaleshop.repository;

import me.don1ns.adsonlineresaleshop.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Репозиторий для комментариев (Comment) в онлайн-магазине вторичных товаров.
 * Этот интерфейс расширяет JpaRepository для доступа к данным объявлений в базе данных.
 */
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    /**
     * Метод для получения списка комментариев по идентификатору объявления.
     *
     * @param id Идентификатор объявления, для которого нужно получить комментарии.
     * @return Список комментариев, принадлежащих указанному объявлению.
     */
    List<Comment> getCommentsByAds_Id(int id);

    /**
     * Метод для удаления всех комментариев по идентификатору объявления.
     *
     * @param id Идентификатор объявления, для которого нужно удалить комментарии.
     */
    void deleteAllByAds_Id(int id);

    /**
     * Метод для получения комментария по его идентификатору.
     *
     * @param id Идентификатор комментария, который нужно получить.
     * @return Объект Optional с найденным комментарием, если такой существует, иначе пустой объект.
     */
    Optional<Comment> findById(int id);
}

