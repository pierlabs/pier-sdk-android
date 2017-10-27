package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de Documento Integra\u00C3\u00A7\u00C3\u00A3o
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de Documento Integra\u00C3\u00A7\u00C3\u00A3o")
public class DocumentoIntegracaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTemplate")
  private Long idTemplate = null;
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * ID do Documento Integrado.
   **/
  @ApiModelProperty(value = "ID do Documento Integrado.")
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
  public Long getIdTemplate() {
    return idTemplate;
  }
  public void setIdTemplate(Long idTemplate) {
    this.idTemplate = idTemplate;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoIntegracaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTemplate: ").append(idTemplate).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


