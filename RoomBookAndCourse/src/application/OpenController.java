package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class OpenController {
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
	@FXML
	private TextField t2;
	@FXML
	private TextField t3;
	@FXML
	private TextField t4;
	
	public void login(ActionEvent event){
		Stage primaryStage = new Stage();
		try {
		//	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/SignUpPage.fxml"));
			
			Parent root = FXMLLoader.load(getClass().getResource("/application/MainDiagram.fxml"));
			//Scene scene = new Scene(loader.load(),600,600);
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
		//	SignUpController controller = loader.<SignUpController>getController();
		//	controller.trial();
					
			primaryStage.show();
			((Node) (event.getSource())).getScene().getWindow().hide();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void signup(ActionEvent event){
		Stage primaryStage = new Stage();
		try {
		//	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/SignUpPage.fxml"));
			
			Parent root = FXMLLoader.load(getClass().getResource("/application/SignUpPage.fxml"));
			//Scene scene = new Scene(loader.load(),600,600);
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
		//	SignUpController controller = loader.<SignUpController>getController();
		//	controller.trial();
					
			primaryStage.show();
			((Node) (event.getSource())).getScene().getWindow().hide();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
