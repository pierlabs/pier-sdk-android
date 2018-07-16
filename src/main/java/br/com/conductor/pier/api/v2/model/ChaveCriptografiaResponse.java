package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{chave_criptografia_resposta_descricao}}}
 **/
@ApiModel(description = "{{{chave_criptografia_resposta_descricao}}}")
public class ChaveCriptografiaResponse  {
  
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * {{{chave_criptografia_resposta_texto_conteudo}}}
   **/
  @ApiModelProperty(value = "{{{chave_criptografia_resposta_texto_conteudo}}}")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChaveCriptografiaResponse {\n");
    
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


