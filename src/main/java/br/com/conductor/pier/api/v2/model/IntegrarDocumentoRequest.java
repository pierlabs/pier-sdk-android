package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PropriedadeDocumentoRequest;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object of request
 **/
@ApiModel(description = "Object of request")
public class IntegrarDocumentoRequest  {
  
  @SerializedName("idTemplate")
  private Long idTemplate = null;
  @SerializedName("arquivo")
  private String arquivo = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("propriedades")
  private List<PropriedadeDocumentoRequest> propriedades = null;

  
  /**
   * Identifier of the template of document
   **/
  @ApiModelProperty(value = "Identifier of the template of document")
  public Long getIdTemplate() {
    return idTemplate;
  }
  public void setIdTemplate(Long idTemplate) {
    this.idTemplate = idTemplate;
  }

  
  /**
   * Content of the converted file in Base 64
   **/
  @ApiModelProperty(value = "Content of the converted file in Base 64")
  public String getArquivo() {
    return arquivo;
  }
  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  
  /**
   * Name of the file
   **/
  @ApiModelProperty(value = "Name of the file")
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
  public List<PropriedadeDocumentoRequest> getPropriedades() {
    return propriedades;
  }
  public void setPropriedades(List<PropriedadeDocumentoRequest> propriedades) {
    this.propriedades = propriedades;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrarDocumentoRequest {\n");
    
    sb.append("  idTemplate: ").append(idTemplate).append("\n");
    sb.append("  arquivo: ").append(arquivo).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  propriedades: ").append(propriedades).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
