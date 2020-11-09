package com.apozdniakov.git.api;

import com.apozdniakov.git.api.domain.User;

public interface GitClient {
    User find(String username);
}
