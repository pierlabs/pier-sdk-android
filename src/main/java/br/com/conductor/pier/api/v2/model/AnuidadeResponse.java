package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{anuidade_response_description}}}
 **/
@ApiModel(description = "{{{anuidade_response_description}}}")
public class AnuidadeResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("flagAnuidadeBonificada")
  private Boolean flagAnuidadeBonificada = null;

  
  /**
   * {{{anuidade_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{anuidade_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{anuidade_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{anuidade_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{anuidade_response_valor_value}}}
   **/
  @ApiModelProperty(value = "{{{anuidade_response_valor_value}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{anuidade_response_flag_anuidade_bonificada_value}}}
   **/
  @ApiModelProperty(value = "{{{anuidade_response_flag_anuidade_bonificada_value}}}")
  public Boolean getFlagAnuidadeBonificada() {
    return flagAnuidadeBonificada;
  }
  public void setFlagAnuidadeBonificada(Boolean flagAnuidadeBonificada) {
    this.flagAnuidadeBonificada = flagAnuidadeBonificada;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnuidadeResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  flagAnuidadeBonificada: ").append(flagAnuidadeBonificada).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
