package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto para altera\u00E7\u00E3o de controle de limites de um cart\u00E3o. Nenhum dos campos s\u00E3o obrigat\u00F3rios. Devem ser informados apenas os campos que deseja modificar
 **/
@ApiModel(description = "Objeto para altera\u00E7\u00E3o de controle de limites de um cart\u00E3o. Nenhum dos campos s\u00E3o obrigat\u00F3rios. Devem ser informados apenas os campos que deseja modificar")
public class ControleLimiteCartaoUpdate  {
  
  @SerializedName("limiteMensal")
  private BigDecimal limiteMensal = null;
  @SerializedName("limiteSemanal")
  private BigDecimal limiteSemanal = null;
  @SerializedName("limiteDiario")
  private BigDecimal limiteDiario = null;

  
  /**
   * Valor do limite mensal
   **/
  @ApiModelProperty(value = "Valor do limite mensal")
  public BigDecimal getLimiteMensal() {
    return limiteMensal;
  }
  public void setLimiteMensal(BigDecimal limiteMensal) {
    this.limiteMensal = limiteMensal;
  }

  
  /**
   * Valor do limite semanal
   **/
  @ApiModelProperty(value = "Valor do limite semanal")
  public BigDecimal getLimiteSemanal() {
    return limiteSemanal;
  }
  public void setLimiteSemanal(BigDecimal limiteSemanal) {
    this.limiteSemanal = limiteSemanal;
  }

  
  /**
   * Valor do limite di\u00E1rio
   **/
  @ApiModelProperty(value = "Valor do limite di\u00E1rio")
  public BigDecimal getLimiteDiario() {
    return limiteDiario;
  }
  public void setLimiteDiario(BigDecimal limiteDiario) {
    this.limiteDiario = limiteDiario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleLimiteCartaoUpdate {\n");
    
    sb.append("  limiteMensal: ").append(limiteMensal).append("\n");
    sb.append("  limiteSemanal: ").append(limiteSemanal).append("\n");
    sb.append("  limiteDiario: ").append(limiteDiario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
