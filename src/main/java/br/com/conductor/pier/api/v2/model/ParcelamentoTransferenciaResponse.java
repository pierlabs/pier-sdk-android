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
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  cetAnual: ").append(cetAnual).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


