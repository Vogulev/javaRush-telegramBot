package com.github.vogulev.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.vogulev.jrtb.command.CommandName.NO;
import static com.github.vogulev.jrtb.command.NoCommand.NO_MESSAGE;

@DisplayName("Unit-level testing for NoCommand")
class NoCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
}