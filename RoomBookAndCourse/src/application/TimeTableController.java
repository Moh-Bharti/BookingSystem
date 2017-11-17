package application;

import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.*;
import java.net.*;

class Cou{
	String Code;
	String Acro;
	String Start;
	String end;
	String room;
	String day;
	Cou(){
		
	}
}

public class TimeTableController implements Initializable {
	@FXML
	private Label[][] L;
	
	
	
	@FXML
	private GridPane g;
	public int[] findtime(courses a) {
		HashMap<String,Integer> tim=new HashMap<String,Integer>();
		tim.put("8:30", 1);tim.put("9:00", 2);tim.put("9:30", 3);tim.put("10:00", 4);
		tim.put("10:30", 5);tim.put("11:00", 6);tim.put("11:30", 7);tim.put("12:00", 8);
		tim.put("12:30", 9);tim.put("1:00", 10);tim.put("1:30", 11);tim.put("2:00", 12);
		tim.put("2:30", 13);tim.put("3:00", 14);tim.put("3:30", 15);tim.put("4:00", 16);
		tim.put("4:30", 17);tim.put("5:00", 18);
		int s=0;
		int e=0;
		int[] f=new int[3];
		
			if(a.day.equals("Monday")) {
				String q=a.Start;
				String w=a.end;
				s=s+tim.get(q);
				e=e+tim.get(w);
				f[0]=1;
				f[1]=s;
				f[2]=e;
				
			}
			else if(a.day.equals("Tuesday")) {
				String q=a.Start;
				String w=a.end;
				s=s+tim.get(q);
				e=e+tim.get(w);
				f[0]=2;
				f[1]=s;
				f[2]=e;
				
			}
			else if(a.day.equals("Wednesday")) {
				String q=a.Start;
				String w=a.end;
				s=s+tim.get(q);
				e=e+tim.get(w);
				f[0]=3;
				f[1]=s;
				f[2]=e;
				
			}
			else if(a.day.equals("Thursday")) {
				String q=a.Start;
				String w=a.end;
				s=s+tim.get(q);
				e=e+tim.get(w);
				f[0]=4;
				f[1]=s;
				f[2]=e;
				
			}
			else  {
				String q=a.Start;
				String w=a.end;
				s=s+tim.get(q);
				e=e+tim.get(w);
				f[0]=5;
				f[1]=s;
				f[2]=e;
				
}
			
			
		
		return f;
	}
	List<courses> d=new ArrayList<courses>();
	@Override
	public void initialize(URL location, ResourceBundle resource) {
		
		
		Cou p=new Cou();
		p.Acro="DM";
		p.Code="MTH";
		p.day="Monday";
		p.Start="10:30";
		p.end="11:30";
		addLabel(p);
	}
	public void addLabel(courses a) {
		int[] w=new int[3];
		w=findtime(a);
		int x=w[0];
		int y=w[1];
		int z=w[2];
		
		L=new Label[19][6];
		for(int i=1;i<=18;i++) {
			for(int j=1;j<=5;j++) {
				L[i][j]=new Label();
				//L[i][j].setText("Havanna");
				g.add(L[i][j], i, j);
				
			}
		}
		for(int i=1;i<=18;i++) {
			for(int j=1;j<=5;j++) {
		if(j==x) {
			for(int k=y;k<z;k++) {
				
				L[k][x].setText(a.Code);
				L[k][x].setTextFill(Color.RED);
		}
			}
			}
		}
		
		
		}
				
		
		
	
		
	

}
