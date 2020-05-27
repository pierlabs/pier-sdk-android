package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto que representa a altera\u00E7\u00E3o parcial do recurso de Evento Externo de Compra
 **/
@ApiModel(description = "Objeto que representa a altera\u00E7\u00E3o parcial do recurso de Evento Externo de Compra")
public class EventoExternoCompraParcialUpdate  {
  
  @SerializedName("status")
  private Long status = null;

  
  /**
   * Status da compra
   **/
  @ApiModelProperty(required = true, value = "Status da compra")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventoExternoCompraParcialUpdate {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
