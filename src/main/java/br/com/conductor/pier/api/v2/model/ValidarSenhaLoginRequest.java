package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{validar_senha_login_request_description}}}
 **/
@ApiModel(description = "{{{validar_senha_login_request_description}}}")
public class ValidarSenhaLoginRequest  {
  
  @SerializedName("idPlataforma")
  private Integer idPlataforma = null;

  
  /**
   * {{{validar_senha_login_request_id_plataforma_value}}}
   **/
  @ApiModelProperty(value = "{{{validar_senha_login_request_id_plataforma_value}}}")
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
