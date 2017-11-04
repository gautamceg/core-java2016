package json.model;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ModelYearConfigData {
    private Award award1;
    private Copy copy;
    private String video;
    private List<IntUrl> intUrl = new ArrayList();
    private List<ExtUrl> extUrl = new ArrayList();
    private Map<String, Object> additionalProperties = new HashMap();

    public Award getAward1() {
        return award1;
    }

    public void setAward1(Award award1) {
        this.award1 = award1;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<IntUrl> getIntUrl() {
        return intUrl;
    }

    public void setIntUrl(List<IntUrl> intUrl) {
        this.intUrl = intUrl;
    }

    public List<ExtUrl> getExtUrl() {
        return extUrl;
    }

    public void setExtUrl(List<ExtUrl> extUrl) {
        this.extUrl = extUrl;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    //TBD
    @Override
    public String toString() {
        return "ModelYearConfigData{" +
                "award1=" + award1 +
                ", copy=" + copy +
                ", video='" + video + '\'' +
                ", intUrl=" + intUrl +
                ", extUrl=" + extUrl +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

