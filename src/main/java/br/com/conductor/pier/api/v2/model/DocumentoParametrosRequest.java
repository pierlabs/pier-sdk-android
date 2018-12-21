package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PropriedadeDocumentoRequest;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object that encapsulate the parameters for generation of a document
 **/
@ApiModel(description = "Object that encapsulate the parameters for generation of a document")
public class DocumentoParametrosRequest  {
  
  @SerializedName("idTemplateDocumento")
  private Long idTemplateDocumento = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("parametrosConteudo")
  private List<PropriedadeDocumentoRequest> parametrosConteudo = null;

  
  /**
   * ID for the template of the document
   **/
  @ApiModelProperty(value = "ID for the template of the document")
  public Long getIdTemplateDocumento() {
    return idTemplateDocumento;
  }
  public void setIdTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
  }

  
  /**
   * Name for the file
   **/
  @ApiModelProperty(value = "Name for the file")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * List the parameters for the formation of the document
   **/
  @ApiModelProperty(value = "List the parameters for the formation of the document")
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
