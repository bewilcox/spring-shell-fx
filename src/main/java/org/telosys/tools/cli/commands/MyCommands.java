package org.telosys.tools.cli.commands;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.stereotype.Component;
import org.telosys.tools.cli.GuiContext;

/**
 * Created by bewilcox on 06/07/2014.
 */
@Component
public class MyCommands implements CommandMarker{

    @CliCommand(value = "gui", help = "Display an interface provided by JavaFX")
    public void displayGUI() {
        System.out.println("Configurtion interface launched ....");
        Thread guiThread = new Thread(new GuiContext());
        guiThread.start();
    }

}
