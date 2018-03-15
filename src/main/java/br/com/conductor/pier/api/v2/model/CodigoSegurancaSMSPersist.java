package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do recurso gerar c\u00F3digo de seguran\u00E7a.
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do recurso gerar c\u00F3digo de seguran\u00E7a.")
public class CodigoSegurancaSMSPersist  {
  
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;

  
  /**
   * DDD do n\u00FAmero de telefone para envio do sms.
   **/
  @ApiModelProperty(value = "DDD do n\u00FAmero de telefone para envio do sms.")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00FAmero do telefone para envio do sms.
   **/
  @ApiModelProperty(value = "N\u00FAmero do telefone para envio do sms.")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaSMSPersist {\n");
    
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
