package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto que representa a sensibiliza\u00E7\u00E3o do saldo
 **/
@ApiModel(description = "Objeto que representa a sensibiliza\u00E7\u00E3o do saldo")
public class SensibilizarSaldoGlobalUpdate  {
  
  @SerializedName("valor")
  private BigDecimal valor = null;

  
  /**
   * Quantidade que deve ser sensibilizada
   **/
  @ApiModelProperty(required = true, value = "Quantidade que deve ser sensibilizada")
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
