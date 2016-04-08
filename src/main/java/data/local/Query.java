
package data.local;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Query {

    @SerializedName("count")
    @Expose
    public Integer count;
    @SerializedName("created")
    @Expose
    public String created;
    @SerializedName("lang")
    @Expose
    public String lang;
    @SerializedName("results")
    @Expose
    public Results results;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
