# Learn Java Template

Sample project with some gradle libraries.

 ### Looking for quick copy paste ?


 ~~~~
    compile group: 'org.apache.logging.log4j', name: 'log4j-api', version: '2.5'
    compile group: 'org.apache.logging.log4j', name: 'log4j-core', version: '2.5'

    //----- Guava
    compile 'com.google.guava:guava:19.0'

    //----- Libraries to help with internet stuff
    compile 'com.squareup.retrofit2:retrofit:2.0.0'
    compile "com.squareup.retrofit2:converter-gson:2.0.0"
    compile 'com.squareup.okhttp3:logging-interceptor:3.0.1'

    //for the toString in our models
    compile 'org.apache.commons:commons-lang3:3.0'

    //---- Easy operations with time
    compile 'joda-time:joda-time:2.9.3'
~~~~


### Examples:

 ~~~~
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
~~~~


### Config for log4j (save a log4j2.xml into your resources)

~~~~
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} [%t] %-5p %c{1}:%L - %msg%n"/>
        </Console>

        <RollingFile name="RollingFile" filename="log/MyApplication.log"
                     filepattern="${logPath}/%d{yyyyMMddHHmmss}-fargo.log">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} [%t] %-5p %c{1}:%L - %msg%n"/>
            <Policies>
                <SizeBasedTriggeringPolicy size="10 MB"/>
            </Policies>
            <DefaultRolloverStrategy max="20"/>
        </RollingFile>
    </Appenders>
    <Loggers>
        <Root level="info">
            <AppenderRef ref="Console"/>
            <AppenderRef ref="RollingFile"/>
        </Root>
    </Loggers>
</Configuration>
~~~~