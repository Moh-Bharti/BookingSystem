
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.scene.image.*;
import java.io.*;

abstract class User{
	
}
class Student extends User{
	
}
class Admin extends User{
	
}
class Faculty extends User{
	
}

public class BookRoom extends Application {

	@Override
	public void start(Stage primaryStage)throws Exception {
		primaryStage.setTitle("Booking System");
        Button btn = new Button();
        TextField txt=new TextField();
        Group room=new Group();
        Scene scenario=new Scene(room,400,300,Color.WHEAT);
      //  txt.setId("Search");
        //Image img=new Image((getClass().getResourceAsStream("file:C:/Users/MOH BHARTI/Desktop/Git/BookingSystem/RoomBooking/src/icon21.jpg")));
       Button srch=new Button();
       srch.setText("Search");
        
        btn.setText("Login");
        btn.setOnAction(new EventHandler<ActionEvent>() {
       
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("Hello bombay");
                Stage Dialog=new Dialog(primaryStage);
                Dialog.sizeToScene();
                Dialog.show();
            }
        });
        srch.setOnAction(new EventHandler<ActionEvent>(){
        	@Override
        	public void handle(ActionEvent event){
        		Stage stg=new Stage();
        		Text crs=new Text();
        		crs.setFont(Font.font("new courses",FontWeight.BOLD,FontPosture.REGULAR,20));
        		crs.setText("new Courses");
        		crs.setX(70);
        		crs.setY(70);
        		Group grp=new Group(crs);
        		Scene sc=new Scene(grp,200,200,Color.WHEAT);
        		stg.setTitle("Course Selected");
        		stg.setScene(sc);
        		stg.show();
        	}
        });
        
        StackPane root = new StackPane();
        txt.setTranslateY(-200.0);
        txt.setTranslateX(-300.0);
        srch.setTranslateX(-150.0);
        srch.setTranslateY(-200.0);
        btn.setTranslateY(-290.0);
        btn.setTranslateX(460.0);
        txt.setMaxWidth(250);
        //primaryStage.getIcons().add();
       // root.setPadding(new Insets(100));
        root.getChildren().add(btn);
       root.getChildren().add(srch);
      //  root.getStylesheets().add(this.getClass().getResource("textfield.css").toExternalForm());
        root.getChildren().add(txt);
        
        primaryStage.setScene(new Scene(root, 1000, 625));
        primaryStage.show();
        //primaryStage.setScene(scn);
        //primaryStage.show();
        
	}

	public static void main(String[] args)throws Exception {
		launch(args);
	}
}
class Dialog extends Stage{
	public Dialog(Stage User){
		super();
		initOwner(User);
		setTitle("Login");
		Group root=new Group();
		Scene scene=new Scene(root,250,150,Color.BEIGE);
		setScene(scene);
		
		GridPane gridpane=new GridPane();
		gridpane.setPadding(new Insets(5));
		gridpane.setVgap(5);
		gridpane.setHgap(5);
		
		
		Label user=new Label("LoginId");
		user.setTextFill(Color.DARKRED);
		user.fontProperty();
		gridpane.add(user, 0, 1);
		
		
		Label password=new Label("Password");
		password.setTextFill(Color.DARKRED);
		password.fontProperty();
		gridpane.add(password, 0, 2);
		
		TextField Id=new TextField();
		gridpane.add(Id,1,1);
		
		PasswordField field=new PasswordField();
		gridpane.add(field, 1, 2);
		
		Button login=new Button("OK");
		login.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				close();
				User.close();
				Stage stage=new Stage();
				Group grp=new Group();
				
				
				
			}
		});
		gridpane.add(login,1,3);
		GridPane.setHalignment(login,HPos.RIGHT);
		root.getChildren().add(gridpane);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
