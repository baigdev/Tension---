
import javafx.stage.Stage;
import org.controlsfx.control.textfield.TextFields;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.image.Image;

public class Routes {
	
	
    static Stage stage ; 
	static Scene scene ;
	
	public Routes()
	{
		stage=new Stage();
		
		stage.setTitle("Routes");
		stage.setWidth(900);
		stage.setHeight(700);
		stage.setResizable(false);
		Comp();
		stage.setScene(scene);
		stage.show();
		
	}
	
	private void Comp()
	{
		GridPane grid=new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setBackground(new Background(new BackgroundFill(Color.AQUA,null,null)));
		
		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/gettyimages-154388502-1024x1024.jpg");
		grid.setBackground(new Background(new BackgroundImage(img,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
		Text pick=new Text("Select Pick Location");
		
		Text drop=new Text("Select Destination");
	
		pick.setStyle("-fx-font-size:25px");
		drop.setStyle("-fx-font-size:25px");
		Button viewall=new Button("View All Buses");
		Button okbutton=new Button("OK");
		Button clear=new Button("Clear");
		Button logout=new Button("Logout");
		
		okbutton.setPrefSize(70,40);
		clear.setPrefSize(70,40);
		viewall.setPrefSize(70,40);
		logout.setPrefSize(70,40);
		viewall.setPrefSize(230, 50);
		TextField txtdrop=new TextField();
		TextField txtpick=new TextField();
		
		clear.setStyle("-fx-color:red");
		logout.setStyle("-fx-color:yellow");
		okbutton.setStyle("-fx-color:lightgreen");
		viewall.setStyle("-fx-color:lightgreen");
		String[] suggestions = {"Mazar-e-Quaid","Saddar","Shahr-e-Faisal","Tariq Road","University Road","Baloch Colony","Iqra University","Kala Pull","Korangi","Landhi"};
		TextFields.bindAutoCompletion(txtdrop, suggestions);
		TextFields.bindAutoCompletion(txtpick, suggestions);
		
		grid.add(pick, 0, 1);
		grid.add(txtpick, 1 ,1);
		grid.add(drop, 0, 2);
		grid.add(txtdrop, 1, 2);
		grid.add(okbutton, 1, 3);
		grid.add(clear, 1, 3);
		grid.add(logout, 1, 3);
		GridPane.setMargin(clear, new Insets(0,0,0,80));
		GridPane.setMargin(logout, new Insets(0,0,0,160));
		
		grid.add(viewall, 1, 4);
		grid.setAlignment(Pos.CENTER);
		scene=new Scene(grid);
		
		viewall.setOnAction(x->{
			new Viewbuses();
			stage.hide();
		});
		clear.setOnAction(x->{
			txtdrop.setText("");
			txtpick.setText("");
			
		});
		okbutton.setOnAction(x->{
			
			String d,p;
			d=txtdrop.getText();
			p=txtpick.getText();
			new ViewInfo(p,d);
			
		});
logout.setOnAction(x->{
	
	StartWindow MainWindow=new StartWindow();
			
			try
			{
				MainWindow.start(stage);
			}
			catch(Exception e)
			{
				
			}
		});
		
	}
	

}
