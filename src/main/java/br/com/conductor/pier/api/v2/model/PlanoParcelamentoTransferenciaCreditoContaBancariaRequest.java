package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Transfer\u00EAncia cr\u00E9dito conta banc\u00E1ria request
 **/
@ApiModel(description = "Transfer\u00EAncia cr\u00E9dito conta banc\u00E1ria request")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest  {
  
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("numeroMesesCarencia")
  private Integer numeroMesesCarencia = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o.
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o.")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o com duas casas decimais para os centavos.
   **/
  @ApiModelProperty(required = true, value = "Valor da transa\u00E7\u00E3o com duas casas decimais para os centavos.")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * Representa o N\u00FAmero de Meses concedido como car\u00EAncia.
   **/
  @ApiModelProperty(required = true, value = "Representa o N\u00FAmero de Meses concedido como car\u00EAncia.")
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
