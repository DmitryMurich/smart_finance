package com.smartfinance.controllers;

import com.smartfinance.entities.Revenue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Date;

public class Controller {

    private ObservableList<Revenue> revenues = FXCollections.observableArrayList();

    @FXML
    private TableView<Revenue> revenueTable;

    @FXML
    private TableColumn<Revenue, Date> dateColumn;

    @FXML
    private TableColumn<Revenue, Double> volumeColumn;

    @FXML
    private TableColumn<Revenue, String> categoryColumn;

    @FXML
    private TableColumn<Revenue, String> descriptionColumn;

    @FXML
    private void initialize() {
        initData();

        dateColumn.setCellValueFactory(new PropertyValueFactory<Revenue, Date>("date"));
        volumeColumn.setCellValueFactory(new PropertyValueFactory<Revenue, Double>("volume"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<Revenue, String>("category"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<Revenue, String>("description"));

        revenueTable.setItems(revenues);

    }

    private void initData() {
        revenues.add(new Revenue(1, 10000, "Расход на питание", "Детям на пробитание"));
        revenues.add(new Revenue(2, 20000, "Расход на алкоголь", "Побухать с тещей"));
        revenues.add(new Revenue(3, 5000, "Расход на спорт", "Абонемент в фитнес ЧТОББЫЛ"));
    }
}
