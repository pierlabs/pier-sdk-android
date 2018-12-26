package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do recurso de validar senha pelo login
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do recurso de validar senha pelo login")
public class ValidarSenhaLoginRequest  {
  
  @SerializedName("idPlataforma")
  private Integer idPlataforma = null;

  
  /**
   * idPlataforma
   **/
  @ApiModelProperty(value = "idPlataforma")
  public Integer getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Integer idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidarSenhaLoginRequest {\n");
    
    sb.append("  idPlataforma: ").append(idPlataforma).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
