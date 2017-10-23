package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Booking System");
        Button btnLogin = new Button();
        Button btnSignUp = new Button();
        Group room=new Group();
        btnLogin.setText("Login");
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
        
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello bombay");
                Stage Dialog=new DialogLogin(primaryStage);
                Dialog.sizeToScene();
                Dialog.show();
            }
        });
        btnSignUp.setText("Sign Up");
        btnSignUp.setOnAction(new EventHandler<ActionEvent>() {
        
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello bombay");
                Stage Dialog=new DialogSignUP(primaryStage);
                Dialog.sizeToScene();
                Dialog.show();
            }
        });
        
        StackPane root = new StackPane();
        btnLogin.setTranslateY(-250.0);
        btnLogin.setTranslateX(-300.0);
        btnSignUp.setTranslateY(-300.0);
        btnSignUp.setTranslateX(-300.0);
       // root.setPadding(new Insets(100));
        root.getChildren().add(btnLogin);
        root.getChildren().add(btnSignUp);

        Scene scenario=new Scene(root,1500,700,Color.WHEAT);
        primaryStage.setScene(scenario);
        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
class DialogLogin extends Stage{
	public DialogLogin(Stage User){
		super();
		initOwner(User);
		setTitle("Login Page");
		Group root=new Group();
		Scene scene=new Scene(root,500,400,Color.ORANGE);
		setScene(scene);
		
		GridPane gridpane=new GridPane();
		gridpane.setPadding(new Insets(5));
		gridpane.setVgap(5);
		gridpane.setHgap(5);
		
		Label user=new Label("Email Id");
		user.fontProperty();
		gridpane.add(user, 0, 1);
		
		Label password=new Label("Password");
		gridpane.add(password, 0, 2);
		
		TextField Id=new TextField();
		gridpane.add(Id,1,1);
		
		PasswordField field=new PasswordField();
		gridpane.add(field, 1, 2);
		
		Button login=new Button("Login");
		login.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				close();
			}
		});
		gridpane.add(login,1,3);
		GridPane.setHalignment(login,HPos.RIGHT);
		root.getChildren().add(gridpane);
	}
	
}
	
class DialogSignUP extends Stage{
		public DialogSignUP(Stage User){
			super();
			initOwner(User);
			setTitle("SignUp Page");
			Group root=new Group();
			Scene scene=new Scene(root,500,400,Color.ORANGE);
			setScene(scene);
			
			GridPane gridpane=new GridPane();
			gridpane.setPadding(new Insets(5));
			gridpane.setVgap(5);
			gridpane.setHgap(5);
			
			Label user=new Label("Email Id");
			user.fontProperty();
			gridpane.add(user, 0, 1);
			
			Label password=new Label("Password");
			gridpane.add(password, 0, 2);
			
			Label Confirmpassword=new Label("ReEnter Password");
			gridpane.add(Confirmpassword, 0, 3);
			
			TextField Id=new TextField();
			gridpane.add(Id,1,1);
			
			PasswordField field=new PasswordField();
			gridpane.add(field, 1, 2);
			
			PasswordField field2=new PasswordField();
			gridpane.add(field2, 1, 3);
			
			Button login=new Button("Sign Up");
			login.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent event){
					close();
				}
			});
			gridpane.add(login,1,4);
			GridPane.setHalignment(login,HPos.RIGHT);
			root.getChildren().add(gridpane);
		}
	
	}











