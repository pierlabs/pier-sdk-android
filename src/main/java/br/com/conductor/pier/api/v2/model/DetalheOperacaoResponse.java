package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{detalhe_operacao_response_description}}}
 **/
@ApiModel(description = "{{{detalhe_operacao_response_description}}}")
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
   * {{{detalhe_operacao_response_id_operacao_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_id_operacao_value}}}")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * {{{detalhe_operacao_response_codigo_processamento_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_codigo_processamento_value}}}")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * {{{detalhe_operacao_response_codigo_processamento_cancelamento_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_codigo_processamento_cancelamento_value}}}")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   * {{{detalhe_operacao_response_nome_operacao_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_nome_operacao_value}}}")
  public String getNomeOperacao() {
    return nomeOperacao;
  }
  public void setNomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
  }

  
  /**
   * {{{detalhe_operacao_response_descricao_operacao_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_descricao_operacao_value}}}")
  public String getDescricaoOperacao() {
    return descricaoOperacao;
  }
  public void setDescricaoOperacao(String descricaoOperacao) {
    this.descricaoOperacao = descricaoOperacao;
  }

  
  /**
   * {{{detalhe_operacao_response_plano_minimo_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_plano_minimo_value}}}")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * {{{detalhe_operacao_response_plano_maximo_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_plano_maximo_value}}}")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * {{{detalhe_operacao_response_valor_minimo_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_valor_minimo_value}}}")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * {{{detalhe_operacao_response_valor_maximo_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_valor_maximo_value}}}")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * {{{detalhe_operacao_response_flag_cobra_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_flag_cobra_juros_value}}}")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * {{{detalhe_operacao_response_taxa_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_taxa_juros_value}}}")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * {{{detalhe_operacao_response_flag_cobra_tarifa_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_flag_cobra_tarifa_value}}}")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * {{{detalhe_operacao_response_taxa_tarifa_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_taxa_tarifa_value}}}")
  public BigDecimal getTaxaTarifa() {
    return taxaTarifa;
  }
  public void setTaxaTarifa(BigDecimal taxaTarifa) {
    this.taxaTarifa = taxaTarifa;
  }

  
  /**
   * {{{detalhe_operacao_response_valor_tac_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_valor_tac_value}}}")
  public BigDecimal getValorTac() {
    return valorTac;
  }
  public void setValorTac(BigDecimal valorTac) {
    this.valorTac = valorTac;
  }

  
  /**
   * {{{detalhe_operacao_response_percentual_tac_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_percentual_tac_value}}}")
  public BigDecimal getPercentualTac() {
    return percentualTac;
  }
  public void setPercentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
  }

  
  /**
   * {{{detalhe_operacao_response_valor_operacao_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_valor_operacao_value}}}")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }

  
  /**
   * {{{detalhe_operacao_response_carencia_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_carencia_value}}}")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * {{{detalhe_operacao_response_excedente_permitido_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_excedente_permitido_value}}}")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   * {{{detalhe_operacao_response_flag_permitir_parcelamento_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_flag_permitir_parcelamento_value}}}")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
  }

  
  /**
   * {{{detalhe_operacao_response_flag_manter_taxa_juros_no_rotativo_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_operacao_response_flag_manter_taxa_juros_no_rotativo_value}}}")
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
