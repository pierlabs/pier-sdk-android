package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.DocumentoDetalheResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{documento_detalhado_response_description}}}
 **/
@ApiModel(description = "{{{documento_detalhado_response_description}}}")
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
   * {{{documento_detalhado_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_detalhado_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{documento_detalhado_response_id_template_documento_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_detalhado_response_id_template_documento_value}}}")
  public Long getIdTemplateDocumento() {
    return idTemplateDocumento;
  }
  public void setIdTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
  }

  
  /**
   * {{{documento_detalhado_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_detalhado_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{documento_detalhado_response_documento_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_detalhado_response_documento_value}}}")
  public String getDocumento() {
    return documento;
  }
  public void setDocumento(String documento) {
    this.documento = documento;
  }

  
  /**
   * {{{documento_detalhado_response_extensao_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_detalhado_response_extensao_value}}}")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * {{{documento_detalhado_response_documento_detalhes_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_detalhado_response_documento_detalhes_value}}}")
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


