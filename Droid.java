public class Droid{
 int batteryLevel;
 String name;
 
 public Droid(String droidName){
  name = droidName;
  batteryLevel = 100;
 }

  public String toString(){
  return ("Hello my name is: "+name);
 }
 public void energyReport(){
   System.out.println("Your battery level is at :"+batteryLevel);
 }

 public void performTask(String task){
  System.out.println(name+ "is performing a task: "+task);
  batteryLevel = batteryLevel - 10;
   
 }

public static void main(String[] args){
Droid codey = new Droid("Codey");
System.out.println(codey);
codey.performTask("Lifting Weights");
codey.energyReport();




}
}
