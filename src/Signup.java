import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BackgroundRepeat;
import java.io.IOException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Signup {
	
	static String name,pass;
	static String gender,phone,email,cnic;
	Scene scene;
	Stage stage;
	
	public Signup(){
		stage=new Stage();
		stage.setTitle("Signup");
		stage.setHeight(700);
		stage.setWidth(900);
		stage.setResizable(false);
		addcomp();
		stage.setScene(scene);
		stage.show();
	}
	public void addcomp(){
		
		
		GridPane grid=new GridPane();
		grid.setHgap(20);
		grid.setVgap(10);
		grid.setBackground(new Background(new BackgroundFill(Color.CADETBLUE,null,null)));
		
		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/new.jpg");
		
		grid.setBackground(new Background(new BackgroundImage(img,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
		
		grid.setAlignment(Pos.CENTER);
		
		Button btnreg=new Button("Register");
		Button btnclear=new Button("Clear");
		Button btnback = new Button("Back");
		
		Label lbluname=new Label("Name");
		Label lblupass=new Label("Password");
		Label lblphone=new Label("Phone");
		Label lblemail=new Label("Email");
		Label lblgender =new Label("Gender");
		Label lblcnic=new Label("CNIC");
		
		RadioButton rmale = new RadioButton("Male");
		RadioButton rfemale=new RadioButton("Female");
		
		TextField txtname=new TextField();
		PasswordField txtpass=new PasswordField();
		TextField txtphone=new TextField();
		TextField  txtemail=new TextField();
		TextField  txtcnic=new TextField();
		ToggleGroup togle=new ToggleGroup();
		
		rfemale.setToggleGroup(togle);
		rmale.setToggleGroup(togle);
		
		grid.add(lbluname,0, 0);
		grid.add(txtname, 1, 0);
		grid.add(lblupass, 0, 1);
		grid.add(txtpass, 1, 1);
		grid.add(lblgender, 0, 2);
		grid.add(rmale, 1, 2);
		grid.add(rfemale, 1, 2);
		GridPane.setMargin(rfemale, new Insets(0,0,0,100));
		grid.add(lblphone, 0, 3);
		grid.add(txtphone, 1, 3);
		grid.add(lblemail, 0, 4);
		grid.add(txtemail, 1, 4);
		grid.add(lblcnic, 0, 5);
		grid.add(txtcnic, 1,5);
		grid.add(btnreg, 1 ,6);
		grid.add(btnclear, 1, 6);
		grid.add(btnback,1,6);
		
		GridPane.setMargin(btnclear, new Insets(0,0,0,70));
		GridPane.setMargin(btnback, new Insets(0,0,0,120));
		
		scene=new Scene(grid);
		
		btnreg.setOnAction(x->{
			
			name=txtname.getText();
			pass=txtpass.getText();
			phone = txtphone.getText();
			email = txtemail.getText();
			cnic = txtcnic.getText();
			if(rmale.isSelected())
				gender = "Male";
			if(rfemale.isSelected())
				gender = "Female";
			try {
				Filing f = new Filing();
				f.writeUsername();
				f.writePass();
				f.writeDetails();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			new Login();
			stage.hide();
		});
		
		
		btnclear.setOnAction(x->{
			
			txtname.clear();
			txtpass.clear();
			txtphone.clear();
			txtcnic.clear();
		});
		
		btnback.setOnAction(x->
		{
			new Login();
			stage.hide();
		});
		
		
	}
	

}
