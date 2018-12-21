package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the Integration Document Resource
 **/
@ApiModel(description = "Response Representation of the Integration Document Resource")
public class DocumentoIntegracaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTemplate")
  private Long idTemplate = null;
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * ID of the Integrated Document
   **/
  @ApiModelProperty(value = "ID of the Integrated Document")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * ID of the Template of the associated Document
   **/
  @ApiModelProperty(value = "ID of the Template of the associated Document")
  public Long getIdTemplate() {
    return idTemplate;
  }
  public void setIdTemplate(Long idTemplate) {
    this.idTemplate = idTemplate;
  }

  
  /**
   * Name of the Document
   **/
  @ApiModelProperty(value = "Name of the Document")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoIntegracaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTemplate: ").append(idTemplate).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
