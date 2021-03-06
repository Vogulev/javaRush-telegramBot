package com.github.vogulev.jrtb.repository;

import com.github.vogulev.jrtb.repository.entity.TelegramUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * {@link Repository} for handling with {@link TelegramUser} entity.
 */
@Repository
public interface TelegramUserRepository extends JpaRepository<TelegramUser, String> {
    List<TelegramUser> findAllByActiveTrue();

    Optional<TelegramUser> findByChatId(Long chatId);

    List<TelegramUser> findAllByActiveFalse();
}
