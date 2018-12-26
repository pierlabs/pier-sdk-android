package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{tipo_template_request_description}}}
 **/
@ApiModel(description = "{{{tipo_template_request_description}}}")
public class TipoTemplateRequest  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("sigla")
  private String sigla = null;

  
  /**
   * {{{tipo_template_request_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_template_request_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{tipo_template_request_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_template_request_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_template_request_sigla_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_template_request_sigla_value}}}")
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
