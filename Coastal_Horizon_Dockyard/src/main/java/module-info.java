module common.coastal_horizon_dockyard {
    requires javafx.controls;
    requires javafx.fxml;


    opens common.coastal_horizon_dockyard to javafx.fxml;
    exports common.coastal_horizon_dockyard;
}