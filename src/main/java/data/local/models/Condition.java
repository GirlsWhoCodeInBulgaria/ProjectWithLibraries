
package data.local.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Condition {

    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("date")
    @Expose
    public String date;
    @SerializedName("temp")
    @Expose
    public String temp;
    @SerializedName("text")
    @Expose
    public String text;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
