/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.parking;

/**
 *
 * @author johna
 */
public class Bus extends vechile {
    int duration;

    public Bus(int id,int duration, int length) {
        super(id, length);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int calcMoney(){
        return duration*15;
    }
    public String gettype(){
    String Type="bus";
    return Type;
}
    
    
}
