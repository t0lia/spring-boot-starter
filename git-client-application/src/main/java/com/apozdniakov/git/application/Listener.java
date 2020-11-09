package com.apozdniakov.git.application;

import com.apozdniakov.git.api.GitClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;

import org.springframework.context.event.EventListener;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class Listener {

    private final GitClient gitClient;

    private final  RestTemplate restTemplate;

    @Autowired
    public Listener(GitClient gitClient, RestTemplate restTemplate) {
        this.gitClient = gitClient;
        this.restTemplate = restTemplate;
    }

    @EventListener
    public void onRefreshed(ContextRefreshedEvent e) {
        System.out.println(gitClient.find("user"));
    }
}

