package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation for the detailed document
 **/
@ApiModel(description = "Response Representation for the detailed document")
public class DocumentoDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("propriedade")
  private String propriedade = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * ID of identification of the document
   **/
  @ApiModelProperty(value = "ID of identification of the document")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Detailing Properties of the document
   **/
  @ApiModelProperty(value = "Detailing Properties of the document")
  public String getPropriedade() {
    return propriedade;
  }
  public void setPropriedade(String propriedade) {
    this.propriedade = propriedade;
  }

  
  /**
   * Detailing Content of the document
   **/
  @ApiModelProperty(value = "Detailing Content of the document")
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
