package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o de resposta do d\u00E9bito recorrente do portador
 **/
@ApiModel(description = "Representa\u00E7\u00E3o de resposta do d\u00E9bito recorrente do portador")
public class PortadorDebitoRecorrenteResponse  {
  
  @SerializedName("dataHoraFim")
  private String dataHoraFim = null;
  @SerializedName("dataHoraInicio")
  private String dataHoraInicio = null;
  @SerializedName("flagCartaoDesbloqueado")
  private Boolean flagCartaoDesbloqueado = null;
  @SerializedName("flagLancatarifa")
  private Boolean flagLancatarifa = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idAnuidade")
  private Long idAnuidade = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("numeroParcela")
  private Integer numeroParcela = null;
  @SerializedName("parcelaPerdida")
  private Integer parcelaPerdida = null;
  @SerializedName("percentualDesconto")
  private BigDecimal percentualDesconto = null;
  @SerializedName("portador")
  private Integer portador = null;
  @SerializedName("valorOriginal")
  private BigDecimal valorOriginal = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;

  
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
   * Flag para identifica\u00E7\u00E3o de cart\u00E3o desbloqueado
   **/
  @ApiModelProperty(value = "Flag para identifica\u00E7\u00E3o de cart\u00E3o desbloqueado")
  public Boolean getFlagCartaoDesbloqueado() {
    return flagCartaoDesbloqueado;
  }
  public void setFlagCartaoDesbloqueado(Boolean flagCartaoDesbloqueado) {
    this.flagCartaoDesbloqueado = flagCartaoDesbloqueado;
  }

  
  /**
   * Flag para identifica\u00E7\u00E3o de lan\u00E7ametno de tarifa
   **/
  @ApiModelProperty(value = "Flag para identifica\u00E7\u00E3o de lan\u00E7ametno de tarifa")
  public Boolean getFlagLancatarifa() {
    return flagLancatarifa;
  }
  public void setFlagLancatarifa(Boolean flagLancatarifa) {
    this.flagLancatarifa = flagLancatarifa;
  }

  
  /**
   * C\u00F3digo identificador do registro de d\u00E9bito recorrente do portador (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do registro de d\u00E9bito recorrente do portador (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador da anuidade
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da anuidade")
  public Long getIdAnuidade() {
    return idAnuidade;
  }
  public void setIdAnuidade(Long idAnuidade) {
    this.idAnuidade = idAnuidade;
  }

  
  /**
   * C\u00F3digo identificador da conta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da conta (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
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
   * N\u00FAmero de parcelas ja pedidas
   **/
  @ApiModelProperty(value = "N\u00FAmero de parcelas ja pedidas")
  public Integer getParcelaPerdida() {
    return parcelaPerdida;
  }
  public void setParcelaPerdida(Integer parcelaPerdida) {
    this.parcelaPerdida = parcelaPerdida;
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
   * Valor total sem aplica\u00E7\u00E3o da porcentagem de desconto
   **/
  @ApiModelProperty(value = "Valor total sem aplica\u00E7\u00E3o da porcentagem de desconto")
  public BigDecimal getValorOriginal() {
    return valorOriginal;
  }
  public void setValorOriginal(BigDecimal valorOriginal) {
    this.valorOriginal = valorOriginal;
  }

  
  /**
   * Valor da parcela com aplica\u00E7\u00E3o da porcentagem de desconto
   **/
  @ApiModelProperty(value = "Valor da parcela com aplica\u00E7\u00E3o da porcentagem de desconto")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortadorDebitoRecorrenteResponse {\n");
    
    sb.append("  dataHoraFim: ").append(dataHoraFim).append("\n");
    sb.append("  dataHoraInicio: ").append(dataHoraInicio).append("\n");
    sb.append("  flagCartaoDesbloqueado: ").append(flagCartaoDesbloqueado).append("\n");
    sb.append("  flagLancatarifa: ").append(flagLancatarifa).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idAnuidade: ").append(idAnuidade).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  numeroParcela: ").append(numeroParcela).append("\n");
    sb.append("  parcelaPerdida: ").append(parcelaPerdida).append("\n");
    sb.append("  percentualDesconto: ").append(percentualDesconto).append("\n");
    sb.append("  portador: ").append(portador).append("\n");
    sb.append("  valorOriginal: ").append(valorOriginal).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
