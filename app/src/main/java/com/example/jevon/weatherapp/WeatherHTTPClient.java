package com.example.jevon.weatherapp;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by Jevon on 4/27/18.
 */

public class WeatherHTTPClient {

    private static final WeatherHTTPClient ourInstance = new WeatherHTTPClient();

    public static WeatherHTTPClient getInstance() {
        return ourInstance;
    }

    private WeatherHTTPClient() {
        mRetrofit = new Retrofit.Builder().baseUrl(WEATHER_URL).build();

        mWeatherService = mRetrofit.create(WeatherService.class);
    }

    private final String WEATHER_URL = "http://api.worldweatheronline.com/premium/v1/search.ashx";

    private Retrofit mRetrofit;

    private WeatherService mWeatherService;

    public void fetchUser(String name, Callback<ResponseBody> callback) {
        mWeatherService.getUserDetails(name).enqueue(callback);
    }

//WEATHER API KEY: 348dcdedd8e245d9b49142844182704
// Google Places API: AIzaSyDJW3zN2ZeEFrEQ9xOUZG_3mIfVXCqb5EU

    private interface WeatherService {

        @GET() //endpoint
        Call<ResponseBody> getUserDetails(@Header("Authorization") String credentials);

    }

}
