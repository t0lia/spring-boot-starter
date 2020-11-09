package com.apozdniakov.git.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class GitHubUser {
    private String login;
    private long id;
    private String html_url;
    private String name;
}
