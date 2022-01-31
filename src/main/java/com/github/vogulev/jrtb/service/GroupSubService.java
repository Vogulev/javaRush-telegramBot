package com.github.vogulev.jrtb.service;

import com.github.vogulev.jrtb.javarushclient.dto.GroupDiscussionInfo;
import com.github.vogulev.jrtb.repository.entity.GroupSub;

/**
 * Service for manipulating with {@link GroupSub}.
 */
public interface GroupSubService {
    GroupSub save(Long chatId, GroupDiscussionInfo groupDiscussionInfo);
}
