
package com.cakeshop.org.utils;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
 public class SpringSequrity   {
    @Bean
    public InternalResourceViewResolver   urlBasedViewResolver() {
        InternalResourceViewResolver  resolver = new InternalResourceViewResolver();
         resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //http.csrf().disable().
        http.   authorizeHttpRequests().anyRequest().authenticated()
                   // .requestMatchers("/login", "/register")
                //.requestMatchers("/welcome_admin.jsp", "/addproducts.jsp").hasRole("admin").anyRequest()
                //. anyRequest().authenticated()
                //.requestMatchers("").hasRole("")
                .and()
                .formLogin().loginPage("/login")
                .defaultSuccessUrl("/welcome_admin").permitAll();
        //  .failureUrl("/login")
        //.and()
        //.logout();//.logoutUrl("/login");
        return http.build();
    }


}

