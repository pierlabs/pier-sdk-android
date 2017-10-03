package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de Tipo de Template
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de Tipo de Template")
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
   * ID do Tipo de Template.
   **/
  @ApiModelProperty(value = "ID do Tipo de Template.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do Tipo de Template.
   **/
  @ApiModelProperty(value = "Nome do Tipo de Template.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do Tipo de Template.
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do Tipo de Template.")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Sigla do Tipo de Template.
   **/
  @ApiModelProperty(value = "Sigla do Tipo de Template.")
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


