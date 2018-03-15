package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Response de par\u00E2metros do arquivo.
 **/
@ApiModel(description = "Objeto Response de par\u00E2metros do arquivo.")
public class ArquivoParametroResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nomeCampo")
  private String nomeCampo = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do detalhe do arquivo.
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do detalhe do arquivo.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome que identifica o detalhe do arquivo
   **/
  @ApiModelProperty(required = true, value = "Nome que identifica o detalhe do arquivo")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   * Conte\u00FAdo do nomeCampo
   **/
  @ApiModelProperty(required = true, value = "Conte\u00FAdo do nomeCampo")
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
