package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da atualiza\u00E7\u00E3o do d\u00E9bito recorrente do portador
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da atualiza\u00E7\u00E3o do d\u00E9bito recorrente do portador")
public class PortadorDebitoRecorrenteUpdate  {
  
  @SerializedName("portador")
  private Integer portador = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idAnuidade")
  private Long idAnuidade = null;
  @SerializedName("dataHoraInicio")
  private String dataHoraInicio = null;
  @SerializedName("dataHoraFim")
  private String dataHoraFim = null;
  @SerializedName("numeroParcela")
  private Integer numeroParcela = null;
  @SerializedName("parcelaPerdida")
  private Integer parcelaPerdida = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("valorOriginal")
  private BigDecimal valorOriginal = null;
  @SerializedName("percentualDesconto")
  private BigDecimal percentualDesconto = null;
  @SerializedName("flagCartaoDesbloqueado")
  private Boolean flagCartaoDesbloqueado = null;
  @SerializedName("flagLancatarifa")
  private Boolean flagLancatarifa = null;
  @SerializedName("dataFimDescontoAnuidade")
  private String dataFimDescontoAnuidade = null;

  
  /**
   * N\u00FAmero referente ao portador
   **/
  @ApiModelProperty(value = "N\u00FAmero referente ao portador")
  public Integer getPortador() {
    return portador;
  }
  public void setPortador(Integer portador) {
    this.portador = portador;
  }

  
  /**
   * C\u00F3digo identificador do produto
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo identificador da anuidade inv\u00E1lido
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da anuidade inv\u00E1lido")
  public Long getIdAnuidade() {
    return idAnuidade;
  }
  public void setIdAnuidade(Long idAnuidade) {
    this.idAnuidade = idAnuidade;
  }

  
  /**
   * Data e hora do in\u00EDcio da recorr\u00EAncia do d\u00E9bito
   **/
  @ApiModelProperty(value = "Data e hora do in\u00EDcio da recorr\u00EAncia do d\u00E9bito")
  public String getDataHoraInicio() {
    return dataHoraInicio;
  }
  public void setDataHoraInicio(String dataHoraInicio) {
    this.dataHoraInicio = dataHoraInicio;
  }

  
  /**
   * Data e hora do fim da recorr\u00EAncia do d\u00E9bito
   **/
  @ApiModelProperty(value = "Data e hora do fim da recorr\u00EAncia do d\u00E9bito")
  public String getDataHoraFim() {
    return dataHoraFim;
  }
  public void setDataHoraFim(String dataHoraFim) {
    this.dataHoraFim = dataHoraFim;
  }

  
  /**
   * N\u00FAmero de parcelas recorrentes
   **/
  @ApiModelProperty(value = "N\u00FAmero de parcelas recorrentes")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * N\u00FAmero de parcelas j\u00E1 pedidas
   **/
  @ApiModelProperty(value = "N\u00FAmero de parcelas j\u00E1 pedidas")
  public Integer getParcelaPerdida() {
    return parcelaPerdida;
  }
  public void setParcelaPerdida(Integer parcelaPerdida) {
    this.parcelaPerdida = parcelaPerdida;
  }

  
  /**
   * Valor da parcela com aplica\u00E7\u00E3o da parcela de desconto
   **/
  @ApiModelProperty(value = "Valor da parcela com aplica\u00E7\u00E3o da parcela de desconto")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Valor total sem a aplica\u00E7\u00E3o da porcentagem de desconto
   **/
  @ApiModelProperty(value = "Valor total sem a aplica\u00E7\u00E3o da porcentagem de desconto")
  public BigDecimal getValorOriginal() {
    return valorOriginal;
  }
  public void setValorOriginal(BigDecimal valorOriginal) {
    this.valorOriginal = valorOriginal;
  }

  
  /**
   * Percentual de desconto de cada parcela
   **/
  @ApiModelProperty(value = "Percentual de desconto de cada parcela")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * Falg para identifica\u00E7\u00E3o de cart\u00E3o desbloqueado
   **/
  @ApiModelProperty(value = "Falg para identifica\u00E7\u00E3o de cart\u00E3o desbloqueado")
  public Boolean getFlagCartaoDesbloqueado() {
    return flagCartaoDesbloqueado;
  }
  public void setFlagCartaoDesbloqueado(Boolean flagCartaoDesbloqueado) {
    this.flagCartaoDesbloqueado = flagCartaoDesbloqueado;
  }

  
  /**
   * Falg para identifica\u00E7\u00E3o de lan\u00E7amento de tarifa
   **/
  @ApiModelProperty(value = "Falg para identifica\u00E7\u00E3o de lan\u00E7amento de tarifa")
  public Boolean getFlagLancatarifa() {
    return flagLancatarifa;
  }
  public void setFlagLancatarifa(Boolean flagLancatarifa) {
    this.flagLancatarifa = flagLancatarifa;
  }

  
  /**
   * Data referente ao final do desconto da anuidade
   **/
  @ApiModelProperty(value = "Data referente ao final do desconto da anuidade")
  public String getDataFimDescontoAnuidade() {
    return dataFimDescontoAnuidade;
  }
  public void setDataFimDescontoAnuidade(String dataFimDescontoAnuidade) {
    this.dataFimDescontoAnuidade = dataFimDescontoAnuidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortadorDebitoRecorrenteUpdate {\n");
    
    sb.append("  portador: ").append(portador).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idAnuidade: ").append(idAnuidade).append("\n");
    sb.append("  dataHoraInicio: ").append(dataHoraInicio).append("\n");
    sb.append("  dataHoraFim: ").append(dataHoraFim).append("\n");
    sb.append("  numeroParcela: ").append(numeroParcela).append("\n");
    sb.append("  parcelaPerdida: ").append(parcelaPerdida).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  valorOriginal: ").append(valorOriginal).append("\n");
    sb.append("  percentualDesconto: ").append(percentualDesconto).append("\n");
    sb.append("  flagCartaoDesbloqueado: ").append(flagCartaoDesbloqueado).append("\n");
    sb.append("  flagLancatarifa: ").append(flagLancatarifa).append("\n");
    sb.append("  dataFimDescontoAnuidade: ").append(dataFimDescontoAnuidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
