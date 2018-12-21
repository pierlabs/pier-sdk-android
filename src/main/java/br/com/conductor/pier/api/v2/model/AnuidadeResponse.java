package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the annuity resource
 **/
@ApiModel(description = "Response Representation of the annuity resource")
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
   * Identifier of Annuity type of the telephone bonuses
   **/
  @ApiModelProperty(value = "Identifier of Annuity type of the telephone bonuses")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Description of Annuity type of the telephone bonuses
   **/
  @ApiModelProperty(value = "Description of Annuity type of the telephone bonuses")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Value of Annuity type of the telephone bonuses
   **/
  @ApiModelProperty(value = "Value of Annuity type of the telephone bonuses")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * If the type of annuity of the telephone bonuses is subsidised
   **/
  @ApiModelProperty(value = "If the type of annuity of the telephone bonuses is subsidised")
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
