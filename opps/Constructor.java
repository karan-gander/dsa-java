
public class Constructor {

    
    public static void main(String args[]){
        
        Student s1 = new Student();
        // Student s2 = new Student("Karan");
        // Student s3 = new Student(12);

        // System.out.print(s3.rollno);
        s1.name= "Karan";
        s1.rollno= 1004;
        s1.password="Karan@123";
        s1.marks[0]= 10;
        s1.marks[1]= 20;
        s1.marks[2]= 30;
        

        Student scp = new Student(s1);

        s1.marks[1]=40;
        for(int i=0;i<3;i++){
            System.out.print(scp.marks[i]);
        }
    }

}

class Student {
    // this is calles constructoe overloading 
    String name;
    int rollno;
    String password = "karan";
    int marks[];
    
    // student 
    //copy constructor // shallow by default 
    // Student(Student s1){
        
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     this.marks = s1.marks;
        
    // }
    //copy constructor // shallow by default 
    Student(Student s1){
        
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        
        for(int i=0;i<this.marks.length;i++){

            this.marks[i] = s1.marks[i]; // deep constructor
        }
        
    }



    Student() {
        System.out.print("My name is KK  \n");
        marks = new int[3]; 
    };
    
    
    
    Student(int rollno) {
        this.rollno = rollno;
        marks = new int[3]; 
    }
    
    Student(String name) {
        this.name = name;
        marks = new int[3]; 
    }


    
}