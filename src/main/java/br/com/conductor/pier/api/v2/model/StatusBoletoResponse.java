package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso de status de boleto
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de status de boleto")
public class StatusBoletoResponse  {
  
  @SerializedName("status")
  private String status = null;
  @SerializedName("data")
  private String data = null;

  
  /**
   * Descri\u00E7\u00E3o do status CNAB sumarizado do boleto
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do status CNAB sumarizado do boleto")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Data em que o status foi definido
   **/
  @ApiModelProperty(value = "Data em que o status foi definido")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusBoletoResponse {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
