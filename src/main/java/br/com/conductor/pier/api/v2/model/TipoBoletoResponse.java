package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{tipo_boleto_response_description}}}
 **/
@ApiModel(description = "{{{tipo_boleto_response_description}}}")
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
   * {{{tipo_boleto_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_boleto_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_boleto_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_boleto_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_boleto_response_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_boleto_response_banco_value}}}")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * {{{tipo_boleto_response_faixa_nosso_numero_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_boleto_response_faixa_nosso_numero_value}}}")
  public Integer getFaixaNossoNumero() {
    return faixaNossoNumero;
  }
  public void setFaixaNossoNumero(Integer faixaNossoNumero) {
    this.faixaNossoNumero = faixaNossoNumero;
  }

  
  /**
   * {{{tipo_boleto_response_min_nosso_numero_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_boleto_response_min_nosso_numero_value}}}")
  public BigDecimal getMinNossoNumero() {
    return minNossoNumero;
  }
  public void setMinNossoNumero(BigDecimal minNossoNumero) {
    this.minNossoNumero = minNossoNumero;
  }

  
  /**
   * {{{tipo_boleto_response_max_nosso_numero_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_boleto_response_max_nosso_numero_value}}}")
  public BigDecimal getMaxNossoNumero() {
    return maxNossoNumero;
  }
  public void setMaxNossoNumero(BigDecimal maxNossoNumero) {
    this.maxNossoNumero = maxNossoNumero;
  }

  
  /**
   * {{{tipo_boleto_response_tam_nosso_numero_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_boleto_response_tam_nosso_numero_value}}}")
  public Integer getTamNossoNumero() {
    return tamNossoNumero;
  }
  public void setTamNossoNumero(Integer tamNossoNumero) {
    this.tamNossoNumero = tamNossoNumero;
  }

  
  /**
   * {{{tipo_boleto_response_ultimo_nosso_numero_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_boleto_response_ultimo_nosso_numero_value}}}")
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


