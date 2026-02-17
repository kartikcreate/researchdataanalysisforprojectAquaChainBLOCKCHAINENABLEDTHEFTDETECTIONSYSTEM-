package oops;
class Studentw{
    String section;
    String name;

/*void PrintStudentDetails(){
    System.out.println(this.section +" "+ this.name);
}*/
Studentw(String section,String name){
    this.name=name;
    this.section=section;

}
}
public class Student {
    public static void main(String[] args) {
    Studentw stu=new Studentw("Asection","vasantha");/* the values are directlty passed as constructors is present */
    /*stu.section="Asection";
    stu.name="pushya"; this can be used  if the construcctor is not made*/
   // stu.PrintStudentDetails();
    
}
}