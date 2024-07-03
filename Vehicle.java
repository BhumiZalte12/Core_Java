package com.itep.corejava;

class Vehicle1 {
    int vehicleno;
    String vehicle_name;
    String Vehicle_type;
    int vehicle_speed;
    
    void get_data(int vehi_no, String vehi_name, String vehi_type, int vehi_speed) {
        vehicleno = vehi_no;
        vehicle_name = vehi_name;
        Vehicle_type = vehi_type;
        vehicle_speed = vehi_speed;
    }   
}

class Car extends Vehicle1 {
    void show_data() {
        System.out.println("vehicle number is : " + vehicleno);
        System.out.println("vehicle name is :" + vehicle_name);
        System.out.println("vehicle type is :" + Vehicle_type);
        System.out.println("vehicle speed is :" + vehicle_speed);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.get_data(123, "Vitara brizza", "four wheeler", 500);
        c.show_data();
    }
}

