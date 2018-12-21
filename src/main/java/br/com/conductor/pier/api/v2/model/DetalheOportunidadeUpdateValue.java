package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{detalhe_oportunidade_update_description}}}
 **/
@ApiModel(description = "{{{detalhe_oportunidade_update_description}}}")
public class DetalheOportunidadeUpdateValue  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nomeCampo")
  private String nomeCampo = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * {{{detalhe_oportunidade_update_id_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_oportunidade_update_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{detalhe_oportunidade_update_nome_campo_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_oportunidade_update_nome_campo_value}}}")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   * {{{detalhe_oportunidade_update_conteudo_value}}}
   **/
  @ApiModelProperty(value = "{{{detalhe_oportunidade_update_conteudo_value}}}")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheOportunidadeUpdateValue {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nomeCampo: ").append(nomeCampo).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
