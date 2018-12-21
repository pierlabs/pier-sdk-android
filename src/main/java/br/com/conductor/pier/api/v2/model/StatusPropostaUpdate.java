package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Update Parameters for a Proposal Status
 **/
@ApiModel(description = "Update Parameters for a Proposal Status")
public class StatusPropostaUpdate  {
  
  @SerializedName("status")
  private Integer status = null;

  
  /**
   * Proposal status
   **/
  @ApiModelProperty(required = true, value = "Proposal status")
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
