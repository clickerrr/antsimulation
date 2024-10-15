module com.bswiech.antsimulation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bswiech.antsimulation to javafx.fxml;
    exports com.bswiech.antsimulation;
}