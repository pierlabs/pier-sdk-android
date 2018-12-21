package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Currency type
 **/
@ApiModel(description = "Currency type")
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
   * Identifier of the currency type
   **/
  @ApiModelProperty(value = "Identifier of the currency type")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identifier Code of the currency type
   **/
  @ApiModelProperty(value = "Identifier Code of the currency type")
  public String getCodigoMoeda() {
    return codigoMoeda;
  }
  public void setCodigoMoeda(String codigoMoeda) {
    this.codigoMoeda = codigoMoeda;
  }

  
  /**
   * Currency symbol
   **/
  @ApiModelProperty(value = "Currency symbol")
  public String getSimbolo() {
    return simbolo;
  }
  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  
  /**
   * Description of the currency type
   **/
  @ApiModelProperty(value = "Description of the currency type")
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
