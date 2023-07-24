package me.don1ns.adsonlineresaleshop.DTO;

import org.springframework.security.core.GrantedAuthority;

/**
 * Роли пользователей
 **/
public enum Role implements GrantedAuthority {
    USER,ADMIN;
    @Override
    public String getAuthority() {
        return name();
    }
}
