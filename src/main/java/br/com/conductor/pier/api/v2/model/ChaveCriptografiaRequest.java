package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{chave_criptografia_requisicao_descricao}}}
 **/
@ApiModel(description = "{{{chave_criptografia_requisicao_descricao}}}")
public class ChaveCriptografiaRequest  {
  
  @SerializedName("idChave")
  private Long idChave = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * {{{chave_criptografia_requisicao_id_chave_valor}}}
   **/
  @ApiModelProperty(required = true, value = "{{{chave_criptografia_requisicao_id_chave_valor}}}")
  public Long getIdChave() {
    return idChave;
  }
  public void setIdChave(Long idChave) {
    this.idChave = idChave;
  }

  
  /**
   * {{{chave_criptografia_requisicao_conteudo_valor}}}
   **/
  @ApiModelProperty(required = true, value = "{{{chave_criptografia_requisicao_conteudo_valor}}}")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChaveCriptografiaRequest {\n");
    
    sb.append("  idChave: ").append(idChave).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


