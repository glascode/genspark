package com.example.boardingpassgui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class DisplayAirportsOfArrivingCity {
    @FXML
    private Button button;

    @FXML
    public void goNext(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("display-arriving-airports-accepted.fxml"));
        stage.setTitle("Do you see an airport you want to go to?");
        stage.setScene(new Scene(root));
    }
}
