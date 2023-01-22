import javafx.scene.Scene;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
public class StartWindow extends Application{
	
	Stage stage;
	Scene scene;
	
		
	@Override
	public void start(Stage stage)throws Exception
	{
		this.stage=stage;
		stage.setTitle("StartWindow");
		stage.setHeight(700);
		stage.setWidth(900);
		stage.setResizable(false);
		Comp();
		stage.setScene(scene);
		stage.show();	
	}
	
	
	private void Comp()
	{
		GridPane grid=new GridPane();
		HBox hbox=new HBox();
		VBox vbox =new VBox(200);
		hbox.setAlignment(Pos.CENTER);
		grid.setAlignment(Pos.BASELINE_CENTER);
		grid.setVgap(20);
		grid.setHgap(15);
		
		Image img=new Image("file:///G:/Niaz%20Iqra%20Lectures/My%20Java%20Projects/Project/New/gettyimages-157526603-1024x1024.jpg");
		vbox.setBackground(new Background(new BackgroundImage(img,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
		Text welcome =new Text("Welcome To Tension --");
		
		Button start=new Button("START TO DECREASE TENSION");
		Button admin=new Button("ADMIN");
		Button close =new Button("CLOSE");
		
		
		start.setPrefSize(220, 50);
		admin.setPrefSize(220, 50);
		close.setPrefSize(220, 50);
		welcome.setStyle("-fx-font-size: 40px ;");
		welcome.setStroke(Color.BISQUE);
		
		start.setStyle("-fx-color:cadetblue;-fx-text-fill:black");
		admin.setStyle("-fx-color:cadetblue;-fx-text-fill:black");
		close.setStyle("-fx-color:red;-fx-text-fill:black;");
		hbox.getChildren().add(welcome);
		grid.add(start, 0, 1);
		grid.add(admin, 0, 2);
		grid.add(close, 0, 3);
		vbox.getChildren().addAll(hbox,grid); 
	
		scene=new Scene(vbox);
		
		start.setOnAction(x->{
			
			new Login();
			stage.hide();
		});
		
		admin.setOnAction(x->{
			
			new Admin();
			stage.hide();
		});
		
		close.setOnAction(x->{
			stage.hide();
		});
	}
	
public static void main(String [] args)
{
	launch(args);
}
}
