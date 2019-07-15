package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.MapOfstringAndobject;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de Resposta de Autoriza\u00E7\u00E3o
 **/
@ApiModel(description = "Objeto de Resposta de Autoriza\u00E7\u00E3o")
public class TransacaoOnUsResponse  {
  
  @SerializedName("nsuOrigem")
  private String nsuOrigem = null;
  @SerializedName("nsuAutorizacao")
  private String nsuAutorizacao = null;
  @SerializedName("planoDeParcelamento")
  private List<MapOfstringAndobject> planoDeParcelamento = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("numeroMascaradoCartao")
  private String numeroMascaradoCartao = null;
  @SerializedName("nomePortadorCartao")
  private String nomePortadorCartao = null;
  @SerializedName("terminalRequisitante")
  private String terminalRequisitante = null;

  
  /**
   * N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou
   **/
  @ApiModelProperty(value = "N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * N\u00FAmero Sequencial \u00DAnico gerado pelo Autorizador a cada Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "N\u00FAmero Sequencial \u00DAnico gerado pelo Autorizador a cada Transa\u00E7\u00E3o")
  public String getNsuAutorizacao() {
    return nsuAutorizacao;
  }
  public void setNsuAutorizacao(String nsuAutorizacao) {
    this.nsuAutorizacao = nsuAutorizacao;
  }

  
  /**
   * Descri\u00E7\u00E3o do Plano de Parcelamento atribu\u00EDdo a Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do Plano de Parcelamento atribu\u00EDdo a Transa\u00E7\u00E3o")
  public List<MapOfstringAndobject> getPlanoDeParcelamento() {
    return planoDeParcelamento;
  }
  public void setPlanoDeParcelamento(List<MapOfstringAndobject> planoDeParcelamento) {
    this.planoDeParcelamento = planoDeParcelamento;
  }

  
  /**
   * C\u00F3digo de Autoriza\u00E7\u00E3o gerado pelo Autorizador
   **/
  @ApiModelProperty(value = "C\u00F3digo de Autoriza\u00E7\u00E3o gerado pelo Autorizador")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * N\u00FAmero do Cart\u00E3o que originou a transa\u00E7\u00E3o em formato mascarado
   **/
  @ApiModelProperty(value = "N\u00FAmero do Cart\u00E3o que originou a transa\u00E7\u00E3o em formato mascarado")
  public String getNumeroMascaradoCartao() {
    return numeroMascaradoCartao;
  }
  public void setNumeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
  }

  
  /**
   * Nome do Portador do Cart\u00E3o que originou a transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Nome do Portador do Cart\u00E3o que originou a transa\u00E7\u00E3o")
  public String getNomePortadorCartao() {
    return nomePortadorCartao;
  }
  public void setNomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
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
