package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Fatura
 **/
@ApiModel(description = "Fatura")
public class TipoBoletoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("banco")
  private Long banco = null;
  @SerializedName("faixaNossoNumero")
  private Integer faixaNossoNumero = null;
  @SerializedName("minNossoNumero")
  private BigDecimal minNossoNumero = null;
  @SerializedName("maxNossoNumero")
  private BigDecimal maxNossoNumero = null;
  @SerializedName("tamNossoNumero")
  private Integer tamNossoNumero = null;
  @SerializedName("ultimoNossoNumero")
  private BigDecimal ultimoNossoNumero = null;

  
  /**
   * C\u00F3digo identificador do tipo de boleto
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do tipo de boleto")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de boleto
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo de boleto")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * C\u00F3digo identificador do banco
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * Faixa permitida para cria\u00E7\u00E3o do nosso n\u00FAmero
   **/
  @ApiModelProperty(value = "Faixa permitida para cria\u00E7\u00E3o do nosso n\u00FAmero")
  public Integer getFaixaNossoNumero() {
    return faixaNossoNumero;
  }
  public void setFaixaNossoNumero(Integer faixaNossoNumero) {
    this.faixaNossoNumero = faixaNossoNumero;
  }

  
  /**
   * N\u00FAmero minimo para o nosso n\u00FAmero
   **/
  @ApiModelProperty(value = "N\u00FAmero minimo para o nosso n\u00FAmero")
  public BigDecimal getMinNossoNumero() {
    return minNossoNumero;
  }
  public void setMinNossoNumero(BigDecimal minNossoNumero) {
    this.minNossoNumero = minNossoNumero;
  }

  
  /**
   * N\u00FAmero m\u00E1ximo para o nosso n\u00FAmero
   **/
  @ApiModelProperty(value = "N\u00FAmero m\u00E1ximo para o nosso n\u00FAmero")
  public BigDecimal getMaxNossoNumero() {
    return maxNossoNumero;
  }
  public void setMaxNossoNumero(BigDecimal maxNossoNumero) {
    this.maxNossoNumero = maxNossoNumero;
  }

  
  /**
   * Tamanho do nosso n\u00FAmero
   **/
  @ApiModelProperty(value = "Tamanho do nosso n\u00FAmero")
  public Integer getTamNossoNumero() {
    return tamNossoNumero;
  }
  public void setTamNossoNumero(Integer tamNossoNumero) {
    this.tamNossoNumero = tamNossoNumero;
  }

  
  /**
   * \u00DAltimo nosso n\u00FAmero utilizado
   **/
  @ApiModelProperty(value = "\u00DAltimo nosso n\u00FAmero utilizado")
  public BigDecimal getUltimoNossoNumero() {
    return ultimoNossoNumero;
  }
  public void setUltimoNossoNumero(BigDecimal ultimoNossoNumero) {
    this.ultimoNossoNumero = ultimoNossoNumero;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoBoletoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  faixaNossoNumero: ").append(faixaNossoNumero).append("\n");
    sb.append("  minNossoNumero: ").append(minNossoNumero).append("\n");
    sb.append("  maxNossoNumero: ").append(maxNossoNumero).append("\n");
    sb.append("  tamNossoNumero: ").append(tamNossoNumero).append("\n");
    sb.append("  ultimoNossoNumero: ").append(ultimoNossoNumero).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
