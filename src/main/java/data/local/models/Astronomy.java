
package data.local.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Astronomy {

    @SerializedName("sunrise")
    @Expose
    public String sunrise;
    @SerializedName("sunset")
    @Expose
    public String sunset;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
