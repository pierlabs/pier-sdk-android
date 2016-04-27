package br.com.conductor.pier.api.v1.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ConsultarContaCartaoResponse  {
  
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("descricaoEstagio")
  private String descricaoEstagio = null;
  @SerializedName("descricaoStatus")
  private String descricaoStatus = null;
  @SerializedName("estagio")
  private Integer estagio = null;
  @SerializedName("flagCancelamento")
  private Boolean flagCancelamento = null;
  @SerializedName("idCartao")
  private Integer idCartao = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("portador")
  private String portador = null;
  @SerializedName("portadorId")
  private Integer portadorId = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("statusData")
  private Date statusData = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoEstagio() {
    return descricaoEstagio;
  }
  public void setDescricaoEstagio(String descricaoEstagio) {
    this.descricaoEstagio = descricaoEstagio;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEstagio() {
    return estagio;
  }
  public void setEstagio(Integer estagio) {
    this.estagio = estagio;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagCancelamento() {
    return flagCancelamento;
  }
  public void setFlagCancelamento(Boolean flagCancelamento) {
    this.flagCancelamento = flagCancelamento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Integer idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getPortador() {
    return portador;
  }
  public void setPortador(String portador) {
    this.portador = portador;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPortadorId() {
    return portadorId;
  }
  public void setPortadorId(Integer portadorId) {
    this.portadorId = portadorId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getStatusData() {
    return statusData;
  }
  public void setStatusData(Date statusData) {
    this.statusData = statusData;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarContaCartaoResponse {\n");
    
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  descricaoEstagio: ").append(descricaoEstagio).append("\n");
    sb.append("  descricaoStatus: ").append(descricaoStatus).append("\n");
    sb.append("  estagio: ").append(estagio).append("\n");
    sb.append("  flagCancelamento: ").append(flagCancelamento).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  portador: ").append(portador).append("\n");
    sb.append("  portadorId: ").append(portadorId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  statusData: ").append(statusData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


