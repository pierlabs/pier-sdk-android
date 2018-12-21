package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Username Password Strong
 **/
@ApiModel(description = "Object Username Password Strong")
public class StrongPassword  {
  
  @SerializedName("idPlataforma")
  private Integer idPlataforma = null;

  
  /**
   * platform id
   **/
  @ApiModelProperty(value = "platform id")
  public Integer getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Integer idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrongPassword {\n");
    
    sb.append("  idPlataforma: ").append(idPlataforma).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
