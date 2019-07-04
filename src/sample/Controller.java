package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Controller {

    public void onButtonClicked(ActionEvent e){
        System.out.println("THANK YOU FOR YOUR FEEDBACK!!!!");
    }

    @FXML
    private Label l;

    @FXML
    private Label a;

    @FXML
    private Button submit;
 @FXML
 private WebView webView;



    public void initialize(){
 submit.setEffect(new DropShadow());
    }

    @FXML
    public void handelMouseEnter(){
        l.setScaleX(2.0);
        l.setScaleY(2.0);
        a.setScaleX(2.0);
        a.setScaleY(2.0);
        submit.setScaleX(2.0);
        submit.setScaleY(2.0);

    }
    @FXML
    public void handleMouseExit(){
        l.setScaleX(1.0);
        l.setScaleY(1.0);
        a.setScaleX(1.0);
        a.setScaleY(1.0);
        submit.setScaleX(1.0);
        submit.setScaleY(1.0);

    }
    @FXML
    public  void  handleLinkClick(){
        WebEngine engine = webView.getEngine();
        engine.load("https://www.amazon.in/");

    }

    @FXML
    public  void  handleClick(){
        try{
            Desktop.getDesktop().browse(new URI("https://maps.google.com"));
        }catch (IOException e){
            e.printStackTrace();
        }catch (URISyntaxException e){
            e.printStackTrace();
        }
    }


}
