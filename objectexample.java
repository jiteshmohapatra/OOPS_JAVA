class student{



int rollno;
int marks;
char grade;


void rollnodisplay(){


System.out.println("The RollNo is -:"+ rollno);


}

void marksdisplay(){

System.out.println("The marks is -:" + marks);

}



void gradedisplay(){


System.out.println("The grade is -:" + grade);


}


}



class objectexample{


public static void main(String args[]){


student s1;

s1 = new student();

student s2 = new student();

s2.rollno = 21;
s2.marks = 53;
s2.grade = 'c';

s2.rollnodisplay();
s2.marksdisplay();
s2.gradedisplay();



s1.rollno = 151;

s1.marks = 90;

s1.grade = 'E';


//s1.rollnodisplay();

//s1.marksdisplay();

//s1.gradedisplay();


}

}