package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * CardStageUpdate
 **/
@ApiModel(description = "CardStageUpdate")
public class EstagioCartaoUpdate  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   * ID of the Card Stage
   **/
  @ApiModelProperty(value = "ID of the Card Stage")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstagioCartaoUpdate {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
