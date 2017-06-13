package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Antecipacao Simulada
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Antecipacao Simulada")
public class AntecipacaoSimuladaDetalhesResponse  {
  
  @SerializedName("idSimulacaoDetalhe")
  private Long idSimulacaoDetalhe = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("valorParcelas")
  private BigDecimal valorParcelas = null;
  @SerializedName("valorDesconto")
  private BigDecimal valorDesconto = null;
  @SerializedName("valorParcelasDesconto")
  private BigDecimal valorParcelasDesconto = null;

  
  /**
   * C\u00C3\u00B3digo identificador do detalhe da simula\u00C3\u00A7\u00C3\u00A3o de antecipa\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do detalhe da simula\u00C3\u00A7\u00C3\u00A3o de antecipa\u00C3\u00A7\u00C3\u00A3o.")
  public Long getIdSimulacaoDetalhe() {
    return idSimulacaoDetalhe;
  }
  public void setIdSimulacaoDetalhe(Long idSimulacaoDetalhe) {
    this.idSimulacaoDetalhe = idSimulacaoDetalhe;
  }

  
  /**
   * Quantidade de parcelas do plano de parcelamento simulado.
   **/
  @ApiModelProperty(value = "Quantidade de parcelas do plano de parcelamento simulado.")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Valor total das parcelas do plano de parcelamento.
   **/
  @ApiModelProperty(value = "Valor total das parcelas do plano de parcelamento.")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * Valor do desconto para o plano de parcelamento.
   **/
  @ApiModelProperty(value = "Valor do desconto para o plano de parcelamento.")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * Valor total da parcela ap\u00C3\u00B3s a aplica\u00C3\u00A7\u00C3\u00A3o do desconto.
   **/
  @ApiModelProperty(value = "Valor total da parcela ap\u00C3\u00B3s a aplica\u00C3\u00A7\u00C3\u00A3o do desconto.")
  public BigDecimal getValorParcelasDesconto() {
    return valorParcelasDesconto;
  }
  public void setValorParcelasDesconto(BigDecimal valorParcelasDesconto) {
    this.valorParcelasDesconto = valorParcelasDesconto;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoSimuladaDetalhesResponse {\n");
    
    sb.append("  idSimulacaoDetalhe: ").append(idSimulacaoDetalhe).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  valorParcelas: ").append(valorParcelas).append("\n");
    sb.append("  valorDesconto: ").append(valorDesconto).append("\n");
    sb.append("  valorParcelasDesconto: ").append(valorParcelasDesconto).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


