package me.don1ns.adsonlineresaleshop.mapper;

import me.don1ns.adsonlineresaleshop.DTO.CommentDTO;
import me.don1ns.adsonlineresaleshop.entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Алексей Серебряков
 **/
@Mapper(componentModel = "spring")
public interface CommentMapper {

    @Mapping(source = "id", target = "pk")
    @Mapping(source = "user.id", target = "author")
    @Mapping(source = "user.image", target = "authorImage")
    @Mapping(source = "user.firstName", target = "authorFirstName")
    Comment toAdsComment(CommentDTO commentDTO);
    CommentDTO toCommentDto(Comment adsComment);

}
