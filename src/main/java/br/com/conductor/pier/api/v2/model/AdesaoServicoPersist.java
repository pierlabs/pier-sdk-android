package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{adesao_servico_persistencia_descricao}}}
 **/
@ApiModel(description = "{{{adesao_servico_persistencia_descricao}}}")
public class AdesaoServicoPersist  {
  
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

  
  /**
   * {{{adesao_servico_persistencia_canal_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_servico_persistencia_canal_descricao}}}")
  public String getCanal() {
    return canal;
  }
  public void setCanal(String canal) {
    this.canal = canal;
  }

  
  /**
   * {{{adesao_servico_persistencia_estabelecimento_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_servico_persistencia_estabelecimento_descricao}}}")
  public Integer getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(Integer estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * {{{adesao_servico_persistencia_tipo_envio_fatura_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_servico_persistencia_tipo_envio_fatura_descricao}}}")
  public Integer getTipoEnvioFatura() {
    return tipoEnvioFatura;
  }
  public void setTipoEnvioFatura(Integer tipoEnvioFatura) {
    this.tipoEnvioFatura = tipoEnvioFatura;
  }

  
  /**
   * {{{adesao_servico_persistencia_tipo_sms_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_servico_persistencia_tipo_sms_descricao}}}")
  public TipoSmsEnum getTipoSms() {
    return tipoSms;
  }
  public void setTipoSms(TipoSmsEnum tipoSms) {
    this.tipoSms = tipoSms;
  }

  
  /**
   * {{{adesao_servico_persistencia_cobranca_limite_credito_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_servico_persistencia_cobranca_limite_credito_descricao}}}")
  public Boolean getCobrancaLimiteCredito() {
    return cobrancaLimiteCredito;
  }
  public void setCobrancaLimiteCredito(Boolean cobrancaLimiteCredito) {
    this.cobrancaLimiteCredito = cobrancaLimiteCredito;
  }

  
  /**
   * {{{adesao_servico_persistencia_ofertas_promocoes_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_servico_persistencia_ofertas_promocoes_descricao}}}")
  public Boolean getFlagPromocoes() {
    return flagPromocoes;
  }
  public void setFlagPromocoes(Boolean flagPromocoes) {
    this.flagPromocoes = flagPromocoes;
  }

  
  /**
   * {{{adesao_servico_persistencia_responsavel_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_servico_persistencia_responsavel_descricao}}}")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * {{{adesao_servico_persistencia_ofertar_tipo_envio_fatura_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_servico_persistencia_ofertar_tipo_envio_fatura_descricao}}}")
  public Boolean getFlagTipoEnvioFatura() {
    return flagTipoEnvioFatura;
  }
  public void setFlagTipoEnvioFatura(Boolean flagTipoEnvioFatura) {
    this.flagTipoEnvioFatura = flagTipoEnvioFatura;
  }

  
  /**
   * {{{adesao_servico_persistencia_ofertar_tipo_sms_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_servico_persistencia_ofertar_tipo_sms_descricao}}}")
  public Boolean getFlagTipoSms() {
    return flagTipoSms;
  }
  public void setFlagTipoSms(Boolean flagTipoSms) {
    this.flagTipoSms = flagTipoSms;
  }

  
  /**
   * {{{adesao_servico_persistencia_ofertar_cobranca_limite_credito_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_servico_persistencia_ofertar_cobranca_limite_credito_descricao}}}")
  public Boolean getFlagCobrancaLimiteCredito() {
    return flagCobrancaLimiteCredito;
  }
  public void setFlagCobrancaLimiteCredito(Boolean flagCobrancaLimiteCredito) {
    this.flagCobrancaLimiteCredito = flagCobrancaLimiteCredito;
  }

  
  /**
   * {{{adesao_servico_persistencia_ofertar_ofertas_promocoes_descricao}}}
   **/
  @ApiModelProperty(value = "{{{adesao_servico_persistencia_ofertar_ofertas_promocoes_descricao}}}")
  public Boolean getFlagOfertasPromocoes() {
    return flagOfertasPromocoes;
  }
  public void setFlagOfertasPromocoes(Boolean flagOfertasPromocoes) {
    this.flagOfertasPromocoes = flagOfertasPromocoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoServicoPersist {\n");
    
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
    sb.append("}\n");
    return sb.toString();
  }
}
