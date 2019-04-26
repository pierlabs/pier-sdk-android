package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto tipo opera\u00E7\u00E3o com campos pass\u00EDveis de altera\u00E7\u00E3o
 **/
@ApiModel(description = "Objeto tipo opera\u00E7\u00E3o com campos pass\u00EDveis de altera\u00E7\u00E3o")
public class TipoOperacaoParcialUpdate  {
  
  @SerializedName("flagManterTaxaJurosNoRotativo")
  private Boolean flagManterTaxaJurosNoRotativo = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("idEmissor")
  private Integer idEmissor = null;
  @SerializedName("idTabela")
  private Long idTabela = null;
  @SerializedName("valorParcela")
  private Long valorParcela = null;
  @SerializedName("flagCobraProRata")
  private Boolean flagCobraProRata = null;
  @SerializedName("flagCobraJuros")
  private Boolean flagCobraJuros = null;
  @SerializedName("planoMinimo")
  private Integer planoMinimo = null;
  @SerializedName("planoMaximo")
  private Integer planoMaximo = null;
  @SerializedName("valorMinimo")
  private BigDecimal valorMinimo = null;
  @SerializedName("valorMaximo")
  private BigDecimal valorMaximo = null;
  @SerializedName("idTabelaJuros")
  private Long idTabelaJuros = null;
  @SerializedName("flagPosProximoVencimento")
  private Integer flagPosProximoVencimento = null;
  @SerializedName("excedentePermitido")
  private BigDecimal excedentePermitido = null;
  @SerializedName("tipoExcedentePermitido")
  private String tipoExcedentePermitido = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;
  @SerializedName("percentualTac")
  private BigDecimal percentualTac = null;

  
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
   * Nome do tipo de opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Nome do tipo de opera\u00E7\u00E3o")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo de opera\u00E7\u00E3o")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
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
   * Flag que indica se cobra pr\u00F3-rata
   **/
  @ApiModelProperty(value = "Flag que indica se cobra pr\u00F3-rata")
  public Boolean getFlagCobraProRata() {
    return flagCobraProRata;
  }
  public void setFlagCobraProRata(Boolean flagCobraProRata) {
    this.flagCobraProRata = flagCobraProRata;
  }

  
  /**
   * Flag que indica se cobra juros
   **/
  @ApiModelProperty(value = "Flag que indica se cobra juros")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * Quantidade m\u00EDnima de meses permitida para a opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Quantidade m\u00EDnima de meses permitida para a opera\u00E7\u00E3o")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Quantidade m\u00E1xima de meses permitida para a opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Quantidade m\u00E1xima de meses permitida para a opera\u00E7\u00E3o")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * Valor m\u00EDnimo permitido para a opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Valor m\u00EDnimo permitido para a opera\u00E7\u00E3o")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * Valor m\u00E1ximo permitido para a opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Valor m\u00E1ximo permitido para a opera\u00E7\u00E3o")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
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
   * Flag p\u00F3s-pr\u00F3ximo vencimento
   **/
  @ApiModelProperty(value = "Flag p\u00F3s-pr\u00F3ximo vencimento")
  public Integer getFlagPosProximoVencimento() {
    return flagPosProximoVencimento;
  }
  public void setFlagPosProximoVencimento(Integer flagPosProximoVencimento) {
    this.flagPosProximoVencimento = flagPosProximoVencimento;
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
   * Valor da TAC
   **/
  @ApiModelProperty(value = "Valor da TAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Percentual da TAC
   **/
  @ApiModelProperty(value = "Percentual da TAC")
  public BigDecimal getPercentualTac() {
    return percentualTac;
  }
  public void setPercentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOperacaoParcialUpdate {\n");
    
    sb.append("  flagManterTaxaJurosNoRotativo: ").append(flagManterTaxaJurosNoRotativo).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  idTabela: ").append(idTabela).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  flagCobraProRata: ").append(flagCobraProRata).append("\n");
    sb.append("  flagCobraJuros: ").append(flagCobraJuros).append("\n");
    sb.append("  planoMinimo: ").append(planoMinimo).append("\n");
    sb.append("  planoMaximo: ").append(planoMaximo).append("\n");
    sb.append("  valorMinimo: ").append(valorMinimo).append("\n");
    sb.append("  valorMaximo: ").append(valorMaximo).append("\n");
    sb.append("  idTabelaJuros: ").append(idTabelaJuros).append("\n");
    sb.append("  flagPosProximoVencimento: ").append(flagPosProximoVencimento).append("\n");
    sb.append("  excedentePermitido: ").append(excedentePermitido).append("\n");
    sb.append("  tipoExcedentePermitido: ").append(tipoExcedentePermitido).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("  percentualTac: ").append(percentualTac).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
