module common.coastal_horizon_dockyard {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;



    opens common.coastal_horizon_dockyard to javafx.fxml;
    exports common.coastal_horizon_dockyard;

    opens common.coastal_horizon_dockyard.Saif_2120462 to javafx.fxml;
    exports common.coastal_horizon_dockyard.Saif_2120462;
    opens common.coastal_horizon_dockyard.Apurbo_2110400 to javafx.fxml;
    exports common.coastal_horizon_dockyard.Apurbo_2110400;
    opens common.coastal_horizon_dockyard.Rejwan_2030588 to javafx.fxml;
    exports common.coastal_horizon_dockyard.Rejwan_2030588;
    opens common.coastal_horizon_dockyard.Razin_2420842 to javafx.fxml;
    exports common.coastal_horizon_dockyard.Razin_2420842;
}