package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudentController {
	private int EmailNo;
	@FXML
	private Button b1;
	@FXML
	private Button b2;
	@FXML
	private Button b3;
	@FXML
	private Button b4;
	@FXML
	private Button b5;
	@FXML
	private Button b6;
	@FXML
	private Button b7;
	@FXML
	private Button b8;
	@FXML
	private Label l1;
	@FXML
	private TextField t1;

	public void start(String head,int no){
		l1.setText(head);
		this.EmailNo = no;
	}

	public void SignOut(ActionEvent event){
		Stage primaryStage = new Stage();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Open.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			((Node) (event.getSource())).getScene().getWindow().hide();
		}
		catch(Exception e) {
		e.printStackTrace();
		}
	}

}
