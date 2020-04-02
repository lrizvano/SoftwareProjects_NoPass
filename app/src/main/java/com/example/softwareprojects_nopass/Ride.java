package com.example.softwareprojects_nopass;

import android.os.Parcel;
import android.os.Parcelable;

public class Ride implements Parcelable {
    private String driver, car, destination, time;

    public Ride(String destination, String time) {
        this.driver = "Elon Musk";
        this.car = "Tesla";
        this.destination = destination;
        this.time = time;
    }

    protected Ride(Parcel in) {
        driver = in.readString();
        car = in.readString();
        destination = in.readString();
        time = in.readString();
    }

    public static final Creator<Ride> CREATOR = new Creator<Ride>() {
        @Override
        public Ride createFromParcel(Parcel in) {
            return new Ride(in);
        }

        @Override
        public Ride[] newArray(int size) {
            return new Ride[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(driver);
        parcel.writeString(car);
        parcel.writeString(destination);
        parcel.writeString(time);
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
