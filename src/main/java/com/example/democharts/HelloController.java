package com.example.democharts;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class HelloController {
    @FXML
    private LineChart graphChart;


    @FXML
    protected void createChartBtnClick(ActionEvent actionEvent) {
        NumberAxis x = new NumberAxis(1960, 2020, 10);
        x.setLabel("Years");

        NumberAxis y = new NumberAxis(0, 350, 50);
        y.setLabel("No.of schools");

        graphChart = new LineChart<>(x,y);
        XYChart.Series series = new XYChart.Series();
        series.setName("No of schools in an year");

        series.getData().add(new XYChart.Data(1970, 15));
        series.getData().add(new XYChart.Data(1980, 30));
        series.getData().add(new XYChart.Data(1990, 60));
        series.getData().add(new XYChart.Data(2000, 120));
        series.getData().add(new XYChart.Data(2013, 240));
        series.getData().add(new XYChart.Data(2014, 300));

        //Setting the data to Line chart
        graphChart.getData().add(series);

        //Creating a Group object
        Group root = new Group(graphChart);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 400);

        Stage primaryStage = new Stage();

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}