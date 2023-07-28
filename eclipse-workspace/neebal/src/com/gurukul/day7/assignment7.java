package com.gurukul.day7;

class Person{
	String name;
	int age;
	Person(){}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
class employee extends Person{
	int id;
	double salary;
	employee(){
		super();
		
	}
	public employee(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary+ "]";
	}
	 
	
}
class teacher extends employee{
	String subjects;
	teacher(){
		super();
	}
	public teacher(String subjects) {
		super();
		this.subjects = subjects;
	}
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;                      
	}
	@Override
	public String toString() {
		return "teacher [   name=" + name + ", age=" + age+ "subjects=" + subjects + ", id=" + id + ", salary=" + salary + "]";
	}
	
}
class principal extends teacher{
	double years;
	
	principal(){
		super();
	}
	public principal(double years) {
		super();
		this.years = years;
	}
	
	public double getYears() {
		return years;
	}
    
	public void setYears(double years) {
		this.years = years;
	}
	@Override
	public String toString() {
		return "principal [years=" + years + ", subjects=" + subjects + ", id=" + id + ", salary=" + salary + ", name="
				+ name + ", age=" + age + "]";
	}
	

	
}


class officer extends employee{
	String department;
	
	officer(){
		super();
	}

	public officer(String department) {
		super();
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "officer [department=" + department + ", id=" + id + ", salary=" + salary + ", name=" + name + ", age="
				+ age + "]";
	}
	
}
public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		teacher t1=new teacher("Maths","");
	}

}
