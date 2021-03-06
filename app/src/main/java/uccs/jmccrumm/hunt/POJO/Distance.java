package uccs.jmccrumm.hunt.POJO;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by John on 1/20/2017.
 */

public class Distance {
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("value")
    @Expose
    private Integer value;

    /**
     *
     * @return
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The value
     */
    public Integer getValue() {
        return value;
    }

    /**
     *
     * @param value
     * The value
     */
    public void setValue(Integer value) {
        this.value = value;
    }
}
