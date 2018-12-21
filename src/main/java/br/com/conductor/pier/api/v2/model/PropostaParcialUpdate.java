package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object that represents a proposal
 **/
@ApiModel(description = "Object that represents a proposal")
public class PropostaParcialUpdate  {
  
  @SerializedName("correspondencia")
  private Integer correspondencia = null;

  
  /**
   * Identifier of the mail address for the proposal
   **/
  @ApiModelProperty(value = "Identifier of the mail address for the proposal")
  public Integer getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Integer correspondencia) {
    this.correspondencia = correspondencia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropostaParcialUpdate {\n");
    
    sb.append("  correspondencia: ").append(correspondencia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
