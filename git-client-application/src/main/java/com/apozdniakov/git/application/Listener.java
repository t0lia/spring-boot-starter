package com.apozdniakov.git.application;

import com.apozdniakov.git.api.GitClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Listener {

    private final GitClient gitClient;

    @Autowired
    public Listener(GitClient gitClient) {
        this.gitClient = gitClient;
    }

    @EventListener
    public void onRefreshed(ContextRefreshedEvent e) {
        System.out.println(gitClient.find("octocat"));
    }
}

