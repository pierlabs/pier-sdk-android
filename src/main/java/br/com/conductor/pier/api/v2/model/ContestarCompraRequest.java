package br.com.conductor.pier.api.v2.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{contestar_compra_request_description}}}
 **/
@ApiModel(description = "{{{contestar_compra_request_description}}}")
public class ContestarCompraRequest  {
  
  @SerializedName("codigoChargebackId")
  private Long codigoChargebackId = null;
  @SerializedName("compras")
  private List<Long> compras = null;
  @SerializedName("enviarDocumentos")
  private Boolean enviarDocumentos = null;
  @SerializedName("mensagem")
  private String mensagem = null;
  @SerializedName("mensagemCSLight")
  private String mensagemCSLight = null;
  @SerializedName("mensagemChargeback")
  private String mensagemChargeback = null;
  @SerializedName("statusId")
  private Long statusId = null;
  @SerializedName("tipoContestacaoId")
  private Long tipoContestacaoId = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getCodigoChargebackId() {
    return codigoChargebackId;
  }
  public void setCodigoChargebackId(Long codigoChargebackId) {
    this.codigoChargebackId = codigoChargebackId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<Long> getCompras() {
    return compras;
  }
  public void setCompras(List<Long> compras) {
    this.compras = compras;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEnviarDocumentos() {
    return enviarDocumentos;
  }
  public void setEnviarDocumentos(Boolean enviarDocumentos) {
    this.enviarDocumentos = enviarDocumentos;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMensagemCSLight() {
    return mensagemCSLight;
  }
  public void setMensagemCSLight(String mensagemCSLight) {
    this.mensagemCSLight = mensagemCSLight;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMensagemChargeback() {
    return mensagemChargeback;
  }
  public void setMensagemChargeback(String mensagemChargeback) {
    this.mensagemChargeback = mensagemChargeback;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getStatusId() {
    return statusId;
  }
  public void setStatusId(Long statusId) {
    this.statusId = statusId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTipoContestacaoId() {
    return tipoContestacaoId;
  }
  public void setTipoContestacaoId(Long tipoContestacaoId) {
    this.tipoContestacaoId = tipoContestacaoId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestarCompraRequest {\n");
    
    sb.append("  codigoChargebackId: ").append(codigoChargebackId).append("\n");
    sb.append("  compras: ").append(compras).append("\n");
    sb.append("  enviarDocumentos: ").append(enviarDocumentos).append("\n");
    sb.append("  mensagem: ").append(mensagem).append("\n");
    sb.append("  mensagemCSLight: ").append(mensagemCSLight).append("\n");
    sb.append("  mensagemChargeback: ").append(mensagemChargeback).append("\n");
    sb.append("  statusId: ").append(statusId).append("\n");
    sb.append("  tipoContestacaoId: ").append(tipoContestacaoId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
