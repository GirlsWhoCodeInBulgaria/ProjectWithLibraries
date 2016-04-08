import com.google.common.base.CharMatcher;
import com.google.common.io.Files;
import data.local.models.Forecast;
import data.local.models.Weather;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import data.remote.WeatherAPI;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import retrofit2.Call;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;


public class Main {


    private static Weather weather;

    public static void main(String[] args) {

        //===================== Log4j Library ===============================

        Logger Log = LogManager.getLogger();
        Log.warn("----------------- Testing Log4j Library ----------------");
        Log.info("Starting the engine!");
        Log.error("No errors until now....");


        //===================== Joda Time Library ===========================

        Log.info("--------------------------------------------------------");
        Log.info("------------- Joda Time Library  -----------------------");
        Log.info("--------------------------------------------------------");

        DateTime dt = new DateTime();
        DateTime dtLondon = dt.withZone(DateTimeZone.forID("Europe/London"));
        Log.warn("Time now in London: " + dtLondon.toString("dd:MM:yy HH:mm:ss"));


        //===================== Retrofit Library ===========================

        Log.info("--------------------------------------------------------");
        Log.info("------------- Retrofit Library  ------------------------");
        Log.info("--------------------------------------------------------");

        WeatherAPI weatherAPI = WeatherAPI.Factory.getInstance();

        Call<Weather> call = weatherAPI.getWeatherSofia();

        try {
            weather = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Log.info("Current Conditions: " + weather.query.results.channel.item.condition.temp + " °C - " + weather.query.results.channel.item.condition.text);
        for (Forecast forecast : weather.query.results.channel.item.forecast) {
            Log.info(forecast.date + " " + forecast.text);
        }


        //===================== Guava Library ==============================

        Log.info("--------------------------------------------------------");
        Log.info("--------------- Guava Library  -------------------------");
        Log.info("--------------------------------------------------------");

        try {
            File simpleFile = new File(System.getProperty("user.dir") + "/src/main/java/data/local/some_text_file.txt");
            List<String> lines = Files.readLines(simpleFile, Charset.defaultCharset());
            for (String line : lines.subList(1, 4)) {
                Log.info(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String phoneNumber = CharMatcher.DIGIT.retainFrom("my phone number is 884925548451");
        Log.info("phoneNumber=" + phoneNumber);

    }

}
