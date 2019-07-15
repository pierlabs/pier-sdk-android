package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta para o parcelamento de acordo
 **/
@ApiModel(description = "Objeto de resposta para o parcelamento de acordo")
public class ParcelamentoAcordoResponse  {
  
  @SerializedName("percentualEntrada")
  private BigDecimal percentualEntrada = null;
  @SerializedName("percentualDesconto")
  private BigDecimal percentualDesconto = null;
  @SerializedName("valorDesconto")
  private BigDecimal valorDesconto = null;
  @SerializedName("valorLiquido")
  private BigDecimal valorLiquido = null;
  @SerializedName("valorEntrada")
  private BigDecimal valorEntrada = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("valorPrimeiraParcela")
  private BigDecimal valorPrimeiraParcela = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;

  
  /**
   * Valor do percentual de entrada do acordo
   **/
  @ApiModelProperty(value = "Valor do percentual de entrada do acordo")
  public BigDecimal getPercentualEntrada() {
    return percentualEntrada;
  }
  public void setPercentualEntrada(BigDecimal percentualEntrada) {
    this.percentualEntrada = percentualEntrada;
  }

  
  /**
   * Valor do percentual de desconto do acordo
   **/
  @ApiModelProperty(value = "Valor do percentual de desconto do acordo")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * Valor do desconto atribuido
   **/
  @ApiModelProperty(value = "Valor do desconto atribuido")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * Valor liquido do acordo
   **/
  @ApiModelProperty(value = "Valor liquido do acordo")
  public BigDecimal getValorLiquido() {
    return valorLiquido;
  }
  public void setValorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
  }

  
  /**
   * Valor da entrada do acordo
   **/
  @ApiModelProperty(value = "Valor da entrada do acordo")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Valor da parcela do acordo
   **/
  @ApiModelProperty(value = "Valor da parcela do acordo")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Valor da primeira parcela do acordo
   **/
  @ApiModelProperty(value = "Valor da primeira parcela do acordo")
  public BigDecimal getValorPrimeiraParcela() {
    return valorPrimeiraParcela;
  }
  public void setValorPrimeiraParcela(BigDecimal valorPrimeiraParcela) {
    this.valorPrimeiraParcela = valorPrimeiraParcela;
  }

  
  /**
   * N\u00FAmero de parcelas do acordo
   **/
  @ApiModelProperty(value = "N\u00FAmero de parcelas do acordo")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelamentoAcordoResponse {\n");
    
    sb.append("  percentualEntrada: ").append(percentualEntrada).append("\n");
    sb.append("  percentualDesconto: ").append(percentualDesconto).append("\n");
    sb.append("  valorDesconto: ").append(valorDesconto).append("\n");
    sb.append("  valorLiquido: ").append(valorLiquido).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  valorPrimeiraParcela: ").append(valorPrimeiraParcela).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
