package io.github.hgwells.hunger4memes;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.command.CommandCallable;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.text.format.TextColors;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.spongepowered.api.text.Text;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.command.source.CommandBlockSource;
import org.spongepowered.api.command.source.ConsoleSource;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;


import javax.annotation.Nonnull;
import javax.annotation.Nullable;


public class MyBroadcastCommand implements CommandCallable {

    private final Optional<Text> desc = Optional.of(Text.of("Displays a message to all players"));
    private final Optional<Text> help = Optional.of(Text.of("Displays a message to all players. It has no color support!"));
    private final Text usage = Text.of("<message>");

    @Override
    public CommandResult process(CommandSource source, String arguments) throws CommandException {
        source.sendMessage(
                Text.builder("This is a Test").color(TextColors.DARK_AQUA).build()
        );
        return CommandResult.success();
    }

    @Override
    public List<String> getSuggestions(CommandSource source, String arguments, @Nullable Location<World> targetPosition) throws CommandException {
        return null;
    }

    @Override
    public boolean testPermission(CommandSource source) {
        return source.hasPermission("myplugin.broadcast");
    }
    @Override
    public Optional<Text> getShortDescription(CommandSource source) {
        return desc;
    }
    @Override
    public Optional<Text> getHelp(CommandSource source) {
        return help;
    }
    @Override
    public Text getUsage(CommandSource source) {
        return usage;
    }

    private List<String> getSuggestions(CommandSource source, String arguments) throws CommandException {
        return Collections.emptyList();
    }
}