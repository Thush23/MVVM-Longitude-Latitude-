package com.example.longlatimvvm.repo;

import java.util.Observer;

public interface DataSource {
    void getCoordinatesForLocation(String latitude, String longtitude);
    void setObserver(Observer observer);
}

