package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de atualiza\u00E7\u00E3o para ades\u00E3o servi\u00E7os
 **/
@ApiModel(description = "Objeto de atualiza\u00E7\u00E3o para ades\u00E3o servi\u00E7os")
public class AdesaoServicoPartialUpdate  {
  
  @SerializedName("canal")
  private String canal = null;
  @SerializedName("estabelecimento")
  private Integer estabelecimento = null;
  @SerializedName("tipoEnvioFatura")
  private Integer tipoEnvioFatura = null;
  public enum TipoSmsEnum {
     CONTROLE,  NOTIFICACAO,  ALERTA, 
  };
  @SerializedName("tipoSms")
  private TipoSmsEnum tipoSms = null;
  @SerializedName("cobrancaLimiteCredito")
  private Boolean cobrancaLimiteCredito = null;
  @SerializedName("flagPromocoes")
  private Boolean flagPromocoes = null;
  @SerializedName("responsavel")
  private String responsavel = null;
  @SerializedName("flagTipoEnvioFatura")
  private Boolean flagTipoEnvioFatura = null;
  @SerializedName("flagTipoSms")
  private Boolean flagTipoSms = null;
  @SerializedName("flagCobrancaLimiteCredito")
  private Boolean flagCobrancaLimiteCredito = null;
  @SerializedName("flagOfertasPromocoes")
  private Boolean flagOfertasPromocoes = null;
  @SerializedName("flagAdesaoInvestimento")
  private Boolean flagAdesaoInvestimento = null;
  @SerializedName("flagAdesaoCompraProgramada")
  private Boolean flagAdesaoCompraProgramada = null;

  
  /**
   * Canal de entrada
   **/
  @ApiModelProperty(value = "Canal de entrada")
  public String getCanal() {
    return canal;
  }
  public void setCanal(String canal) {
    this.canal = canal;
  }

  
  /**
   * Estabelecimento
   **/
  @ApiModelProperty(value = "Estabelecimento")
  public Integer getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(Integer estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * Tipo do envio da fatura
   **/
  @ApiModelProperty(value = "Tipo do envio da fatura")
  public Integer getTipoEnvioFatura() {
    return tipoEnvioFatura;
  }
  public void setTipoEnvioFatura(Integer tipoEnvioFatura) {
    this.tipoEnvioFatura = tipoEnvioFatura;
  }

  
  /**
   * Tipo do sms
   **/
  @ApiModelProperty(value = "Tipo do sms")
  public TipoSmsEnum getTipoSms() {
    return tipoSms;
  }
  public void setTipoSms(TipoSmsEnum tipoSms) {
    this.tipoSms = tipoSms;
  }

  
  /**
   * Cobran\u00E7a do limite de cr\u00E9dito
   **/
  @ApiModelProperty(value = "Cobran\u00E7a do limite de cr\u00E9dito")
  public Boolean getCobrancaLimiteCredito() {
    return cobrancaLimiteCredito;
  }
  public void setCobrancaLimiteCredito(Boolean cobrancaLimiteCredito) {
    this.cobrancaLimiteCredito = cobrancaLimiteCredito;
  }

  
  /**
   * Ofertar promo\u00E7\u00F5es
   **/
  @ApiModelProperty(value = "Ofertar promo\u00E7\u00F5es")
  public Boolean getFlagPromocoes() {
    return flagPromocoes;
  }
  public void setFlagPromocoes(Boolean flagPromocoes) {
    this.flagPromocoes = flagPromocoes;
  }

  
  /**
   * Respons\u00E1vel
   **/
  @ApiModelProperty(value = "Respons\u00E1vel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * Oferece a op\u00E7\u00E3o do tipo de envio da fatura
   **/
  @ApiModelProperty(value = "Oferece a op\u00E7\u00E3o do tipo de envio da fatura")
  public Boolean getFlagTipoEnvioFatura() {
    return flagTipoEnvioFatura;
  }
  public void setFlagTipoEnvioFatura(Boolean flagTipoEnvioFatura) {
    this.flagTipoEnvioFatura = flagTipoEnvioFatura;
  }

  
  /**
   * Oferece a op\u00E7\u00E3o do tipo do sms
   **/
  @ApiModelProperty(value = "Oferece a op\u00E7\u00E3o do tipo do sms")
  public Boolean getFlagTipoSms() {
    return flagTipoSms;
  }
  public void setFlagTipoSms(Boolean flagTipoSms) {
    this.flagTipoSms = flagTipoSms;
  }

  
  /**
   * Oferece cobran\u00E7a no limite de cr\u00E9dito
   **/
  @ApiModelProperty(value = "Oferece cobran\u00E7a no limite de cr\u00E9dito")
  public Boolean getFlagCobrancaLimiteCredito() {
    return flagCobrancaLimiteCredito;
  }
  public void setFlagCobrancaLimiteCredito(Boolean flagCobrancaLimiteCredito) {
    this.flagCobrancaLimiteCredito = flagCobrancaLimiteCredito;
  }

  
  /**
   * Oferece a op\u00E7\u00E3o de promo\u00E7\u00F5es disponiveis
   **/
  @ApiModelProperty(value = "Oferece a op\u00E7\u00E3o de promo\u00E7\u00F5es disponiveis")
  public Boolean getFlagOfertasPromocoes() {
    return flagOfertasPromocoes;
  }
  public void setFlagOfertasPromocoes(Boolean flagOfertasPromocoes) {
    this.flagOfertasPromocoes = flagOfertasPromocoes;
  }

  
  /**
   * Permite a op\u00E7\u00E3o da ades\u00E3o de investimentos 
   **/
  @ApiModelProperty(value = "Permite a op\u00E7\u00E3o da ades\u00E3o de investimentos ")
  public Boolean getFlagAdesaoInvestimento() {
    return flagAdesaoInvestimento;
  }
  public void setFlagAdesaoInvestimento(Boolean flagAdesaoInvestimento) {
    this.flagAdesaoInvestimento = flagAdesaoInvestimento;
  }

  
  /**
   * Permite a op\u00E7\u00E3o da ades\u00E3o compra programada
   **/
  @ApiModelProperty(value = "Permite a op\u00E7\u00E3o da ades\u00E3o compra programada")
  public Boolean getFlagAdesaoCompraProgramada() {
    return flagAdesaoCompraProgramada;
  }
  public void setFlagAdesaoCompraProgramada(Boolean flagAdesaoCompraProgramada) {
    this.flagAdesaoCompraProgramada = flagAdesaoCompraProgramada;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoServicoPartialUpdate {\n");
    
    sb.append("  canal: ").append(canal).append("\n");
    sb.append("  estabelecimento: ").append(estabelecimento).append("\n");
    sb.append("  tipoEnvioFatura: ").append(tipoEnvioFatura).append("\n");
    sb.append("  tipoSms: ").append(tipoSms).append("\n");
    sb.append("  cobrancaLimiteCredito: ").append(cobrancaLimiteCredito).append("\n");
    sb.append("  flagPromocoes: ").append(flagPromocoes).append("\n");
    sb.append("  responsavel: ").append(responsavel).append("\n");
    sb.append("  flagTipoEnvioFatura: ").append(flagTipoEnvioFatura).append("\n");
    sb.append("  flagTipoSms: ").append(flagTipoSms).append("\n");
    sb.append("  flagCobrancaLimiteCredito: ").append(flagCobrancaLimiteCredito).append("\n");
    sb.append("  flagOfertasPromocoes: ").append(flagOfertasPromocoes).append("\n");
    sb.append("  flagAdesaoInvestimento: ").append(flagAdesaoInvestimento).append("\n");
    sb.append("  flagAdesaoCompraProgramada: ").append(flagAdesaoCompraProgramada).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
