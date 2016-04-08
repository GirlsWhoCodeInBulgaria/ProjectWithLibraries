package data.remote;

import data.local.models.Weather;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

import java.util.concurrent.TimeUnit;

public interface WeatherAPI {

    String BASE_URL = "https://query.yahooapis.com/v1/public/";

    @GET("yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22sofia%2Cbg%22)%20%20and%20u%3D%27c%27&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather> getWeatherSofia();

    class Factory {
        private static WeatherAPI service;

        public static WeatherAPI getInstance() {
            if (service == null) {

                OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
                builder.readTimeout(15, TimeUnit.SECONDS);
                builder.connectTimeout(10, TimeUnit.SECONDS);
                builder.writeTimeout(10, TimeUnit.SECONDS);

                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
                builder.addInterceptor(interceptor);


                Retrofit retrofit = new Retrofit.Builder().client(builder.build()).addConverterFactory(GsonConverterFactory.create()).baseUrl(BASE_URL).build();
                service = retrofit.create(WeatherAPI.class);
                return service;
            } else {
                return service;
            }
        }
    }
}