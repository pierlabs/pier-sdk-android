package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Detalhe do plano de parcelamento para Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias
 **/
@ApiModel(description = "Detalhe do plano de parcelamento para Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias")
public class ParcelamentoTransferenciaResponse  {
  
  @SerializedName("numeroParcela")
  private String numeroParcela = null;
  @SerializedName("valorPrimeiraParcela")
  private BigDecimal valorPrimeiraParcela = null;
  @SerializedName("valorDemaisParcelas")
  private BigDecimal valorDemaisParcelas = null;
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
   * N\u00C3\u00BAmero de parcelas dispon\u00C3\u00ADveis.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero de parcelas dispon\u00C3\u00ADveis.")
  public String getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(String numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * Valor da primeira parcela.
   **/
  @ApiModelProperty(value = "Valor da primeira parcela.")
  public BigDecimal getValorPrimeiraParcela() {
    return valorPrimeiraParcela;
  }
  public void setValorPrimeiraParcela(BigDecimal valorPrimeiraParcela) {
    this.valorPrimeiraParcela = valorPrimeiraParcela;
  }

  
  /**
   * Valor das demais parcelas.
   **/
  @ApiModelProperty(value = "Valor das demais parcelas.")
  public BigDecimal getValorDemaisParcelas() {
    return valorDemaisParcelas;
  }
  public void setValorDemaisParcelas(BigDecimal valorDemaisParcelas) {
    this.valorDemaisParcelas = valorDemaisParcelas;
  }

  
  /**
   * Valor total do financiamento.
   **/
  @ApiModelProperty(value = "Valor total do financiamento.")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * Valor da tarifa de contrata\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Valor da tarifa de contrata\u00C3\u00A7\u00C3\u00A3o.")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * IOF
   **/
  @ApiModelProperty(value = "IOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor da taxa de juros.
   **/
  @ApiModelProperty(value = "Valor da taxa de juros.")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * CET anual.
   **/
  @ApiModelProperty(value = "CET anual.")
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
    sb.append("  valorPrimeiraParcela: ").append(valorPrimeiraParcela).append("\n");
    sb.append("  valorDemaisParcelas: ").append(valorDemaisParcelas).append("\n");
    sb.append("  valorTotal: ").append(valorTotal).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("  valorIOF: ").append(valorIOF).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  cetAnual: ").append(cetAnual).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


