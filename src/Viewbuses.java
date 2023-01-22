 import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Viewbuses {
	

	Stage stage;
	Scene scene;
	Button back=new Button("Back");
	public Viewbuses(){
		stage=new Stage();
		stage.setTitle("Buses");
		stage.setHeight(700);
		stage.setWidth(900);
		stage.setResizable(false);
		addcomp();
		stage.setScene(scene);
		stage.show();
	}
	private void addcomp(){
		
		GridPane grid=new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		Image imgbtnin=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/bridge.jpg");
		
		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/city-4094885_960_720.jpg");
		grid.setBackground(new Background(new BackgroundImage(img,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
		
		Button g3=new Button("G-3");
		Button h16=new Button("H-16");
		Button w11=new Button("W-11");
		Button h24=new Button("H-24");
		Button h26=new Button("H-26");
		Button h4=new Button("H-4");
		Button f16=new Button("F-16");
		Button f11=new Button("F-11");
		Button iu=new Button("IU");
		Button m14=new Button("M-14");
		
		
	
		back.setStyle("-fx-color:red;");
		g3.setPrefSize(110,35);
		h16.setPrefSize(110,35);
		w11.setPrefSize(110,35);
		h24.setPrefSize(110,35);
		h26.setPrefSize(110,35);
		h4.setPrefSize(110,35);
		f16.setPrefSize(110,35);
		f11.setPrefSize(110,35);
		iu.setPrefSize(110,35);
		m14.setPrefSize(110,35);
		back.setPrefSize(110,35);
		grid.add(f16, 0, 0);
		grid.add(iu, 1, 0);
		grid.add(m14, 0, 1);
		grid.add(f11, 1,1);
		grid.add(h4, 0, 2);
		grid.add(h26, 1,2);
		grid.add(h24, 0, 3);
		grid.add(w11, 1,3);
		grid.add(h16, 0, 4);
		grid.add(g3, 1,4);
		grid.add(back, 0, 6);
		
		GridPane.setMargin(back, new Insets(0,0,0,80));
		scene=new Scene(grid);
	back.setOnAction(x->{
		
		Routes.stage.setScene(Routes.scene);
		Routes.stage.show();
		stage.hide();
	
	});	
		f16.setOnAction(x->{
			Scene scene2;
			GridPane grid2=new GridPane();
			grid2.setHgap(10);
			grid2.setVgap(10);
			grid2.setBackground(new Background(new BackgroundImage(imgbtnin,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
			grid2.setAlignment(Pos.CENTER);
			
			Text info1=new Text("From Kala Pull to Korangi");
			Text info2=new Text("From korangi  to Landhi");
			Text info3=new Text("From Landhi to Iqra University");
			Text info4=new Text("From Iqra  to Baloch Colony");
			
			info1.setStroke(Color.CADETBLUE);
			info2.setStroke(Color.CADETBLUE);
			info3.setStroke(Color.CADETBLUE);
			info4.setStroke(Color.CADETBLUE);
			info1.setStyle("-fx-font-size:30px;");
			info2.setStyle("-fx-font-size:30px;");
			info3.setStyle("-fx-font-size:30px;");
			info4.setStyle("-fx-font-size:30px;");
			
			grid2.add(info1, 0, 0);
			grid2.add(info2, 0, 1);
			grid2.add(info3, 0, 2);
			grid2.add(info4, 0, 3);
			grid2.add(back, 0, 4);
			
			
			scene2=new Scene(grid2);
			stage.setScene(scene2);
			stage.show();
			
back.setOnAction(y->{
				
				new Viewbuses();
				stage.hide();
			});
			
		});
		iu.setOnAction(x->{
			Scene scene2;
			GridPane grid2=new GridPane();
			grid2.setHgap(10);
			grid2.setVgap(10);
			grid2.setAlignment(Pos.CENTER);
			grid2.setBackground(new Background(new BackgroundImage(imgbtnin,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
			
			Text info1=new Text("From Kala Pull to Korangi");
			Text info2=new Text("From korangi  to Landhi");
			Text info3=new Text("From Landhi to Iqra University");
			Text info4=new Text("From Iqra  to Balock Colony");
			

			info1.setStroke(Color.CADETBLUE);
			info2.setStroke(Color.CADETBLUE);
			info3.setStroke(Color.CADETBLUE);
			info4.setStroke(Color.CADETBLUE);
			info1.setStyle("-fx-font-size:30px;");
			info2.setStyle("-fx-font-size:30px;");
			info3.setStyle("-fx-font-size:30px;");
			info4.setStyle("-fx-font-size:30px;");
			
			grid2.add(info1, 0, 0);
			grid2.add(info2, 0, 1);
			grid2.add(info3, 0, 2);
			grid2.add(info4, 0, 3);
			grid2.add(back, 0, 4);
			
			
			scene2=new Scene(grid2);
			stage.setScene(scene2);
			stage.show();
			
back.setOnAction(y->{
				
				new Viewbuses();
				stage.hide();
			});
			
		});
		m14.setOnAction(x->{
			Scene scene2;
			GridPane grid2=new GridPane();
			grid2.setHgap(10);
			grid2.setVgap(10);
			grid2.setAlignment(Pos.CENTER);
			grid2.setBackground(new Background(new BackgroundImage(imgbtnin,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
			
			Text info1=new Text("From Kala Pull to Korangi");
			Text info2=new Text("From korangi  to Landhi");
			Text info3=new Text("From Landhi to Iqra University");
			Text info4=new Text("From Iqra  to baloch Colony");
			

			info1.setStroke(Color.CADETBLUE);
			info2.setStroke(Color.CADETBLUE);
			info3.setStroke(Color.CADETBLUE);
			info4.setStroke(Color.CADETBLUE);
			grid2.add(info1, 0, 0);
			grid2.add(info2, 0, 1);
			grid2.add(info3, 0, 2);
			grid2.add(info4, 0, 3);
			grid2.add(back, 0, 4);
			
			info1.setStyle("-fx-font-size:30px;");
			info2.setStyle("-fx-font-size:30px;");
			info3.setStyle("-fx-font-size:30px;");
			info4.setStyle("-fx-font-size:30px;");
			
			scene2=new Scene(grid2);
			stage.setScene(scene2);
			stage.show();
			
back.setOnAction(y->{
				
				new Viewbuses();
				stage.hide();
			});
			
		});
		f11.setOnAction(x->{
			Scene scene2;
			GridPane grid2=new GridPane();
			grid2.setHgap(10);
			grid2.setVgap(10);
			grid2.setAlignment(Pos.CENTER);
			grid2.setBackground(new Background(new BackgroundImage(imgbtnin,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
			
			Text info1=new Text("From Kala Pull to Korangi");
			Text info2=new Text("From korangi  to Landhi");
			Text info3=new Text("From Landhi to Iqra University");
			Text info4=new Text("From Iqra  to Balock Colony");
			
			info1.setStroke(Color.CADETBLUE);
			info2.setStroke(Color.CADETBLUE);
			info3.setStroke(Color.CADETBLUE);
			info4.setStroke(Color.CADETBLUE);
			info1.setStyle("-fx-font-size:30px;");
			info2.setStyle("-fx-font-size:30px;");
			info3.setStyle("-fx-font-size:30px;");
			info4.setStyle("-fx-font-size:30px;");
			
			grid2.add(info1, 0, 0);
			grid2.add(info2, 0, 1);
			grid2.add(info3, 0, 2);
			grid2.add(info4, 0, 3);
			grid2.add(back, 0, 4);
			
			
			scene2=new Scene(grid2);
			stage.setScene(scene2);
			stage.show();
			
			
back.setOnAction(y->{
				
				new Viewbuses();
				stage.hide();
			});
		});
		h4.setOnAction(x->{
			Scene scene2;
			GridPane grid2=new GridPane();
			grid2.setHgap(10);
			grid2.setVgap(10);
			grid2.setAlignment(Pos.CENTER);
			grid2.setBackground(new Background(new BackgroundImage(imgbtnin,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
			
			Text info1=new Text("From Kala Pull to Korangi");
			Text info2=new Text("From korangi  to Landhi");
			Text info3=new Text("From Landhi to Iqra University");
			Text info4=new Text("From Iqra  to Balock Colony");
			info1.setStroke(Color.PURPLE);

			info1.setStroke(Color.CADETBLUE);
			info2.setStroke(Color.CADETBLUE);
			info3.setStroke(Color.CADETBLUE);
			info4.setStroke(Color.CADETBLUE);
			info1.setStyle("-fx-font-size:30px;");
			info2.setStyle("-fx-font-size:30px;");
			info3.setStyle("-fx-font-size:30px;");
			info4.setStyle("-fx-font-size:30px;");
			
			grid2.add(info1, 0, 0);
			grid2.add(info2, 0, 1);
			grid2.add(info3, 0, 2);
			grid2.add(info4, 0, 3);
			grid2.add(back, 0, 4);
			
			
			scene2=new Scene(grid2);
			stage.setScene(scene2);
			stage.show();
			
back.setOnAction(y->{
				
				new Viewbuses();
				stage.hide();
			});
			
		});
		h26.setOnAction(x->{
			Scene scene2;
			GridPane grid2=new GridPane();
			grid2.setHgap(10);
			grid2.setVgap(10);
			grid2.setAlignment(Pos.CENTER);
			grid2.setBackground(new Background(new BackgroundImage(imgbtnin,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
			
			Text info1=new Text("From Shahr-e-Faisal to Tarique Road");
			Text info2=new Text("From Tarique Road  to University Road");
			

			info1.setStroke(Color.CADETBLUE);
			info2.setStroke(Color.CADETBLUE);
			info1.setStyle("-fx-font-size:25px;");
			info2.setStyle("-fx-font-size:25px;");
			
			grid2.add(info1, 0, 0);
			grid2.add(info2, 0, 1);
			grid2.add(back, 0, 2);
			
			scene2=new Scene(grid2);
			stage.setScene(scene2);
			stage.show();
			
back.setOnAction(y->{
				
				new Viewbuses();
				stage.hide();
			});
			
		});
		h24.setOnAction(x->{
			Scene scene2;
			GridPane grid2=new GridPane();
			grid2.setHgap(10);
			grid2.setVgap(10);
			grid2.setAlignment(Pos.CENTER);
			grid2.setBackground(new Background(new BackgroundImage(imgbtnin,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
			

			Text info1=new Text("From University Road  to Tarique Road");
			Text info2=new Text("From Tarique Road  to Shahr-e-Faisal");

			info1.setStroke(Color.CADETBLUE);
			info2.setStroke(Color.CADETBLUE);
			info1.setStyle("-fx-font-size:25px;");
			info2.setStyle("-fx-font-size:25px;");
			grid2.add(info1, 0, 0);
			grid2.add(info2, 0, 1);
			grid2.add(back, 0, 2);
			
			
			
			scene2=new Scene(grid2);
			stage.setScene(scene2);
			stage.show();
			
back.setOnAction(y->{
				
				new Viewbuses();
				stage.hide();
			});
			
		});
		w11.setOnAction(x->{
			Scene scene2;
			GridPane grid2=new GridPane();
			grid2.setHgap(10);
			grid2.setVgap(10);
			grid2.setAlignment(Pos.CENTER);
			grid2.setBackground(new Background(new BackgroundImage(imgbtnin,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
			
			Text info1=new Text("From Shahr-e-Faisal to Tarique Road");
			Text info2=new Text("From Tarique Road  to University Road");

			info1.setStroke(Color.CADETBLUE);
			info2.setStroke(Color.CADETBLUE);	
			info1.setStyle("-fx-font-size:25px;");
			info2.setStyle("-fx-font-size:25px;");
			
			grid2.add(info1, 0, 0);
			grid2.add(info2, 0, 1);
			grid2.add(back, 0, 2);
			
			
			
			scene2=new Scene(grid2);
			stage.setScene(scene2);
			stage.show();
			
back.setOnAction(y->{
				
				new Viewbuses();
				stage.hide();
			});
			
		});
		h16.setOnAction(x->{
			Scene scene2;
			GridPane grid2=new GridPane();
			grid2.setHgap(10);
			grid2.setVgap(10);
			grid2.setAlignment(Pos.CENTER);
			grid2.setBackground(new Background(new BackgroundImage(imgbtnin,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
			
			Text info1=new Text("From Saddar to Mazar-e-Quaid");
			Text info2=new Text("From Mazar-e-Quaid  to Saddar");
			
			info1.setStroke(Color.CADETBLUE);
			info2.setStroke(Color.CADETBLUE);
			info1.setStyle("-fx-font-size:30px;");
			info2.setStyle("-fx-font-size:30px;");
			grid2.add(info1, 0, 0);
			grid2.add(info2, 0, 1);
			grid2.add(back, 0, 2);
			
			
			
			scene2=new Scene(grid2);
			stage.setScene(scene2);
			stage.show();
			
               back.setOnAction(y->{
				
				new Viewbuses();
				stage.hide();
			});
			
		});
		g3.setOnAction(x->{
			Scene scene2;
			GridPane grid2=new GridPane();
			grid2.setHgap(10);
			grid2.setVgap(10);
			grid2.setAlignment(Pos.CENTER);
			grid2.setBackground(new Background(new BackgroundImage(imgbtnin,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
			
			Text info1=new Text("From Mazar-e-Quaid to Saddar ");
			Text info2=new Text("From Saddar  to Mazar-e-Quaid");
			
			info1.setStroke(Color.CADETBLUE);
			info2.setStroke(Color.CADETBLUE);
			info1.setStyle("-fx-font-size:30px;");
			info2.setStyle("-fx-font-size:30px;");
			grid2.add(info1, 0, 0);
			grid2.add(info2, 0, 1);
			grid2.add(back, 0, 2);
			
			
			scene2=new Scene(grid2);
			stage.setScene(scene2);
			stage.show();
			
			back.setOnAction(y->{
				
				new Viewbuses();
				stage.hide();
			});
			
			
		});
		
	}
}
