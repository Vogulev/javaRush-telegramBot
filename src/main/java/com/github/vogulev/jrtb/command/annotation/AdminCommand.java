package com.github.vogulev.jrtb.command.annotation;

import com.github.vogulev.jrtb.command.Command;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Mark if {@link Command} can be viewed only by admins.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AdminCommand {
}
