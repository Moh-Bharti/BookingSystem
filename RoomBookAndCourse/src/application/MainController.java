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

public class MainController {
	@FXML
	private Button bb ;
	@FXML
	private Button logAdmin ;
	@FXML
	private Button logFaculty ;
	@FXML
	private Button logStudent ;
	@FXML
	private TextField em1 ;
	@FXML
	private PasswordField ps1 ;
	@FXML
	private Label Head ;
	
	public void menu(ActionEvent event){
		Stage primaryStage = new Stage();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Open.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			((Node) (event.getSource())).getScene().getWindow().hide();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void FacLogin(ActionEvent event){
		String email = em1.getText();
		String pass = ps1.getText();
		int check = Main.getFacProfs().search(email, pass);
		if(check==-1){
			Head.setText("Wrong Credentials");
		}
		else{
			Stage primaryStage = new Stage();
			try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Faculty.fxml"));
			
			//Parent root = FXMLLoader.load(getClass().getResource("/application/Faculty.fxml"));
			Scene scene = new Scene(loader.load(),600,600);
			//Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			FacultyController controller = loader.<FacultyController>getController();
			controller.start(email,check);
					
			primaryStage.show();
			((Node) (event.getSource())).getScene().getWindow().hide();
		} catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
	
	public void AdmLogin(ActionEvent event){
		String email = em1.getText();
		String pass = ps1.getText();
		int check = Main.getAdmProfs().search(email, pass);
		if(check==-1){
			Head.setText("Wrong Credentials");
		}
		else{
			Stage primaryStage = new Stage();
			try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Admin.fxml"));
			
			//Parent root = FXMLLoader.load(getClass().getResource("/application/Faculty.fxml"));
			Scene scene = new Scene(loader.load(),600,600);
			//Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			AdminController controller = loader.<AdminController>getController();
			controller.start(email,check);
					
			primaryStage.show();
			((Node) (event.getSource())).getScene().getWindow().hide();
		} catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
	public void StuLogin(ActionEvent event){
//To open the page without login credentials make if condition to check == -100		
		String email = em1.getText();
		String pass = ps1.getText();
		int check = Main.getStuProfs().search(email, pass);
		if(check==-1){
			Head.setText("Wrong Credentials");
		}
		else{
			Stage primaryStage = new Stage();
			try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Student.fxml"));
			
			//Parent root = FXMLLoader.load(getClass().getResource("/application/Faculty.fxml"));
			Scene scene = new Scene(loader.load(),600,600);
			//Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			StudentController controller = loader.<StudentController>getController();
			controller.start(email,check);
					
			primaryStage.show();
			((Node) (event.getSource())).getScene().getWindow().hide();
		} catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
}
