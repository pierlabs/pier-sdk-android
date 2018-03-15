package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do recurso de transa\u00E7\u00E3o segura conductorPay
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do recurso de transa\u00E7\u00E3o segura conductorPay")
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
   * Data e hora utilizado na gera\u00E7\u00E3o do criptograma em GMT - 0
   **/
  @ApiModelProperty(value = "Data e hora utilizado na gera\u00E7\u00E3o do criptograma em GMT - 0")
  public String getDataHoraTransacao() {
    return dataHoraTransacao;
  }
  public void setDataHoraTransacao(String dataHoraTransacao) {
    this.dataHoraTransacao = dataHoraTransacao;
  }

  
  /**
   * Numero do cartao (criptografado)
   **/
  @ApiModelProperty(value = "Numero do cartao (criptografado)")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Id do cart\u00E3o
   **/
  @ApiModelProperty(value = "Id do cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o em moeda local
   **/
  @ApiModelProperty(value = "Valor da transa\u00E7\u00E3o em moeda local")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou (critografado).
   **/
  @ApiModelProperty(value = "N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou (critografado).")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * Nome do Portador do Cart\u00E3o que originou a transa\u00E7\u00E3o (criptografado).
   **/
  @ApiModelProperty(value = "Nome do Portador do Cart\u00E3o que originou a transa\u00E7\u00E3o (criptografado).")
  public String getNomePortadorCartao() {
    return nomePortadorCartao;
  }
  public void setNomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
  }

  
  /**
   * Origem da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Origem da transa\u00E7\u00E3o")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Apresenta a identifica\u00E7\u00E3o do terminal requisitante
   **/
  @ApiModelProperty(required = true, value = "Apresenta a identifica\u00E7\u00E3o do terminal requisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * C\u00F3digo de Processamento que identifica o Tipo da Transa\u00E7\u00E3o.
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Processamento que identifica o Tipo da Transa\u00E7\u00E3o.")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Data de Validade do Cart\u00E3o. Ex: AAMM
   **/
  @ApiModelProperty(required = true, value = "Data de Validade do Cart\u00E3o. Ex: AAMM")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * N\u00FAmero do Estabelecimento (N\u00FAmero+DV).
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero do Estabelecimento (N\u00FAmero+DV).")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * N\u00FAmero de Parcelas.
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero de Parcelas.")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * C\u00F3digo de Seguran\u00E7a do Cart\u00E3o (criptografado).
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Seguran\u00E7a do Cart\u00E3o (criptografado).")
  public String getCodigoSegurancaCartao() {
    return codigoSegurancaCartao;
  }
  public void setCodigoSegurancaCartao(String codigoSegurancaCartao) {
    this.codigoSegurancaCartao = codigoSegurancaCartao;
  }

  
  /**
   * Tipo de ordena\u00E7\u00E3o dos registros.
   **/
  @ApiModelProperty(value = "Tipo de ordena\u00E7\u00E3o dos registros.")
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
