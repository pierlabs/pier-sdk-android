package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PropriedadeDocumentoRequest;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de requisi\u00E7\u00E3o.
 **/
@ApiModel(description = "Objeto de requisi\u00E7\u00E3o.")
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
   * Identificador do template de documento
   **/
  @ApiModelProperty(value = "Identificador do template de documento")
  public Long getIdTemplate() {
    return idTemplate;
  }
  public void setIdTemplate(Long idTemplate) {
    this.idTemplate = idTemplate;
  }

  
  /**
   * Conte\u00FAdo do arquivo convertido em Base 64
   **/
  @ApiModelProperty(value = "Conte\u00FAdo do arquivo convertido em Base 64")
  public String getArquivo() {
    return arquivo;
  }
  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  
  /**
   * Nome do arquivo.
   **/
  @ApiModelProperty(value = "Nome do arquivo.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Lista de par\u00E2metros para montagem do documento.
   **/
  @ApiModelProperty(value = "Lista de par\u00E2metros para montagem do documento.")
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
