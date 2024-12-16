module org.example.app_for_studing_java {
    requires javafx.fxml;
    requires Medusa;
    requires org.controlsfx.controls;


    opens org.example.app_for_studing_java to javafx.fxml;
    exports org.example.app_for_studing_java;
}