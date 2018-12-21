package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the user access log
 **/
@ApiModel(description = "Representation of the user access log")
public class LogAcessoUsuarioResponse  {
  
  @SerializedName("id")
  private Long id = null;

  
  /**
   * Unique user identifier inserted (id)
   **/
  @ApiModelProperty(value = "Unique user identifier inserted (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogAcessoUsuarioResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
