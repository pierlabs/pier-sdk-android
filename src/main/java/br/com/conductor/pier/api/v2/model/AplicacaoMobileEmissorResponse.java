package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Represents a mobile application response
 **/
@ApiModel(description = "Represents a mobile application response")
public class AplicacaoMobileEmissorResponse  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   * Mobile application id
   **/
  @ApiModelProperty(value = "Mobile application id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobileEmissorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
