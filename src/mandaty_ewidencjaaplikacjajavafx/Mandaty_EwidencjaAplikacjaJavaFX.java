/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandaty_ewidencjaaplikacjajavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.*; 

/**
 *
 * @author peevs
 */
public class Mandaty_EwidencjaAplikacjaJavaFX extends Application {
    Ewidancja ew = new Ewidancja();
    int position;
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Log in");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               VBox VerticalBox = new VBox(5);
               VerticalBox.setPadding(new Insets(5));
               
              
                        HBox HorizontalAddDriver = new HBox(5);
                        HorizontalAddDriver.setPadding(new Insets(5));
            /* ADDING*/ VerticalBox.getChildren().add(HorizontalAddDriver);
                                Label AddDriverLabel = new Label();//"Window for police actions..."
                                AddDriverLabel.setText("Dodaj kierowce");
                                HorizontalAddDriver.getChildren().add(AddDriverLabel);
               
                                VBox VerticalAddDriver = new VBox(5);
                                VerticalAddDriver.setPadding(new Insets(5));
                    /* ADDING*/ HorizontalAddDriver.getChildren().add(VerticalAddDriver);
                                            TextField nameDriver = new TextField ();
                                            nameDriver.setPromptText("Imię kierowcy.");
                                        //nameDriver.setWrapText(true)
                                /* ADDING*/ VerticalAddDriver.getChildren().add(nameDriver);
                                            TextField surnameDriver = new TextField();
                                            surnameDriver.setPromptText("Nazwisko kierowcy.");
                         //  surnameDriver.setWrapText(true);
                                /* ADDING*/ VerticalAddDriver.getChildren().add(surnameDriver);
                                            TextField peselDriver = new TextField();
                                            peselDriver.setPromptText("Pesel kierowcy.");
                           //peselDriver.setWrapText(true);
                               /* ADDING*/  VerticalAddDriver.getChildren().add(peselDriver);
                                            HBox addDriverButtonBox = new HBox();
                                            addDriverButtonBox.setSpacing(35);
                                            VerticalAddDriver.getChildren().add(addDriverButtonBox);
                                                    Button addDriver = new Button("Add driver");
                                    /* ADDING*/     addDriverButtonBox.getChildren().add(addDriver);
                                      //HorizontalAddDriver.getChildren().add(VerticalAddDriver);
         //                             VerticalBox.getChildren().add(HorizontalAddDriver);
                                                             addDriver.setOnAction((ActionEvent e) -> {
                        //  Ewidancja ew = new Ewidancja();
                                                             ew.add_driver(nameDriver.getText(),surnameDriver.getText(),peselDriver.getText());
//                                                             System.out.println(ew.getKierowca(0));
//                                                             System.out.println(ew.getKierowca(1));
//                                                             System.out.println(ew.getKierowca(2));
                                                             Alert alert = new Alert(AlertType.INFORMATION);
                                                             alert.setTitle("Information Dialog");
                                                             alert.setHeaderText(null);
                                                             alert.setContentText("The driver was added to the database! Name: " + nameDriver.getText() + " Surname: " + surnameDriver.getText() + " Pesel: " + peselDriver.getText() );
                                                             alert.showAndWait();
                                                             nameDriver.clear();
                                                             surnameDriver.clear();
                                                             peselDriver.clear();
                                                             });
                                                    Button clearDriver = new Button("Clear");
                                                    clearDriver.setMinWidth(75);
                                    /* ADDING*/     addDriverButtonBox.getChildren().add(clearDriver);
                                                             clearDriver.setOnAction((ActionEvent e) -> {
                                                             System.out.println(ew.getKierowca(0));
//                                                             System.out.println(ew.getKierowca(1));
//                                                             System.out.println(ew.getKierowca(2));
                                                             nameDriver.clear();
                                                             surnameDriver.clear();
                                                             peselDriver.clear();
                                                             });
                             
                        HBox HorizontalPanaliseDriver = new HBox(5);
                        HorizontalPanaliseDriver.setPadding(new Insets(5));
            /* ADDING*/ VerticalBox.getChildren().add(HorizontalPanaliseDriver);     
                                    Label PanaliseDriverLabel = new Label();//"Window for police actions..."
                                    PanaliseDriverLabel.setText("Punish a driver");
                                    HorizontalPanaliseDriver.getChildren().add(PanaliseDriverLabel);
                                    VBox VerticalPanaliseDriver = new VBox(5);
                                    VerticalPanaliseDriver.setPadding(new Insets(5));
                        /* ADDING*/ HorizontalPanaliseDriver.getChildren().add(VerticalPanaliseDriver);
                                                TextField fineDriver = new TextField ();
                                                fineDriver.setPromptText("The amount of the fine");
                                            //nameDriver.setWrapText(true)
                                    /* ADDING*/ VerticalPanaliseDriver.getChildren().add(fineDriver);
                                                TextField PanaltyPointsDriver = new TextField();
                                                PanaltyPointsDriver.setPromptText("The amount of the panalty points.");
                             //  surnameDriver.setWrapText(true);
                                    /* ADDING*/ VerticalPanaliseDriver.getChildren().add(PanaltyPointsDriver);
                                                TextField PanaltyPeselDriver = new TextField();
                                                PanaltyPeselDriver.setPromptText("Pesel kierowcy.");
                               //peselDriver.setWrapText(true);
                                   /* ADDING*/  VerticalPanaliseDriver.getChildren().add(PanaltyPeselDriver);
                                                HBox PenalizeDriverButtonBox = new HBox();
                                                PenalizeDriverButtonBox.setSpacing(35);
                                                VerticalPanaliseDriver.getChildren().add(PenalizeDriverButtonBox);
                                                            Button PanaliseDriver = new Button("Apply penalize");
                                    /* ADDING*/             PenalizeDriverButtonBox.getChildren().add(PanaliseDriver);
                                                            PanaliseDriver.setOnAction((ActionEvent e) -> {
                                                              System.out.println(ew.getKierowca(0));
                                                              System.out.println(ew.getKierowca(1));
                                                              System.out.println(ew.getKierowca(0).getPesel());
                                                              System.out.println(PanaltyPeselDriver.getText());
                                                              position = ew.find_kierowca(PanaltyPeselDriver.getText());
                                                              System.out.println(position);
                                                             
                                                            if (position >= 0) {
                                                            //int a = Integer.parseInt(fineDriver.getText());
                                                            
                                                            ew.getKierowca(ew.find_kierowca(PanaltyPeselDriver.getText())).ukaracMandatem(Integer.parseInt(fineDriver.getText()));
                                                            ew.getKierowca(position).ukaracPunktami(Integer.parseInt(PanaltyPointsDriver.getText()));
                                                            Alert warning = new Alert(AlertType.INFORMATION);
                                                            warning.setTitle("Information Dialog");
                                                            warning.setHeaderText(null);
                                                            warning.setContentText("The driver got penalised" + ew.getKierowca(position));
                                                            warning.showAndWait();
                                                            fineDriver.clear();
                                                            PanaltyPointsDriver.clear();
                                                            PanaltyPeselDriver.clear();
                                                            }
                                                            else {
                                                             Alert warning = new Alert(AlertType.INFORMATION);
                                                             warning.setTitle("Information Dialog");
                                                             warning.setHeaderText(null);
                                                             warning.setContentText("There's no driver with such pesel: " + PanaltyPeselDriver.getText() + " Surname: " + surnameDriver.getText() + " Pesel: " + peselDriver.getText() );
                                                             warning.showAndWait();
                                                             fineDriver.clear();
                                                             PanaltyPointsDriver.clear();
                                                             PanaltyPeselDriver.clear();
                                                            
                                                            }
                                                             });
                                                            Button CancelPanalisingDriver = new Button("Cancel");
                                                            CancelPanalisingDriver.setMinWidth(75);
                                    /* ADDING*/             PenalizeDriverButtonBox.getChildren().add(CancelPanalisingDriver);
                                                                            CancelPanalisingDriver.setOnAction((ActionEvent e) -> {
                                                                            System.out.println("/////////////////////////////");
                                                                           // System.out.println(ew.getKierowca(0));
//                                                                            System.out.println(ew.getKierowca(1));
//                                                                            System.out.println(ew.getKierowca(2));
                                                                            fineDriver.clear();
                                                                            PanaltyPointsDriver.clear();
                                                                            PanaltyPeselDriver.clear();
                                                                            });

               
               
              
               Scene policemanScene = new Scene (VerticalBox, 300, 180);
               Stage policemanWindow = new Stage();
               policemanWindow.setTitle("Window for police actions...");
               policemanWindow.setScene(policemanScene);
               policemanWindow.show();
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
            
    }
    
}
