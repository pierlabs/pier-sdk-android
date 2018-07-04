package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PropriedadeDocumentoRequest;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{integrar_documento_request_description}}}
 **/
@ApiModel(description = "{{{integrar_documento_request_description}}}")
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
   * {{{integrar_documento_request_id_template_value}}}
   **/
  @ApiModelProperty(value = "{{{integrar_documento_request_id_template_value}}}")
  public Long getIdTemplate() {
    return idTemplate;
  }
  public void setIdTemplate(Long idTemplate) {
    this.idTemplate = idTemplate;
  }

  
  /**
   * {{{integrar_documento_request_arquivo_value}}}
   **/
  @ApiModelProperty(value = "{{{integrar_documento_request_arquivo_value}}}")
  public String getArquivo() {
    return arquivo;
  }
  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  
  /**
   * {{{integrar_documento_request_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{integrar_documento_request_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{integrar_documento_request_propriedades_value}}}
   **/
  @ApiModelProperty(value = "{{{integrar_documento_request_propriedades_value}}}")
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


