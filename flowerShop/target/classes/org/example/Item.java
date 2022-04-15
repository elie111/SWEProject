package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.util.Optional;


public class Item {

    @FXML
    private Button editbtn;
    @FXML
    private TextField txt;
    @FXML
    private ImageView img;
    @FXML
    private Button addbtn;
    private String[] itemstr={"flower 1","flower 2","flower 3","flower 4","flower 5","flower 6"};

  @FXML
    void initialize(){
      txt.setEditable(false);
        txt.setText(itemstr[0]);
       // img=new ImageView(new Image("target/image1.png"));

    }
    @FXML
    void addBtn(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("");
        alert.setHeaderText("Do you want to this Item to your cart?");
        alert.setContentText("");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            // ... user chose OK
        } else {
            // ... user chose CANCEL or closed the dialog
        }
    }
    @FXML
    void edit(ActionEvent event) {
      if(editbtn.getText().equals("edit")) {
          txt.setEditable(true);
          editbtn.setText("done");
      }
      else{
          txt.setEditable(false);
      }

    }


}
