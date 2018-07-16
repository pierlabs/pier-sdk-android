package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{documento_integracao_response_description}}}
 **/
@ApiModel(description = "{{{documento_integracao_response_description}}}")
public class DocumentoIntegracaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTemplate")
  private Long idTemplate = null;
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * {{{documento_integracao_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_integracao_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{documento_integracao_response_id_template_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_integracao_response_id_template_value}}}")
  public Long getIdTemplate() {
    return idTemplate;
  }
  public void setIdTemplate(Long idTemplate) {
    this.idTemplate = idTemplate;
  }

  
  /**
   * {{{documento_integracao_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_integracao_response_nome_value}}}")
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


