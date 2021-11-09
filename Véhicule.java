
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Véhicule {
    int pos_x;
    int pos_y;
    double size;
    int Speed = 0;
    float Orientation = 0;
    ImageView image_éclatée;
    int arrivée_x;
    int arrivée_y;

    public Véhicule(int pos_x, int pos_y, double size, int but_x, int but_y){
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.size = size;
        this.arrivée_x = but_x;
        this.arrivée_y = but_y;
        Image image_nulle = new Image("C:\\Users\\vumer\\IdeaProjects\\Simulation_trafic\\src\\voiture_éclatée.png");
        this.image_éclatée = new ImageView(image_nulle);
        this.image_éclatée.setFitWidth(100);
        this.image_éclatée.setFitHeight(200);
        this.image_éclatée.setViewport(new Rectangle2D(pos_x,pos_y,500 * this.size, 500 * this.size));
        return;
    }

    public int GetArrivée_x(){
        return this.arrivée_x;
    }

    public int GetArrivée_y(){
        return this.arrivée_y;
    }

    public int GetSpeed(){
        return this.Speed;
    }

    public float GetOrientation(){
        return this.Orientation;
    }

    public int GetPos_x(){
        return this.pos_x;
    }

    public int GetPos_y(){
        return this.pos_y;
    }

    public void Vroumvroum(){
        this.pos_x = (int)this.Orientation*this.Speed;
        this.pos_y = (1-(int)this.Orientation)*this.Speed;
    }

    public ImageView GetVisual(){
        return this.image_éclatée;
    }
}

