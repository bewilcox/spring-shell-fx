package org.telosys.tools.cli.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.telosys.tools.cli.Application;
import org.telosys.tools.cli.GuiContext;

/**
 * Created by bewilcox on 06/07/2014.
 */
public class MyController {

    @FXML
    private Label lblMessage;

    @FXML
    private TextField txtName;

    @FXML
    private Button btnSayHello;

    @FXML
    void OnMouseReleased(javafx.scene.input.MouseEvent event) {
        this.lblMessage.setText("Hello " + this.txtName.getText());
    }

}
