package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Future Invoice
 **/
@ApiModel(description = "Future Invoice")
public class FaturaResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  public enum SituacaoProcessamentoEnum {
     ABERTA,  FECHADA,  TODAS, 
  };
  @SerializedName("situacaoProcessamento")
  private SituacaoProcessamentoEnum situacaoProcessamento = null;
  @SerializedName("pagamentoEfetuado")
  private Boolean pagamentoEfetuado = null;
  @SerializedName("dataVencimentoFatura")
  private String dataVencimentoFatura = null;
  @SerializedName("dataVencimentoReal")
  private String dataVencimentoReal = null;
  @SerializedName("dataFechamento")
  private String dataFechamento = null;
  @SerializedName("valorTotal")
  private BigDecimal valorTotal = null;
  @SerializedName("valorPagamentoMinimo")
  private BigDecimal valorPagamentoMinimo = null;
  @SerializedName("saldoAnterior")
  private BigDecimal saldoAnterior = null;
  @SerializedName("idBoleto")
  private Long idBoleto = null;

  
  /**
   * Identification Code of the Account
   **/
  @ApiModelProperty(value = "Identification Code of the Account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Processing situation of the invoice
   **/
  @ApiModelProperty(value = "Processing situation of the invoice")
  public SituacaoProcessamentoEnum getSituacaoProcessamento() {
    return situacaoProcessamento;
  }
  public void setSituacaoProcessamento(SituacaoProcessamentoEnum situacaoProcessamento) {
    this.situacaoProcessamento = situacaoProcessamento;
  }

  
  /**
   * Effected Payment Status
   **/
  @ApiModelProperty(value = "Effected Payment Status")
  public Boolean getPagamentoEfetuado() {
    return pagamentoEfetuado;
  }
  public void setPagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
  }

  
  /**
   * Expiration date of the invoice
   **/
  @ApiModelProperty(value = "Expiration date of the invoice")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Real expiration date of the invoice
   **/
  @ApiModelProperty(value = "Real expiration date of the invoice")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Closing date of the invoice
   **/
  @ApiModelProperty(value = "Closing date of the invoice")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * Total value of the invoice
   **/
  @ApiModelProperty(value = "Total value of the invoice")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * Value of the minimum payment
   **/
  @ApiModelProperty(value = "Value of the minimum payment")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * Value of the previous value
   **/
  @ApiModelProperty(value = "Value of the previous value")
  public BigDecimal getSaldoAnterior() {
    return saldoAnterior;
  }
  public void setSaldoAnterior(BigDecimal saldoAnterior) {
    this.saldoAnterior = saldoAnterior;
  }

  
  /**
   * Identification Code of the Ticket
   **/
  @ApiModelProperty(value = "Identification Code of the Ticket")
  public Long getIdBoleto() {
    return idBoleto;
  }
  public void setIdBoleto(Long idBoleto) {
    this.idBoleto = idBoleto;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  situacaoProcessamento: ").append(situacaoProcessamento).append("\n");
    sb.append("  pagamentoEfetuado: ").append(pagamentoEfetuado).append("\n");
    sb.append("  dataVencimentoFatura: ").append(dataVencimentoFatura).append("\n");
    sb.append("  dataVencimentoReal: ").append(dataVencimentoReal).append("\n");
    sb.append("  dataFechamento: ").append(dataFechamento).append("\n");
    sb.append("  valorTotal: ").append(valorTotal).append("\n");
    sb.append("  valorPagamentoMinimo: ").append(valorPagamentoMinimo).append("\n");
    sb.append("  saldoAnterior: ").append(saldoAnterior).append("\n");
    sb.append("  idBoleto: ").append(idBoleto).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
