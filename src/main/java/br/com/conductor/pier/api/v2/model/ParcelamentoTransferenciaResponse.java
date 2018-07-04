package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{parcelamento_transferencia_response_description}}}
 **/
@ApiModel(description = "{{{parcelamento_transferencia_response_description}}}")
public class ParcelamentoTransferenciaResponse  {
  
  @SerializedName("numeroParcela")
  private Integer numeroParcela = null;
  @SerializedName("valorParcelas")
  private BigDecimal valorParcelas = null;
  @SerializedName("valorTotal")
  private BigDecimal valorTotal = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;
  @SerializedName("valorIOF")
  private BigDecimal valorIOF = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("cetAnual")
  private BigDecimal cetAnual = null;

  
  /**
   * {{{parcelamento_transferencia_response_numero_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_transferencia_response_numero_parcela_value}}}")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * {{{parcelamento_transferencia_response_valor_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_transferencia_response_valor_parcelas_value}}}")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * {{{parcelamento_transferencia_response_valor_total_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_transferencia_response_valor_total_value}}}")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * {{{parcelamento_transferencia_response_valor_t_a_c_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_transferencia_response_valor_t_a_c_value}}}")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * {{{parcelamento_transferencia_response_valor_i_o_f_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_transferencia_response_valor_i_o_f_value}}}")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * {{{parcelamento_transferencia_response_taxa_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_transferencia_response_taxa_juros_value}}}")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * {{{parcelamento_transferencia_response_cet_anual_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_transferencia_response_cet_anual_value}}}")
  public BigDecimal getCetAnual() {
    return cetAnual;
  }
  public void setCetAnual(BigDecimal cetAnual) {
    this.cetAnual = cetAnual;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelamentoTransferenciaResponse {\n");
    
    sb.append("  numeroParcela: ").append(numeroParcela).append("\n");
    sb.append("  valorParcelas: ").append(valorParcelas).append("\n");
    sb.append("  valorTotal: ").append(valorTotal).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("  valorIOF: ").append(valorIOF).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  cetAnual: ").append(cetAnual).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


