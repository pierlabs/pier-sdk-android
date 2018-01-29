package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Represneta\u00C3\u00A7\u00C3\u00A3o do recurso atualizar cart\u00C3\u00A3o
 **/
@ApiModel(description = "Represneta\u00C3\u00A7\u00C3\u00A3o do recurso atualizar cart\u00C3\u00A3o")
public class CartaoPayUpdate  {
  
  public enum StatusEnum {
     ATIVO,  INATIVO,  BLOQUEADO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;

  
  /**
   * Status do cart\u00C3\u00A3o
   **/
  @ApiModelProperty(required = true, value = "Status do cart\u00C3\u00A3o")
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
