package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{transacao_pay_secure_request_description}}}
 **/
@ApiModel(description = "{{{transacao_pay_secure_request_description}}}")
public class TransacaoPaySecureRequest  {
  
  @SerializedName("dataHoraTransacao")
  private String dataHoraTransacao = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("nsuOrigem")
  private String nsuOrigem = null;
  @SerializedName("nomePortadorCartao")
  private String nomePortadorCartao = null;
  @SerializedName("origem")
  private String origem = null;
  @SerializedName("terminalRequisitante")
  private String terminalRequisitante = null;
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;
  @SerializedName("dataValidadeCartao")
  private String dataValidadeCartao = null;
  @SerializedName("numeroEstabelecimento")
  private String numeroEstabelecimento = null;
  @SerializedName("numeroParcelas")
  private Long numeroParcelas = null;
  @SerializedName("codigoSegurancaCartao")
  private String codigoSegurancaCartao = null;
  @SerializedName("sort")
  private List<String> sort = null;

  
  /**
   * {{{transacao_pay_secure_request_data_hora_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_pay_secure_request_data_hora_transacao_value}}}")
  public String getDataHoraTransacao() {
    return dataHoraTransacao;
  }
  public void setDataHoraTransacao(String dataHoraTransacao) {
    this.dataHoraTransacao = dataHoraTransacao;
  }

  
  /**
   * {{{transacao_pay_generic_request_numero_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_pay_generic_request_numero_cartao_value}}}")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{transacao_pay_generic_request_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_pay_generic_request_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{transacao_pay_secure_request_valor_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_pay_secure_request_valor_value}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{transacao_pay_secure_request_nsu_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_pay_secure_request_nsu_origem_value}}}")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * {{{transacao_pay_secure_request_nome_portador_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_pay_secure_request_nome_portador_cartao_value}}}")
  public String getNomePortadorCartao() {
    return nomePortadorCartao;
  }
  public void setNomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
  }

  
  /**
   * {{{transacao_pay_generic_request_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_pay_generic_request_origem_value}}}")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * {{{transacao_pay_secure_request_terminal_requisitante_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_pay_secure_request_terminal_requisitante_value}}}")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * {{{transacao_pay_secure_request_codigo_processamento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_pay_secure_request_codigo_processamento_value}}}")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * {{{transacao_pay_secure_request_data_validade_cartao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_pay_secure_request_data_validade_cartao_value}}}")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * {{{transacao_pay_secure_request_numero_estabelecimento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_pay_secure_request_numero_estabelecimento_value}}}")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * {{{transacao_pay_secure_request_numero_parcelas_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_pay_secure_request_numero_parcelas_value}}}")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{transacao_pay_secure_request_codigo_seguranca_cartao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_pay_secure_request_codigo_seguranca_cartao_value}}}")
  public String getCodigoSegurancaCartao() {
    return codigoSegurancaCartao;
  }
  public void setCodigoSegurancaCartao(String codigoSegurancaCartao) {
    this.codigoSegurancaCartao = codigoSegurancaCartao;
  }

  
  /**
   * {{{global_menssagem_sort_sort}}}
   **/
  @ApiModelProperty(value = "{{{global_menssagem_sort_sort}}}")
  public List<String> getSort() {
    return sort;
  }
  public void setSort(List<String> sort) {
    this.sort = sort;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoPaySecureRequest {\n");
    
    sb.append("  dataHoraTransacao: ").append(dataHoraTransacao).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  nomePortadorCartao: ").append(nomePortadorCartao).append("\n");
    sb.append("  origem: ").append(origem).append("\n");
    sb.append("  terminalRequisitante: ").append(terminalRequisitante).append("\n");
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("  dataValidadeCartao: ").append(dataValidadeCartao).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  codigoSegurancaCartao: ").append(codigoSegurancaCartao).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


