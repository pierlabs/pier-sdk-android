package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the upload of a base64
 **/
@ApiModel(description = "Response Representation of the upload of a base64")
public class DocumentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTemplateDocumento")
  private Long idTemplateDocumento = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("extensao")
  private String extensao = null;

  
  /**
   * ID of the Document
   **/
  @ApiModelProperty(value = "ID of the Document")
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
  public Long getIdTemplateDocumento() {
    return idTemplateDocumento;
  }
  public void setIdTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
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

  
  /**
   * Extension of the Document
   **/
  @ApiModelProperty(value = "Extension of the Document")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTemplateDocumento: ").append(idTemplateDocumento).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  extensao: ").append(extensao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
