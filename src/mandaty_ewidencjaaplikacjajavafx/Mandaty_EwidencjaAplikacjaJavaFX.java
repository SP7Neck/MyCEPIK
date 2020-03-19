/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandaty_ewidencjaaplikacjajavafx;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;


/**
 *
 * @author peevs
 */
public class Mandaty_EwidencjaAplikacjaJavaFX extends Application {
    Ewidancja ew = new Ewidancja();
    int position;
    Boolean A;
    @Override
    public void start(Stage primaryStage) {

        //creating label login
        Text text1 = new Text("Login");

        //creating label password
        Text text2 = new Text("Password");

        //Creating Text Filed for email
        TextField textField1 = new TextField();

        //Creating Text Filed for password
        PasswordField textField2 = new PasswordField();
        final ToggleGroup group = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Policeman");
        rb1.setToggleGroup(group);
        RadioButton rb2 = new RadioButton("Driver");
        rb2.setToggleGroup(group);
        Button btn = new Button();
        btn.setText("Log in");
        Button btn2 = new Button();
        btn2.setText("Clear");
        GridPane gridPane = new GridPane();
        //Setting size for the pane
        gridPane.setMinSize(400, 400);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(rb1, 0, 2);
        gridPane.add(rb2, 0, 3);
        gridPane.add(btn, 0, 4);
        gridPane.add(btn2, 1, 4);

        rb1.setOnAction((ActionEvent e) -> {
            A = true;
            if (rb1.isSelected()) {
            }
            if(rb2.isSelected()){
            }
        });
        rb2.setOnAction((ActionEvent e) -> {
            A = false;
            if (rb1.isSelected()) {
            }
            if(rb2.isSelected()){

            }
        });


        btn.setOnAction(new EventHandler<ActionEvent>() {


            @Override

            public void handle(ActionEvent event) { if(A == true) {
                VBox VerticalBox = new VBox(5);
                VerticalBox.setPadding(new Insets(5));

                HBox HorizontalAddDriver = new HBox(5);
                HorizontalAddDriver.setPadding(new Insets(5));
                /* ADDING*/
                VerticalBox.getChildren().add(HorizontalAddDriver);
                Label AddDriverLabel = new Label();//"Window for police actions..."
                AddDriverLabel.setText("Add driver");
                HorizontalAddDriver.getChildren().add(AddDriverLabel);

                VBox VerticalAddDriver = new VBox(5);
                VerticalAddDriver.setPadding(new Insets(5));

                /* ADDING*/
                HorizontalAddDriver.getChildren().add(VerticalAddDriver);
                TextField nameDriver = new TextField();
                nameDriver.setPromptText("Imię kierowcy.");
                //nameDriver.setWrapText(true)
                /* ADDING*/
                VerticalAddDriver.getChildren().add(nameDriver);
                TextField surnameDriver = new TextField();
                surnameDriver.setPromptText("Nazwisko kierowcy.");
                //  surnameDriver.setWrapText(true);
                /* ADDING*/
                VerticalAddDriver.getChildren().add(surnameDriver);
                TextField peselDriver = new TextField();
                peselDriver.setPromptText("Pesel kierowcy.");
                //peselDriver.setWrapText(true);
                /* ADDING*/
                VerticalAddDriver.getChildren().add(peselDriver);
                HBox addDriverButtonBox = new HBox();
                addDriverButtonBox.setSpacing(35);
                VerticalAddDriver.getChildren().add(addDriverButtonBox);
                Button addDriver = new Button("Add driver");
                /* ADDING*/
                addDriverButtonBox.getChildren().add(addDriver);
                //HorizontalAddDriver.getChildren().add(VerticalAddDriver);
                //                             VerticalBox.getChildren().add(HorizontalAddDriver);
                addDriver.setOnAction((ActionEvent e) -> {
                    //  Ewidancja ew = new Ewidancja();
                    ew.add_driver(nameDriver.getText(), surnameDriver.getText(), peselDriver.getText());
//                                                             System.out.println(ew.getKierowca(0));
//                                                             System.out.println(ew.getKierowca(1));
//                                                             System.out.println(ew.getKierowca(2));
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Dialog");
                    alert.setHeaderText(null);
                    alert.setContentText("The driver was added to the database! Name: " + nameDriver.getText() + " Surname: " + surnameDriver.getText() + " Pesel: " + peselDriver.getText());
                    alert.showAndWait();
                    nameDriver.clear();
                    surnameDriver.clear();
                    peselDriver.clear();
                });
                Button clearDriver = new Button("Clear");
                clearDriver.setMinWidth(75);
                /* ADDING*/
                addDriverButtonBox.getChildren().add(clearDriver);
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
                /* ADDING*/
                VerticalBox.getChildren().add(HorizontalPanaliseDriver);
                Label PanaliseDriverLabel = new Label();//"Window for police actions..."
                PanaliseDriverLabel.setText("Punish a driver");
                HorizontalPanaliseDriver.getChildren().add(PanaliseDriverLabel);
                VBox VerticalPanaliseDriver = new VBox(5);
                VerticalPanaliseDriver.setPadding(new Insets(5));
                /* ADDING*/
                HorizontalPanaliseDriver.getChildren().add(VerticalPanaliseDriver);
                TextField fineDriver = new TextField();
                fineDriver.setPromptText("The amount of the fine");
                //nameDriver.setWrapText(true)
                /* ADDING*/
                VerticalPanaliseDriver.getChildren().add(fineDriver);
                TextField PanaltyPointsDriver = new TextField();
                PanaltyPointsDriver.setPromptText("The amount of the panalty points.");
                //  surnameDriver.setWrapText(true);
                /* ADDING*/
                VerticalPanaliseDriver.getChildren().add(PanaltyPointsDriver);
                TextField PanaltyPeselDriver = new TextField();
                PanaltyPeselDriver.setPromptText("Pesel kierowcy.");
                //peselDriver.setWrapText(true);
                /* ADDING*/
                VerticalPanaliseDriver.getChildren().add(PanaltyPeselDriver);
                HBox PenalizeDriverButtonBox = new HBox();
                PenalizeDriverButtonBox.setSpacing(35);
                VerticalPanaliseDriver.getChildren().add(PenalizeDriverButtonBox);
                Button PanaliseDriver = new Button("Apply penalize");
                /* ADDING*/
                PenalizeDriverButtonBox.getChildren().add(PanaliseDriver);
                PanaliseDriver.setOnAction((ActionEvent e) -> {
                    position = ew.find_kierowca(PanaltyPeselDriver.getText());


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
                    } else {
                        Alert warning = new Alert(AlertType.INFORMATION);
                        warning.setTitle("Information Dialog");
                        warning.setHeaderText(null);
                        warning.setContentText("There's no driver with such pesel: " + PanaltyPeselDriver.getText() + " Surname: " + surnameDriver.getText() + " Pesel: " + peselDriver.getText());
                        warning.showAndWait();
                        fineDriver.clear();
                        PanaltyPointsDriver.clear();
                        PanaltyPeselDriver.clear();

                    }
                });
                Button CancelPanalisingDriver = new Button("Cancel");
                CancelPanalisingDriver.setMinWidth(75);
                /* ADDING*/
                PenalizeDriverButtonBox.getChildren().add(CancelPanalisingDriver);
                CancelPanalisingDriver.setOnAction((ActionEvent e) -> {
                    System.out.println("/////////////////////////////");
                    // System.out.println(ew.getKierowca(0));
//                                                                            System.out.println(ew.getKierowca(1));
//                                                                            System.out.println(ew.getKierowca(2));
                    fineDriver.clear();
                    PanaltyPointsDriver.clear();
                    PanaltyPeselDriver.clear();
                });
                HBox HorizontalFindDriver = new HBox(5);
                HorizontalFindDriver.setPadding(new Insets(5));
                /* ADDING*/
                VerticalBox.getChildren().add(HorizontalFindDriver);
                Label FindDriverLabel = new Label();//"Window for police actions..."
                FindDriverLabel.setText("Find driver");
                HorizontalFindDriver.getChildren().add(FindDriverLabel);
                VBox VerticalFindDriver = new VBox(5);
                VerticalFindDriver.setPadding(new Insets(5));
                HorizontalFindDriver.getChildren().add(VerticalFindDriver);
                TextField pesel = new TextField();
                pesel.setPromptText("Drivers' pesel:");
                VerticalFindDriver.getChildren().add(pesel);
                HBox findButtonBox = new HBox();
                findButtonBox.setSpacing(35);
                VerticalFindDriver.getChildren().add(findButtonBox);
                Button findDriver  = new Button("Find driver");
                findButtonBox.getChildren().add(findDriver);
                Button clearPeselFindDriver  = new Button("Clear");
                clearPeselFindDriver.setMinWidth(75);
                findButtonBox.getChildren().add(clearPeselFindDriver);
                findDriver.setOnAction((ActionEvent e) -> {
                    position = ew.find_kierowca(pesel.getText());
                    if (position >= 0) {
                        Alert warning = new Alert(AlertType.INFORMATION);
                        warning.setTitle("Information Dialog");
                        warning.setHeaderText(null);
                        warning.setContentText("The driver" + ew.getKierowca(position).getImie() + " " + ew.getKierowca(position).getImie() + " is in the system " + ew.getKierowca(position));
                        warning.showAndWait();
                        pesel.clear();
                    } else {
                        Alert warning = new Alert(AlertType.INFORMATION);
                        warning.setTitle("Information Dialog");
                        warning.setHeaderText(null);
                        warning.setContentText("There's no driver with such pesel: " + pesel.getText());
                        warning.showAndWait();
                        pesel.clear();

                    }

                });
                clearPeselFindDriver.setOnAction((ActionEvent e) ->{
                    pesel.clear();
                });






                Scene policemanScene = new Scene(VerticalBox, 300, 180);
                Stage policemanWindow = new Stage();
                policemanWindow.setTitle("Window for police actions...");
                policemanWindow.setScene(policemanScene);
                policemanWindow.show();
            }
            if(A == false) {

                Text text1 =new Text("Pay a fine");
                TextField textPesel1 = new TextField();
                textPesel1.setPromptText("Enter you pesel");
                TextField textPay= new TextField();
                textPay.setPromptText("Enter sum of payment");
                TextArea SomeText = new TextArea();
                SomeText.setWrapText(true);
                Button btnPay = new Button("   Pay  ");
                btnPay.setOnAction((ActionEvent e) ->{
                    position = ew.find_kierowca(textPesel1.getText());


                    if (position >= 0) {
                        ew.getKierowca(position).zaplacMandat(Integer.parseInt(textPay.getText()));
                        Alert infoDesk = new Alert (AlertType.INFORMATION);
                        infoDesk.setTitle("Information window");
                        infoDesk.setHeaderText("Some text");
                        infoDesk.setContentText(ew.getKierowca(position).getImie() + " " + ew.getKierowca(position).getNazwisko() + " ! The fine was payed in the amount of " + textPay.getText());
                        infoDesk.showAndWait();
                        textPesel1.clear();
                        textPay.clear();
                    }
                    else{
                        Alert infoDesk = new Alert (AlertType.INFORMATION);
                        infoDesk.setTitle("Information window");
                        infoDesk.setHeaderText("Some text");
                        infoDesk.setContentText("There's no driver with such pesel: " + textPesel1.getText() + "!");
                    }
                });
                Button btnClear1 = new Button("Clear");
                btnClear1.setOnAction((ActionEvent e) -> {
                    textPesel1.clear();
                    textPay.clear();
                });
                Text text2 =new Text("Find yourself");
                TextField textPesel2 = new TextField();
                textPesel2.setPromptText("Enter you pesel");
                Button btnFind = new Button("Search");
                btnFind.setOnAction((ActionEvent e) ->{
                    position = ew.find_kierowca(textPesel2.getText());
                    if (position >= 0){
                        SomeText.setText(" There's a driver with such pesel: " + textPesel2.getText() + " " + ew.getKierowca(position));
                        Alert infoDesk = new Alert(AlertType.INFORMATION);
                        infoDesk.setTitle("Information window");
                        infoDesk.setHeaderText("Some text");
                        infoDesk.setContentText(" There's a driver with such pesel: " + textPesel2.getText() + " " + ew.getKierowca(position));
                        infoDesk.showAndWait();
                        textPesel2.clear();
                    }
                    else{
                        Alert infoDesk = new Alert(AlertType.INFORMATION);
                        infoDesk.setTitle("Information window");
                        infoDesk.setHeaderText("Some text");
                        infoDesk.setContentText(" There's no driver with such pesel: " + textPesel2.getText());
                        infoDesk.showAndWait();
                        textPesel2.clear();
                    }
                });
                Button btnClear2 = new Button("Clear");

         //       GridPane gridPaneChild = new GridPane();
                GridPane gridPane = new GridPane();
                gridPane.add(text1,0,0,1,1);
                gridPane.add(textPesel1,1,0,1,1);
                gridPane.add(textPay,1,1,1,1);
                gridPane.add(btnPay, 0,2,1,1);
                gridPane.add(btnClear1, 1,2,1,1);
                gridPane.add(text2,0 ,3,1,1);
                gridPane.add(textPesel2,1,3,1,1);
                gridPane.add(btnFind,0,4,1,1);
                gridPane.add(btnClear2,1,4,1,1);
                gridPane.add(SomeText, 0, 5,2,1);

//                gridPane.add(gridPaneChild,1,2);
//                gridPaneChild.add(btnPay, 0,0);
//                gridPaneChild.add(btnClear1, 1,0);
//                gridPaneChild.setPadding(new Insets(5, 40, 5, 40));
//                gridPaneChild.setVgap(5);
//                gridPaneChild.setHgap(5);
          //      gridPaneChild.setAlignment(Pos.BASELINE_LEFT);
                //Setting size for the pane
                gridPane.setMinSize(400, 400);

                //Setting the padding
                gridPane.setPadding(new Insets(10, 10, 10, 10));
                //Setting the vertical and horizontal gaps between the columns
                gridPane.setVgap(5);
                gridPane.setHgap(5);


                Scene driverScene = new Scene(gridPane, 350, 290);
                Stage driverWindow = new Stage();
                driverWindow.setTitle("Window for drivers' actions...");
                driverWindow.setScene(driverScene);
                driverWindow.show();



            }
            }
        });




        StackPane root = new StackPane();
        root.getChildren().add(gridPane);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("CEPIK");
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
