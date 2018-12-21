package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.DocumentoDetalheResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the Document resource
 **/
@ApiModel(description = "Response Representation of the Document resource")
public class DocumentoDetalhadoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTemplateDocumento")
  private Long idTemplateDocumento = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("documento")
  private String documento = null;
  @SerializedName("extensao")
  private String extensao = null;
  @SerializedName("documentoDetalhes")
  private List<DocumentoDetalheResponse> documentoDetalhes = null;

  
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
   * Representation of the document in Base64
   **/
  @ApiModelProperty(value = "Representation of the document in Base64")
  public String getDocumento() {
    return documento;
  }
  public void setDocumento(String documento) {
    this.documento = documento;
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

  
  /**
   * Detailing of the document
   **/
  @ApiModelProperty(value = "Detailing of the document")
  public List<DocumentoDetalheResponse> getDocumentoDetalhes() {
    return documentoDetalhes;
  }
  public void setDocumentoDetalhes(List<DocumentoDetalheResponse> documentoDetalhes) {
    this.documentoDetalhes = documentoDetalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoDetalhadoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTemplateDocumento: ").append(idTemplateDocumento).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  documento: ").append(documento).append("\n");
    sb.append("  extensao: ").append(extensao).append("\n");
    sb.append("  documentoDetalhes: ").append(documentoDetalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
