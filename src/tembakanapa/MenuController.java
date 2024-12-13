package tembakanapa;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuController implements Initializable {

    @FXML
    private ImageView playBtn;
    @FXML
    private ImageView quitBtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        quitBtn.setOnMouseClicked(event -> quitApplication());
    }
    
    private void quitApplication() {
        System.exit(0); 
    }
}
