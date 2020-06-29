/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmlexample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author PrithviDevKumar
 */
public class FXMLDocumentController implements Initializable {
    
    //These are for Checkbox example
    @FXML private Label vehicleorderlabel;
    @FXML private CheckBox carcheckbox;
    @FXML private CheckBox bikecheckbox;
    @FXML private CheckBox planecheckbox;
    @FXML private Button vehicleorderbutton;
    
    //These are for Choicebox example
    @FXML private ChoiceBox choicebox;
    @FXML private Label choiceboxlabel;
    
    /**
     * This is for the choice box example
     */
    public void choiceboxbuttonpushed(){
        choiceboxlabel.setText("My Favourite Fruit is:\n"+choicebox.getValue().toString());
    }
    
    
    //This is the example of CheckBox example
     public void vehicleorderbuttonpushed(){
         String order = "Vehicle Ordered is :";
         
        if(carcheckbox.isSelected())
            order+="\n Car";
        
        if(bikecheckbox.isSelected())
            order+="\n Bike";
        
        if(planecheckbox.isSelected())
            order+="\n Airplane";
        
        this.vehicleorderlabel.setText(order);
    }
    
    @Override
    
    public void initialize(URL url, ResourceBundle rb) {
        vehicleorderlabel.setText(" ");
        choiceboxlabel.setText("");
        //adding objects to choice box
        choicebox.getItems().add("Apples");
        choicebox.getItems().add("Banana");
        choicebox.getItems().add("Pear");
        choicebox.getItems().addAll("Grapes","Pineapple","Guava");
        choicebox.setValue("Apples");
    }    
    
}
