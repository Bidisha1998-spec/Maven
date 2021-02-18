package truck;

import java.util.*;

class TestTollBooth {
    public static void main(String [] args) {
        TollBooth booth = new TollBooth();
        Truck truck1 = new Truck(5, 12500);
        Truck truck2 = new Truck(2, 5000);
        Truck truck3 = new Truck(6, 17000);

        //collecting tolls
        booth.calculateToll(truck1);
        booth.displayData();
        booth.calculateToll(truck2);
        booth.displayData();

        //collecting receipts
        booth.ReceiptCollection();

        //another truck
        booth.calculateToll(truck2);
        booth.displayData();
    }
}


class TollBooth {
	int receiptsSinceCollection;
    int trucksSinceCollection;
    TollBooth() {
        trucksSinceCollection = 0;        
        receiptsSinceCollection = 0;
    }
    void calculateToll(Truck truck) {
        int axles = truck.getAxles();
        int totalWeight = truck.getTotalWeight();
        int tollDue = 5*axles + 10*(totalWeight/1000);  // Toll calculation
        System.out.println("Truck arrival - axles: "+axles+" total weight: "+totalWeight+" Toll due: "+tollDue);
        trucksSinceCollection = trucksSinceCollection + 1;
        receiptsSinceCollection = receiptsSinceCollection + tollDue;
    }
    void ReceiptCollection() {
        System.out.println("*** Collecting receipts ***");
        displayData();
        trucksSinceCollection = 0;      // Clear out totals
        receiptsSinceCollection = 0;
    }
    void displayData() {
        System.out.println("Totals since last collection - Receipts: "+receiptsSinceCollection+" Trucks: "+trucksSinceCollection);
    }
}

class Truck {
	int axles;
	int totalWeight;
    Truck(int axles, int totalWeight) {
        this.axles = axles;
        this.totalWeight = totalWeight;
    }
    int getAxles() 
    {	
    	return axles;
    
    }
    int getTotalWeight() 
    {
    	return totalWeight;
    }
 
}























/*package truck;

import java.util.ArrayList;
import java.util.Scanner;



 class Daewoo implements Truck {
    private int axels,wieght;
    private String name="Daewoo" , plateno="lek-1021";
	public Daewoo(int axels,int wieght)
	{
		this.axels=axels;
                this.wieght=wieght;
	} 
        public int gettruck_wieght()
        {
          return this.wieght;
        }
        public int gettruck_axels()
        {
          return this.axels;
        }
       
        public String gettruck_specs()
        {
          return " Truck name: "+this.name+" plate no :"+ 
this.plateno;
        }
        
    
}
class Ford implements Truck{
    
    private int axels,wieght;
    private String name="ford" , plateno="lgs-2031";
	public Ford(int axels,int wieght)
	{
		this.axels=axels;
                this.wieght=wieght;
	} 
        public int gettruck_wieght()
        {
          return this.wieght;
        }
        public int gettruck_axels()
        {
          return this.axels;
        }
       
        public String gettruck_specs()
        {
          return "Truck name"+this.name+"plate no "+ this.plateno;
        }
        
}
class Nissan implements Truck{
    
    private int axels,wieght;
    private String name="Nissan" , plateno="lgs-231";
	public Nissan(int axels,int wieght)
	{
		this.axels=axels;
                this.wieght=wieght;
	} 
        public int gettruck_wieght()
        {
          return this.wieght;
        }
        public int gettruck_axels()
        {
          return this.axels;
        }
       
        public String gettruck_specs()
        {
          return "Truck name"+this.name+"plate no "+ this.plateno;
        }
        
}
class LahoreTollBooth implements TollBooth {
    private int truckwieght,halfwieght,noofhalftons,tolldue,axels;
        private  static int truckinfo, totalcash;
    public void calculateToll(Truck info)
    {
       truckwieght=info.gettruck_wieght();
       halfwieght=truckwieght/2;
       noofhalftons=halfwieght/500;
       axels=info.gettruck_axels();
       tolldue=noofhalftons*10+info.gettruck_axels()*5;
       truckinfo++;totalcash=totalcash +tolldue;
       System.out.println(  "Axels :"+axels+" Truckwieght :"+truckwieght  +" tolldue : "+ totalcash);
       System.out.println( " Truck info :> "+ info.gettruck_specs());
       
    }
    public void displaydata()
    {
       System.out.println("No of Trucks "+truckinfo); 
       System.out.println("Reciept"+totalcash);
    }
    public void resetmeter()
     {
         totalcash=0;
         truckinfo=0;
          System.out.println("totalcash :"+totalcash + " truckinfo :"+truckinfo);
      }
	public void calculateToll(Object object) {
		// TODO Auto-generated method stub
		
	}
}
public class TestTollBooth {
    public static void main(String [] args){
    int i=2;  
    Scanner sc=new Scanner(System.in);  
    
    ArrayList  obj=  new ArrayList();
    obj.add(new Ford(5,12000));
    obj.add(new Nissan(6,15000));
    obj.add(new Daewoo(4,10000));
    LahoreTollBooth booth = new LahoreTollBooth();
    boolean flag=true;
     int j=2;
   while(flag)
   {
    System.out.println("1:Scan barcode");
    System.out.println("2: display data");
    System.out.println("3:restartmeter");
   
    int n= sc.nextInt();
    switch(n)
    {
       
        case 1: 
               if(j<0)
               {
                System.out.println("no car came");
                break;
               }
               booth.calculateToll(obj.get(j));
               
               System.out.println(j);
               j--;
               break;
        
        case 2: 
            booth.displaydata();
            break;
        case 3:
            booth.resetmeter();
            break;
        default : 
    }
   }
           
    
}
}
 interface Truck {
	 public int gettruck_wieght();
    public int gettruck_axels();
        public String gettruck_specs();

}
 interface TollBooth {
	  public void calculateToll(Truck info);
	  public void displaydata();
	  public void resetmeter();
	    
	} */

