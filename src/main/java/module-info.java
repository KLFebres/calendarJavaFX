module com.example.calendarjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calendarjavafx to javafx.fxml;
    exports com.example.calendarjavafx;
}