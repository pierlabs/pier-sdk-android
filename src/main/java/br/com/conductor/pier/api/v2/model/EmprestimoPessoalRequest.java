package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Representation of the Device resource
 **/
@ApiModel(description = "Request Representation of the Device resource")
public class EmprestimoPessoalRequest  {
  
  @SerializedName("valorSolicitado")
  private BigDecimal valorSolicitado = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("periodoTaxa")
  private String periodoTaxa = null;
  @SerializedName("sistemaAmortizacao")
  private String sistemaAmortizacao = null;
  @SerializedName("numeroMesesCarencia")
  private Integer numeroMesesCarencia = null;

  
  /**
   * Value of the Loan/financing
   **/
  @ApiModelProperty(required = true, value = "Value of the Loan/financing")
  public BigDecimal getValorSolicitado() {
    return valorSolicitado;
  }
  public void setValorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
  }

  
  /**
   * Total Number of the portions of the loan/financing
   **/
  @ApiModelProperty(required = true, value = "Total Number of the portions of the loan/financing")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Percent value of the taxes of interest to be applied
   **/
  @ApiModelProperty(required = true, value = "Percent value of the taxes of interest to be applied")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Period of application of the taxes of interest
   **/
  @ApiModelProperty(required = true, value = "Period of application of the taxes of interest")
  public String getPeriodoTaxa() {
    return periodoTaxa;
  }
  public void setPeriodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
  }

  
  /**
   * System to diminish the value of the portions
   **/
  @ApiModelProperty(required = true, value = "System to diminish the value of the portions")
  public String getSistemaAmortizacao() {
    return sistemaAmortizacao;
  }
  public void setSistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
  }

  
  /**
   * Number of months to the collection of the first portion
   **/
  @ApiModelProperty(value = "Number of months to the collection of the first portion")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmprestimoPessoalRequest {\n");
    
    sb.append("  valorSolicitado: ").append(valorSolicitado).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  periodoTaxa: ").append(periodoTaxa).append("\n");
    sb.append("  sistemaAmortizacao: ").append(sistemaAmortizacao).append("\n");
    sb.append("  numeroMesesCarencia: ").append(numeroMesesCarencia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
