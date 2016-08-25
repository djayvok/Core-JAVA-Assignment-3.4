public class Student{  
    int id;  
    String name;  
    String result;  
    Student(int i,String n,String r){  
    id = i;  
    name = n;  
    result = r;
    }  
    void display(){
    	    	System.out.println(id+"\t"+name+ "\t" +result);
    	}  
   
    public static void main(String args[]){  
    	System.out.println("Student Details");
    	System.out.println("--------------------------------------------");
    	System.out.println("ID\t"+"Name\t"+"Result");
    Student s1 = new Student(111,"AAA","DISTINCTION");  
    Student s2 = new Student(222,"BBB","SECOND CLASS"); 
    Student s3= new Student(333,"CCC","First Class");
    s1.display();  
    s2.display();  
    s3.display();
   }  
}  
