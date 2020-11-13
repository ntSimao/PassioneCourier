package com.PassioneCourier.group2.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class AppSecurity  extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("cUser0").password("{noop}5members0").roles("ADMIN")
        .and().withUser("cUser1").password("{noop}5members1").roles("CLIENT");
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.POST, "").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "").hasRole("ADMIN").and()
                .csrf().disable().formLogin().disable();
    }
}
