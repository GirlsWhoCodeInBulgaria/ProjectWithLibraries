
package data.local.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Forecast {

    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("date")
    @Expose
    public String date;
    @SerializedName("day")
    @Expose
    public String day;
    @SerializedName("high")
    @Expose
    public String high;
    @SerializedName("low")
    @Expose
    public String low;
    @SerializedName("text")
    @Expose
    public String text;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
