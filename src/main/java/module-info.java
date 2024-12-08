module org.quizproject.quizproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires java.sql;
    requires mysql.connector.java;

    opens org.quizproject.quizproject.Authentification to javafx.fxml;
    opens org.quizproject.quizproject.Controllers to javafx.fxml;

    exports org.quizproject.quizproject.Authentification;
    exports org.quizproject.quizproject.Controllers;

    opens org.quizproject.quizproject to javafx.fxml;
    exports org.quizproject.quizproject;
    exports org.quizproject.quizproject.Tests;
    opens org.quizproject.quizproject.Tests to javafx.fxml;
}