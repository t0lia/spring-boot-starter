package com.apozdniakov.git.application;

import com.apozdniakov.git.api.GitClient;
import com.apozdniakov.git.api.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GitClient gitClient() {
        User stub = new User();
        stub.setName("stub");
        return username -> stub;
    }

}
