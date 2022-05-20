module com.example.boardingpassgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.boardingpassgui to javafx.fxml;
    exports com.example.boardingpassgui;
    exports com.example.boardingpassgui.Controllers;
    opens com.example.boardingpassgui.Controllers to javafx.fxml;
}