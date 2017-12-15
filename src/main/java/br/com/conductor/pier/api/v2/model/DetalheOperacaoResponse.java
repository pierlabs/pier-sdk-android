package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Operacao
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Operacao")
public class DetalheOperacaoResponse  {
  
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;
  @SerializedName("codigoProcessamentoCancelamento")
  private String codigoProcessamentoCancelamento = null;
  @SerializedName("nomeOperacao")
  private String nomeOperacao = null;
  @SerializedName("descricaoOperacao")
  private String descricaoOperacao = null;
  @SerializedName("planoMinimo")
  private Integer planoMinimo = null;
  @SerializedName("planoMaximo")
  private Integer planoMaximo = null;
  @SerializedName("valorMinimo")
  private BigDecimal valorMinimo = null;
  @SerializedName("valorMaximo")
  private BigDecimal valorMaximo = null;
  @SerializedName("flagCobraJuros")
  private Boolean flagCobraJuros = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("flagCobraTarifa")
  private Boolean flagCobraTarifa = null;
  @SerializedName("taxaTarifa")
  private BigDecimal taxaTarifa = null;
  @SerializedName("valorTac")
  private BigDecimal valorTac = null;
  @SerializedName("percentualTac")
  private BigDecimal percentualTac = null;
  @SerializedName("valorOperacao")
  private BigDecimal valorOperacao = null;
  @SerializedName("carencia")
  private Integer carencia = null;
  @SerializedName("excedentePermitido")
  private BigDecimal excedentePermitido = null;
  @SerializedName("flagPermitirParcelamento")
  private Boolean flagPermitirParcelamento = null;

  
  /**
   * C\u00C3\u00B3digo que identifica a opera\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo que identifica a opera\u00C3\u00A7\u00C3\u00A3o")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * C\u00C3\u00B3digo de processamento usado em transa\u00C3\u00A7\u00C3\u00B5es com o autorizador
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de processamento usado em transa\u00C3\u00A7\u00C3\u00B5es com o autorizador")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * C\u00C3\u00B3digo de processamento usado para cancelar transa\u00C3\u00A7\u00C3\u00B5es no autorizador
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de processamento usado para cancelar transa\u00C3\u00A7\u00C3\u00B5es no autorizador")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   * Nome da opera\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Nome da opera\u00C3\u00A7\u00C3\u00A3o")
  public String getNomeOperacao() {
    return nomeOperacao;
  }
  public void setNomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o da opera\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o da opera\u00C3\u00A7\u00C3\u00A3o")
  public String getDescricaoOperacao() {
    return descricaoOperacao;
  }
  public void setDescricaoOperacao(String descricaoOperacao) {
    this.descricaoOperacao = descricaoOperacao;
  }

  
  /**
   * Quantidade m\u00C3\u00ADnima de meses permitido para opera\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Quantidade m\u00C3\u00ADnima de meses permitido para opera\u00C3\u00A7\u00C3\u00A3o")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Quantidade M\u00C3\u00A1ximo de meses permitido para opera\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Quantidade M\u00C3\u00A1ximo de meses permitido para opera\u00C3\u00A7\u00C3\u00A3o")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   *  Valor m\u00C3\u00ADnimo permitido permitido para opera\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = " Valor m\u00C3\u00ADnimo permitido permitido para opera\u00C3\u00A7\u00C3\u00A3o")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   *  Valor m\u00C3\u00A1ximo permitido permitido para opera\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = " Valor m\u00C3\u00A1ximo permitido permitido para opera\u00C3\u00A7\u00C3\u00A3o")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * Flag indicativa para crobran\u00C3\u00A7a de juros
   **/
  @ApiModelProperty(value = "Flag indicativa para crobran\u00C3\u00A7a de juros")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * Valor do juros a ser cobrado, caso opera\u00C3\u00A7\u00C3\u00A3o cobre juros
   **/
  @ApiModelProperty(value = "Valor do juros a ser cobrado, caso opera\u00C3\u00A7\u00C3\u00A3o cobre juros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Flag indicativa para crobran\u00C3\u00A7a de tarifas
   **/
  @ApiModelProperty(value = "Flag indicativa para crobran\u00C3\u00A7a de tarifas")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Valor da tarifa a ser cobrado, caso opera\u00C3\u00A7\u00C3\u00A3o cobre tarifas
   **/
  @ApiModelProperty(value = "Valor da tarifa a ser cobrado, caso opera\u00C3\u00A7\u00C3\u00A3o cobre tarifas")
  public BigDecimal getTaxaTarifa() {
    return taxaTarifa;
  }
  public void setTaxaTarifa(BigDecimal taxaTarifa) {
    this.taxaTarifa = taxaTarifa;
  }

  
  /**
   * Valor da taxa de abertura de conta
   **/
  @ApiModelProperty(value = "Valor da taxa de abertura de conta")
  public BigDecimal getValorTac() {
    return valorTac;
  }
  public void setValorTac(BigDecimal valorTac) {
    this.valorTac = valorTac;
  }

  
  /**
   * Percentual da taxa de abertura de conta
   **/
  @ApiModelProperty(value = "Percentual da taxa de abertura de conta")
  public BigDecimal getPercentualTac() {
    return percentualTac;
  }
  public void setPercentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
  }

  
  /**
   * Valor da opera\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Valor da opera\u00C3\u00A7\u00C3\u00A3o")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }

  
  /**
   * Quantidade de meses para car\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "Quantidade de meses para car\u00C3\u00AAncia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * Valor excedente permitido para opera\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Valor excedente permitido para opera\u00C3\u00A7\u00C3\u00A3o")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   * Permitir transa\u00C3\u00A7\u00C3\u00B5es parceladas
   **/
  @ApiModelProperty(value = "Permitir transa\u00C3\u00A7\u00C3\u00B5es parceladas")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheOperacaoResponse {\n");
    
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("  codigoProcessamentoCancelamento: ").append(codigoProcessamentoCancelamento).append("\n");
    sb.append("  nomeOperacao: ").append(nomeOperacao).append("\n");
    sb.append("  descricaoOperacao: ").append(descricaoOperacao).append("\n");
    sb.append("  planoMinimo: ").append(planoMinimo).append("\n");
    sb.append("  planoMaximo: ").append(planoMaximo).append("\n");
    sb.append("  valorMinimo: ").append(valorMinimo).append("\n");
    sb.append("  valorMaximo: ").append(valorMaximo).append("\n");
    sb.append("  flagCobraJuros: ").append(flagCobraJuros).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  flagCobraTarifa: ").append(flagCobraTarifa).append("\n");
    sb.append("  taxaTarifa: ").append(taxaTarifa).append("\n");
    sb.append("  valorTac: ").append(valorTac).append("\n");
    sb.append("  percentualTac: ").append(percentualTac).append("\n");
    sb.append("  valorOperacao: ").append(valorOperacao).append("\n");
    sb.append("  carencia: ").append(carencia).append("\n");
    sb.append("  excedentePermitido: ").append(excedentePermitido).append("\n");
    sb.append("  flagPermitirParcelamento: ").append(flagPermitirParcelamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


