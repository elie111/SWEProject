package org.example;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable  {

    @FXML
    private ListView<String> myListView;
    private String currentString;
    private String[] liststr={"flower1","flower2","flower3"};


    public String[] getListstr() {
        return liststr;
    }

    public void setListstr(String[] liststr) {
        this.liststr = liststr;
    }

    public void setCurrentString(String  currentString) {
        this.currentString = currentString;
    }



    public String getCurrentString() {
        return currentString;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

      myListView.getItems().addAll(liststr);
      myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
          @Override
          public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
          currentString=(myListView.getSelectionModel().getSelectedItem()).toString();
              try {

                  App.setRoot("item");

              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      });

    }


}
