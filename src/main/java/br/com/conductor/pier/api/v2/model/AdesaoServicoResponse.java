package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Reponse object for services adhesion
 **/
@ApiModel(description = "Reponse object for services adhesion")
public class AdesaoServicoResponse  {
  
  @SerializedName("canal")
  private String canal = null;
  @SerializedName("cobrancaLimiteCredito")
  private Boolean cobrancaLimiteCredito = null;
  @SerializedName("estabelecimento")
  private Integer estabelecimento = null;
  @SerializedName("flagCobrancaLimiteCredito")
  private Boolean flagCobrancaLimiteCredito = null;
  @SerializedName("flagOfertasPromocoes")
  private Boolean flagOfertasPromocoes = null;
  @SerializedName("flagPromocoes")
  private Boolean flagPromocoes = null;
  @SerializedName("flagTipoEnvioFatura")
  private Boolean flagTipoEnvioFatura = null;
  @SerializedName("flagTipoSms")
  private Boolean flagTipoSms = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("responsavel")
  private String responsavel = null;
  @SerializedName("tipoEnvioFatura")
  private Integer tipoEnvioFatura = null;
  public enum TipoSmsEnum {
     CONTROLE,  NOTIFICACAO,  ALERTA, 
  };
  @SerializedName("tipoSms")
  private TipoSmsEnum tipoSms = null;

  
  /**
   * Input channer
   **/
  @ApiModelProperty(value = "Input channer")
  public String getCanal() {
    return canal;
  }
  public void setCanal(String canal) {
    this.canal = canal;
  }

  
  /**
   * Credit limit charge
   **/
  @ApiModelProperty(value = "Credit limit charge")
  public Boolean getCobrancaLimiteCredito() {
    return cobrancaLimiteCredito;
  }
  public void setCobrancaLimiteCredito(Boolean cobrancaLimiteCredito) {
    this.cobrancaLimiteCredito = cobrancaLimiteCredito;
  }

  
  /**
   * Establishment
   **/
  @ApiModelProperty(value = "Establishment")
  public Integer getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(Integer estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * Offer billing at credit limit
   **/
  @ApiModelProperty(value = "Offer billing at credit limit")
  public Boolean getFlagCobrancaLimiteCredito() {
    return flagCobrancaLimiteCredito;
  }
  public void setFlagCobrancaLimiteCredito(Boolean flagCobrancaLimiteCredito) {
    this.flagCobrancaLimiteCredito = flagCobrancaLimiteCredito;
  }

  
  /**
   * Offer Avaliable Deals
   **/
  @ApiModelProperty(value = "Offer Avaliable Deals")
  public Boolean getFlagOfertasPromocoes() {
    return flagOfertasPromocoes;
  }
  public void setFlagOfertasPromocoes(Boolean flagOfertasPromocoes) {
    this.flagOfertasPromocoes = flagOfertasPromocoes;
  }

  
  /**
   * Offer deals
   **/
  @ApiModelProperty(value = "Offer deals")
  public Boolean getFlagPromocoes() {
    return flagPromocoes;
  }
  public void setFlagPromocoes(Boolean flagPromocoes) {
    this.flagPromocoes = flagPromocoes;
  }

  
  /**
   * offer type of invoice submission
   **/
  @ApiModelProperty(value = "offer type of invoice submission")
  public Boolean getFlagTipoEnvioFatura() {
    return flagTipoEnvioFatura;
  }
  public void setFlagTipoEnvioFatura(Boolean flagTipoEnvioFatura) {
    this.flagTipoEnvioFatura = flagTipoEnvioFatura;
  }

  
  /**
   * Offer SMS type
   **/
  @ApiModelProperty(value = "Offer SMS type")
  public Boolean getFlagTipoSms() {
    return flagTipoSms;
  }
  public void setFlagTipoSms(Boolean flagTipoSms) {
    this.flagTipoSms = flagTipoSms;
  }

  
  /**
   * Identify account
   **/
  @ApiModelProperty(value = "Identify account")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Responsible
   **/
  @ApiModelProperty(value = "Responsible")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * Invoice submission type
   **/
  @ApiModelProperty(value = "Invoice submission type")
  public Integer getTipoEnvioFatura() {
    return tipoEnvioFatura;
  }
  public void setTipoEnvioFatura(Integer tipoEnvioFatura) {
    this.tipoEnvioFatura = tipoEnvioFatura;
  }

  
  /**
   * Sms type
   **/
  @ApiModelProperty(value = "Sms type")
  public TipoSmsEnum getTipoSms() {
    return tipoSms;
  }
  public void setTipoSms(TipoSmsEnum tipoSms) {
    this.tipoSms = tipoSms;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoServicoResponse {\n");
    
    sb.append("  canal: ").append(canal).append("\n");
    sb.append("  cobrancaLimiteCredito: ").append(cobrancaLimiteCredito).append("\n");
    sb.append("  estabelecimento: ").append(estabelecimento).append("\n");
    sb.append("  flagCobrancaLimiteCredito: ").append(flagCobrancaLimiteCredito).append("\n");
    sb.append("  flagOfertasPromocoes: ").append(flagOfertasPromocoes).append("\n");
    sb.append("  flagPromocoes: ").append(flagPromocoes).append("\n");
    sb.append("  flagTipoEnvioFatura: ").append(flagTipoEnvioFatura).append("\n");
    sb.append("  flagTipoSms: ").append(flagTipoSms).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  responsavel: ").append(responsavel).append("\n");
    sb.append("  tipoEnvioFatura: ").append(tipoEnvioFatura).append("\n");
    sb.append("  tipoSms: ").append(tipoSms).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
