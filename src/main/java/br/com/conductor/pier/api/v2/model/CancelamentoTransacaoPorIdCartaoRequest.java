package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Cancellation request object of the transaction per idCard
 **/
@ApiModel(description = "Cancellation request object of the transaction per idCard")
public class CancelamentoTransacaoPorIdCartaoRequest  {
  
  @SerializedName("nsuOrigem")
  private String nsuOrigem = null;
  @SerializedName("nsuOrigemTransacaoCancelada")
  private String nsuOrigemTransacaoCancelada = null;
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;
  @SerializedName("dataHoraTransacaoCancelada")
  private String dataHoraTransacaoCancelada = null;
  @SerializedName("nsuAutorizacaoTransacaoCancelada")
  private String nsuAutorizacaoTransacaoCancelada = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("numeroEstabelecimento")
  private Long numeroEstabelecimento = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("dataHoraTerminal")
  private String dataHoraTerminal = null;
  @SerializedName("terminalRequisitante")
  private String terminalRequisitante = null;
  @SerializedName("numeroParcelas")
  private Long numeroParcelas = null;

  
  /**
   * Unique Sequel Number that identifies the transaction in the system that originated it
   **/
  @ApiModelProperty(required = true, value = "Unique Sequel Number that identifies the transaction in the system that originated it")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * Unique Sequel Number that identifies the transaction in the system to be canceled
   **/
  @ApiModelProperty(required = true, value = "Unique Sequel Number that identifies the transaction in the system to be canceled")
  public String getNsuOrigemTransacaoCancelada() {
    return nsuOrigemTransacaoCancelada;
  }
  public void setNsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
    this.nsuOrigemTransacaoCancelada = nsuOrigemTransacaoCancelada;
  }

  
  /**
   * Code of Processing that identifies the type of transaction
   **/
  @ApiModelProperty(required = true, value = "Code of Processing that identifies the type of transaction")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Show the date and local time of the Transaction to be canceled yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   **/
  @ApiModelProperty(required = true, value = "Show the date and local time of the Transaction to be canceled yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00")
  public String getDataHoraTransacaoCancelada() {
    return dataHoraTransacaoCancelada;
  }
  public void setDataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
  }

  
  /**
   * Unique Sequel Number of HOST that identifies the transactionin the system that was authorized
   **/
  @ApiModelProperty(required = true, value = "Unique Sequel Number of HOST that identifies the transactionin the system that was authorized")
  public String getNsuAutorizacaoTransacaoCancelada() {
    return nsuAutorizacaoTransacaoCancelada;
  }
  public void setNsuAutorizacaoTransacaoCancelada(String nsuAutorizacaoTransacaoCancelada) {
    this.nsuAutorizacaoTransacaoCancelada = nsuAutorizacaoTransacaoCancelada;
  }

  
  /**
   * Value of the transaction with two decimal places for the cents
   **/
  @ApiModelProperty(required = true, value = "Value of the transaction with two decimal places for the cents")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * Number of the Establishment (Number+DV)
   **/
  @ApiModelProperty(required = true, value = "Number of the Establishment (Number+DV)")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Establishment Name
   **/
  @ApiModelProperty(value = "Establishment Name")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Show the date and local time of the retrievement yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   **/
  @ApiModelProperty(required = true, value = "Show the date and local time of the retrievement yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * Show the identification of the terminal applicant
   **/
  @ApiModelProperty(required = true, value = "Show the identification of the terminal applicant")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * Number of Parcels
   **/
  @ApiModelProperty(required = true, value = "Number of Parcels")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelamentoTransacaoPorIdCartaoRequest {\n");
    
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  nsuOrigemTransacaoCancelada: ").append(nsuOrigemTransacaoCancelada).append("\n");
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("  dataHoraTransacaoCancelada: ").append(dataHoraTransacaoCancelada).append("\n");
    sb.append("  nsuAutorizacaoTransacaoCancelada: ").append(nsuAutorizacaoTransacaoCancelada).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  dataHoraTerminal: ").append(dataHoraTerminal).append("\n");
    sb.append("  terminalRequisitante: ").append(terminalRequisitante).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
