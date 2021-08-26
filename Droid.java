public class Droid{
    String name;
    int batteryLevel = 100;
    //constructor
    public Droid(String droidName){
        this.name = droidName;
    }
    
    //performingTask method
    public void performTask(String task){
      
      batteryLevel -=10;
     System.out.println(name + " is performing task:" + task);
    }
    
    //eneryReport()
    public void eneryReport(){
      System.out.println("Battery Level: " + batteryLevel);
    }
    
    //energyTransfer method
    public void energyTransfer(Droid dFrom, Droid dTo){
          System.out.println("Transfering energy form " +
          dFrom.name + " >>>>>>> " + dTo.name);
          dFrom.batteryLevel -= 10;
          dTo.batteryLevel += 10;
    }
    
    
    //toString method
    public String toString(){
      return "Hello, I’m the droid: " + name;
    }
      public static void main(String[] args){
            Droid Codey = new Droid("Android");
            System.out.println(Codey);
            Codey.performTask("Knacking");
            Codey.eneryReport();
            Droid Sexy = new Droid("Sexy");
            System.out.println(Sexy);
            Sexy.performTask("Abj");
            Sexy.performTask("Abj");
            Sexy.performTask("69");
            Sexy.eneryReport();
            Sexy.energyTransfer(Codey, Sexy);
            Codey.eneryReport();
            Sexy.eneryReport();
            Sexy.energyTransfer(Codey, Sexy);
            Sexy.energyTransfer(Codey, Sexy);
            Codey.eneryReport();
            Sexy.eneryReport();
    
      }
    }