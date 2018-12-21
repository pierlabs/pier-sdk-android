package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the Operation resource
 **/
@ApiModel(description = "Response Representation of the Operation resource")
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
  @SerializedName("flagManterTaxaJurosNoRotativo")
  private Boolean flagManterTaxaJurosNoRotativo = null;

  
  /**
   * Code that identifies the operation
   **/
  @ApiModelProperty(value = "Code that identifies the operation")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Processing Code used in transactions with the authorizer
   **/
  @ApiModelProperty(value = "Processing Code used in transactions with the authorizer")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Processing Code used to cancel the transactions in the authorizer
   **/
  @ApiModelProperty(value = "Processing Code used to cancel the transactions in the authorizer")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   * Name of the operation
   **/
  @ApiModelProperty(value = "Name of the operation")
  public String getNomeOperacao() {
    return nomeOperacao;
  }
  public void setNomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
  }

  
  /**
   * Description of the operation
   **/
  @ApiModelProperty(value = "Description of the operation")
  public String getDescricaoOperacao() {
    return descricaoOperacao;
  }
  public void setDescricaoOperacao(String descricaoOperacao) {
    this.descricaoOperacao = descricaoOperacao;
  }

  
  /**
   * Minimum quantity of the months allowed to the operation
   **/
  @ApiModelProperty(value = "Minimum quantity of the months allowed to the operation")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Maximum quantity of months allowed to the operation
   **/
  @ApiModelProperty(value = "Maximum quantity of months allowed to the operation")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * Valor m?nimo allowed to the operation
   **/
  @ApiModelProperty(value = "Valor m?nimo allowed to the operation")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * Maximum value allowed to the operation
   **/
  @ApiModelProperty(value = "Maximum value allowed to the operation")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * Indicative flag to charge the interest
   **/
  @ApiModelProperty(value = "Indicative flag to charge the interest")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * Value of the interest to be charged, in case of charging interest
   **/
  @ApiModelProperty(value = "Value of the interest to be charged, in case of charging interest")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Flag indicative for the charginf of fees
   **/
  @ApiModelProperty(value = "Flag indicative for the charginf of fees")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Value of the fee to be charged, in case of the operation charges the fees
   **/
  @ApiModelProperty(value = "Value of the fee to be charged, in case of the operation charges the fees")
  public BigDecimal getTaxaTarifa() {
    return taxaTarifa;
  }
  public void setTaxaTarifa(BigDecimal taxaTarifa) {
    this.taxaTarifa = taxaTarifa;
  }

  
  /**
   * taxe value of the openning account
   **/
  @ApiModelProperty(value = "taxe value of the openning account")
  public BigDecimal getValorTac() {
    return valorTac;
  }
  public void setValorTac(BigDecimal valorTac) {
    this.valorTac = valorTac;
  }

  
  /**
   * Taxe percentage of the openning account
   **/
  @ApiModelProperty(value = "Taxe percentage of the openning account")
  public BigDecimal getPercentualTac() {
    return percentualTac;
  }
  public void setPercentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
  }

  
  /**
   * Value of the operation
   **/
  @ApiModelProperty(value = "Value of the operation")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }

  
  /**
   * Quantity of months for the lack
   **/
  @ApiModelProperty(value = "Quantity of months for the lack")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * Exceed allowed to the operation
   **/
  @ApiModelProperty(value = "Exceed allowed to the operation")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   * Allow parceled transactions
   **/
  @ApiModelProperty(value = "Allow parceled transactions")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
  }

  
  /**
   * Boolean that signals to all transactions of this operation type must use the purchase interest rate as the due balance interest rate
   **/
  @ApiModelProperty(value = "Boolean that signals to all transactions of this operation type must use the purchase interest rate as the due balance interest rate")
  public Boolean getFlagManterTaxaJurosNoRotativo() {
    return flagManterTaxaJurosNoRotativo;
  }
  public void setFlagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
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
    sb.append("  flagManterTaxaJurosNoRotativo: ").append(flagManterTaxaJurosNoRotativo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
