package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Detail of the resource response of simulating loan/refinancing
 **/
@ApiModel(description = "Detail of the resource response of simulating loan/refinancing")
public class PlanoParcelamentoEmprestimoResponse  {
  
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("valorParcelas")
  private BigDecimal valorParcelas = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("valorTributosIOF")
  private BigDecimal valorTributosIOF = null;
  @SerializedName("valorPercentualCET")
  private BigDecimal valorPercentualCET = null;

  
  /**
   * Parcel numbers of the loan/financing
   **/
  @ApiModelProperty(value = "Parcel numbers of the loan/financing")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Parcel Value
   **/
  @ApiModelProperty(value = "Parcel Value")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * Interest Taxes applied on the loan/financing
   **/
  @ApiModelProperty(value = "Interest Taxes applied on the loan/financing")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Total value estimated of the charge taxes on the Financial Operations
   **/
  @ApiModelProperty(value = "Total value estimated of the charge taxes on the Financial Operations")
  public BigDecimal getValorTributosIOF() {
    return valorTributosIOF;
  }
  public void setValorTributosIOF(BigDecimal valorTributosIOF) {
    this.valorTributosIOF = valorTributosIOF;
  }

  
  /**
   * Percentage value of the Total Cost, per yeat, of the loan/financing
   **/
  @ApiModelProperty(value = "Percentage value of the Total Cost, per yeat, of the loan/financing")
  public BigDecimal getValorPercentualCET() {
    return valorPercentualCET;
  }
  public void setValorPercentualCET(BigDecimal valorPercentualCET) {
    this.valorPercentualCET = valorPercentualCET;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoEmprestimoResponse {\n");
    
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  valorParcelas: ").append(valorParcelas).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  valorTributosIOF: ").append(valorTributosIOF).append("\n");
    sb.append("  valorPercentualCET: ").append(valorPercentualCET).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
