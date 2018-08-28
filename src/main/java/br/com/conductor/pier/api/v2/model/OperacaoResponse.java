package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{operacao_response_description}}}
 **/
@ApiModel(description = "{{{operacao_response_description}}}")
public class OperacaoResponse  {
  
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;
  @SerializedName("codigoProcessamentoCancelamento")
  private String codigoProcessamentoCancelamento = null;
  @SerializedName("nomeOperacao")
  private String nomeOperacao = null;
  @SerializedName("flagCobraJuros")
  private Boolean flagCobraJuros = null;
  @SerializedName("flagCobraTarifa")
  private Boolean flagCobraTarifa = null;
  @SerializedName("carencia")
  private Integer carencia = null;
  @SerializedName("flagPermitirParcelamento")
  private Boolean flagPermitirParcelamento = null;

  
  /**
   * {{{operacao_response_id_operacao_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_response_id_operacao_value}}}")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * {{{operacao_response_codigo_processamento_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_response_codigo_processamento_value}}}")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * {{{operacao_response_codigo_processamento_cancelamento_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_response_codigo_processamento_cancelamento_value}}}")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   * {{{operacao_response_nome_operacao_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_response_nome_operacao_value}}}")
  public String getNomeOperacao() {
    return nomeOperacao;
  }
  public void setNomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
  }

  
  /**
   * {{{operacao_response_flag_cobra_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_response_flag_cobra_juros_value}}}")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * {{{operacao_response_flag_cobra_tarifa_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_response_flag_cobra_tarifa_value}}}")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * {{{operacao_response_carencia_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_response_carencia_value}}}")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * {{{operacao_response_flag_permitir_parcelamento_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_response_flag_permitir_parcelamento_value}}}")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoResponse {\n");
    
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("  codigoProcessamentoCancelamento: ").append(codigoProcessamentoCancelamento).append("\n");
    sb.append("  nomeOperacao: ").append(nomeOperacao).append("\n");
    sb.append("  flagCobraJuros: ").append(flagCobraJuros).append("\n");
    sb.append("  flagCobraTarifa: ").append(flagCobraTarifa).append("\n");
    sb.append("  carencia: ").append(carencia).append("\n");
    sb.append("  flagPermitirParcelamento: ").append(flagPermitirParcelamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
