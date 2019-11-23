class Throws_Test{
static void Test()throws IllegalAccessException{
System.out.println("Inside test() method");
throw new IllegalAccessException("test");}
public static void main(String args[]){
try
{
Test();
}
catch(IllegalAccessException e)
{
System.out.println("caught in main"+e);
}
}
}
