package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Represneta\u00E7\u00E3o do recurso atualizar cart\u00E3o
 **/
@ApiModel(description = "Represneta\u00E7\u00E3o do recurso atualizar cart\u00E3o")
public class CartaoPayUpdate  {
  
  public enum StatusEnum {
     ATIVO,  INATIVO,  BLOQUEADO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;

  
  /**
   * Status do cart\u00E3o
   **/
  @ApiModelProperty(required = true, value = "Status do cart\u00E3o")
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
