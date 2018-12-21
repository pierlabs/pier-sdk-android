package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Detail of the installment plan for credit transfer to banking accounts
 **/
@ApiModel(description = "Detail of the installment plan for credit transfer to banking accounts")
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
   * Number of the available parcels
   **/
  @ApiModelProperty(value = "Number of the available parcels")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * Value of the other parcels
   **/
  @ApiModelProperty(value = "Value of the other parcels")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * Total value of the financing
   **/
  @ApiModelProperty(value = "Total value of the financing")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * Value of the hiring fee
   **/
  @ApiModelProperty(value = "Value of the hiring fee")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * IOF calculated for the client
   **/
  @ApiModelProperty(value = "IOF calculated for the client")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Value of the interest taxes
   **/
  @ApiModelProperty(value = "Value of the interest taxes")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * CET annual
   **/
  @ApiModelProperty(value = "CET annual")
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
