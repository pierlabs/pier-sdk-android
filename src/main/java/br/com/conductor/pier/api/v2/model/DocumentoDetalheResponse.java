package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{documento_detalhe_response_description}}}
 **/
@ApiModel(description = "{{{documento_detalhe_response_description}}}")
public class DocumentoDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("propriedade")
  private String propriedade = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * {{{documento_detalhe_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_detalhe_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{documento_detalhe_response_propriedade_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_detalhe_response_propriedade_value}}}")
  public String getPropriedade() {
    return propriedade;
  }
  public void setPropriedade(String propriedade) {
    this.propriedade = propriedade;
  }

  
  /**
   * {{{documento_detalhe_response_conteudo_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_detalhe_response_conteudo_value}}}")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  propriedade: ").append(propriedade).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
