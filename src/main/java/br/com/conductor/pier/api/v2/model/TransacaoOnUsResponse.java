package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.MapOfstringAndstring;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{transacao_on_us_response_description}}}
 **/
@ApiModel(description = "{{{transacao_on_us_response_description}}}")
public class TransacaoOnUsResponse  {
  
  @SerializedName("nsuOrigem")
  private String nsuOrigem = null;
  @SerializedName("nsuAutorizacao")
  private String nsuAutorizacao = null;
  @SerializedName("planoDeParcelamento")
  private List<MapOfstringAndstring> planoDeParcelamento = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("numeroMascaradoCartao")
  private String numeroMascaradoCartao = null;
  @SerializedName("nomePortadorCartao")
  private String nomePortadorCartao = null;
  @SerializedName("terminalRequisitante")
  private String terminalRequisitante = null;

  
  /**
   * {{{transacao_on_us_response_nsu_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_on_us_response_nsu_origem_value}}}")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * {{{transacao_on_us_response_nsu_autorizacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_on_us_response_nsu_autorizacao_value}}}")
  public String getNsuAutorizacao() {
    return nsuAutorizacao;
  }
  public void setNsuAutorizacao(String nsuAutorizacao) {
    this.nsuAutorizacao = nsuAutorizacao;
  }

  
  /**
   * {{{transacao_on_us_response_plano_de_parcelamento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_on_us_response_plano_de_parcelamento_value}}}")
  public List<MapOfstringAndstring> getPlanoDeParcelamento() {
    return planoDeParcelamento;
  }
  public void setPlanoDeParcelamento(List<MapOfstringAndstring> planoDeParcelamento) {
    this.planoDeParcelamento = planoDeParcelamento;
  }

  
  /**
   * {{{transacao_on_us_response_codigo_autorizacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_on_us_response_codigo_autorizacao_value}}}")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * {{{transacao_on_us_response_numero_mascarado_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_on_us_response_numero_mascarado_cartao_value}}}")
  public String getNumeroMascaradoCartao() {
    return numeroMascaradoCartao;
  }
  public void setNumeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
  }

  
  /**
   * {{{transacao_on_us_response_nome_portador_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_on_us_response_nome_portador_cartao_value}}}")
  public String getNomePortadorCartao() {
    return nomePortadorCartao;
  }
  public void setNomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
  }

  
  /**
   * {{{transacao_on_us_response_terminal_requisitante_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transacao_on_us_response_terminal_requisitante_value}}}")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoOnUsResponse {\n");
    
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  nsuAutorizacao: ").append(nsuAutorizacao).append("\n");
    sb.append("  planoDeParcelamento: ").append(planoDeParcelamento).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  numeroMascaradoCartao: ").append(numeroMascaradoCartao).append("\n");
    sb.append("  nomePortadorCartao: ").append(nomePortadorCartao).append("\n");
    sb.append("  terminalRequisitante: ").append(terminalRequisitante).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


