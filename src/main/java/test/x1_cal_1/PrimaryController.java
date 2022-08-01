/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package test.x1_cal_1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class PrimaryController implements Initializable {

    @FXML
    private TextField display;
    @FXML
    private Button Mul;
    @FXML
    private Button b9;
    @FXML
    private Button div;
    @FXML
    private Button Clear;
    @FXML
    private Button b5;
    @FXML
    private Button b4;
    @FXML
    private Button b8;
    @FXML
    private Button AC;
    @FXML
    private Button b7;
    @FXML
    private Button b0;
    @FXML
    private Button Add;
    @FXML
    private Button b3;
    @FXML
    private Button Sub;
    @FXML
    private Button b6;
    @FXML
    private Button b2;
    @FXML
    private Button b1;
    @FXML
    private Button Dot;
    @FXML
    private Button Off;

    /**
     * Initializes the controller class.
     */
    
    String number ="";
    String operator="";
    double num1=0,num2=0,total;
    boolean start = true;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void doOperation(ActionEvent event)
    {
        num1 = Double.parseDouble(display.getText());
        operator = ((Button)event.getSource()).getText();
        
        display.setText("");
        
        
        
    }

    @FXML
    private void doDisplay(ActionEvent event) 
    {
        
        if(start == true)
        {
            display.setText("");
            start = false;
        }
       String oldText = display.getText();
       String newText = ((Button)event.getSource()).getText();
        number = oldText + newText;
        
        display.setText(number);
        
        
    }

    @FXML
    private void doClear(ActionEvent event)
    {
        String oldText = display.getText();
        if(oldText.equals(""))
        {
            return;
        }
        
        String subString = oldText.substring(0, oldText.length()-1);
        display.setText(subString);
    }

    @FXML
    private void doAC(ActionEvent event) 
    {
        display.setText("");
        start = true;
    }

    @FXML
    private void showResult(ActionEvent event) 
    {
        num2 = Double.parseDouble(display.getText());
        
        if(operator.equals("+"))
        {
            display.setText("" +(num1+num2));
        }
        else if(operator.equals("-"))
        {
            display.setText(""+(num1-num2));
        }
        else if(operator.equals("X"))
        {
            display.setText("" +(num1*num2));
        }
        else if(operator.equals("/"))
        {
            display.setText("" +(num1/num2));
        }
        start = true;
        
    }

    @FXML
    private void bDot(ActionEvent event)
    {
        String oldText = display.getText();
        if(oldText.contains("."))
        {
            return;
        }
        
        display.setText(oldText +".");
    }

    @FXML
    private void doOff(ActionEvent event)
    {
        System.exit(0);
    }
    
}
