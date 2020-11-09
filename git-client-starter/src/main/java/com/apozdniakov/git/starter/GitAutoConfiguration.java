package com.apozdniakov.git.starter;

import com.apozdniakov.git.api.GitClient;
import com.apozdniakov.git.api.domain.GitHubUser;
import com.apozdniakov.git.api.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.Map;

@Configuration
@ConditionalOnClass(GitClient.class)
//@EnableConfigurationProperties(MongoProperties.class)
@ConditionalOnMissingBean(type = "com.apozdniakov.springboot.git.common.GitClient")
public class GitAutoConfiguration {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public GitClient gitClient(RestTemplate restTemplate) {
        return username -> {
            ResponseEntity<GitHubUser> forEntity = restTemplate.getForEntity("https://api.github.com/users/" + username, GitHubUser.class);
            GitHubUser body = forEntity.getBody();
            System.out.println(body);

            User user = new User();
            user.setName(body.getLogin());
            return user;
        };
    }
}
