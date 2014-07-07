package org.telosys.tools.cli;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by bewilcox on 07/07/2014.
 */
public class GuiContext extends javafx.application.Application implements Runnable{

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = new FXMLLoader().load(GuiContext.class.getResource("/views/gui.fxml"));
        stage.setTitle("Telosys Tools");
        stage.setScene(new Scene(root));
        stage.show();

    }

    @Override
    public void run() {
        Application.launch();
    }
}
