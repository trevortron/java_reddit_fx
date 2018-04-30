package jgraphics;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.AnchorPane;

public class WindowController implements Initializable {
    
	private RedditHandler reddit = new RedditHandler();
	private ArrayList<String> redditdata = reddit.frontpage();
	private ArrayList<String> redditdataself = reddit.frontpageself();
	
	 private int i = 0; 
	 
    @FXML
    private TextField field;

    @FXML
    private Label label;
    
    @FXML
    private Accordion accord;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        addTile();
    }


    
    
    private void addTile() {
    	
        AnchorPane newPanelContent = new AnchorPane();
        newPanelContent.getChildren().add(new Label(redditdataself.get(i)));
        System.out.println(redditdataself.get(i));
        TitledPane pane = new TitledPane(redditdata.get(i), newPanelContent);
        i++;
        System.out.println("test 2");
        accord.getPanes().add(pane);
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	
    	  label.setText("this is a test to change shit");
    	  
    	   
    	  
          for(int j=1; j<20; j++){
              addTile(); 
          }  
    } 
    
    
    
    
    
}