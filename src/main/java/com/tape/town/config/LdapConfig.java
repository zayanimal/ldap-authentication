package com.tape.town.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.ldap.repository.config.EnableLdapRepositories;

@Configuration
@EnableLdapRepositories(basePackages = "com.tape.town.**")
public class LdapConfig {
}
