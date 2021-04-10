package com.backend.eindopdracht.musictool.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    //hier komen 2 methodes.
    //config methode (deze zit al in WebSecConfigAd). Gaat over authentication. We herdefinieren hem wel.
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        //dit is ook weer 1 statement
        //{noop} staat voor niet en-coded
        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER")
                .and()
                .withUser("admin").password("{noop}password").roles("USER", "ADMIN");
    }

    //endpoints beveiligen met HTTP Basic Authentication
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //het volgende is eigenlijk 1 statement
        http
                //http basic auth
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().permitAll()
                .and()
                .csrf().disable()
                .formLogin().disable();
    }


}



//                .antMatchers("/users/**").hasRole("USER") //deze zelf aangepast, opletten
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers(HttpMethod.GET, "/authenticated/**").authenticated()