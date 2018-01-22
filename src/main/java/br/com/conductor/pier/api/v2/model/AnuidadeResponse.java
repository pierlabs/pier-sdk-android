package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de anuidade
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de anuidade")
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
   * Identificador do Tipo de anuidade de b\u00C3\u00B4nus de celular
   **/
  @ApiModelProperty(value = "Identificador do Tipo de anuidade de b\u00C3\u00B4nus de celular")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do tipo de anuidade de b\u00C3\u00B4nus de celular
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do tipo de anuidade de b\u00C3\u00B4nus de celular")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Valor do tipo de anuidade de b\u00C3\u00B4nus de celular
   **/
  @ApiModelProperty(value = "Valor do tipo de anuidade de b\u00C3\u00B4nus de celular")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Se o tipo de anuidade de b\u00C3\u00B4nus de celular \u00C3\u00A9 bonificada
   **/
  @ApiModelProperty(value = "Se o tipo de anuidade de b\u00C3\u00B4nus de celular \u00C3\u00A9 bonificada")
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
