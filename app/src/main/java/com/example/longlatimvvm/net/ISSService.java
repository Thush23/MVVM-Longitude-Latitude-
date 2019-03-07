package com.example.longlatimvvm.net;

import com.example.longlatimvvm.data.ISSRepo;
import com.example.longlatimvvm.net.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ISSService {
    @GET(Constants.ENDPOINT)
    Call<ISSRepo> getCoordinates(@Query("lat") String lat, @Query("lon") String lon);
}