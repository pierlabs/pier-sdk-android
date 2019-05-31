package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Transa\u00E7\u00F5es pelo tipo de terminal
 **/
@ApiModel(description = "Transa\u00E7\u00F5es pelo tipo de terminal")
public class TipoTerminalTransacoesResponse  {
  
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;
  @SerializedName("conta")
  private Long conta = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("dataTransacao")
  private String dataTransacao = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("nomePortador")
  private String nomePortador = null;
  @SerializedName("nsuEmissor")
  private Integer nsuEmissor = null;
  @SerializedName("nsuOrigem")
  private Integer nsuOrigem = null;
  @SerializedName("statusConta")
  private Integer statusConta = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;

  
  /**
   * C\u00F3digo de processamento
   **/
  @ApiModelProperty(value = "C\u00F3digo de processamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Conta
   **/
  @ApiModelProperty(value = "Conta")
  public Long getConta() {
    return conta;
  }
  public void setConta(Long conta) {
    this.conta = conta;
  }

  
  /**
   * CPF
   **/
  @ApiModelProperty(value = "CPF")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Data da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data da transa\u00E7\u00E3o")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identificador do cart\u00E3o
   **/
  @ApiModelProperty(value = "Identificador do cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Nome do portador do cart\u00E3o
   **/
  @ApiModelProperty(value = "Nome do portador do cart\u00E3o")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * NSU Emissor
   **/
  @ApiModelProperty(value = "NSU Emissor")
  public Integer getNsuEmissor() {
    return nsuEmissor;
  }
  public void setNsuEmissor(Integer nsuEmissor) {
    this.nsuEmissor = nsuEmissor;
  }

  
  /**
   * NSU Origem
   **/
  @ApiModelProperty(value = "NSU Origem")
  public Integer getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Integer nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * Status da conta
   **/
  @ApiModelProperty(value = "Status da conta")
  public Integer getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Integer statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Valor da transa\u00E7\u00E3o")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoTerminalTransacoesResponse {\n");
    
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("  conta: ").append(conta).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  dataTransacao: ").append(dataTransacao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  nomePortador: ").append(nomePortador).append("\n");
    sb.append("  nsuEmissor: ").append(nsuEmissor).append("\n");
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
