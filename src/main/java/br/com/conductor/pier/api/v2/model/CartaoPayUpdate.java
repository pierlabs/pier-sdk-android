package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{cartao_pay_update_description}}}
 **/
@ApiModel(description = "{{{cartao_pay_update_description}}}")
public class CartaoPayUpdate  {
  
  public enum StatusEnum {
     ATIVO,  INATIVO,  BLOQUEADO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;

  
  /**
   * {{{cartao_pay_update_status_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{cartao_pay_update_status_value}}}")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoPayUpdate {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
