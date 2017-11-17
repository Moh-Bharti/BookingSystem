package application;
	
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
/*	public static StudentEmails StuEmails;
	public static AdminEmails AdmEmails;
	public static FacultyEmails FacEmails;
	public static TimeTable MainTimeTable;
	public static FacultyDataBase FacProfs;
	public static AdminDataBase AdmProfs;
	public static StudentDataBase StuProfs;
	
	public static AllRoom AllRooms;
	
	public static void Save()throws IOException,FileNotFoundException{
		FacEmailsSerialize("FEmails", FacEmails);
		StuEmailsSerialize("SEmails", StuEmails);
		AdmEmailsSerialize("AEmails", AdmEmails);
		FacDataSerialize("FData", FacProfs);
		StuDataSerialize("SData", StuProfs);
		AdmDataSerialize("AData", AdmProfs);
	}
	
	*/
	
	@Override
	public void start(Stage primaryStage) {
		
		 
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/TimeTable.fxml"));
			Scene scene = new Scene(root,900,900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		/*StudentEmails StuEmails = new StudentEmails();
		StuEmails.addEmail("student1@iiitd.ac.in");
		StuEmails.addEmail("student2@iiitd.ac.in");
		StuEmails.addEmail("student3@iiitd.ac.in");
		StuEmails.addEmail("student4@iiitd.ac.in");
		StuEmails.addEmail("student5@iiitd.ac.in");
		StuEmailsSerialize("SEmails", StuEmails);
		AdminEmails AdmEmails = new AdminEmails();
		AdmEmails.addEmail("admin1@iiitd.ac.in");
		AdmEmails.addEmail("admin2@iiitd.ac.in");
		AdmEmails.addEmail("admin3@iiitd.ac.in");
		AdmEmails.addEmail("admin4@iiitd.ac.in");
		AdmEmails.addEmail("admin5@iiitd.ac.in");
		AdmEmailsSerialize("AEmails", AdmEmails);
		FacultyEmails FacEmails = new FacultyEmails();
		FacEmails.addEmail("faculty1@iiitd.ac.in");
		FacEmails.addEmail("faculty2@iiitd.ac.in");
		FacEmails.addEmail("faculty3@iiitd.ac.in");
		FacEmails.addEmail("faculty4@iiitd.ac.in");
		FacEmails.addEmail("faculty5@iiitd.ac.in");
		FacEmailsSerialize("FEmails", FacEmails);
		FacProfs = new FacultyDataBase();
		FacDataSerialize("FData", FacProfs);
		StuProfs = new StudentDataBase();
		StuDataSerialize("SData", StuProfs);
		AdmProfs = new AdminDataBase();
		AdmDataSerialize("AData", AdmProfs);
		AllRooms = new AllRoom();
		AllRooms.getRooms().add(new Room("C01",150));
		AllRooms.getRooms().add(new Room("C02",50));
		AllRooms.getRooms().add(new Room("C03",50));
		AllRooms.getRooms().add(new Room("C11",150));
		AllRooms.getRooms().add(new Room("C12",50));
		AllRooms.getRooms().add(new Room("C13",50));
		AllRooms.getRooms().add(new Room("C21",150));
		AllRooms.getRooms().add(new Room("C22",50));
		AllRooms.getRooms().add(new Room("C23",50));
		AllRooms.getRooms().add(new Room("C24",150));
		AllRooms.getRooms().add(new Room("LR1",40));
		AllRooms.getRooms().add(new Room("LR2",40));
		AllRooms.getRooms().add(new Room("LR3",30));
		AllRooms.getRooms().add(new Room("S01",70));
		AllRooms.getRooms().add(new Room("S02",70));
		AllRoomDataSerialize("AllRoomData", AllRooms);
		
		AllRooms = AllRoomDataDeserialize("AllRoomData");
		StuEmails = StuEmailsDeserialize("SEMails");
		AdmEmails = AdmEmailsDeserialize("AEMails");
		FacEmails = FacEmailsDeserialize("FEMails");
		try{
			FacProfs = FacDataDeserialize("FData");
		}
		catch(Exception e){
			FacProfs = new FacultyDataBase();
		}
		try{
			StuProfs = StuDataDeserialize("FData");
		}
		catch(Exception e){
			StuProfs = new StudentDataBase();
		}
		try{
			AdmProfs = AdmDataDeserialize("FData");
		}
		catch(Exception e){
			AdmProfs = new AdminDataBase();
		}*/
	/*	String CoursesDataRead = "C:\\Users\\AJAY KUMAR\\workspace\\Tutorials\\src\\ReadCourseData.csv";
		String line = "";
		String delimeter = ",";
		MainTimeTable = new TimeTable();
		try(BufferedReader br = new BufferedReader(new FileReader(CoursesDataRead))){
			int counter = 0;
			while((line=br.readLine())!=null){
			if(counter==0){
				counter++;
			}
			else{
				String[] c = line.split(delimeter);
				if(c.length<2){
					
				}
				else{
					MainTimeTable.getCourseData().add(new courses(c[0],c[1],c[2],c[3],c[4],c[5],c[6],c[7],c[8],c[8],c[10],c[11],c[12],c[13],c[14]));

				}
				//String S = c[0]+","+c[1]+","+c[2]+","+c[3]+","+c[4]+","+c[5]+","+c[6]+","+c[7]+","+c[8]+","+c[9]+","+c[10]+c[11]+","+c[12]+","+c[13]+","+c[14];

				counter++;
				}
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		/*System.out.println("working");
		if(StuEmails.search("student4@iiitd.ac.in")==true){
			System.out.println("dzvfzsdfhsdjkflzdskhfakjsdhing");
		}*/
		
		launch(args);
	}
	
}
	/*public static StudentEmails StuEmailsDeserialize(String SEmails) throws IOException,ClassNotFoundException{
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream( new FileInputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+SEmails+".txt"));
			return (StudentEmails) in.readObject();
		}
		finally{
			in.close();
		}
	}
	public static void StuEmailsSerialize(String SEmails,StudentEmails PSerialize)throws IOException{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+SEmails+".txt"));
			out.writeObject(PSerialize);
		}
		finally{
			out.close();
		}
		
		
	}
	
	public static StudentDataBase StuDataDeserialize(String SData) throws IOException,ClassNotFoundException{
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream( new FileInputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+SData+".txt"));
			return (StudentDataBase) in.readObject();
		}
		finally{
			in.close();
		}
	}
	public static void StuDataSerialize(String SData,StudentDataBase PSerialize)throws IOException{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+SData+".txt"));
			out.writeObject(PSerialize);
		}
		finally{
			out.close();
		}
		
		
	}
	
	public static StudentEmails getStuEmails() {
		return StuEmails;
	}

	public static void setStuEmails(StudentEmails stuEmails) {
		StuEmails = stuEmails;
	}
	
	

	public static StudentDataBase getStuProfs() {
		return StuProfs;
	}



	public static void setStuProfs(StudentDataBase stuProfs) {
		StuProfs = stuProfs;
	}



	public static AdminEmails AdmEmailsDeserialize(String AEmails) throws IOException,ClassNotFoundException{
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream( new FileInputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+AEmails+".txt"));
			return (AdminEmails) in.readObject();
		}
		finally{
			in.close();
		}
	}
	public static void AdmEmailsSerialize(String AEmails,AdminEmails PSerialize)throws IOException{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+AEmails+".txt"));
			out.writeObject(PSerialize);
		}
		finally{
			out.close();
		}
		
		
	}
	public static AdminDataBase AdmDataDeserialize(String AData) throws IOException,ClassNotFoundException{
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream( new FileInputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+AData+".txt"));
			return (AdminDataBase) in.readObject();
		}
		finally{
			in.close();
		}
	}
	public static void AdmDataSerialize(String AData,AdminDataBase PSerialize)throws IOException{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+AData+".txt"));
			out.writeObject(PSerialize);
		}
		finally{
			out.close();
		}
		
		
	}

	public static AdminEmails getAdmEmails() {
		return AdmEmails;
	}

	public static void setAdmEmails(AdminEmails admEmails) {
		AdmEmails = admEmails;
	
	}
	
	
	public static AdminDataBase getAdmProfs() {
		return AdmProfs;
	}



	public static void setAdmProfs(AdminDataBase admProfs) {
		AdmProfs = admProfs;
	}



	public static FacultyEmails FacEmailsDeserialize(String FEmails) throws IOException,ClassNotFoundException{
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream( new FileInputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+FEmails+".txt"));
			return (FacultyEmails) in.readObject();
		}
		finally{
			in.close();
		}
	}
	public static void FacEmailsSerialize(String FEmails,FacultyEmails PSerialize)throws IOException{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+FEmails+".txt"));
			out.writeObject(PSerialize);
		}
		finally{
			out.close();
		}
		
		
	}
	
	public static FacultyDataBase FacDataDeserialize(String FData) throws IOException,ClassNotFoundException{
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream( new FileInputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+FData+".txt"));
			return (FacultyDataBase) in.readObject();
		}
		finally{
			in.close();
		}
	}
	public static void FacDataSerialize(String FData,FacultyDataBase PSerialize)throws IOException{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+FData+".txt"));
			out.writeObject(PSerialize);
		}
		finally{
			out.close();
		}
		
		
	}

	public static FacultyEmails getFacEmails() {
		return FacEmails;
	}

	public static void setFacEmails(FacultyEmails facEmails) {
		FacEmails = facEmails;
	
	}

	public static FacultyDataBase getFacProfs() {
		return FacProfs;
	}

	public static void setFacProfs(FacultyDataBase facProfs) {
		FacProfs = facProfs;
	}
	
	public static AllRoom AllRoomDataDeserialize(String AllRoomData) throws IOException,ClassNotFoundException{
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream( new FileInputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+AllRoomData+".txt"));
			return (AllRoom) in.readObject();
		}
		finally{
			in.close();
		}
	}
	public static void AllRoomDataSerialize(String AllRoomData,AllRoom PSerialize)throws IOException{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\AJAY KUMAR\\workspace\\Statis Gui\\src\\application\\"+AllRoomData+".txt"));
			out.writeObject(PSerialize);
		}
		finally{
			out.close();
		}
		
		
	}
	
}


//------------------------------------------------Student Related Stuff------------------------------
class Student implements Serializable{
	private String Email;
	private int emlExist=0;
	Student(String em){
		this.Email = em;

	}
	public void Signup(){
		this.emlExist=1;
	}
	public int getEmlExist() {
		return emlExist;
	}
	public void setEmlExist(int emlExist) {
		this.emlExist = emlExist;
	}
	public String getEmail() {
		return Email;
	}
	
}



class StudentEmails implements Serializable{
	ArrayList Emails;
	StudentEmails() {
		this.Emails = new ArrayList<Student>();
	}
	public void addEmail(String em){
		this.Emails.add(new Student(em));
	}
	public Boolean search(String em){
		int len = Emails.size();
		for(int i = 0 ; i < len ; i++){
			if(em.equals(((Student)(Emails.get(i))).getEmail()) && ((Student)(Emails.get(i))).getEmlExist()==0){
				return true;
			}
		}
		return false;
//print wrong email or already registered
	}
	public void Register(String em){
		int len = Emails.size();
		for(int i = 0 ; i < len ; i++){
			if(em.equals(((Student)(Emails.get(i))).getEmail()) && ((Student)(Emails.get(i))).getEmlExist()==0){
				((Student)(Emails.get(i))).setEmlExist(1);
			}
		}
	}
	
}

class StudentProfile implements Serializable{
	String PassWord;
	ArrayList Courses;
	String Email;
	
	StudentProfile(String em,String pass){
		this.Email = em;
		this.PassWord = pass;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public ArrayList getCourses() {
		return Courses;
	}
	public void setCourses(ArrayList courses) {
		Courses = courses;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
}


class StudentDataBase implements Serializable{
	private ArrayList StudentData;
	StudentDataBase(){
		this.StudentData = new ArrayList<StudentProfile>();
	}
	public ArrayList getStudentData() {
		return StudentData;
	}
	public void setAdminData(ArrayList studentData) {
		StudentData = studentData;
	}
	public int search(String email,String pass){
		int ret = -1;
		int len = StudentData.size(); 
		for(int i = 0 ; i < len ; i++){
			if(((StudentProfile)StudentData.get(i)).getEmail().equals(email) && ((StudentProfile)StudentData.get(i)).getPassWord().equals(pass)){
				return i ;
			}
		}
		return ret;
	}
	
}
//------------------------------------------------Admin Related Stuff------------------------------
class Admin implements Serializable{
	private String Email;
	private int emlExist=0;
	Admin(String em){
		this.Email = em;

	}
	public void Signup(){
		this.emlExist=1;
	}
	public int getEmlExist() {
		return emlExist;
	}
	public void setEmlExist(int emlExist) {
		this.emlExist = emlExist;
	}
	public String getEmail() {
		return Email;
	}
	
}



class AdminEmails implements Serializable{
	ArrayList Emails;
	AdminEmails() {
		this.Emails = new ArrayList<Admin>();
	}
	public void addEmail(String em){
		this.Emails.add(new Admin(em));
	}
	public Boolean search(String em){
		int len = Emails.size();
		for(int i = 0 ; i < len ; i++){
			if(em.equals(((Admin)(Emails.get(i))).getEmail()) && ((Admin)(Emails.get(i))).getEmlExist()==0){
				return true;
			}
		}
		return false;
//print wrong email or already registered
	}
	public void Register(String em){
		int len = Emails.size();
		for(int i = 0 ; i < len ; i++){
			if(em.equals(((Admin)(Emails.get(i))).getEmail()) && ((Admin)(Emails.get(i))).getEmlExist()==0){
				((Admin)(Emails.get(i))).setEmlExist(1);
			}
		}
	}
}

class AdminProfile implements Serializable{
	String PassWord;
	ArrayList Courses;
	String Email;
	AdminProfile(String em,String pass){
		this.Email = em;
		this.PassWord = pass;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public ArrayList getCourses() {
		return Courses;
	}
	public void setCourses(ArrayList courses) {
		Courses = courses;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
}


class AdminDataBase implements Serializable{
	private ArrayList AdminData;
	AdminDataBase(){
		this.AdminData = new ArrayList<AdminProfile>();
	}
	public ArrayList getAdminData() {
		return AdminData;
	}
	public void setAdminData(ArrayList adminData) {
		AdminData = adminData;
	}
	public int search(String email,String pass){
		int ret = -1;
		int len = AdminData.size(); 
		for(int i = 0 ; i < len ; i++){
			if(((AdminProfile)AdminData.get(i)).getEmail().equals(email) && ((AdminProfile)AdminData.get(i)).getPassWord().equals(pass)){
				return i ;
			}
		}
		return ret;
	}
	
}
//------------------------------------------------Faculty Related Stuff------------------------------
class Faculty implements Serializable{
	private String Email;
	private int emlExist=0;
	Faculty(String em){
		this.Email = em;

	}
	public void Signup(){
		this.emlExist=1;
	}
	public int getEmlExist() {
		return emlExist;
	}
	public void setEmlExist(int emlExist) {
		this.emlExist = emlExist;
	}
	public String getEmail() {
		return Email;
	}
	
}



class FacultyEmails implements Serializable{
	ArrayList Emails;
	FacultyEmails() {
		this.Emails = new ArrayList<Faculty>();
	}
	public void addEmail(String em){
		this.Emails.add(new Faculty(em));
	}
	public Boolean search(String em){
		int len = Emails.size();
		for(int i = 0 ; i < len ; i++){
			if(em.equals(((Faculty)(Emails.get(i))).getEmail()) && ((Faculty)(Emails.get(i))).getEmlExist()==0){
				return true;
			}
		}
		return false;
//print wrong email or already registered
	}
	public void Register(String em){
		int len = Emails.size();
		for(int i = 0 ; i < len ; i++){
			if(em.equals(((Faculty)(Emails.get(i))).getEmail()) && ((Faculty)(Emails.get(i))).getEmlExist()==0){
				((Faculty)(Emails.get(i))).setEmlExist(1);
			}
		}
	}
}

class FacultyProfile implements Serializable{
	String PassWord;
	ArrayList Courses;
	String Email;
	FacultyProfile(String em,String pass){
		this.Email = em;
		this.PassWord = pass;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public ArrayList getCourses() {
		return Courses;
	}
	public void setCourses(ArrayList courses) {
		Courses = courses;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
}


class FacultyDataBase implements Serializable{
	private ArrayList FacultyData;
	FacultyDataBase(){
		this.FacultyData = new ArrayList<FacultyProfile>();
	}
	public ArrayList getFacultyData() {
		return FacultyData;
	}
	public void setFacultyData(ArrayList facultyData) {
		FacultyData = facultyData;
	}
	public int search(String email,String pass){
		int ret = -1;
		int len = FacultyData.size(); 
		for(int i = 0 ; i < len ; i++){
			if(((FacultyProfile)FacultyData.get(i)).getEmail().equals(email) && ((FacultyProfile)FacultyData.get(i)).getPassWord().equals(pass)){
				return i ;
			}
		}
		return ret;
	}
	
}*/
//--------------------------------------------------------------------------------------------------------------------
class DayAndTime implements Serializable{
	private String day;
	private String start;
	private String end;
	public DayAndTime(String d,String s,String e) {
		this.day = d;
		this.start = s;
		this.end = e;
	}
}
class Room implements Serializable{
	String RoomNo;
	private int capacity;
	Room(String roomno,int cap){
		this.RoomNo = roomno;
		this.capacity = cap;
	}
	public String getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(String roomNo) {
		RoomNo = roomNo;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
class courses implements Serializable{
	private String CourseName;
	private String CourseCode;
	private String preConditions;
	private String postConditions;
	private String CourseType;
	private String Credits;
	private String Acronym;
	private HashMap<String,String> lec;
	private HashMap<String,String> Tut;
	private HashMap<String,String> Lab;
	private String Instructor;
	
	public courses(String typ,String CN,String CC,String instr,String Cred,String Acrym,HashMap<String,String> lec,String tut,String lab,String pre,String post) {
		this.CourseType = typ;
		this.CourseName = CN;
		this.CourseCode = CC;
		this.Instructor = instr;
		this.Acronym = Acrym;
		this.lec=lec;
		this.Lab = lab;
		this.Tut = tut;
		this.preConditions = pre;
		this.postConditions = post;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getCourseCode() {
		return CourseCode;
	}
	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}
	public String getPreConditions() {
		return preConditions;
	}
	public void setPreConditions(String preConditions) {
		this.preConditions = preConditions;
	}
	public String getPostConditions() {
		return postConditions;
	}
	public void setPostConditions(String postConditions) {
		this.postConditions = postConditions;
	}
	public String getCourseType() {
		return CourseType;
	}
	public void setCourseType(String courseType) {
		CourseType = courseType;
	}
	public String getCredits() {
		return Credits;
	}
	public void setCredits(String credits) {
		Credits = credits;
	}
	public String getAcronym() {
		return Acronym;
	}
	public void setAcronym(String acronym) {
		Acronym = acronym;
	}
	public String getMon() {
		return Mon;
	}
	public void setMon(String mon) {
		Mon = mon;
	}
	public String getTue() {
		return Tue;
	}
	public void setTue(String tue) {
		Tue = tue;
	}
	public String getWed() {
		return Wed;
	}
	public void setWed(String wed) {
		Wed = wed;
	}
	public String getThur() {
		return Thur;
	}
	public void setThur(String thur) {
		Thur = thur;
	}
	public String getFri() {
		return Fri;
	}
	public void setFri(String fri) {
		Fri = fri;
	}
	
	public String getTut() {
		return Tut;
	}
	public void setTut(String tut) {
		Tut = tut;
	}
	public String getLab() {
		return Lab;
	}
	public void setLab(String lab) {
		Lab = lab;
	}
	public String getInstructor() {
		return Instructor;
	}
	public void setInstructor(String instructor) {
		Instructor = instructor;
	}
		
}
class TimeTable implements Serializable{
	private ArrayList CourseData;
	TimeTable(){
		this.CourseData = new ArrayList<courses>();
	}
	public ArrayList getCourseData() {
		return CourseData;
	}
	public void setCourseData(ArrayList courseData) {
		CourseData = courseData;
	}
	
}
class AllRoom implements Serializable{
	private ArrayList rooms;
	AllRoom(){
		rooms = new ArrayList<Room>();
	}
	public ArrayList getRooms() {
		return rooms;
	}
	public void setRooms(ArrayList rooms) {
		this.rooms = rooms;
	}
	
}
	
	