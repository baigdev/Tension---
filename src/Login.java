import java.io.*;import java.util.List;

import javax.print.attribute.standard.Sides;

import com.sun.javafx.scene.control.skin.SliderSkin;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Login
{
	Scene scene;
	Stage stage=new Stage();
	static int i,l1,l2; 
	public Login()
	{
		stage.setTitle("Login");
		stage.setHeight(700);
		stage.setWidth(900);
		stage.setResizable(false);
		Comp();
		stage.setScene(scene);
		stage.show();
		
	}
	public void Comp(){
		
		GridPane grid= new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);	
		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/gettyimages-574928031-1024x1024.jpg");
		grid.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
		
		Button login=new Button("Login");
		Button signup=new Button("Signup");
		Button back=new Button("Back");
		
		Text uname=new Text("Name");
		Text upass=new Text("Password");
		
		login.setPrefSize(70, 40);
		signup.setPrefSize(70, 40);
		back.setPrefSize(70, 40);
		uname.setStyle("-fx-font-size:25px");
		upass.setStyle("-fx-font-size:25px");
		TextField txtname=new TextField();
		PasswordField txtpass=new PasswordField();
		
		login.setStyle("-fx-color:lightgreen");
		back.setStyle("-fx-color:red");
		signup.setStyle("-fx-color:lightgreen");
		grid.add(uname, 0, 0);
		grid.add(txtname, 1,0);
		grid.add(upass, 0, 1);
		grid.add(txtpass,1,1);
		grid.add(login, 1, 2);
		grid.add(signup, 1, 2);
		grid.add(back, 1, 2);
		GridPane.setMargin(signup, new Insets(0,0,0,80));
		GridPane.setMargin(back, new Insets(0,0,0,160));
		scene=new Scene(grid);
		
		signup.setOnAction(x->{
			
			new Signup();
			
			stage.hide();
		});
		
		back.setOnAction(x->{
			
			StartWindow MainWindow=new StartWindow();
			try
			{
				MainWindow.start(stage);
			}
			catch(Exception e)
			{
				
			}
		});
		
login.setOnAction(x->{
			
			
	String tname,tpass;
	tname=txtname.getText();
	tpass=txtpass.getText();
	Filing f = new Filing();
	try {
		f.readUsername();
		f.readPass();
		
	} catch (IOException e) {
	}
	f.userlist.remove(0);
	f.passlist.remove(0);
	l1=f.userlist.size();
	for(i=0;i<l1;i++)
	{
		if(tname.equals(f.userlist.get(i))&&tpass.equals(f.passlist.get(i))){
			
			new Routes();
			stage.hide();
			break;
			}
	}
	
	
	if(i>=l1)
	{
		Alert msg=new Alert(AlertType.ERROR);
		msg.setHeaderText("Login Failed");
		msg.setContentText("Password/Name incorrect");
		msg.show();
	}
		});
		
		}
}
