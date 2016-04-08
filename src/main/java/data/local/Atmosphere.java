
package data.local;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;;

@Generated("org.jsonschema2pojo")
public class Atmosphere {

    @SerializedName("humidity")
    @Expose
    public String humidity;
    @SerializedName("pressure")
    @Expose
    public String pressure;
    @SerializedName("rising")
    @Expose
    public String rising;
    @SerializedName("visibility")
    @Expose
    public String visibility;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
