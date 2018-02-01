package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Tipo de moeda
 **/
@ApiModel(description = "Tipo de moeda")
public class MoedaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("codigoMoeda")
  private String codigoMoeda = null;
  @SerializedName("simbolo")
  private String simbolo = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * Identificador do tipo de moeda.
   **/
  @ApiModelProperty(value = "Identificador do tipo de moeda.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do tipo de moeda.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do tipo de moeda.")
  public String getCodigoMoeda() {
    return codigoMoeda;
  }
  public void setCodigoMoeda(String codigoMoeda) {
    this.codigoMoeda = codigoMoeda;
  }

  
  /**
   * S\u00C3\u00ADmbolo da Moeda.
   **/
  @ApiModelProperty(value = "S\u00C3\u00ADmbolo da Moeda.")
  public String getSimbolo() {
    return simbolo;
  }
  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do tipo da moeda.
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do tipo da moeda.")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoedaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  codigoMoeda: ").append(codigoMoeda).append("\n");
    sb.append("  simbolo: ").append(simbolo).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
