package br.com.conductor.pier.api.v2.model;

import java.util.*;
import java.util.Map;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto que encapsula os par\u00C3\u00A2metros para gera\u00C3\u00A7\u00C3\u00A3o de um documento
 **/
@ApiModel(description = "Objeto que encapsula os par\u00C3\u00A2metros para gera\u00C3\u00A7\u00C3\u00A3o de um documento")
public class DocumentoParametrosRequest  {
  
  @SerializedName("idTipoDocumento")
  private Long idTipoDocumento = null;
  @SerializedName("idTemplateDocumento")
  private Long idTemplateDocumento = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("parametrosConteudo")
  private Map<String, Object> parametrosConteudo = null;

  
  /**
   * ID para o tipo de documento.
   **/
  @ApiModelProperty(value = "ID para o tipo de documento.")
  public Long getIdTipoDocumento() {
    return idTipoDocumento;
  }
  public void setIdTipoDocumento(Long idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
  }

  
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
   * Mapa de par\u00C3\u00A2metros para montagem do documento.
   **/
  @ApiModelProperty(value = "Mapa de par\u00C3\u00A2metros para montagem do documento.")
  public Map<String, Object> getParametrosConteudo() {
    return parametrosConteudo;
  }
  public void setParametrosConteudo(Map<String, Object> parametrosConteudo) {
    this.parametrosConteudo = parametrosConteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoParametrosRequest {\n");
    
    sb.append("  idTipoDocumento: ").append(idTipoDocumento).append("\n");
    sb.append("  idTemplateDocumento: ").append(idTemplateDocumento).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  parametrosConteudo: ").append(parametrosConteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


