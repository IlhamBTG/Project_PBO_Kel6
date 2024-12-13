package tembakanapa;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Player extends Character{
    
    public Player(AnchorPane gamePane, ImageView player, FXMLDocumentController controller){
        super(gamePane, player, controller);
    }
    
    public void movePlayer(int dx, int dy) {
        double newX = getPlayer().getLayoutX() + dx;
        double newY = getPlayer().getLayoutY() + dy;

        if (newX >= 0 && newX <= getGamePane().getPrefWidth() - getPlayer().getFitWidth()) {
            getPlayer().setLayoutX(newX);
        }
        if (newY >= 0 && newY <= getGamePane().getPrefHeight() - getPlayer().getFitHeight()) {
            getPlayer().setLayoutY(newY);
        }
    }
    
    public void playerCollision() {
        for (ImageView enemy : getController().myEnemy.enemies) {
            if (getController().myBullet.checkCollision(getPlayer(), enemy)) {
                getGamePane().getChildren().remove(getPlayer());
                getGamePane().getChildren().remove(enemy);
                getController().myEnemy.enemies.remove(enemy);
                  
            try {
                getController().endGame();
            } catch (Exception e) {
                e.printStackTrace();
            }
                break;
            }
        }
    }
}
