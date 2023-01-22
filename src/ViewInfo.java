import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ViewInfo {
	
	Scene scene;
	String pick,drop,fare;
	String distance;
	public ViewInfo(String p,String d)
	{
		pick=p;
		drop=d;
		callbuses();
	}
	public void saddarDiverge()
	{
		Text h16=new Text("H-16");
		Text g3=new Text("G-3");
		Button back=new Button("Back");
		
		GridPane grid=new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(20);
		grid.setVgap(10);
        Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/info.jpg");
		
		grid.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		

		h16.setStyle("-fx-font-size:40px;");
		g3.setStyle("-fx-font-size:40px;");
		
		h16.setStroke(Color.CADETBLUE);
		g3.setStroke(Color.CADETBLUE);
		grid.add(h16, 0, 0);
		grid.add(g3, 0, 1);
		grid.add(back, 0, 2);
		
		scene=new Scene(grid);
		Routes.stage.setScene(scene);
		
		back.setOnAction(x->{
			
			Routes.stage.setScene(Routes.scene);
		});
	}
	
	public void FaisalDiverge()
	{
		Text w11=new Text("W-11");
		Text h24=new Text("H-24");
		Text h26=new Text("H-26");
		Button back=new Button("Back");
		
		GridPane grid=new GridPane();
		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/info.jpg");
		
		grid.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		

		w11.setStyle("-fx-font-size:40px;");
		h24.setStyle("-fx-font-size:40px;");
		h26.setStyle("-fx-font-size:40px;");
		
		w11.setStroke(Color.CADETBLUE);
		h24.setStroke(Color.CADETBLUE);
		h26.setStroke(Color.CADETBLUE);
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(20);
		grid.setVgap(10);
		
		grid.add(w11, 0, 0);
		grid.add(h24, 0, 1);
		grid.add(h26, 0, 2);
		grid.add(back, 0, 3);
		
		scene=new Scene(grid);
		Routes.stage.setScene(scene);
		
		back.setOnAction(x->{
			
			Routes.stage.setScene(Routes.scene);
		});
	}
	public void iuDiverge()
	{
		Text h4=new Text("H-4");
		Text m14=new Text("M-14");
		Text f11=new Text("F-11");
		Button back=new Button("Back");
		
		GridPane grid=new GridPane();

		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/info.jpg");
		grid.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		
		h4.setStyle("-fx-font-size:40px;");
		m14.setStyle("-fx-font-size:40px;");
		f11.setStyle("-fx-font-size:40px;");
		
		h4.setStroke(Color.CADETBLUE);
		m14.setStroke(Color.CADETBLUE);
		f11.setStroke(Color.CADETBLUE);
		
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(20);
		grid.setVgap(10);		
		grid.add(f11, 0, 0);
		grid.add(m14, 0, 1);
		grid.add(h4, 0, 2);
		grid.add(back, 0, 3);
		
		scene=new Scene(grid);
		Routes.stage.setScene(scene);
		
		back.setOnAction(x->{
			
			Routes.stage.setScene(Routes.scene);
		});
		
	}
	
	public void buses10(){
		
		Text g3=new Text("G-3");
		Text h16=new Text("H-16");
		Text w11=new Text("W-11");
		Text h24=new Text("H-24");
		Text h26=new Text("H-26");
		Text h4=new Text("H-4");
		Text f16=new Text("F-16");
		Text f11=new Text("F-11");
		Text iu=new Text("IU");
		Text m14=new Text("M-14");
		Text lbldistance = new Text("Distance: ");
	    Text txtdistance = new Text(distance);
		Text lblfare=new Text("Fare");
		Text txtfare =new Text(fare);
		
		lbldistance.setStroke(Color.BLACK);
		g3.setStyle("-fx-font-size:40px;");
		h16.setStyle("-fx-font-size:40px;");
		w11.setStyle("-fx-font-size:40px;");
		h24.setStyle("-fx-font-size:40px;");
		h26.setStyle("-fx-font-size:40px;");
		h4.setStyle("-fx-font-size:40px;");
		f16.setStyle("-fx-font-size:40px;");
		f11.setStyle("-fx-font-size:40px;");
		iu.setStyle("-fx-font-size:40px;");
		m14.setStyle("-fx-font-size:40px;");
		lbldistance.setStyle("-fx-font-size:40px;");
		txtdistance.setStyle("-fx-font-size:40px;");
		lblfare.setStyle("-fx-font-size:40px;");
		txtfare.setStyle("-fx-font-size:40px;");
		g3.setStroke(Color.CADETBLUE);
		h16.setStroke(Color.CADETBLUE);
		w11.setStroke(Color.CADETBLUE);
		h24.setStroke(Color.CADETBLUE);
		h26.setStroke(Color.CADETBLUE);
		h4.setStroke(Color.CADETBLUE);
		f16.setStroke(Color.CADETBLUE);
		f11.setStroke(Color.CADETBLUE);
		iu.setStroke(Color.CADETBLUE);
		m14.setStroke(Color.CADETBLUE);
		lbldistance.setStroke(Color.CADETBLUE);
		txtdistance.setStroke(Color.CADETBLUE);
		lblfare.setStroke(Color.CADETBLUE);
		txtfare.setStroke(Color.CADETBLUE);
		
		
		Button back=new Button("Back");
		back.setPrefSize(70, 40);
		GridPane grid=new GridPane();
		
		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/info.jpg");
		grid.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(20);
		grid.setVgap(10);

		grid.add(m14, 0, 0);
		grid.add(iu, 1, 0);
		grid.add(f11, 0, 1);
		grid.add(f16, 1, 1);
		grid.add(h4, 0, 2);
		grid.add(h26, 1, 2);
		grid.add(h24, 0, 3);
		grid.add(w11, 1,3);
		grid.add(h16, 0, 4);
		grid.add(g3, 1,4);
		grid.add(lbldistance, 0, 5);
		grid.add(txtdistance, 1, 5);
		grid.add(lblfare, 0, 6);
		grid.add(txtfare, 1, 6);
		grid.add(back,0, 7);
		GridPane.setMargin(back,new Insets(0,0,0,120));
		scene=new Scene(grid);
		Routes.stage.setScene(scene);
		
		back.setOnAction(x->{
			
			Routes.stage.setScene(Routes.scene);
		});
		
	}
	
	public void callbuses()
	{
		
	if(pick.equals("Kala Pull")&& drop.equals("Iqra University")||pick.equals("Iqra University")&&drop.equals("Kala Pull"))
	{
		distance ="4";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		buses10();
		}
	else if(pick.equals("Kala Pull")&& drop.equals("Baloch Colony")||pick.equals("Kala Pull")&&drop.equals("Baloch Colony"))
	{
			distance ="7";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		buses10();
	}
	else if(pick.equals("Kala Pull")&& drop.equals("Shahr-e-Faisal")||pick.equals("Shahr-e-Faisal")&&drop.equals("Kala Pull"))
	{
		distance ="10";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		buses10();	
	}
	else if(pick.equals("Kala Pull")&& drop.equals("Saddar")||pick.equals("Saddar")&&drop.equals("Kala Pull"))
	{
		distance ="6";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		buses10();
		}
	else if(pick.equals("Iqra University")&& drop.equals("Baloch Colony")||pick.equals("Baloch Colony")&&drop.equals("Iqra University"))
	{
		distance ="3";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		buses10();
		
	}
	else if(pick.equals("Iqra University")&& drop.equals("Shahr-e-Faisal")||pick.equals("Shahr-e-Faisal")&&drop.equals("Iqra University"))
	{
		distance ="6";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		buses10();
		
	}
	else  if(pick.equals("Iqra University")&& drop.equals("Saddar")||pick.equals("Saddar")&&drop.equals("Iqra University"))
	{
		distance ="10";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		buses10();
		
	}
	else if(pick.equals("Baloch Colony")&& drop.equals("Shahr-e-Faisal")||pick.equals("Shahr-e-Faisal")&&drop.equals("Baloch Colony"))
	{
		distance ="3";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		buses10();		
	}
	else if(pick.equals("Baloch Colony")&& drop.equals("Saddar")||pick.equals("Saddar")&&drop.equals("Baloch Colony"))
	{
		distance ="7";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		buses10();
		
	}
	else if(pick.equals("Shahr-e-Faisal")&& drop.equals("Saddar")||pick.equals("Saddar")&&drop.equals("Shahr-e-Faisal"))
	{
		distance ="4";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		buses10();
		
	}
	else if(pick.equals("Kala Pull")&& drop.equals("Korangi")||pick.equals("Korangi")&&drop.equals("Kala Pull"))
{
		distance ="8";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
	iuDiverge();
}
	else if(pick.equals("Kala Pull")&& drop.equals("Landhi")||pick.equals("Landhi")&&drop.equals("Kala Pull"))
	{
		distance ="13";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		iuDiverge();
	}
	else if(pick.equals("Iqra University")&& drop.equals("Korangi")||pick.equals("Korangi")&&drop.equals("Iqra University"))
	{
		distance ="4";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		iuDiverge();
	}
	else if(pick.equals("Iqra University")&& drop.equals("Landhi")||pick.equals("Landhi")&&drop.equals("Iqra University"))
	{
		distance ="9";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
	    iuDiverge();
	}
	else if(pick.equals("Baloch Colony")&& drop.equals("Korangi")||pick.equals("Korangi")&&drop.equals("Baloch Colony"))
	{
		distance ="7";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		iuDiverge();
	}
	else if(pick.equals("Baloch Colony")&& drop.equals("Landhi")||pick.equals("Landhi")&&drop.equals("Baloch Colony"))
	{
		distance ="12";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		iuDiverge();
	}
	else if(pick.equals("Shahr-e-Faisal")&& drop.equals("Korangi")||pick.equals("Korangi")&&drop.equals("Shahr-e-Faisal"))
	{
		distance ="10";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		iuDiverge();
	}
	else if(pick.equals("Shahr-e-Faisal")&& drop.equals("Landhi")||pick.equals("Landhi")&&drop.equals("Shahr-e-Faisal"))
	{
		distance ="15";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		iuDiverge();
	}
	else if(pick.equals("Saddar")&& drop.equals("Korangi")||pick.equals("Korangi")&&drop.equals("Saddar"))
	{
		distance ="14";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		iuDiverge();
	}
	else if(pick.equals("Saddar")&& drop.equals("Landhi")||pick.equals("Landhi")&&drop.equals("Saddar"))
	{
		distance ="19";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		iuDiverge();
	}
	else if(pick.equals("Korangi")&& drop.equals("Landhi")||pick.equals("Landhi")&&drop.equals("Korangi"))
	{
		distance ="5";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		iuDiverge();
	}
	else if(pick.equals("Kala Pull")&& drop.equals("Tariq Road")||pick.equals("Tariq Road")&&drop.equals("Kala Pull"))
	{
		distance ="14";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		FaisalDiverge();
	}
	else if(pick.equals("Kala Pull")&& drop.equals("University Road")||pick.equals("University Road")&&drop.equals("Kala Pull"))
	{
		distance ="21";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		FaisalDiverge();
	}
	else if(pick.equals("Iqra University")&& drop.equals("Tariq Road")||pick.equals("Tariq Road")&&drop.equals("Iqra University"))
	{
		distance ="10";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		FaisalDiverge();
	}
	else if(pick.equals("Iqra University")&& drop.equals("University Road")||pick.equals("University Road")&&drop.equals("Iqra University"))
	{
		distance ="17";
		int a=Integer.parseInt(distance);
		int b=(a*2);
		fare=String.valueOf(b);
		FaisalDiverge();
	}
	else if(pick.equals("Baloch Colony")&& drop.equals("Tariq Road")||pick.equals("Tariq Road")&&drop.equals("Baloch Colony"))
	{
		distance ="7";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		FaisalDiverge();
	}
	else if(pick.equals("Baloch Colony")&& drop.equals("University Road")||pick.equals("University Road")&&drop.equals("Baloch Colony"))
	{
		distance ="14";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		FaisalDiverge();
	}
	else if(pick.equals("Shahr-e-Faisal")&& drop.equals("Tariq Road")||pick.equals("Tariq Road")&&drop.equals("Shahr-e-Faisal"))
	{
		distance ="4";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		FaisalDiverge();
	}
	else if(pick.equals("Shahr-e-Faisal")&& drop.equals("University Road")||pick.equals("University Road")&&drop.equals("Shahr-e-Faisal"))
	{
		distance ="11";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		FaisalDiverge();
	}
	else if(pick.equals("Saddar")&& drop.equals("Tariq Road")||pick.equals("Tariq Road")&&drop.equals("Saddar"))
	{
		distance ="8";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		FaisalDiverge();
	}
	else if(pick.equals("Saddar")&& drop.equals("University Road")||pick.equals("University Road")&&drop.equals("Saddar"))
	{
		distance ="15";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		FaisalDiverge();
	}
	else if(pick.equals("Tariq Road")&& drop.equals("University Road")||pick.equals("University Road")&&drop.equals("Tariq Road"))
	{
		distance ="7";
		int a=Integer.parseInt(distance);
		int b=(a*3);
		fare=String.valueOf(b);
		FaisalDiverge();
	}
	else if(pick.equals("Kala Pull")&& drop.equals("Mazar-e-Quaid")||pick.equals("Mazar-e-Quaid")&&drop.equals("Kala Pull"))
	{
		distance ="10.7";
		Double a=Double.parseDouble(distance);
		Double b=(a*3);
		fare=String.valueOf(b);
		saddarDiverge();
	}
	else if(pick.equals("Iqra University")&& drop.equals("Mazar-e-Quaid")||pick.equals("Mazar-e-Quaid")&&drop.equals("Iqra University"))
	{
		distance ="14.7";
		Double a=Double.parseDouble(distance);
		Double b=(a*3);
		fare=String.valueOf(b);
		saddarDiverge();
	}
	else if(pick.equals("Baloch Colony")&& drop.equals("Mazar-e-Quaid")||pick.equals("Mazar-e-Quaid")&&drop.equals("Baloch Colony"))
	{
		distance ="11.7";
		Double a=Double.parseDouble(distance);
		Double b=(a*3);
		fare=String.valueOf(b);
		saddarDiverge();
	}
	else if(pick.equals("Shahr-e-Faisal")&& drop.equals("Mazar-e-Quaid")||pick.equals("Mazar-e-Quaid")&&drop.equals("Shahr-e-Faisal"))
	{
		distance ="8.7";
		Double a=Double.parseDouble(distance);
		Double b=(a*3);
		fare=String.valueOf(b);
		saddarDiverge();
	}
	else if(pick.equals("Saddar")&& drop.equals("Mazar-e-Quaid")||pick.equals("Mazar-e-Quaid")&&drop.equals("Saddar"))
	{
		distance ="4.7";
		Double a=Double.parseDouble(distance);
		Double b=(a*3);
		fare=String.valueOf(b);
		saddarDiverge();
	}
	
	
	else if((pick.equals("Tariq Road")||pick.equals("University Road"))&& (drop.equals("Landhi")||drop.equals("Korangi")))
	{
		if(pick.equals("Tariq Road")&& drop.equals("Landhi"))
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		else if(pick.equals("Tariq Road")&& drop.equals("Landhi"))
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		if(pick.equals("University Road")&& drop.equals("Korangi"))
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		else if(pick.equals("University Road")&& drop.equals("Landhi"))
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		
		VBox vbox=new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		
		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/info.jpg");
		vbox.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));

		HBox hbox=new HBox(10);
		hbox.setAlignment(Pos.CENTER);
		
		VBox vbox2=new VBox(10);
		vbox2.setAlignment(Pos.CENTER);
		
		HBox hbox2=new HBox(10);
		hbox2.setAlignment(Pos.CENTER);
		
		HBox hbox3=new HBox(10);
		hbox3.setAlignment(Pos.CENTER);
		
		HBox hbox4=new HBox(10);
		hbox4.setAlignment(Pos.CENTER);
		Text w11=new Text("W-11");
		Text h24=new Text("H-24");
		Text h26=new Text("H-26");
		Text lbldistance=new Text("Distance");
		Text txtdistance=new Text(distance);
		Text lblfare=new Text("Fare");
		Text txtfare=new Text(fare);
		
		Button back=new Button("Back");
		
		Text sug=new Text("These above buses will drop you at Iqra University");
		Text sug2=new Text("then you will must join these buses as follows");
		
		Text h4=new Text("H-4");
		Text m14=new Text("M-14");
		Text f11=new Text("F-11");
		
		w11.setStyle("-fx-font-size:40px;");
		h24.setStyle("-fx-font-size:40px;");
		h26.setStyle("-fx-font-size:40px;");
		lbldistance.setStyle("-fx-font-size:40px;");
		txtdistance.setStyle("-fx-font-size:40px;");
		lblfare.setStyle("-fx-font-size:40px;");
		txtfare.setStyle("-fx-font-size:40px;");
		sug.setStyle("-fx-font-size:30px;");
		sug2.setStyle("-fx-font-size:30px;");
		h4.setStyle("-fx-font-size:40px;");
		m14.setStyle("-fx-font-size:40px;");
		f11.setStyle("-fx-font-size:40px;");
		
		w11.setStroke(Color.CADETBLUE);
		h24.setStroke(Color.CADETBLUE);
		h26.setStroke(Color.CADETBLUE);
		lbldistance.setStroke(Color.CADETBLUE);
		txtdistance.setStroke(Color.CADETBLUE);
		lblfare.setStroke(Color.CADETBLUE);
		txtfare.setStroke(Color.CADETBLUE);
		sug.setStroke(Color.CADETBLUE);
		sug2.setStroke(Color.CADETBLUE);
		h4.setStroke(Color.CADETBLUE);
		m14.setStroke(Color.CADETBLUE);
		f11.setStroke(Color.CADETBLUE);
		hbox.getChildren().addAll(w11,h24,h26);
		vbox2.getChildren().addAll(sug,sug2);
		hbox2.getChildren().addAll(h4,m14,f11);
		hbox3.getChildren().addAll(lbldistance,txtdistance);
		hbox4.getChildren().addAll(lblfare,txtfare);
		
		back.setPrefSize(75,45);
		
		vbox.getChildren().addAll(hbox,vbox2,hbox2,hbox3,hbox4,back);
		scene=new Scene(vbox);
		
		Routes.stage.setScene(scene);
		Routes.stage.show();

		back.setOnAction(x->{
			
			Routes.stage.setScene(Routes.scene);
		});
	}
	else if((pick.equals("Korangi")||pick.equals("Landhi")) && (drop.equals("Tariq Road")||drop.equals("University Road")))
	{
		
		if(pick.equals("Korangi")&& drop.equals("Tariq Road"))
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		else if(pick.equals("Korangi")&& drop.equals("University Road"))
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		if(pick.equals("Landhi")&& drop.equals("Tariq Road"))
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		else if(pick.equals("Landhi")&& drop.equals("University Road"))
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		
		HBox hbox =new HBox(10);
		hbox.setAlignment(Pos.CENTER);
		HBox hbox1=new HBox(10);
		hbox1.setAlignment(Pos.CENTER);
		VBox vbox =new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		VBox vboxf=new VBox(10);
		vboxf.setAlignment(Pos.CENTER);
		HBox hbox2=new HBox(10);
		hbox2.setAlignment(Pos.CENTER);
		HBox hbox3=new HBox(10);
		hbox3.setAlignment(Pos.CENTER );
		
		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/info.jpg");
		vboxf.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		Text h4=new Text("H-4");
		Text m14=new Text("M-14");
		Text f11=new Text("F-11");
		Button back=new Button("Back");
		back.setPrefSize(75, 45);
		Text sug=new Text("These above buses will drop you at Shahr-e-Faisal");
		Text sug2=new Text("then you will must join these buses as follows");
		
		hbox.getChildren().addAll(h4,m14,f11);
		vbox.getChildren().addAll(sug,sug2);
		
		Text w11=new Text("W-11");
		Text h24=new Text("H-24");
		Text h26=new Text("H-26");
		Text lbldistance=new Text("Distance");
		Text txtdistance=new Text(distance);
		Text lblfare=new Text("Fare");
		Text txtfare=new Text(fare);
		
		h4.setStyle("-fx-font-size:40px;");
		m14.setStyle("-fx-font-size:40px;");
		f11.setStyle("-fx-font-size:40px;");
		sug.setStyle("-fx-font-size:30px;");
		sug2.setStyle("-fx-font-size:30px;");
		w11.setStyle("-fx-font-size:40px;");
		h24.setStyle("-fx-font-size:40px;");
		h26.setStyle("-fx-font-size:40px;");
		lbldistance.setStyle("-fx-font-size:40px;");
	    txtdistance.setStyle("-fx-font-size:30px;");
		lblfare.setStyle("-fx-font-size:30px;");
		txtfare.setStyle("-fx-font-size:40px;");

		h4.setStroke(Color.CADETBLUE);
		m14.setStroke(Color.CADETBLUE);
		f11.setStroke(Color.CADETBLUE);
		sug.setStroke(Color.CADETBLUE);
		sug2.setStroke(Color.CADETBLUE);
		w11.setStroke(Color.CADETBLUE);
		h24.setStroke(Color.CADETBLUE);
		h26.setStroke(Color.CADETBLUE);
		lbldistance.setStroke(Color.CADETBLUE);
		txtdistance.setStroke(Color.CADETBLUE);
		lblfare.setStroke(Color.CADETBLUE);
		txtfare.setStroke(Color.CADETBLUE);
	
		
		hbox1.getChildren().addAll(w11,h24,h26);
		hbox2.getChildren().addAll(lbldistance,txtdistance);
		hbox3.getChildren().addAll(lblfare,txtfare);
		vboxf.getChildren().addAll(hbox,vbox,hbox1,hbox2,hbox3,back);
		
		scene=new Scene(vboxf);
		Routes.stage.setScene(scene);
		Routes.stage.show();
		
		back.setOnAction(x->{
			
			Routes.stage.setScene(Routes.scene);
		});
	}		
	else if(pick.equals("Mazar-e-Quaid")&& drop.equals("Tariq Road")||drop.equals("University Road"))
	{
		if(pick.equals("Mazar-e-Quaid")&& drop.equals("Tariq Road"))
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		else
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		
		HBox hbox =new HBox(10);
		hbox.setAlignment(Pos.CENTER);
		HBox hbox1=new HBox(10);
		hbox1.setAlignment(Pos.CENTER );
		VBox vbox =new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		HBox hbox2=new HBox(10);
		hbox2.setAlignment(Pos.CENTER);
		HBox hbox3=new HBox(10);
		hbox3.setAlignment(Pos.CENTER);
		VBox vboxf=new VBox(10);
		vboxf.setAlignment(Pos.CENTER);
		
		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/info.jpg");
		vboxf.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		Text g3=new Text("G-3");
		Text h16=new Text("H-16");
		Button back=new Button("Back");
		back.setPrefSize(75, 45);
		
		Text sug=new Text("These above buses will drop you at Shahr-e-Faisal");
		Text sug2=new Text("then you will must join these buses as follows");
		
		hbox1.getChildren().addAll(g3,h16);
		vbox.getChildren().addAll(sug,sug2);
		
		Text w11=new Text("W-11");
		Text h26=new Text("H-26");
		Text h24=new Text("H-24");
		Text lbldistance=new Text("Distance");
		Text txtdistance=new Text(distance);
		Text lblfare=new Text("Fare");
		Text txtfare=new Text(fare);
		
		g3.setStyle("-fx-font-size:40px;");
		h16.setStyle("-fx-font-size:40px;");
		sug.setStyle("-fx-font-size:30px;");
		sug2.setStyle("-fx-font-size:30px;");
		w11.setStyle("-fx-font-size:40px;");
		h26.setStyle("-fx-font-size:40px;");
		h24.setStyle("-fx-font-size:40px;");
		lbldistance.setStyle("-fx-font-size:40px;");
	    txtdistance.setStyle("-fx-font-size:30px;");
		lblfare.setStyle("-fx-font-size:30px;");
		txtfare.setStyle("-fx-font-size:40px;");	
		
		g3.setStroke(Color.CADETBLUE);
		h16.setStroke(Color.CADETBLUE);
		sug.setStroke(Color.CADETBLUE);
		sug2.setStroke(Color.CADETBLUE);
		w11.setStroke(Color.CADETBLUE);
		h26.setStroke(Color.CADETBLUE);
		h24.setStroke(Color.CADETBLUE);
		lbldistance.setStroke(Color.CADETBLUE);
		txtdistance.setStroke(Color.CADETBLUE);
		lblfare.setStroke(Color.CADETBLUE);
		txtfare.setStroke(Color.CADETBLUE);
		
		hbox2.getChildren().addAll(lbldistance,txtdistance);
		hbox3.getChildren().addAll(lblfare,txtfare);
		hbox.getChildren().addAll(w11,h26,h24);
		
		vboxf.getChildren().addAll(hbox1,vbox,hbox,hbox2,hbox3,back);
		
		scene=new Scene(vboxf);
		Routes.stage.setScene(scene);
		Routes.stage.show();

		back.setOnAction(x->{
			
			Routes.stage.setScene(Routes.scene);
		});
	}
	
	else if(pick.equals("Tariq Road")||pick.equals("University Road")&&drop.equals("Mazar-e-Quiad"))
	{
		
		if(pick.equals("Tariq Road")&& drop.equals("Mazar-e-Quaid"))
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		else
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		
		HBox hbox =new HBox(10);
		hbox.setAlignment(Pos.CENTER);
		HBox hbox1=new HBox(10);
		hbox1.setAlignment(Pos.CENTER);;
		VBox vbox =new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		HBox hbox2=new HBox(10);
		hbox2.setAlignment(Pos.CENTER);
		HBox hbox3=new HBox(10);
		hbox3.setAlignment(Pos.CENTER);
		
		VBox vboxf=new VBox(10);
		vboxf.setAlignment(Pos.CENTER);
	
		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/info.jpg");
		vboxf.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		Text w11=new Text("W-11");
		Text h24=new Text("H-24");
		Text h26=new Text("H-26");
		Text lbldistance=new Text("Distance");
		Text txtdistance=new Text(distance);
		Text lblfare=new Text("Fare");
		Text txtfare=new Text(fare);
		
		Button back=new Button("Back");
		back.setPrefSize(75, 45);
		Text sug=new Text("These above buses will drop you at Saddar");
		Text sug2=new Text("then you will must join these buses as follows");
		
		
		hbox1.getChildren().addAll(w11,h24,h26);
		vbox.getChildren().addAll(sug,sug2);
		
		Text h16=new Text("H-16");
		Text g3=new Text("G-3");
		hbox.getChildren().addAll(h16,g3);
		hbox.getChildren().addAll(lbldistance,txtdistance);
		hbox3.getChildren().addAll(lblfare,txtfare);

		w11.setStyle("-fx-font-size:40px;");
		h24.setStyle("-fx-font-size:40px;");
		h26.setStyle("-fx-font-size:40px;");
		lbldistance.setStyle("-fx-font-size:40px;");
		txtdistance.setStyle("-fx-font-size:40px;");
		lblfare.setStyle("-fx-font-size:40px;");
		txtfare.setStyle("-fx-font-size:40px;");
		sug.setStyle("-fx-font-size:30px;");
		sug2.setStyle("-fx-font-size:30px;");
	    h16.setStyle("-fx-font-size:30px;");
		g3.setStyle("-fx-font-size:30px;");
		
		w11.setStroke(Color.CADETBLUE);
		h24.setStroke(Color.CADETBLUE);
		h26.setStroke(Color.CADETBLUE);
		lbldistance.setStroke(Color.CADETBLUE);
		txtdistance.setStroke(Color.CADETBLUE);
		lblfare.setStroke(Color.CADETBLUE);
		txtfare.setStroke(Color.CADETBLUE);
		sug.setStroke(Color.CADETBLUE);
		sug2.setStroke(Color.CADETBLUE);
		h16.setStroke(Color.CADETBLUE);
		g3.setStroke(Color.CADETBLUE);
		vboxf.getChildren().addAll(hbox1,vbox,hbox,hbox2,hbox3,back);
		
		scene=new Scene(vboxf);
		Routes.stage.setScene(scene);
		Routes.stage.show();

		back.setOnAction(x->{
			
			Routes.stage.setScene(Routes.scene);
		});
	}		
	
	
	else if(pick.equals("Landhi")||pick.equals("Korangi")&& drop.equals("Mazar-e-Quaid"))
	{

		if(pick.equals("Korangi")&& drop.equals("Mazar-e-Quaid"))
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		else
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
			
		
		HBox hbox =new HBox(10);
		hbox.setAlignment(Pos.CENTER);;
		HBox hbox1=new HBox(10);
		hbox1.setAlignment(Pos.CENTER);
		VBox vbox =new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		HBox hbox2=new HBox(10);
		hbox2.setAlignment(Pos.CENTER);
		HBox hbox3=new HBox(10);
		hbox3.setAlignment(Pos.CENTER);
		
		VBox vboxf=new VBox(10);
		vboxf.setAlignment(Pos.CENTER);
		
		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/info.jpg");
		vboxf.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		Text h16=new Text("H-16");
		Text g3=new Text("G-3");
		Text lbldistance=new Text("Distance");
		Text txtdistance=new Text(distance);
		Text lblfare=new Text("Fare");
		Text txtfare=new Text(fare);
		
		Button back=new Button("Back");
		
		Text sug=new Text("These above buses will drop you at Saddar");
		Text sug2=new Text("then you will must join these buses as follows");
		
		hbox1.getChildren().addAll(h16,g3);
		vbox.getChildren().addAll(sug,sug2);
		
		Text h4=new Text("H-4");
		Text m14=new Text("M-14");
		Text f11=new Text("F-11");
		
		h16.setStyle("-fx-font-size:40px;");
		g3.setStyle("-fx-font-size:40px;");
		lbldistance.setStyle("-fx-font-size:30px;");
		txtdistance.setStyle("-fx-font-size:30px;");
		lblfare.setStyle("-fx-font-size:40px;");
		txtfare.setStyle("-fx-font-size:40px;");
		sug.setStyle("-fx-font-size:30px;");
		sug2.setStyle("-fx-font-size:30px;");
	    h4.setStyle("-fx-font-size:30px;");
		m14.setStyle("-fx-font-size:30px;");
		f11.setStyle("-fx-font-size:40px;");
		hbox.getChildren().addAll(h4,m14,f11);
		
		h16.setStroke(Color.CADETBLUE);
		g3.setStroke(Color.CADETBLUE);
		lbldistance.setStroke(Color.CADETBLUE);
		txtdistance.setStroke(Color.CADETBLUE);
		lblfare.setStroke(Color.CADETBLUE);
		txtfare.setStroke(Color.CADETBLUE);
		sug.setStroke(Color.CADETBLUE);
		sug2.setStroke(Color.CADETBLUE);
		h4.setStroke(Color.CADETBLUE);
		m14.setStroke(Color.CADETBLUE);
		f11.setStroke(Color.CADETBLUE);
		
		hbox2.getChildren().addAll(lbldistance,txtdistance);
		hbox3.getChildren().addAll(lblfare,txtfare);
		
		vboxf.getChildren().addAll(hbox,vbox,hbox1,hbox2,hbox3,back);
		
		scene=new Scene(vboxf);
		Routes.stage.setScene(scene);
		
		back.setOnAction(x->{
			
			Routes.stage.setScene(Routes.scene);
		});
		
	}	
	else if(pick.equals("Mazar-e-Quaid")&& drop.equals("Korangi")||drop.equals("Landhi"))
	{
		
		if(pick.equals("Mazar-e-Quaid")&& drop.equals("Korangi"))
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
		else
		{
			distance ="8";
			int a=Integer.parseInt(distance);
			int b=(a*3);
			fare=String.valueOf(b);
		}
			
		
		HBox hbox =new HBox(10);
		hbox.setAlignment(Pos.CENTER);
		HBox hbox1=new HBox(10);
		hbox1.setAlignment(Pos.CENTER);
		VBox vbox =new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		VBox vboxf=new VBox(10);
		vboxf.setAlignment(Pos.CENTER);
		
		Image img=new Image("file:///C:/Users/Niaz%20Baig/workspace/OurProject/New/info.jpg");
		vboxf.setBackground(new Background(new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		Text h16=new Text("H-16");
		Text g3=new Text("G-3");
		Text lbldistance=new Text("Distance");
		Text txtdistance=new Text(distance);
		Text lblfare=new  Text("Fare");
		Text txtfare=new Text(fare);
		Button back=new Button("Back");
		
		Text sug=new Text("These above buses will drop you at Iqra university");
		Text sug2=new Text("then you will must join these buses as follows");
		

		hbox1.getChildren().addAll(h16,g3);
		hbox.getChildren().addAll(sug,sug2);

		Text h4=new Text("H-4");
		Text m14=new Text("M-14");
		Text f11=new Text("F-11");
		

		h16.setStyle("-fx-font-size:40px;");
		g3.setStyle("-fx-font-size:40px;");
		lbldistance.setStyle("-fx-font-size:30px;");
		txtdistance.setStyle("-fx-font-size:30px;");
		lblfare.setStyle("-fx-font-size:40px;");
		txtfare.setStyle("-fx-font-size:40px;");
		sug.setStyle("-fx-font-size:30px;");
		sug2.setStyle("-fx-font-size:30px;");
	    h4.setStyle("-fx-font-size:30px;");
		m14.setStyle("-fx-font-size:30px;");
		f11.setStyle("-fx-font-size:40px;");
		
		h16.setStroke(Color.CADETBLUE);
		g3.setStroke(Color.CADETBLUE);
		lbldistance.setStroke(Color.CADETBLUE);
		txtdistance.setStroke(Color.CADETBLUE);
		lblfare.setStroke(Color.CADETBLUE);
		txtfare.setStroke(Color.CADETBLUE);
		sug.setStroke(Color.CADETBLUE);
		sug2.setStroke(Color.CADETBLUE);
		h4.setStroke(Color.CADETBLUE);
		m14.setStroke(Color.CADETBLUE);
		f11.setStroke(Color.CADETBLUE);
		hbox.getChildren().addAll(h4,m14,f11);
		
		hbox.getChildren().addAll(h4,m14,f11);
		vboxf.getChildren().addAll(hbox1,vbox,hbox,back,lbldistance,txtdistance,lblfare,txtfare);
		
		scene=new Scene(vboxf);
		Routes.stage.setScene(scene);
		
		back.setOnAction(x->{
			
			Routes.stage.setScene(Routes.scene);
		});
		
	}	
	else 
	{
		Alert alt=new Alert(AlertType.ERROR);
		alt.setContentText("Invalid Location");
		alt.show();
	}
	
	}
	}


