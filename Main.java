import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Simulation de trafic");
        Group root = new Group();
        Pane pane = new Pane(root);
        Scene theScene = new Scene(pane, 800, 600, true);
        primaryStage.setScene(theScene);
        Véhicule première_voiture_éclatée = new Véhicule(20,30,1,0,0);
        Véhicule deuxième_voiture_éclatée = new Véhicule(0,-300,1,0,0);
        pane.getChildren().addAll(première_voiture_éclatée.GetVisual(),deuxième_voiture_éclatée.GetVisual());
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
