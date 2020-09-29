public class Calculator{
  //simple calculator program  
  public Calculator(){ // create calculator class
 
}
// create the methods for calculator functions below
 public int add(int a, int b){
  return a+b;
 } 
 public int subtract(int a, int b){
    return a-b;
 }
 public int multiply(int a, int b){
   return a*b;
 }
 public double divide(int a, int b){
   return a/b;
 }
public double modulo(int a, int b){
  return a%b;
  }
  public static void main(String[] args){

    Calculator myCalculator = new Calculator(); //create instance myCalculator test features below
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));





  }










}
