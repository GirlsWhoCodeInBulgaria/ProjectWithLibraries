
package data.local.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Channel {

    @SerializedName("units")
    @Expose
    public Units units;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("link")
    @Expose
    public String link;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("language")
    @Expose
    public String language;
    @SerializedName("lastBuildDate")
    @Expose
    public String lastBuildDate;
    @SerializedName("ttl")
    @Expose
    public String ttl;
    @SerializedName("location")
    @Expose
    public Location location;
    @SerializedName("wind")
    @Expose
    public Wind wind;
    @SerializedName("atmosphere")
    @Expose
    public Atmosphere atmosphere;
    @SerializedName("astronomy")
    @Expose
    public Astronomy astronomy;
    @SerializedName("image")
    @Expose
    public Image image;
    @SerializedName("item")
    @Expose
    public Item item;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
