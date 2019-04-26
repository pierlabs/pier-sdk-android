package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Usu\u00E1rio Senha Forte
 **/
@ApiModel(description = "Objeto Usu\u00E1rio Senha Forte")
public class SenhaForte  {
  
  @SerializedName("idPlataforma")
  private Integer idPlataforma = null;

  
  /**
   * id da plataforma
   **/
  @ApiModelProperty(value = "id da plataforma")
  public Integer getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Integer idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenhaForte {\n");
    
    sb.append("  idPlataforma: ").append(idPlataforma).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
