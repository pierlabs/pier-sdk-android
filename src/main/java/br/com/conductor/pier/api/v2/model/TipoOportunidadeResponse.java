package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{tipo_oportunidade_response_description}}}
 **/
@ApiModel(description = "{{{tipo_oportunidade_response_description}}}")
public class TipoOportunidadeResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;

  
  /**
   * {{{tipo_oportunidade_response_id_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_oportunidade_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_oportunidade_response_descricao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_oportunidade_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_oportunidade_response_flag_ativo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_oportunidade_response_flag_ativo_value}}}")
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
