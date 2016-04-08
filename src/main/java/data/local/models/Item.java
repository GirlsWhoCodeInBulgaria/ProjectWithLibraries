
package data.local.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Item {

    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("lat")
    @Expose
    public String lat;
    @SerializedName("long")
    @Expose
    public String _long;
    @SerializedName("link")
    @Expose
    public String link;
    @SerializedName("pubDate")
    @Expose
    public String pubDate;
    @SerializedName("condition")
    @Expose
    public Condition condition;
    @SerializedName("forecast")
    @Expose
    public List<Forecast> forecast = new ArrayList<Forecast>();
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("guid")
    @Expose
    public Guid guid;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
