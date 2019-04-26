package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto que representa a proposta
 **/
@ApiModel(description = "Objeto que representa a proposta")
public class PropostaParcialUpdate  {
  
  @SerializedName("correspondencia")
  private Integer correspondencia = null;

  
  /**
   * C\u00F3digo identificador do endere\u00E7o de correspond\u00EAncia da proposta
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do endere\u00E7o de correspond\u00EAncia da proposta")
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
