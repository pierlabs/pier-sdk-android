package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{sensibilizar_saldo_global_update_description}}}
 **/
@ApiModel(description = "{{{sensibilizar_saldo_global_update_description}}}")
public class SensibilizarSaldoGlobalUpdateValue  {
  
  @SerializedName("valor")
  private BigDecimal valor = null;

  
  /**
   * {{{sensibilizar_saldo_global_update_valor_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{sensibilizar_saldo_global_update_valor_value}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensibilizarSaldoGlobalUpdateValue {\n");
    
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
