package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{desfazimento_transacao_on_us_request_description}}}
 **/
@ApiModel(description = "{{{desfazimento_transacao_on_us_request_description}}}")
public class DesfazimentoTransacaoOnUsRequest  {
  
  @SerializedName("nsuOrigem")
  private String nsuOrigem = null;
  @SerializedName("nsuOrigemTransacaoCancelada")
  private String nsuOrigemTransacaoCancelada = null;
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;
  @SerializedName("dataHoraTransacaoCancelada")
  private String dataHoraTransacaoCancelada = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("numeroRealCartao")
  private String numeroRealCartao = null;
  @SerializedName("dataValidadeCartao")
  private String dataValidadeCartao = null;
  @SerializedName("numeroEstabelecimento")
  private Long numeroEstabelecimento = null;
  @SerializedName("dataHoraTerminal")
  private String dataHoraTerminal = null;
  @SerializedName("terminalRequisitante")
  private String terminalRequisitante = null;

  
  /**
   * {{{transacao_on_us_request_nsu_origem_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_request_nsu_origem_value}}}")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * {{{desfazimento_transacao_on_us_request_nsu_origem_transacao_cancelada_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{desfazimento_transacao_on_us_request_nsu_origem_transacao_cancelada_value}}}")
  public String getNsuOrigemTransacaoCancelada() {
    return nsuOrigemTransacaoCancelada;
  }
  public void setNsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
    this.nsuOrigemTransacaoCancelada = nsuOrigemTransacaoCancelada;
  }

  
  /**
   * {{{transacao_on_us_request_codigo_processamento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_request_codigo_processamento_value}}}")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * {{{desfazimento_transacao_on_us_request_data_hora_transacao_cancelada_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{desfazimento_transacao_on_us_request_data_hora_transacao_cancelada_value}}}")
  public String getDataHoraTransacaoCancelada() {
    return dataHoraTransacaoCancelada;
  }
  public void setDataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
  }

  
  /**
   * {{{transacao_on_us_request_valor_transacao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_request_valor_transacao_value}}}")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * {{{transacao_on_us_request_numero_real_cartao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_request_numero_real_cartao_value}}}")
  public String getNumeroRealCartao() {
    return numeroRealCartao;
  }
  public void setNumeroRealCartao(String numeroRealCartao) {
    this.numeroRealCartao = numeroRealCartao;
  }

  
  /**
   * {{{transacao_on_us_request_data_validade_cartao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_request_data_validade_cartao_value}}}")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * {{{transacao_on_us_request_numero_estabelecimento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_request_numero_estabelecimento_value}}}")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * {{{transacao_on_us_request_data_hora_terminal_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_request_data_hora_terminal_value}}}")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * {{{transacao_on_us_request_terminal_requisitante_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_request_terminal_requisitante_value}}}")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesfazimentoTransacaoOnUsRequest {\n");
    
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  nsuOrigemTransacaoCancelada: ").append(nsuOrigemTransacaoCancelada).append("\n");
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("  dataHoraTransacaoCancelada: ").append(dataHoraTransacaoCancelada).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  numeroRealCartao: ").append(numeroRealCartao).append("\n");
    sb.append("  dataValidadeCartao: ").append(dataValidadeCartao).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  dataHoraTerminal: ").append(dataHoraTerminal).append("\n");
    sb.append("  terminalRequisitante: ").append(terminalRequisitante).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
