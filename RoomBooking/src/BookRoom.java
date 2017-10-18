
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
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
                System.out.println("Hello World!");
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
