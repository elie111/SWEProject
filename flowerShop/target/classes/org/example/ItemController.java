package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ItemController {
    @FXML
    private Button editbtn;
    @FXML
    private ImageView itemImg;
    @FXML
    private Text itemName;

    public ItemController(Button editbtn, Text itemName) {
        this.editbtn = editbtn;
        this.itemName = itemName;
    }

    public ItemController() {

    }

    public ItemController(Button editbtn, ImageView itemImg, Text itemName) {
        this.editbtn = editbtn;
        this.itemImg = itemImg;
        this.itemName = itemName;
    }


    public Button getEditbtn() {
        return editbtn;
    }

    public void setEditbtn(Button editbtn) {
        this.editbtn = editbtn;
    }

    public ImageView getItemImg() {
        return itemImg;
    }

    public void setItemImg(ImageView itemImg) {
        this.itemImg = itemImg;
    }

    public Text getItemName() {
        return itemName;
    }

    public void setItemName(Text itemName) {
        this.itemName = itemName;
    }
}



