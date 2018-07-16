package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{antecipacao_simulada_detalhes_response_description}}}
 **/
@ApiModel(description = "{{{antecipacao_simulada_detalhes_response_description}}}")
public class AntecipacaoSimuladaDetalhesResponse  {
  
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("valorParcelas")
  private BigDecimal valorParcelas = null;
  @SerializedName("valorDesconto")
  private BigDecimal valorDesconto = null;
  @SerializedName("valorParcelasDesconto")
  private BigDecimal valorParcelasDesconto = null;

  
  /**
   * {{{antecipacao_simulada_detalhes_response_quantidade_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_detalhes_response_quantidade_parcelas_value}}}")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * {{{antecipacao_simulada_detalhes_response_valor_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_detalhes_response_valor_parcelas_value}}}")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * {{{antecipacao_simulada_detalhes_response_valor_desconto_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_detalhes_response_valor_desconto_value}}}")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * {{{antecipacao_simulada_detalhes_response_valor_parcelas_desconto_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_detalhes_response_valor_parcelas_desconto_value}}}")
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
    
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  valorParcelas: ").append(valorParcelas).append("\n");
    sb.append("  valorDesconto: ").append(valorDesconto).append("\n");
    sb.append("  valorParcelasDesconto: ").append(valorParcelasDesconto).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


