package com.basics;

public class Student1 {
	int sid;
	String sname;
	
	static int collegeId;
	static String collegeName;

	public static void main(String[] args) {
	Student1 yesu = new Student1();
				
collegeId=101;
collegeName="DNR";
			
yesu.sid=32;
yesu.sname="yesu";
System.out.println("*********object1 info *******");
System.out.println("College ID :" + collegeId);
System.out.println("College Name : " + collegeName);
System.out.println("Student ID : " + yesu.sid);
System.out.println("Student Name : " + yesu.sname);
		
Student1 seshu = new Student1();
seshu.sid=33;
seshu.sname="seshu";
System.out.println("**********object2 info*********");
System.out.println("College ID :" + collegeId);
System.out.println("College Name : " + collegeName);
System.out.println("Student ID : " + seshu.sid);
System.out.println("Student Name : " + seshu.sname);

Student1 paparao = new Student1();
paparao.sid=34;
paparao.sname="paparao";
System.out.println("***********object3 info**********");
System.out.println("College ID :" + collegeId);
System.out.println("College Name : " + collegeName);
System.out.println("Student ID : " + paparao.sid);
System.out.println("Student Name : " + paparao.sname);

Student1 sai = new Student1();
collegeId=102;
collegeName="PNR";
			
sai.sid=35;
sai.sname="sai";
System.out.println("*********object4 info *******");
System.out.println("College ID :" + collegeId);
System.out.println("College Name : " + collegeName);
System.out.println("Student ID : " + sai.sid);
System.out.println("Student Name : " + sai.sname);

Student1 murali = new Student1();
			
murali.sid=35;
murali.sname="murali";
System.out.println("*********object5 info *******");
System.out.println("College ID :" + collegeId);
System.out.println("College Name : " + collegeName);
System.out.println("Student ID : " + murali.sid);
System.out.println("Student Name : " + murali.sname);








	}

}
