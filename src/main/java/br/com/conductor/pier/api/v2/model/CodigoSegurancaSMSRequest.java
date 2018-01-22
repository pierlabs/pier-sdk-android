package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso validar c\u00C3\u00B3digo de seguran\u00C3\u00A7a.
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso validar c\u00C3\u00B3digo de seguran\u00C3\u00A7a.")
public class CodigoSegurancaSMSRequest  {
  
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("codigoSeguranca")
  private String codigoSeguranca = null;

  
  /**
   * C\u00C3\u00B3digo DDD do telefone (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo DDD do telefone (id).")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00C3\u00BAmero do telefone.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do telefone.")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Token para valida\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Token para valida\u00C3\u00A7\u00C3\u00A3o.")
  public String getCodigoSeguranca() {
    return codigoSeguranca;
  }
  public void setCodigoSeguranca(String codigoSeguranca) {
    this.codigoSeguranca = codigoSeguranca;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaSMSRequest {\n");
    
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  codigoSeguranca: ").append(codigoSeguranca).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
