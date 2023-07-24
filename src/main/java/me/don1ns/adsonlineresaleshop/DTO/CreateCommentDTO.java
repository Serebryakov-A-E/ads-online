package me.don1ns.adsonlineresaleshop.DTO;
import lombok.Data;
/**
 * ДТО с тектом комментария
 **/
@Data
public class CreateCommentDTO {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
