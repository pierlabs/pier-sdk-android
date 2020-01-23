package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da fatura consolidada
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da fatura consolidada")
public class FaturaConsolidadaResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
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
  @SerializedName("linhaDigitavel")
  private String linhaDigitavel = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da Conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Indica se a fatura foi paga
   **/
  @ApiModelProperty(value = "Indica se a fatura foi paga")
  public Boolean getPagamentoEfetuado() {
    return pagamentoEfetuado;
  }
  public void setPagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
  }

  
  /**
   * Apresenta a data de vencimento da fatura em formato AAAA-MM-DD
   **/
  @ApiModelProperty(value = "Apresenta a data de vencimento da fatura em formato AAAA-MM-DD")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Quando a data de vencimento da fatura n\u00E3o for em um dia \u00FAtil, este campo apresentar\u00E1 o pr\u00F3ximo dia \u00FAtil ap\u00F3s o vencimento em formato AAAA-MM-DD
   **/
  @ApiModelProperty(value = "Quando a data de vencimento da fatura n\u00E3o for em um dia \u00FAtil, este campo apresentar\u00E1 o pr\u00F3ximo dia \u00FAtil ap\u00F3s o vencimento em formato AAAA-MM-DD")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Apresenta a data de fechamento da fatura em formato AAAA-MM-DD
   **/
  @ApiModelProperty(value = "Apresenta a data de fechamento da fatura em formato AAAA-MM-DD")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * Apresenta o valor total da fatura no momento da consulta
   **/
  @ApiModelProperty(value = "Apresenta o valor total da fatura no momento da consulta")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * Apresenta o valor para pagamento m\u00EDnimo da fatura quando esta estiver com a situa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta o valor para pagamento m\u00EDnimo da fatura quando esta estiver com a situa\u00E7\u00E3o")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * Apresenta o valor da fatura anterior
   **/
  @ApiModelProperty(value = "Apresenta o valor da fatura anterior")
  public BigDecimal getSaldoAnterior() {
    return saldoAnterior;
  }
  public void setSaldoAnterior(BigDecimal saldoAnterior) {
    this.saldoAnterior = saldoAnterior;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do boleto
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do boleto")
  public Long getIdBoleto() {
    return idBoleto;
  }
  public void setIdBoleto(Long idBoleto) {
    this.idBoleto = idBoleto;
  }

  
  /**
   * Linha digit\u00E1vel da fatura
   **/
  @ApiModelProperty(value = "Linha digit\u00E1vel da fatura")
  public String getLinhaDigitavel() {
    return linhaDigitavel;
  }
  public void setLinhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaConsolidadaResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  pagamentoEfetuado: ").append(pagamentoEfetuado).append("\n");
    sb.append("  dataVencimentoFatura: ").append(dataVencimentoFatura).append("\n");
    sb.append("  dataVencimentoReal: ").append(dataVencimentoReal).append("\n");
    sb.append("  dataFechamento: ").append(dataFechamento).append("\n");
    sb.append("  valorTotal: ").append(valorTotal).append("\n");
    sb.append("  valorPagamentoMinimo: ").append(valorPagamentoMinimo).append("\n");
    sb.append("  saldoAnterior: ").append(saldoAnterior).append("\n");
    sb.append("  idBoleto: ").append(idBoleto).append("\n");
    sb.append("  linhaDigitavel: ").append(linhaDigitavel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
