package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da entidade de persist\u00EAncia para um novo acordo. 
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da entidade de persist\u00EAncia para um novo acordo. ")
public class AcordoPersist  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idEscritorioCobranca")
  private Long idEscritorioCobranca = null;
  @SerializedName("valorLiquido")
  private BigDecimal valorLiquido = null;
  @SerializedName("valorEntrada")
  private BigDecimal valorEntrada = null;
  @SerializedName("valorParcelaUm")
  private BigDecimal valorParcelaUm = null;
  @SerializedName("valorParcelas")
  private BigDecimal valorParcelas = null;
  @SerializedName("saldoDevedorCreliq")
  private BigDecimal saldoDevedorCreliq = null;
  @SerializedName("saldoDevedorCorrigido")
  private BigDecimal saldoDevedorCorrigido = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("percentualCorrecao")
  private BigDecimal percentualCorrecao = null;
  @SerializedName("percentualDesconto")
  private BigDecimal percentualDesconto = null;
  @SerializedName("valorDesconto")
  private BigDecimal valorDesconto = null;
  @SerializedName("diasAtraso")
  private Integer diasAtraso = null;
  @SerializedName("dataVencimentoEntrada")
  private String dataVencimentoEntrada = null;
  @SerializedName("responsavel")
  private String responsavel = null;
  @SerializedName("isComIOF")
  private Boolean isComIOF = null;
  @SerializedName("nossoNumero")
  private String nossoNumero = null;
  @SerializedName("valorIOF")
  private BigDecimal valorIOF = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Conta (ID).
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da Conta (ID).")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identifica\u00E7\u00E3o do escrit\u00F3rio de cobran\u00E7a.
   **/
  @ApiModelProperty(value = "Identifica\u00E7\u00E3o do escrit\u00F3rio de cobran\u00E7a.")
  public Long getIdEscritorioCobranca() {
    return idEscritorioCobranca;
  }
  public void setIdEscritorioCobranca(Long idEscritorioCobranca) {
    this.idEscritorioCobranca = idEscritorioCobranca;
  }

  
  /**
   * Valor liquido do acordo.
   **/
  @ApiModelProperty(value = "Valor liquido do acordo.")
  public BigDecimal getValorLiquido() {
    return valorLiquido;
  }
  public void setValorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
  }

  
  /**
   * Valor da parcela de entrada do acordo.
   **/
  @ApiModelProperty(value = "Valor da parcela de entrada do acordo.")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Valor da primeira parcela do acordo.
   **/
  @ApiModelProperty(value = "Valor da primeira parcela do acordo.")
  public BigDecimal getValorParcelaUm() {
    return valorParcelaUm;
  }
  public void setValorParcelaUm(BigDecimal valorParcelaUm) {
    this.valorParcelaUm = valorParcelaUm;
  }

  
  /**
   * Valor das demais parcelas do acordo.
   **/
  @ApiModelProperty(value = "Valor das demais parcelas do acordo.")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * Saldo devedor CRELIQ.
   **/
  @ApiModelProperty(value = "Saldo devedor CRELIQ.")
  public BigDecimal getSaldoDevedorCreliq() {
    return saldoDevedorCreliq;
  }
  public void setSaldoDevedorCreliq(BigDecimal saldoDevedorCreliq) {
    this.saldoDevedorCreliq = saldoDevedorCreliq;
  }

  
  /**
   * Saldo devedor corrigido.
   **/
  @ApiModelProperty(value = "Saldo devedor corrigido.")
  public BigDecimal getSaldoDevedorCorrigido() {
    return saldoDevedorCorrigido;
  }
  public void setSaldoDevedorCorrigido(BigDecimal saldoDevedorCorrigido) {
    this.saldoDevedorCorrigido = saldoDevedorCorrigido;
  }

  
  /**
   * Quantidade de parcelas do acordo.
   **/
  @ApiModelProperty(value = "Quantidade de parcelas do acordo.")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Percentual de corre\u00E7\u00E3o da div\u00EDda.
   **/
  @ApiModelProperty(value = "Percentual de corre\u00E7\u00E3o da div\u00EDda.")
  public BigDecimal getPercentualCorrecao() {
    return percentualCorrecao;
  }
  public void setPercentualCorrecao(BigDecimal percentualCorrecao) {
    this.percentualCorrecao = percentualCorrecao;
  }

  
  /**
   * Percentual de desconto aplicado.
   **/
  @ApiModelProperty(value = "Percentual de desconto aplicado.")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * Valor do desconto aplicado.
   **/
  @ApiModelProperty(value = "Valor do desconto aplicado.")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * Total de dias em atraso.
   **/
  @ApiModelProperty(value = "Total de dias em atraso.")
  public Integer getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Integer diasAtraso) {
    this.diasAtraso = diasAtraso;
  }

  
  /**
   * Data de vencimento da parcela de entrada.
   **/
  @ApiModelProperty(value = "Data de vencimento da parcela de entrada.")
  public String getDataVencimentoEntrada() {
    return dataVencimentoEntrada;
  }
  public void setDataVencimentoEntrada(String dataVencimentoEntrada) {
    this.dataVencimentoEntrada = dataVencimentoEntrada;
  }

  
  /**
   * Nome do respons\u00E1vel por inputar o acordo.
   **/
  @ApiModelProperty(value = "Nome do respons\u00E1vel por inputar o acordo.")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * Flag indicativa para lan\u00E7amento do IOF no momento da cria\u00E7\u00E3o do acordo
   **/
  @ApiModelProperty(value = "Flag indicativa para lan\u00E7amento do IOF no momento da cria\u00E7\u00E3o do acordo")
  public Boolean getIsComIOF() {
    return isComIOF;
  }
  public void setIsComIOF(Boolean isComIOF) {
    this.isComIOF = isComIOF;
  }

  
  /**
   * N\u00FAmero do boleto caso ele j\u00E1 tenha sido gerado antes do acordo.
   **/
  @ApiModelProperty(value = "N\u00FAmero do boleto caso ele j\u00E1 tenha sido gerado antes do acordo.")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * Valor do IOF
   **/
  @ApiModelProperty(value = "Valor do IOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoPersist {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idEscritorioCobranca: ").append(idEscritorioCobranca).append("\n");
    sb.append("  valorLiquido: ").append(valorLiquido).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  valorParcelaUm: ").append(valorParcelaUm).append("\n");
    sb.append("  valorParcelas: ").append(valorParcelas).append("\n");
    sb.append("  saldoDevedorCreliq: ").append(saldoDevedorCreliq).append("\n");
    sb.append("  saldoDevedorCorrigido: ").append(saldoDevedorCorrigido).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  percentualCorrecao: ").append(percentualCorrecao).append("\n");
    sb.append("  percentualDesconto: ").append(percentualDesconto).append("\n");
    sb.append("  valorDesconto: ").append(valorDesconto).append("\n");
    sb.append("  diasAtraso: ").append(diasAtraso).append("\n");
    sb.append("  dataVencimentoEntrada: ").append(dataVencimentoEntrada).append("\n");
    sb.append("  responsavel: ").append(responsavel).append("\n");
    sb.append("  isComIOF: ").append(isComIOF).append("\n");
    sb.append("  nossoNumero: ").append(nossoNumero).append("\n");
    sb.append("  valorIOF: ").append(valorIOF).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
