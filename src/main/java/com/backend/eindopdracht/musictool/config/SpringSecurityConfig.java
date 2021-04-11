package com.backend.eindopdracht.musictool.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public CustomUserDetailsService customUserDetailsService;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    //endpoints beveiligen met HTTP Basic Authentication
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //het volgende is eigenlijk 1 statement. Elke conditie wordt 1 voor 1 gecheckt.
        http
                //http basic auth
                .httpBasic()
                    .and()
                .authorizeRequests()
                    .antMatchers("/customers/**").hasRole("USER")
                    .antMatchers( "/admin/**").hasRole("ADMIN")
                    .antMatchers("/users/**").hasRole("ADMIN")
                    .antMatchers("/authenticated/**").authenticated()
                .anyRequest().permitAll()
                    .and()
                .csrf().disable()
                .formLogin().disable();
    }


}



//                .antMatchers("/users/**").hasRole("USER") //deze zelf aangepast, opletten
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers(HttpMethod.GET, "/authenticated/**").authenticated()