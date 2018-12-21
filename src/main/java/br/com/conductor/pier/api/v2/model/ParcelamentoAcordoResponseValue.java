package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{parcelamento_acordo_response_description}}}
 **/
@ApiModel(description = "{{{parcelamento_acordo_response_description}}}")
public class ParcelamentoAcordoResponseValue  {
  
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

  
  /**
   * {{{parcelamento_acordo_response_percentual_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_acordo_response_percentual_entrada_value}}}")
  public BigDecimal getPercentualEntrada() {
    return percentualEntrada;
  }
  public void setPercentualEntrada(BigDecimal percentualEntrada) {
    this.percentualEntrada = percentualEntrada;
  }

  
  /**
   * {{{parcelamento_acordo_response_percentual_desconto_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_acordo_response_percentual_desconto_value}}}")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * {{{parcelamento_acordo_response_valor_desconto_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_acordo_response_valor_desconto_value}}}")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * {{{parcelamento_acordo_response_valor_liquido_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_acordo_response_valor_liquido_value}}}")
  public BigDecimal getValorLiquido() {
    return valorLiquido;
  }
  public void setValorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
  }

  
  /**
   * {{{parcelamento_acordo_response_valor_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_acordo_response_valor_entrada_value}}}")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * {{{parcelamento_acordo_response_valor_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_acordo_response_valor_parcela_value}}}")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * {{{parcelamento_acordo_response_valor_primeira_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{parcelamento_acordo_response_valor_primeira_parcela_value}}}")
  public BigDecimal getValorPrimeiraParcela() {
    return valorPrimeiraParcela;
  }
  public void setValorPrimeiraParcela(BigDecimal valorPrimeiraParcela) {
    this.valorPrimeiraParcela = valorPrimeiraParcela;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelamentoAcordoResponseValue {\n");
    
    sb.append("  percentualEntrada: ").append(percentualEntrada).append("\n");
    sb.append("  percentualDesconto: ").append(percentualDesconto).append("\n");
    sb.append("  valorDesconto: ").append(valorDesconto).append("\n");
    sb.append("  valorLiquido: ").append(valorLiquido).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  valorPrimeiraParcela: ").append(valorPrimeiraParcela).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
