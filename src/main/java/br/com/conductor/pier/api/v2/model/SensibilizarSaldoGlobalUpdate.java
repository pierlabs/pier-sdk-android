package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object that represents a balance change
 **/
@ApiModel(description = "Object that represents a balance change")
public class SensibilizarSaldoGlobalUpdate  {
  
  @SerializedName("valor")
  private BigDecimal valor = null;

  
  /**
   * Amount that should be sensitized
   **/
  @ApiModelProperty(required = true, value = "Amount that should be sensitized")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensibilizarSaldoGlobalUpdate {\n");
    
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
