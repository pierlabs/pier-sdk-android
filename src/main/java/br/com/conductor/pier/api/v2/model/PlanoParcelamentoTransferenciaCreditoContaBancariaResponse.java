package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PlanoParcelamentoTransferenciaResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Plano de Parcelamentos para Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias
 **/
@ApiModel(description = "Plano de Parcelamentos para Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaResponse  {
  
  @SerializedName("nsuOrigem")
  private String nsuOrigem = null;
  @SerializedName("numeroMascaradoCartao")
  private String numeroMascaradoCartao = null;
  @SerializedName("terminalRequisitante")
  private String terminalRequisitante = null;
  @SerializedName("planoParcelamentos")
  private List<PlanoParcelamentoTransferenciaResponse> planoParcelamentos = null;

  
  /**
   * N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * N\u00C3\u00BAmero do Cart\u00C3\u00A3o que originou a transa\u00C3\u00A7\u00C3\u00A3o em formato mascarado.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do Cart\u00C3\u00A3o que originou a transa\u00C3\u00A7\u00C3\u00A3o em formato mascarado.")
  public String getNumeroMascaradoCartao() {
    return numeroMascaradoCartao;
  }
  public void setNumeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
  }

  
  /**
   * Apresenta a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante
   **/
  @ApiModelProperty(value = "Apresenta a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * Lista os planos de parcelamentos
   **/
  @ApiModelProperty(value = "Lista os planos de parcelamentos")
  public List<PlanoParcelamentoTransferenciaResponse> getPlanoParcelamentos() {
    return planoParcelamentos;
  }
  public void setPlanoParcelamentos(List<PlanoParcelamentoTransferenciaResponse> planoParcelamentos) {
    this.planoParcelamentos = planoParcelamentos;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoTransferenciaCreditoContaBancariaResponse {\n");
    
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  numeroMascaradoCartao: ").append(numeroMascaradoCartao).append("\n");
    sb.append("  terminalRequisitante: ").append(terminalRequisitante).append("\n");
    sb.append("  planoParcelamentos: ").append(planoParcelamentos).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
