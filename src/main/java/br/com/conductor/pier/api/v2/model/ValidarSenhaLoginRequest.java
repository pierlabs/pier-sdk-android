package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the login request valid for login
 **/
@ApiModel(description = "Representation of the login request valid for login")
public class ValidarSenhaLoginRequest  {
  
  @SerializedName("idPlataforma")
  private Integer idPlataforma = null;

  
  /**
   * PlataformId
   **/
  @ApiModelProperty(value = "PlataformId")
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
