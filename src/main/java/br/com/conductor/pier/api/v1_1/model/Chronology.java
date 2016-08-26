package br.com.conductor.pier.api.v1_1.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Chronology  {
  
  @SerializedName("calendarType")
  private String calendarType = null;
  @SerializedName("id")
  private String id = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCalendarType() {
    return calendarType;
  }
  public void setCalendarType(String calendarType) {
    this.calendarType = calendarType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chronology {\n");
    
    sb.append("  calendarType: ").append(calendarType).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


