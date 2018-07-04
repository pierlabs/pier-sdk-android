package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PropriedadeDocumentoRequest;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{documento_parametros_request_description}}}
 **/
@ApiModel(description = "{{{documento_parametros_request_description}}}")
public class DocumentoParametrosRequest  {
  
  @SerializedName("idTemplateDocumento")
  private Long idTemplateDocumento = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("parametrosConteudo")
  private List<PropriedadeDocumentoRequest> parametrosConteudo = null;

  
  /**
   * {{{documento_parametros_request_id_template_documento_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_parametros_request_id_template_documento_value}}}")
  public Long getIdTemplateDocumento() {
    return idTemplateDocumento;
  }
  public void setIdTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
  }

  
  /**
   * {{{documento_parametros_request_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_parametros_request_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{documento_parametros_request_parametros_conteudo_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_parametros_request_parametros_conteudo_value}}}")
  public List<PropriedadeDocumentoRequest> getParametrosConteudo() {
    return parametrosConteudo;
  }
  public void setParametrosConteudo(List<PropriedadeDocumentoRequest> parametrosConteudo) {
    this.parametrosConteudo = parametrosConteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoParametrosRequest {\n");
    
    sb.append("  idTemplateDocumento: ").append(idTemplateDocumento).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  parametrosConteudo: ").append(parametrosConteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


