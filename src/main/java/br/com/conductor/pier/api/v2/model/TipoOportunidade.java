package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto TipoOportunidade
 **/
@ApiModel(description = "Objeto TipoOportunidade")
public class TipoOportunidade  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;

  
  /**
   * Descri\u00E7\u00E3o do tipo oportunidade
   **/
  @ApiModelProperty(required = true, value = "Descri\u00E7\u00E3o do tipo oportunidade")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag de verifica\u00E7\u00E3o se o tipo oportunidade est\u00E1 ativo
   **/
  @ApiModelProperty(required = true, value = "Flag de verifica\u00E7\u00E3o se o tipo oportunidade est\u00E1 ativo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOportunidade {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
