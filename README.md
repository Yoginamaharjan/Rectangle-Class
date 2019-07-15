# Rectangle-Class
Basic Rectangle Class

## Question answers: Java Programming Language  ##

1.	What are the primitive variables and non-primitive or reference variables give some examples?

Ans: The primitives variables are the one which are listed by the primitive data types such as int, char, float, etc., that directly stores the data. For example: 
                     int value; // value is the primitive variable which stores the integer value
                     char alpha; //alpha is the primitive variable that stores the char value

  The non-primitive or reference variables are the one which are listed by non-primitive data types such as arrays, class, etc. These variables contain the reference of the certain data or objects. For example:
Human student = new Human(); // here student is the reference variable which contains the reference of the objects of Human class.

2.	Why objects are referred as reference type.

Ans: Objects are the instance of the class. The variable initialized to create an object does not contain the actual object but contains the reference to the class instance or object. This is why objects are referred as reference type.

3.	Trace the output:


Class Rectangle{
int len;
int bred;


public Rectangle(){
sysout("Constructor called");
this.len = 100;
this.bred = 20;
} 


public void  calArea(){
sysout("Area is " + len*bred);
}

public int getLength(){
	return this.len;
}

public int getBredth(){
	return this.len;
}

public void setLength(int len){
this.len = len;
}

public void setBredth(int bred){
this.bred = bred;
}

}

Trace the output:

a) 
Rectangle rec = new Rectangle();
rec.calArea();

output:: 
Constructor called
Area is 2000

b)
Rectangle rec1 = new Rectangle();
Rectangle rec2 = new Rectangle();

if(rec1 == rec2){
sysout("Equal");
}
else{
sysout("Not Equal");
}
output: 
Not Equal

c) 
Rectangle rec1 = new Rectangle();
Rectangle rec2 = new Rectangle();


if(rec1.getLength == rec2.getLength){
sysout("Equal");
}
else{
sysout("Not Equal");
}

output:
Equal

d) 
Rectangle rec1 = new Rectangle();
Rectangle rec2 = new Rectangle();

rec1.setLength(12);

if(rec1.getLength == rec2.getLength){
sysout("Equal");
}
else{
sysout("Not Equal");
}

output:
Not Equal

e)
 
Rectangle rec1 = new Rectangle();
Rectangle rec2 = new Rectangle();

rec1= rec2

if(rec1 == rec2){
sysout("Equal");
}
else{
sysout("Not Equal");
}

output:
Equal





