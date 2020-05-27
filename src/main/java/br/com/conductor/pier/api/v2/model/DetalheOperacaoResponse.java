package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso Operacao
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso Operacao")
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
  @SerializedName("idEmissor")
  private Integer idEmissor = null;
  @SerializedName("idTabela")
  private Long idTabela = null;
  @SerializedName("valorParcela")
  private Long valorParcela = null;
  @SerializedName("flagCobraProRata")
  private Boolean flagCobraProRata = null;
  @SerializedName("idTabelaJuros")
  private Long idTabelaJuros = null;
  @SerializedName("tipoExcedentePermitido")
  private String tipoExcedentePermitido = null;
  @SerializedName("flagIOFApartado")
  private Boolean flagIOFApartado = null;

  
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
   * Descri\u00E7\u00E3o da opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o da opera\u00E7\u00E3o")
  public String getDescricaoOperacao() {
    return descricaoOperacao;
  }
  public void setDescricaoOperacao(String descricaoOperacao) {
    this.descricaoOperacao = descricaoOperacao;
  }

  
  /**
   * Quantidade m\u00EDnima de meses permitido para opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Quantidade m\u00EDnima de meses permitido para opera\u00E7\u00E3o")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Quantidade M\u00E1ximo de meses permitido para opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Quantidade M\u00E1ximo de meses permitido para opera\u00E7\u00E3o")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * Valor m\u00EDnimo permitido permitido para opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Valor m\u00EDnimo permitido permitido para opera\u00E7\u00E3o")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * Valor m\u00E1ximo permitido permitido para opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Valor m\u00E1ximo permitido permitido para opera\u00E7\u00E3o")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
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
   * Valor do juros a ser cobrado, caso opera\u00E7\u00E3o cobre juros
   **/
  @ApiModelProperty(value = "Valor do juros a ser cobrado, caso opera\u00E7\u00E3o cobre juros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
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
   * Valor da tarifa a ser cobrado, caso opera\u00E7\u00E3o cobre tarifas
   **/
  @ApiModelProperty(value = "Valor da tarifa a ser cobrado, caso opera\u00E7\u00E3o cobre tarifas")
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
   * Valor da opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Valor da opera\u00E7\u00E3o")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
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
   * Valor excedente permitido para opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Valor excedente permitido para opera\u00E7\u00E3o")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
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

  
  /**
   * C\u00F3digo identificador do emissor
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do emissor")
  public Integer getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * C\u00F3digo identificador da tabela
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da tabela")
  public Long getIdTabela() {
    return idTabela;
  }
  public void setIdTabela(Long idTabela) {
    this.idTabela = idTabela;
  }

  
  /**
   * Valor da parcela
   **/
  @ApiModelProperty(value = "Valor da parcela")
  public Long getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(Long valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Flag indicativa de cobrar juros
   **/
  @ApiModelProperty(value = "Flag indicativa de cobrar juros")
  public Boolean getFlagCobraProRata() {
    return flagCobraProRata;
  }
  public void setFlagCobraProRata(Boolean flagCobraProRata) {
    this.flagCobraProRata = flagCobraProRata;
  }

  
  /**
   * C\u00F3digo identificador da tabela de juros
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da tabela de juros")
  public Long getIdTabelaJuros() {
    return idTabelaJuros;
  }
  public void setIdTabelaJuros(Long idTabelaJuros) {
    this.idTabelaJuros = idTabelaJuros;
  }

  
  /**
   * Tipo excedente permitido
   **/
  @ApiModelProperty(value = "Tipo excedente permitido")
  public String getTipoExcedentePermitido() {
    return tipoExcedentePermitido;
  }
  public void setTipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
  }

  
  /**
   * Flag que indica se o IOF \u00E9 apartado
   **/
  @ApiModelProperty(value = "Flag que indica se o IOF \u00E9 apartado")
  public Boolean getFlagIOFApartado() {
    return flagIOFApartado;
  }
  public void setFlagIOFApartado(Boolean flagIOFApartado) {
    this.flagIOFApartado = flagIOFApartado;
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
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  idTabela: ").append(idTabela).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  flagCobraProRata: ").append(flagCobraProRata).append("\n");
    sb.append("  idTabelaJuros: ").append(idTabelaJuros).append("\n");
    sb.append("  tipoExcedentePermitido: ").append(tipoExcedentePermitido).append("\n");
    sb.append("  flagIOFApartado: ").append(flagIOFApartado).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
