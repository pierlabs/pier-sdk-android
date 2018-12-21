package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Response of the file parameter
 **/
@ApiModel(description = "Object Response of the file parameter")
public class ArquivoParametroResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nomeCampo")
  private String nomeCampo = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * Identification Code of detail of the file
   **/
  @ApiModelProperty(value = "Identification Code of detail of the file")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Name that identify the details of the file
   **/
  @ApiModelProperty(required = true, value = "Name that identify the details of the file")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   * Content of nameField
   **/
  @ApiModelProperty(required = true, value = "Content of nameField")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoParametroResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nomeCampo: ").append(nomeCampo).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
