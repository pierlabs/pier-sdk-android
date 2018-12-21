package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Answer Representation of the Template Type Resource
 **/
@ApiModel(description = "Answer Representation of the Template Type Resource")
public class TipoTemplateResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("sigla")
  private String sigla = null;

  
  /**
   * ID of the Type of Template
   **/
  @ApiModelProperty(value = "ID of the Type of Template")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome of the Type of Template
   **/
  @ApiModelProperty(value = "Nome of the Type of Template")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Description of the Tipo of Template
   **/
  @ApiModelProperty(value = "Description of the Tipo of Template")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Acronym of the Type of Template
   **/
  @ApiModelProperty(value = "Acronym of the Type of Template")
  public String getSigla() {
    return sigla;
  }
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoTemplateResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  sigla: ").append(sigla).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
