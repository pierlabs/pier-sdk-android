package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Credit Transfer bank account request
 **/
@ApiModel(description = "Credit Transfer bank account request")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest  {
  
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("numeroMesesCarencia")
  private Integer numeroMesesCarencia = null;

  
  /**
   * Identification Card of the Card
   **/
  @ApiModelProperty(required = true, value = "Identification Card of the Card")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Value of transaction with two decimal places for the cents
   **/
  @ApiModelProperty(required = true, value = "Value of transaction with two decimal places for the cents")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * Represent the number of months given as shortage
   **/
  @ApiModelProperty(required = true, value = "Represent the number of months given as shortage")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest {\n");
    
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  numeroMesesCarencia: ").append(numeroMesesCarencia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
