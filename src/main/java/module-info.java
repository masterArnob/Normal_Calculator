module test.x1_cal_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens test.x1_cal_1 to javafx.fxml;
    exports test.x1_cal_1;
}
