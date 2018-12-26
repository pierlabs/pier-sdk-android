package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * EstagioCartaoUpdate
 **/
@ApiModel(description = "EstagioCartaoUpdate")
public class EstagioCartaoUpdate  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   * ID do est\u00E1gio do cart\u00E3o
   **/
  @ApiModelProperty(value = "ID do est\u00E1gio do cart\u00E3o")
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
