/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.parking;

/**
 *
 * @author johna
 */
public class Car extends vechile {
    int duration;

    public Car(int duration, int id, int length) {
        super(id, length);
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public int calcMoney(){
        int value=duration*10;
        return value;
    }
    @Override
     public String gettype(){
    String Type="car";
    return Type;
     }
}
