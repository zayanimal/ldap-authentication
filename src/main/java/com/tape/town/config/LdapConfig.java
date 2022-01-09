package com.tape.town.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.ldap.repository.config.EnableLdapRepositories;

@Configuration
@Profile("development")
@EnableLdapRepositories(basePackages = "com.zayanimal.todo.**")
public class LdapConfig {
}
