package com.example.boardingpassgui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class DisplayFlights {
    @FXML
    private Button button;

    @FXML
    public void goNext(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("display-flights-accepted.fxml"));
        stage.setTitle("Here is a list of flights");
        stage.setScene(new Scene(root));
    }
}
