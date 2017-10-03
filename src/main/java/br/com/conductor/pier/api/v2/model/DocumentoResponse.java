package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta resumida para o recurso de Documento
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta resumida para o recurso de Documento")
public class DocumentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTemplateDocumento")
  private Long idTemplateDocumento = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("extensao")
  private String extensao = null;

  
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
   * ID do Template de Documento associado.
   **/
  @ApiModelProperty(value = "ID do Template de Documento associado.")
  public Long getIdTemplateDocumento() {
    return idTemplateDocumento;
  }
  public void setIdTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
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
   * Extens\u00C3\u00A3o do Documento.
   **/
  @ApiModelProperty(value = "Extens\u00C3\u00A3o do Documento.")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTemplateDocumento: ").append(idTemplateDocumento).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  extensao: ").append(extensao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


