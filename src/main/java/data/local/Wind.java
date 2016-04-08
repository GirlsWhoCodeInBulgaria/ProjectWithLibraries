
package data.local;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Wind {

    @SerializedName("chill")
    @Expose
    public String chill;
    @SerializedName("direction")
    @Expose
    public String direction;
    @SerializedName("speed")
    @Expose
    public String speed;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
