
package data.local.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Image {

    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("width")
    @Expose
    public String width;
    @SerializedName("height")
    @Expose
    public String height;
    @SerializedName("link")
    @Expose
    public String link;
    @SerializedName("url")
    @Expose
    public String url;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
