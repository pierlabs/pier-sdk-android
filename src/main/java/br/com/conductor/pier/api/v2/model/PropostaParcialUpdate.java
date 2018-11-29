package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{proposta_parcial_update_description}}}
 **/
@ApiModel(description = "{{{proposta_parcial_update_description}}}")
public class PropostaParcialUpdate  {
  
  @SerializedName("correspondencia")
  private Integer correspondencia = null;

  
  /**
   * {{{proposta_parcial_update_correspondencia_value}}}
   **/
  @ApiModelProperty(value = "{{{proposta_parcial_update_correspondencia_value}}}")
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
