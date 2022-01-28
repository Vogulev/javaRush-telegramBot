package com.github.vogulev.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.vogulev.jrtb.command.CommandName.START;
import static com.github.vogulev.jrtb.command.StartCommand.START_MESSAGE;
import static com.github.vogulev.jrtb.command.StatCommand.STAT_MESSAGE;

@DisplayName("Unit-level testing for StartCommand")
class StartCommandTest extends AbstractCommandTest{

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return String.format(STAT_MESSAGE, 0);
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService, telegramUserService);
    }
}