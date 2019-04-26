package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de persist\u00EAncia de um limite para o portador
 **/
@ApiModel(description = "Objeto de persist\u00EAncia de um limite para o portador")
public class LimitePortadorPersist  {
  
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("saldoDisponivelGlobal")
  private BigDecimal saldoDisponivelGlobal = null;

  
  /**
   * Limite do portador
   **/
  @ApiModelProperty(required = true, value = "Limite do portador")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Saldo dispon\u00EDvel do portador
   **/
  @ApiModelProperty(required = true, value = "Saldo dispon\u00EDvel do portador")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitePortadorPersist {\n");
    
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  saldoDisponivelGlobal: ").append(saldoDisponivelGlobal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
