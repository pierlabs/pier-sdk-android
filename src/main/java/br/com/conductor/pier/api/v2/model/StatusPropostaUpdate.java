package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Par\u00E2metros de atualiza\u00E7\u00E3o de um Status de Proposta
 **/
@ApiModel(description = "Par\u00E2metros de atualiza\u00E7\u00E3o de um Status de Proposta")
public class StatusPropostaUpdate  {
  
  @SerializedName("status")
  private Integer status = null;

  
  /**
   * Status da proposta
   **/
  @ApiModelProperty(required = true, value = "Status da proposta")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPropostaUpdate {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
