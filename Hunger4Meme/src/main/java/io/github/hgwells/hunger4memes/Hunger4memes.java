package io.github.hgwells.hunger4memes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.config.ConfigDir;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.game.state.GameStoppingServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.scheduler.SpongeExecutorService;
import com.google.inject.Inject;
import org.spongepowered.api.Game;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.command.CommandManager;
import org.spongepowered.api.command.dispatcher.SimpleDispatcher;

@Plugin(
        id = "hunger4memes",
        name = "Hunger4memes",
        description = "Sponge Modded Hunger Games",
        url = "https://github.com/Hgwells1/Hunger4Meme",
        version="1.0.0",
        authors = {
                "Hgwells"
        }
)
public class Hunger4memes {

    @Inject
    private Game game;

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        CommandManager cmdService = Sponge.getCommandManager();
        cmdService.register(this, new MyBroadcastCommand(), "test", "broadcast");
    }


}
