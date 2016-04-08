
package data.local.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Results {

    @SerializedName("channel")
    @Expose
    public Channel channel;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
