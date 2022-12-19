package car.parking;
import java.util.ArrayList;
import java.util.Scanner;
public class CarParking {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int trucks=0;
        int cars=0;
        int motors=0;
        int bus=0;
        int capactiy=100;
       ArrayList <vechile> garage  ;
       garage=new ArrayList <vechile> ();
        while(true){  
            System.out.println("enter a number ");
            System.out.println("1- add a vechile");
            System.out.println("2- remove a vechile ");
            System.out.println("3- print the status  ");
            System.out.println("4- to exit  ");
            int g=input.nextInt();
            if(g==4){
            break;
            }
            if(g==1){
                String type;
                int id,duration;  
                System.out.println("enter the type ");
                type=input.next();
                System.out.println("enter the ID");
                id=input.nextInt();
                System.out.println("enter the duration ");
                duration=input.nextInt();
                if("bus".equals(type)||"Bus".equals(type)){
                    if(capactiy<10){
                        System.out.println("There isn't Space Avaliable");
                        continue;
                    }
                    vechile d1=new Bus(id,duration,10);
                    int value=d1.calcMoney();
                    System.out.println("the total cost for the vechile id ="+value);
                    bus++;
                    capactiy-=10;
                    garage.add(d1);
                }
                if("truck".equals(type)||"Truck".equals(type)){
                    if(capactiy<7){
                        System.out.println("There isn't Space Avaliable");
                        continue;
                    }
                    vechile t1=new Truck(id,duration,7);
                    
                     int value=t1.calcMoney();
                    System.out.println("the total cost for the vechile id ="+value);
                    trucks++;
                    capactiy-=7;
                    garage.add(t1);
                }
                 if("Car".equals(type)||"car".equals(type)){
                     if(capactiy<5){
                        System.out.println("There isn't Space Avaliable");
                        continue;
                    }
                    vechile c1=new Car(id,duration,5);
                     int value=c1.calcMoney();
                    System.out.println("the total cost for the vechile id ="+value);
                    cars++;
                    capactiy-=5;
                    garage.add(c1);
                }
                 if("Motor".equals(type)||"motor".equals(type)){
                     if(capactiy<2){
                        System.out.println("There isn't Space Avaliable");
                        continue;
                    }
                    vechile m1=new Motor(id,duration,2);
                    int value=m1.calcMoney();
                    System.out.println("the total cost for the vechile id ="+value);
                    motors++;
                    capactiy-=2;
                    garage.add(m1);
                }
            }
            if(g==3){
                System.out.println("the avalaible space is : "+capactiy);
                System.out.println("there are:"+cars+" Cars in garage");
                System.out.println("there are:"+bus+" Bus in garage");
                System.out.println("there are:"+trucks+" Trucks in garage");
                System.out.println("there are:"+motors+" Motor in garage");
             
            }
            if(g==2){
                System.out.println("enter the id of the car you want to remove it");
                int tempID=input.nextInt();
                boolean flag=false;
                for(int i=0;i<garage.size();i++){
                    int id2=garage.get(i).id;
                    if(tempID==id2){
                        flag=true;
                     capactiy= capactiy + garage.get(i).length;
                        String Type=garage.get(i).gettype();
                        int templength=garage.get(i).length;
                        if(templength==10){
                            bus--;
                        }
                        else if(templength==7){
                            trucks--;
                        }
                        else if(templength==5){
                            cars--;
                        }
                        else if(templength==2){
                            motors--;
                        }
                        garage.remove(i);
                        break;
                    }
                }
                if(flag){
                    System.out.println("The vechile removed");
                }else{
                    System.out.println("The vechile1 isn't avaliable here");
                }
            }
            
        }
    }

   
}
