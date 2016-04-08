import data.local.Weather;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import remote.SampleAPI;
import retrofit2.Call;

import java.io.IOException;


public class Main {


    private static Weather weather;

    public static void main(String[] args) {

        Logger Log = LogManager.getLogger();
        Log.info("Starting our program...");

        SampleAPI sampleAPI = SampleAPI.Factory.getInstance();

        Call<Weather> call = sampleAPI.getWeatherSofia();

        try {
            weather = call.execute().body();

        } catch (IOException e) {
            e.printStackTrace();
        }

        Log.info(weather.query.results.channel.toString());
    }

}
