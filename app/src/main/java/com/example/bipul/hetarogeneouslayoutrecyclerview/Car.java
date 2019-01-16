package com.example.bipul.hetarogeneouslayoutrecyclerview;

public class Car {
    private int carImage;
    private String carName;
    private String companyName;

    public Car(int carImage, String carName, String companyName) {
        this.carImage = carImage;
        this.carName = carName;
        this.companyName = companyName;
    }

    public int getCarImage() {
        return carImage;
    }

    public void setCarImage(int carImage) {
        this.carImage = carImage;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
