
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
public class BookRoom extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Booking System");
        Button btn = new Button();
        TextField txt=new TextField();
        
        btn.setText("Say 'Hello Naruto And Goku'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
       
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello bombay");
            }
        });
        
        StackPane root = new StackPane();
        txt.setTranslateY(-200.0);
        txt.setTranslateX(-300.0);
        btn.setTranslateY(-200.0);
        btn.setTranslateX(-30.0);
        txt.setMaxWidth(300);
       // root.setPadding(new Insets(100));
        root.getChildren().add(btn);
        
        root.getChildren().add(txt);
        primaryStage.setScene(new Scene(root, 1000, 625));
        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
class Dialog extends Stage{
	public Dialog(Stage User){
		super();
		initOwner(User);
		setTitle("Username And Password");
		Group root=new Group();
		Scene scene=new Scene(root,220,400,Color.BLUE);
		setScene(scene);
		
		GridPane gridpane=new GridPane();
		gridpane.setPadding(new Insets(5));
		gridpane.setVgap(5);
		gridpane.setHgap(5);
		
		Label user=new Label("LoginId");
		gridpane.add(user, 0, 1);
		
		Label password=new Label("Password");
		gridpane.add(password, 0, 2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
