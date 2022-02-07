package com.github.vogulev.jrtb.command;

import com.github.vogulev.jrtb.command.annotation.AdminCommand;
import com.github.vogulev.jrtb.service.SendBotMessageService;
import com.github.vogulev.jrtb.service.TelegramUserService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Statistics {@link Command}.
 */
@AdminCommand
public class StatCommand implements Command {

    private final TelegramUserService telegramUserService;
    private final SendBotMessageService sendBotMessageService;

    public final static String STAT_MESSAGE = "Javarush Telegram Bot использует %s человек.";

    public StatCommand(SendBotMessageService sendBotMessageService, TelegramUserService telegramUserService) {
        this.telegramUserService = telegramUserService;
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        int activeUserCount = telegramUserService.retrieveAllActiveUsers().size();
        sendBotMessageService
                .sendMessage(update.getMessage().getChatId(), String.format(STAT_MESSAGE, activeUserCount));
    }
}
