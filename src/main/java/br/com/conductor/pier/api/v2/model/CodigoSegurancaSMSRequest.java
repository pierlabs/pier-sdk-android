package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o do recurso validar c\u00F3digo de seguran\u00E7a.
 **/
@ApiModel(description = "Representa\u00E7\u00E3o do recurso validar c\u00F3digo de seguran\u00E7a.")
public class CodigoSegurancaSMSRequest  {
  
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("codigoSeguranca")
  private String codigoSeguranca = null;

  
  /**
   * C\u00F3digo DDD do telefone (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo DDD do telefone (id).")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00FAmero do telefone.
   **/
  @ApiModelProperty(value = "N\u00FAmero do telefone.")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Token para valida\u00E7\u00E3o.
   **/
  @ApiModelProperty(value = "Token para valida\u00E7\u00E3o.")
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
