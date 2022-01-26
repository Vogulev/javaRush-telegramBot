package com.github.vogulev.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.vogulev.jrtb.command.UnknownCommand.UNKNOWN_MESSAGE;

@DisplayName("Unit-level testing for UnknownCommand")
class UnknownCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return "/fgtgsase";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}