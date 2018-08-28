package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{arquivo_detalhes_persist_description}}}
 **/
@ApiModel(description = "{{{arquivo_detalhes_persist_description}}}")
public class ArquivoDetalhesPersist  {
  
  @SerializedName("nomeCampo")
  private String nomeCampo = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * {{{arquivo_detalhes_persist_nome_campo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{arquivo_detalhes_persist_nome_campo_value}}}")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   * {{{arquivo_detalhes_persist_conteudo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{arquivo_detalhes_persist_conteudo_value}}}")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoDetalhesPersist {\n");
    
    sb.append("  nomeCampo: ").append(nomeCampo).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
