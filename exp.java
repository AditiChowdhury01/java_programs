import java.uitl.*;
class MyException{
String str;
MyException(String str){
this.str = str;
}
public String toString(){
return ("my exception occured:"+str);
}
}

class 