module com.example.simulating_operations_of_coastal_horizon_dockyard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulating_operations_of_coastal_horizon_dockyard to javafx.fxml;
    exports com.example.simulating_operations_of_coastal_horizon_dockyard;
}