package scythe.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

public class BotInfo extends Command {

    public BotInfo () {
        super.name = "botinfo";
        super.help = "Get some information about Scythe";
        super.aliases = new String[]{"info", "scythe"};
        super.arguments = "[bot]";
    }

    protected void execute(CommandEvent event) {
        System.out.println("BotInfo running!");
        String scythePFP = "https://cdn.discordapp.com/avatars/852718208916914178/eb484a6f005b71337d45de0227c2fa54.png?size=4096";

        EmbedBuilder eb = new EmbedBuilder()
                .setColor(0x5404fc)
                .setAuthor("Scythe", scythePFP, scythePFP)
                .addField("Version", "0.2.0", true)
                .addField("Library", "JDA", true)
                .addField("Creator", "Snippy#0757", true)
                .setFooter("Uptime " + Uptime.upstring());
        event.reply(eb.build());
    }
}
