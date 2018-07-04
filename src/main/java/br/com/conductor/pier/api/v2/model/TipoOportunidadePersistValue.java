package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{tipo_oportunidade_persist_description}}}
 **/
@ApiModel(description = "{{{tipo_oportunidade_persist_description}}}")
public class TipoOportunidadePersistValue  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;

  
  /**
   * {{{tipo_oportunidade_persist_descricao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_oportunidade_persist_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_oportunidade_persist_flag_ativo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_oportunidade_persist_flag_ativo_value}}}")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOportunidadePersistValue {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


