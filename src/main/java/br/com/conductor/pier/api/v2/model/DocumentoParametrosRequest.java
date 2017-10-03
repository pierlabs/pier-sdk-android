package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PropriedadeDocumentoRequest;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto que encapsula os par\u00C3\u00A2metros para gera\u00C3\u00A7\u00C3\u00A3o de um documento
 **/
@ApiModel(description = "Objeto que encapsula os par\u00C3\u00A2metros para gera\u00C3\u00A7\u00C3\u00A3o de um documento")
public class DocumentoParametrosRequest  {
  
  @SerializedName("idTemplateDocumento")
  private Long idTemplateDocumento = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("parametrosConteudo")
  private List<PropriedadeDocumentoRequest> parametrosConteudo = null;

  
  /**
   * ID para o template do documento.
   **/
  @ApiModelProperty(value = "ID para o template do documento.")
  public Long getIdTemplateDocumento() {
    return idTemplateDocumento;
  }
  public void setIdTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
  }

  
  /**
   * Nome para o arquivo.
   **/
  @ApiModelProperty(value = "Nome para o arquivo.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Lista de par\u00C3\u00A2metros para montagem do documento.
   **/
  @ApiModelProperty(value = "Lista de par\u00C3\u00A2metros para montagem do documento.")
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


