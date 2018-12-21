package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the template type
 **/
@ApiModel(description = "Representation of the template type")
public class TipoTemplateRequest  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("sigla")
  private String sigla = null;

  
  /**
   * Name of the type of template
   **/
  @ApiModelProperty(value = "Name of the type of template")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Description of the type of template
   **/
  @ApiModelProperty(value = "Description of the type of template")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Acronym of the type of template
   **/
  @ApiModelProperty(value = "Acronym of the type of template")
  public String getSigla() {
    return sigla;
  }
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoTemplateRequest {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  sigla: ").append(sigla).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
