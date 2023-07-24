package me.don1ns.adsonlineresaleshop.DTO;
import lombok.Data;
/**
 * ДТО с данными пользователя при авторизации
 **/
@Data
public class LoginReqDTO {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
