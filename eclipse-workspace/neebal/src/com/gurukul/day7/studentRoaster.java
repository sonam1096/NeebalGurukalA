package com.gurukul.day7;

import java.util.*;

	 

class Course{
			int semester;
			String courseName,courseId;
			Course(){}
			public Course(int semester , String courseName, String courseId) {
				super();
				this.courseId = courseId;
				this.courseName = courseName;
				this.semester = semester;
			}
			
			public int getSemester() {
				return semester;
			}
			public void setSemester(int semester) {
				this.semester = semester;
			}
			public String getCourseName() {
				return courseName;
			}
			public void setCourseName(String courseName) {
				this.courseName = courseName;
			}
			public String getCourseId() {
				return courseId;
			}
			public void setCourseId(String courseId) {
				this.courseId = courseId;
			}
			

			@Override
			public String toString() {
				return "course [courseId=" + courseId + ", courseName=" + courseName + ", semester=" + semester + "]";
			}
			
			
		}
class Student{
			int studentId;
			String studentName;
			ArrayList<Course> listCourse;
			
			public ArrayList<Course> getListCourse() {
				return listCourse;
			}
		
			Student(){}
			public Student(int studentId, String studentName ) {
				super();
				this.studentId = studentId;
				this.studentName = studentName;
				this.listCourse = new ArrayList<>();
			}
			public int getStudentId() {
				return studentId;
			}
			public void setStudentId(int studentId) {
				this.studentId = studentId;
			}
			public String getStudentName() {
				return studentName;
			}
			public void setStudentName(String studentName) {
				this.studentName = studentName;
			}
			void setCourse(Course c) {
			listCourse.add(c);			}
			@Override
			public String toString() {
				return "Student [studentId=" + studentId + ", studentName=" + studentName + ", listCourse=" + listCourse + "]";
  }
			
			
			
			
			
}
		 
public class studentRoaster {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				ArrayList<Course> cou=new ArrayList<>();
				ArrayList<Student>stud =new ArrayList<>();
				
				Scanner sc=new Scanner(System.in);
				int number=sc.nextInt();
				System.out.println("Options");
				String s=sc.nextLine();
			    int studId=1;
				
				
				while(s=="yes")
				{
				System.out.println("1.Add a new student to the roster");
				System.out.println("2.Enrol a student in a course.");
				System.out.println("3.Display the list of courses a Student is enrolled in");
				System.out.println("4.Display the list of all Student in the roster along with their ID and enrolled courses");
				System.out.println("5.Remove the Student From the list using the given ID");
				System.out.println("6.Exit the program");
				System.out.println("Enter the option:");
				int ch= sc.nextInt();
				
				switch(ch)
				{
				case 1:
						System.out.println("Enter Student name :");
						String n=sc.nextLine();
						Student s1=new Student(studId,n);
						stud.add(s1);
						System.out.println("Name"+n+"\tStudent id"+s1);
						studId++;
						break;
				case 2:		
						
						System.out.println("Name of courses :");
						System.out.println("1.BE ");
						System.out.println("2.BBA");
						System.out.println("3.BCA");
						System.out.println("4.BCom");
						System.out.println("5.BBM");
						System.out.println("6.BA");
						System.out.println("Enter CourseId :"); 
						String CourseId=sc.nextLine();
						System.out.println("Enter Semester :"); 
						int semester=sc.nextInt();
						System.out.println("Enter Course Name :");
						String courseName=sc.nextLine();
						
						Course c1=new Course(semester,courseName,CourseId);
						System.out.println("Enter the Student id");
						int find=sc.nextInt();
						for(int i=0;i<stud.size();i++)
						{	
							if(stud.get(i).getStudentId()==find)
								stud.get(i).setCourse(c1);
						}
						break;
//				case 3:
//					System.out.println("Enter the StudentId :");
//					int Id=sc.nextInt();
//					
//					if(stud1.studentId==Id) {
//						Student enrolledCourse = stud1;
//						break;
//					}
//					Student enrolledCourse=null;
//					for(Student stud1:stud) {
//						
//					}
//					
//					  if(enrolledCourse==null) {
//						  System.out.println("Student is Not found in Enrolled list");
//					  }
//					  System.out.println(" Enrolled Course List Student "+ Id.studentName + ":");
//							
//					 
//	                
//	                    
// 
//
//	                    if (studentToDisplayCourses == null) {
//	                        System.out.println("Student with ID " + studentIdToDisplayCourses + " not found.");
//	                    } else {
//	                        System.out.println("Courses enrolled by Student " + studentToDisplayCourses.studentName + ":");
//	                        for (Course course : studentToDisplayCourses.enrolledCourses) {
//	                            System.out.println("Course ID: " + course.courseId + ", Course Name: " + course.courseName + ", Semester: " + course.semester);
//	                        }
//	                    }
//	                    break;
						}
					}
					
					
						
						
				}
				
			

		
		
	}

	
