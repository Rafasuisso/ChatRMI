/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplayer;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

/**
 *
 * @author e.rafael.medeiros
 */
public class FXMLDocumentController implements Initializable {
    Media media;
    String VUrl;
    
    @FXML
    private MediaView mv;
    @FXML
    private Button btn_open;
    @FXML
    private Button btn_play;
    @FXML
    private Button btn_OCR;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void onClick_btn_open(ActionEvent event){
       FileChooser fc = new FileChooser();
       fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Video Files", "*.mp4"));
       File file =fc.showOpenDialog(null);
       if(file!= null){
           media = new Media(file.toURI().toString());
           MediaPlayer mediaPlayer = new MediaPlayer(media); // 2
           mv.setFitHeight(800); //= new MediaView(mediaPlayer); // 3
           mv.setFitWidth(800);
       }
    }
     @FXML
    private void onClick_btn_play(){
        
    }
     @FXML
    private void onClick_btn_OCR(){
        
    }
}
