package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{moeda_response_description}}}
 **/
@ApiModel(description = "{{{moeda_response_description}}}")
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
   * {{{moeda_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{moeda_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{moeda_response_codigo_moeda_value}}}
   **/
  @ApiModelProperty(value = "{{{moeda_response_codigo_moeda_value}}}")
  public String getCodigoMoeda() {
    return codigoMoeda;
  }
  public void setCodigoMoeda(String codigoMoeda) {
    this.codigoMoeda = codigoMoeda;
  }

  
  /**
   * {{{moeda_response_simbolo_value}}}
   **/
  @ApiModelProperty(value = "{{{moeda_response_simbolo_value}}}")
  public String getSimbolo() {
    return simbolo;
  }
  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  
  /**
   * {{{moeda_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{moeda_response_descricao_value}}}")
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


