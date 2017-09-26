package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.DocumentoDetalheResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta para o recurso de Documento
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta para o recurso de Documento")
public class DocumentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idDocumentoTipo")
  private Long idDocumentoTipo = null;
  @SerializedName("idDocumentoTemplate")
  private Long idDocumentoTemplate = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("documento")
  private String documento = null;
  @SerializedName("extensao")
  private String extensao = null;
  @SerializedName("documentoDetalhes")
  private List<DocumentoDetalheResponse> documentoDetalhes = null;

  
  /**
   * ID do Documento.
   **/
  @ApiModelProperty(value = "ID do Documento.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * ID do Tipo de Documento associado.
   **/
  @ApiModelProperty(value = "ID do Tipo de Documento associado.")
  public Long getIdDocumentoTipo() {
    return idDocumentoTipo;
  }
  public void setIdDocumentoTipo(Long idDocumentoTipo) {
    this.idDocumentoTipo = idDocumentoTipo;
  }

  
  /**
   * ID do Template de Documento associado.
   **/
  @ApiModelProperty(value = "ID do Template de Documento associado.")
  public Long getIdDocumentoTemplate() {
    return idDocumentoTemplate;
  }
  public void setIdDocumentoTemplate(Long idDocumentoTemplate) {
    this.idDocumentoTemplate = idDocumentoTemplate;
  }

  
  /**
   * Nome do Documento.
   **/
  @ApiModelProperty(value = "Nome do Documento.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Nome do Documento.
   **/
  @ApiModelProperty(value = "Nome do Documento.")
  public String getDocumento() {
    return documento;
  }
  public void setDocumento(String documento) {
    this.documento = documento;
  }

  
  /**
   * Extens\u00C3\u00A3o do Documento.
   **/
  @ApiModelProperty(value = "Extens\u00C3\u00A3o do Documento.")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * Detalhamento do documento.
   **/
  @ApiModelProperty(value = "Detalhamento do documento.")
  public List<DocumentoDetalheResponse> getDocumentoDetalhes() {
    return documentoDetalhes;
  }
  public void setDocumentoDetalhes(List<DocumentoDetalheResponse> documentoDetalhes) {
    this.documentoDetalhes = documentoDetalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idDocumentoTipo: ").append(idDocumentoTipo).append("\n");
    sb.append("  idDocumentoTemplate: ").append(idDocumentoTemplate).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  documento: ").append(documento).append("\n");
    sb.append("  extensao: ").append(extensao).append("\n");
    sb.append("  documentoDetalhes: ").append(documentoDetalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


