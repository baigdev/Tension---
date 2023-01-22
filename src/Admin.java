import javafx.stage.Stage;
import java.io.IOException;

import org.controlsfx.control.textfield.TextFields;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Admin {
	
	int r;
	GridPane pane = new GridPane();
	Stage stage=new Stage();
	Scene scene;
	public Admin()
	{
		stage.setHeight(450);
		stage.setWidth(510);
		stage.setResizable(false);
		stage.setTitle("Admin");
		Comp();
		stage.setScene(scene);
		stage.show();
		
	}
	Filing f = new Filing();
	public void addComponents()
	{
		try {
			f.readDetails();
			f.readUsername();
			f.userlist.remove(0);
			r= f.userlist.size();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HBox hbox = new HBox(10);
		Button btnviewall = new Button("View All");
		Button btnsearch = new Button("Search By Name");
		hbox.getChildren().addAll(btnviewall,btnsearch);
		scene = new Scene(hbox);
		stage.setScene(scene);
		btnviewall.setOnAction(x->{
			
			
			TableView<Details> tableView = new TableView();
			
			TableColumn<Details, ?> column1 = new TableColumn<>("Name");
			column1.setCellValueFactory(new PropertyValueFactory<>("name"));
			
			TableColumn<Details, ?> column2 = new TableColumn<>("Gender");
			column2.setCellValueFactory(new PropertyValueFactory<>("gender"));
			
			TableColumn<Details, ?> column3 = new TableColumn<>("Phone");
			column3.setCellValueFactory(new PropertyValueFactory<>("phone"));
			
			TableColumn<Details, ?> column4 = new TableColumn<>("Email");
			column4.setCellValueFactory(new PropertyValueFactory<>("email"));
			
			TableColumn<Details, ?> column5 = new TableColumn<>("Cnic");
			column5.setCellValueFactory(new PropertyValueFactory<>("cnic"));
			
			
			tableView.getColumns().add(column1);
			tableView.getColumns().add(column2);
			tableView.getColumns().add(column3);
			tableView.getColumns().add(column4);
			tableView.getColumns().add(column5);
			
			for(int i=0; i<=r;i++)
			{
				
				tableView.getItems().add(new Details(f.infolist[i].getName(),f.infolist[i].getGender(),f.infolist[i].getPhone(),f.infolist[i].getEmail(),f.infolist[i].getCnic()));
			}
	
			VBox vbox = new VBox(tableView);
			scene = new Scene(vbox);
			stage.setScene(scene);
		});
		
		Button btnsearch1 = new Button("Search");
		Label lblname = new Label("Enter Name");
		TextField txtname = new TextField();
		btnsearch.setOnAction(x ->{
			
			pane.add(lblname, 0, 0);
			pane.add(txtname, 0, 0);
			String[] suggest = new String[r];
			for(int i=0;i<r;i++)
			{
				suggest[i] = f.userlist.get(i);
			}
			TextFields.bindAutoCompletion(txtname, suggest);
			GridPane.setMargin(txtname, new Insets(0,0,0,90));
			pane.add(btnsearch1, 0, 1);
			GridPane.setMargin(btnsearch1, new Insets(0,0,0,90));
			pane.setVgap(15);
			pane.setHgap(15);
			scene = new Scene(pane);
			stage.setScene(scene);
			});
		btnsearch1.setOnAction(x ->{
			
			String tempname = txtname.getText();
			Filing f = new Filing();
			try {
				f.readPass();
				f.readDetails();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			f.passlist.remove(0);
			for(int i=0;i<r;i++)
			{
				if(tempname.equals(f.infolist[i].getName()))
				{
					Label lblname1 = new Label(f.infolist[i].getName());
					Label lblgender = new Label(f.infolist[i].getGender());
					Label lblphone = new Label(f.infolist[i].getPhone());
					Label lblemail = new Label(f.infolist[i].getEmail());
					Label lblcnic = new Label(f.infolist[i].getCnic());
					GridPane pane1 = new GridPane();
					pane1.add(lblname1, 0, 0);
					pane1.add(lblgender, 0, 1);
					pane1.add(lblphone, 0, 2);
					pane1.add(lblemail, 0, 3);
					pane1.add(lblcnic, 0, 4);
					pane1.setHgap(15);
					pane1.setVgap(15);
					pane1.setAlignment(Pos.CENTER);
					scene = new Scene(pane1);
					stage.setScene(scene);
					break;
				}
			}
		});
	}
	private void Comp()
	{
		GridPane grid =new GridPane();
		grid.setVgap(15);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER);
		grid.setBackground(new Background(new BackgroundFill(Color.CADETBLUE,null,null)));
		Label name=new Label("Name");
		Label pass=new Label("Password");
		
		TextField txtname =new TextField();
		PasswordField txtpass =new PasswordField();
		
		Button login=new Button("Login");
		Button back=new Button("Back");
		
		grid.add(name, 0,0);
		grid.add(txtname, 1, 0);
		grid.add(pass, 0, 1);
		grid.add(txtpass, 1, 1);
		grid.add(login, 1, 2);
		grid.add(back, 1, 2);
		GridPane.setMargin(back, new Insets(0,0,0,60));
		scene=new Scene(grid);
		
		login.setOnAction(x->{
			
			String tempname = txtname.getText();
			String temppass = txtpass.getText();
			if(tempname.equals("admin") && temppass.equals("niaz"))
			{
				addComponents();
			}
		});
		
		back.setOnAction(x->{
			
			StartWindow MainWindow =new StartWindow();
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
