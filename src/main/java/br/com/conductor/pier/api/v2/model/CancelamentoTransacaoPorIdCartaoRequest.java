package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{cancelamento_transacao_por_id_cartao_request_description}}}
 **/
@ApiModel(description = "{{{cancelamento_transacao_por_id_cartao_request_description}}}")
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
  @SerializedName("dataHoraTerminal")
  private String dataHoraTerminal = null;
  @SerializedName("terminalRequisitante")
  private String terminalRequisitante = null;
  @SerializedName("numeroParcelas")
  private Long numeroParcelas = null;

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_nsu_origem_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_por_id_cartao_request_nsu_origem_value}}}")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * {{{cancelamento_transacao_por_id_cartao_request_nsu_origem_transacao_cancelada_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{cancelamento_transacao_por_id_cartao_request_nsu_origem_transacao_cancelada_value}}}")
  public String getNsuOrigemTransacaoCancelada() {
    return nsuOrigemTransacaoCancelada;
  }
  public void setNsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
    this.nsuOrigemTransacaoCancelada = nsuOrigemTransacaoCancelada;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_codigo_processamento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_por_id_cartao_request_codigo_processamento_value}}}")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * {{{cancelamento_transacao_por_id_cartao_request_data_hora_transacao_cancelada_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{cancelamento_transacao_por_id_cartao_request_data_hora_transacao_cancelada_value}}}")
  public String getDataHoraTransacaoCancelada() {
    return dataHoraTransacaoCancelada;
  }
  public void setDataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
  }

  
  /**
   * {{{cancelamento_transacao_por_id_cartao_request_nsu_autorizacao_transacao_cancelada_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{cancelamento_transacao_por_id_cartao_request_nsu_autorizacao_transacao_cancelada_value}}}")
  public String getNsuAutorizacaoTransacaoCancelada() {
    return nsuAutorizacaoTransacaoCancelada;
  }
  public void setNsuAutorizacaoTransacaoCancelada(String nsuAutorizacaoTransacaoCancelada) {
    this.nsuAutorizacaoTransacaoCancelada = nsuAutorizacaoTransacaoCancelada;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_valor_transacao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_por_id_cartao_request_valor_transacao_value}}}")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_numero_estabelecimento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_por_id_cartao_request_numero_estabelecimento_value}}}")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_data_hora_terminal_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_por_id_cartao_request_data_hora_terminal_value}}}")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_terminal_requisitante_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_por_id_cartao_request_terminal_requisitante_value}}}")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_numero_parcelas_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_por_id_cartao_request_numero_parcelas_value}}}")
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
    sb.append("  dataHoraTerminal: ").append(dataHoraTerminal).append("\n");
    sb.append("  terminalRequisitante: ").append(terminalRequisitante).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


