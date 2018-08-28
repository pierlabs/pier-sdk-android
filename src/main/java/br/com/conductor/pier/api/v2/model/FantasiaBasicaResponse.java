package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{fantasia_basica_response_description}}}
 **/
@ApiModel(description = "{{{fantasia_basica_response_description}}}")
public class FantasiaBasicaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * {{{fantasia_basica_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{fantasia_basica_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{fantasia_basica_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{fantasia_basica_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{fantasia_basica_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{fantasia_basica_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FantasiaBasicaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
