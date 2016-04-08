
package data.local.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Units {

    @SerializedName("distance")
    @Expose
    public String distance;
    @SerializedName("pressure")
    @Expose
    public String pressure;
    @SerializedName("speed")
    @Expose
    public String speed;
    @SerializedName("temperature")
    @Expose
    public String temperature;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
