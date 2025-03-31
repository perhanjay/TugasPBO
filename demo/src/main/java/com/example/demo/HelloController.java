package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField input_Nama;
    @FXML
    private TextField input_Nim;
    @FXML
    private TextField input_Prodi;
    @FXML
    private ListView<String> listView;

    private String[] data = {"Ferhan"};

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void displayMe() {
        welcomeText.setText("My name is JavaFX!");
    }


    @FXML
    protected void getData() {
        String nama = input_Nama.getText();
        String nim = input_Nim.getText();
        String prodi = input_Prodi.getText();
        data = new String[]{nama, nim, prodi};
        listView.getItems().setAll(data);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}