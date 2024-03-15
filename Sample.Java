class Student{  
 int id; 
 String name;  
 
  public static void main(String args[]){  
  Student s1=new Student();
  System.out.println(s1.id);
  System.out.println(s1.name);  
 
 }  
}




class Student{  
 int id=100; 
 String name="Ram";  
 
  public static void main(String args[]){  
  Student s1=new Student();
  System.out.println(s1.id);
  System.out.println(s1.name);  
 
 }  
}  


class Student{  
 int id; 
 String name;  
 Student(){
 id=101;
 name="Ram";
 }  
 
 public static void main(String args[]){  
  Student s1=new Student();
  System.out.println(s1.id);
  System.out.println(s1.name);  
 
 }  
}  



class Student{  
 int id; 
 String name;  
 Student(){
 id=101;
 name="Ram";
 }  
 Student(int tId, String tName){
 id=tId;
 name=tName;
 }
 public static void main(String args[]){  
  Student s1=new Student();
  System.out.println(s1.id);
  System.out.println(s1.name);  
  Student s2=new Student(201,"Kalyan");
  System.out.println(s2.id);
  System.out.println(s2.name);  
 }  
}  





class Student{  
 int id;  
 String name;  
 Student(){
 id=101;
 name="Ram";
 }  
 Student(int tId, String tName){
 id=tId;
 name=tName;
 }
}  


class TestStudent1{  
 public static void main(String args[]){  
  Student s1=new Student();  
  System.out.println(s1.id);  
  System.out.println(s1.name);  
  Student s2=new Student(201,"Kalyan");
  System.out.println(s2.id);
  System.out.println(s2.name);  
 }  
}  




class Student{  
 int id;  
 String name;  
} 
 
class TestStudent1{  
 public static void main(String args[]){  
  Student s1=new Student();  
  System.out.println(s1.id);  
  System.out.println(s1.name);  
 }  
}  



class Employee{  
    int id;  
    String name;  
    float salary;  
    void insert(int i, String n, float s) {  
        id=i;  
        name=n;  
        salary=s;  
    }  
    void display(){System.out.println(id+" "+name+" "+salary);}  
}  
public class TestEmployee {  
public static void main(String[] args) {  
    Employee e1=new Employee();  
    Employee e2=new Employee();  
    Employee e3=new Employee();  
    e1.insert(101,"ajeet",45000);  
    e2.insert(102,"irfan",25000);  
    e3.insert(103,"nakul",55000);  
    e1.display();  
    e2.display();  
    e3.display();  
}  
}  
