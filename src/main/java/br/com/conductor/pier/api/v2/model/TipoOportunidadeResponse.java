package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso TipoOportunidade
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso TipoOportunidade")
public class TipoOportunidadeResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;

  
  /**
   * C\u00F3digo identificador do TipoOportunidade
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do TipoOportunidade")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descricao do TipoOportunidade
   **/
  @ApiModelProperty(required = true, value = "Descricao do TipoOportunidade")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag que representa se o tipo oportunidade est\u00E1 ativo
   **/
  @ApiModelProperty(required = true, value = "Flag que representa se o tipo oportunidade est\u00E1 ativo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOportunidadeResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
