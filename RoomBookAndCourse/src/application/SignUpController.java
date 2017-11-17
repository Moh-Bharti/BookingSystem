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

public class SignUpController {
	@FXML
	private Button m;
	@FXML
	private Button m6;
	@FXML
	private Button m7;

	@FXML
	private PasswordField m1;
	@FXML
	private PasswordField m2;
	@FXML
	private Label m3;
	@FXML
	private TextField m4;
	
	public void AdmSignUp(ActionEvent event){
		
		String email = m4.getText();
		
		String pass = m2.getText();
		String confPass = m1.getText();
		
		if(Main.getAdmEmails().search(email)==true){
			if(confPass.equals(pass)){
				m3.setText("regitered");
				Main.getAdmEmails().Register(email);
			}
			else{
				m3.setText("password mismatch");
			}
		}
		else{
			m3.setText("wrong email/email already registered");
		}
	}
	public void StuSignUp(ActionEvent event){
		
		String email = m4.getText();
		
		String pass = m2.getText();
		String confPass = m1.getText();
		if(Main.getStuEmails().search(email)==true){
			if(confPass.equals(pass)){
				m3.setText("regitered");
				Main.getStuEmails().Register(email);
			}
			else{
				m3.setText("password mismatch");
			}
		}
		else{
			m3.setText("wrong email/email already registered");
		}
	}
public void FacSignUp(ActionEvent event){
		
		String email = m4.getText();
		
		String pass = m2.getText();
		String confPass = m1.getText();
		if(Main.getFacEmails().search(email)==true){
			if(confPass.equals(pass)){
				m3.setText("regitered");
				Main.getFacEmails().Register(email);
				Main.getFacProfs().getFacultyData().add(new FacultyProfile(email, confPass));
				try{
					Main.Save();
				}
				catch(Exception e){
					
				}
			}
			else{
				m3.setText("password mismatch");
			}
		}
		else{
			m3.setText("wrong email/email already registered");
		}
	}
	
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
	
	
	
}
