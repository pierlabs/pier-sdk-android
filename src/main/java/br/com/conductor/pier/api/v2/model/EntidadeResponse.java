package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de Resposta da Entidade
 **/
@ApiModel(description = "Objeto de Resposta da Entidade")
public class EntidadeResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da entidade
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da entidade")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o da entidade
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o da entidade")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag que indica se a entidade est\u00E1 ativa
   **/
  @ApiModelProperty(value = "Flag que indica se a entidade est\u00E1 ativa")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntidadeResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
