package com.tape.town.entity;

import lombok.Data;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;

import javax.naming.Name;
import javax.persistence.Id;

@Entry(
    base = "ou=people",
    objectClasses = { "top", "organizationalUnit" }
)
public @Data class UserEntity {
    @Id
    private Name id;

    @Attribute(name = "uid")
    private String username;

    @Attribute(name = "userPassword")
    private String password;

}
