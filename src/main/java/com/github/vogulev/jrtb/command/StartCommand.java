package com.github.vogulev.jrtb.command;

import com.github.vogulev.jrtb.repository.entity.TelegramUser;
import com.github.vogulev.jrtb.service.SendBotMessageService;
import com.github.vogulev.jrtb.service.TelegramUserService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.github.vogulev.jrtb.command.CommandUtils.getChatId;

/**
 * Start {@link Command}.
 */
public class StartCommand implements Command {

    private final SendBotMessageService sendBotMessageService;
    private final TelegramUserService telegramUserService;

    public final static String START_MESSAGE = "Привет. Я Javarush Telegram Bot. Я помогу тебе быть в курсе последних " +
            "статей тех авторов, котрые тебе интересны. Я еще маленький и только учусь.";

    public StartCommand(SendBotMessageService sendBotMessageService, TelegramUserService telegramUserService) {
        this.sendBotMessageService = sendBotMessageService;
        this.telegramUserService = telegramUserService;
    }

    @Override
    public void execute(Update update) {
        telegramUserService.findByChatId(getChatId(update)).ifPresentOrElse(
                user -> {
                    user.setActive(true);
                    telegramUserService.save(user);
                },
                () -> {
                    TelegramUser telegramUser = new TelegramUser();
                    telegramUser.setActive(true);
                    telegramUser.setChatId(getChatId(update));
                    telegramUserService.save(telegramUser);
                }
        );

        sendBotMessageService.sendMessage(update.getMessage().getChatId(), START_MESSAGE);
    }
}
