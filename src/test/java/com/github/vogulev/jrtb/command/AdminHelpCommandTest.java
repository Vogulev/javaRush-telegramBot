package com.github.vogulev.jrtb.command;

import static com.github.vogulev.jrtb.command.AdminHelpCommand.ADMIN_HELP_MESSAGE;
import static com.github.vogulev.jrtb.command.CommandName.ADMIN_HELP;

class AdminHelpCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return ADMIN_HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return ADMIN_HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new AdminHelpCommand(sendBotMessageService);
    }
}