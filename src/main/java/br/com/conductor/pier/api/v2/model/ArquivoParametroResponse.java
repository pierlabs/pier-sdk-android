package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{arquivo_parametro_response_description}}}
 **/
@ApiModel(description = "{{{arquivo_parametro_response_description}}}")
public class ArquivoParametroResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nomeCampo")
  private String nomeCampo = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * {{{arquivo_parametro_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_parametro_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{arquivo_parametro_response_nome_campo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{arquivo_parametro_response_nome_campo_value}}}")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   * {{{arquivo_parametro_response_conteudo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{arquivo_parametro_response_conteudo_value}}}")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoParametroResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nomeCampo: ").append(nomeCampo).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


