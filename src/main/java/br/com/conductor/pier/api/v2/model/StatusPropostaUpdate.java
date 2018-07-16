package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{status_proposta_update_request_description}}}
 **/
@ApiModel(description = "{{{status_proposta_update_request_description}}}")
public class StatusPropostaUpdate  {
  
  @SerializedName("status")
  private Integer status = null;

  
  /**
   * {{{status_proposta_update_status_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{status_proposta_update_status_value}}}")
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


