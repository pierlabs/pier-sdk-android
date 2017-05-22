package br.com.conductor.pier.api.v2.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Dados Cart\u00C3\u00A3o
 **/
@ApiModel(description = "Objeto Dados Cart\u00C3\u00A3o")
public class DadosCarto  {
  
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("dataValidade")
  private Date dataValidade = null;
  @SerializedName("cvv2")
  private String cvv2 = null;
  @SerializedName("nomePlastico")
  private String nomePlastico = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("status")
  private Long status = null;
  @SerializedName("statusDescricao")
  private String statusDescricao = null;
  @SerializedName("flagProvisorio")
  private Integer flagProvisorio = null;

  
  /**
   * N\u00C3\u00BAmero do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do cart\u00C3\u00A3o.")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Data de validade.
   **/
  @ApiModelProperty(value = "Data de validade.")
  public Date getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * CVV2 do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "CVV2 do cart\u00C3\u00A3o.")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   * Nome do portador.
   **/
  @ApiModelProperty(value = "Nome do portador.")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * Identificador da conta do portador.
   **/
  @ApiModelProperty(value = "Identificador da conta do portador.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identificador da cart\u00C3\u00A3o do portador.
   **/
  @ApiModelProperty(value = "Identificador da cart\u00C3\u00A3o do portador.")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Status da conta do portador.
   **/
  @ApiModelProperty(value = "Status da conta do portador.")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status da conta do portador.
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do status da conta do portador.")
  public String getStatusDescricao() {
    return statusDescricao;
  }
  public void setStatusDescricao(String statusDescricao) {
    this.statusDescricao = statusDescricao;
  }

  
  /**
   * Flag de verifica\u00C3\u00A7\u00C3\u00A3o se o cart\u00C3\u00A3o \u00C3\u00A9 provis\u00C3\u00B3rio.
   **/
  @ApiModelProperty(value = "Flag de verifica\u00C3\u00A7\u00C3\u00A3o se o cart\u00C3\u00A3o \u00C3\u00A9 provis\u00C3\u00B3rio.")
  public Integer getFlagProvisorio() {
    return flagProvisorio;
  }
  public void setFlagProvisorio(Integer flagProvisorio) {
    this.flagProvisorio = flagProvisorio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCarto {\n");
    
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  cvv2: ").append(cvv2).append("\n");
    sb.append("  nomePlastico: ").append(nomePlastico).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  statusDescricao: ").append(statusDescricao).append("\n");
    sb.append("  flagProvisorio: ").append(flagProvisorio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


