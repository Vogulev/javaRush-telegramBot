package com.github.vogulev.jrtb.service;

/**
 * Service for finding new articles.
 */
public interface FindNewPostService {

    /**
     * Find new articles and notify subscribers about it.
     */
    void findNewPosts();
}
