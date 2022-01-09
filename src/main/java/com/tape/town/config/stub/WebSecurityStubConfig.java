package com.tape.town.config.stub;

import com.tape.town.config.WebSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@Profile("stub")
public class WebSecurityStubConfig extends WebSecurityConfig {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .ldapAuthentication()
                .userDnPatterns("uid={0},ou=people")
                .groupSearchBase("ou=groups")
            .contextSource()
                .url("ldap://localhost:8389/dc=springframework,dc=org")
                .and()
            .passwordCompare()
                .passwordEncoder(new BCryptPasswordEncoder())
                .passwordAttribute("userPassword");
    }
}
