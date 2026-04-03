module com.codechum.assignment1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.codechum.assignment1 to javafx.fxml;
    exports com.codechum.assignment1;
}