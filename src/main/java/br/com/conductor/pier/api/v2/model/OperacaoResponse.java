package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso Operacao
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso Operacao")
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
  @SerializedName("flagManterTaxaJurosNoRotativo")
  private Boolean flagManterTaxaJurosNoRotativo = null;

  
  /**
   * C\u00F3digo que identifica a opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo que identifica a opera\u00E7\u00E3o")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * C\u00F3digo de processamento usado em transa\u00E7\u00F5es com o autorizador
   **/
  @ApiModelProperty(value = "C\u00F3digo de processamento usado em transa\u00E7\u00F5es com o autorizador")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * C\u00F3digo de processamento usado para cancelar transa\u00E7\u00F5es no autorizador
   **/
  @ApiModelProperty(value = "C\u00F3digo de processamento usado para cancelar transa\u00E7\u00F5es no autorizador")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   * Nome da opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Nome da opera\u00E7\u00E3o")
  public String getNomeOperacao() {
    return nomeOperacao;
  }
  public void setNomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
  }

  
  /**
   * Flag indicativa para crobran\u00E7a de juros
   **/
  @ApiModelProperty(value = "Flag indicativa para crobran\u00E7a de juros")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * Flag indicativa para crobran\u00E7a de tarifas
   **/
  @ApiModelProperty(value = "Flag indicativa para crobran\u00E7a de tarifas")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Quantidade de meses para car\u00EAncia
   **/
  @ApiModelProperty(value = "Quantidade de meses para car\u00EAncia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * Permitir transa\u00E7\u00F5es parceladas
   **/
  @ApiModelProperty(value = "Permitir transa\u00E7\u00F5es parceladas")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
  }

  
  /**
   * Flag que indica que a opera\u00E7\u00E3o deve utilizar a taxa da compra como taxa do rotativo para transa\u00E7\u00F5es desse tipo opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Flag que indica que a opera\u00E7\u00E3o deve utilizar a taxa da compra como taxa do rotativo para transa\u00E7\u00F5es desse tipo opera\u00E7\u00E3o")
  public Boolean getFlagManterTaxaJurosNoRotativo() {
    return flagManterTaxaJurosNoRotativo;
  }
  public void setFlagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
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
    sb.append("  flagManterTaxaJurosNoRotativo: ").append(flagManterTaxaJurosNoRotativo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
