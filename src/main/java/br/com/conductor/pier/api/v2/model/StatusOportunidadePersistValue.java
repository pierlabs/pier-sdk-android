package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{status_oportunidade_persist_description}}}
 **/
@ApiModel(description = "{{{status_oportunidade_persist_description}}}")
public class StatusOportunidadePersistValue  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;

  
  /**
   * {{{status_oportunidade_persist_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{status_oportunidade_persist_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{status_oportunidade_persist_descricao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{status_oportunidade_persist_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{status_oportunidade_persist_flag_ativo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{status_oportunidade_persist_flag_ativo_value}}}")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusOportunidadePersistValue {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
