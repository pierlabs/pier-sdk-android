package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta para o detalhamento do documento
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta para o detalhamento do documento")
public class DocumentoDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("propriedade")
  private String propriedade = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * ID de identifica\u00E7\u00E3o do detalhamento do documento.
   **/
  @ApiModelProperty(value = "ID de identifica\u00E7\u00E3o do detalhamento do documento.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Propriedade do detalhamento do documento.
   **/
  @ApiModelProperty(value = "Propriedade do detalhamento do documento.")
  public String getPropriedade() {
    return propriedade;
  }
  public void setPropriedade(String propriedade) {
    this.propriedade = propriedade;
  }

  
  /**
   * Conte\u00FAdo do detalhamento do documento.
   **/
  @ApiModelProperty(value = "Conte\u00FAdo do detalhamento do documento.")
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
