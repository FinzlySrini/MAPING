package ComaratorDemO;

public class Compare {
int rollNum ;
String name;
int age;
String dept;

public int getRollNum() {
	return rollNum;
}
public Compare(int rollNum, String name, int age, String dept) {
	super();
	this.rollNum = rollNum;
	this.name = name;
	this.age = age;
	this.dept = dept;
}
public void setRollNum(int rollNum) {
	this.rollNum = rollNum;
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
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Compare [rollNum=" + rollNum + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
}
}
