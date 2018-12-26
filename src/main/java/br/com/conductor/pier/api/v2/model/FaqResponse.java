package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{faq_response_description}}}
 **/
@ApiModel(description = "{{{faq_response_description}}}")
public class FaqResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("pergunta")
  private String pergunta = null;
  @SerializedName("resposta")
  private String resposta = null;
  @SerializedName("relevancia")
  private Integer relevancia = null;
  @SerializedName("plataforma")
  private String plataforma = null;
  @SerializedName("categoria")
  private String categoria = null;
  public enum StatusEnum {
     INATIVO,  ATIVO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;

  
  /**
   * {{{faq_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{faq_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{faq_response_pergunta_value}}}
   **/
  @ApiModelProperty(value = "{{{faq_response_pergunta_value}}}")
  public String getPergunta() {
    return pergunta;
  }
  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  
  /**
   * {{{faq_response_resposta_value}}}
   **/
  @ApiModelProperty(value = "{{{faq_response_resposta_value}}}")
  public String getResposta() {
    return resposta;
  }
  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  
  /**
   * {{{faq_response_relevancia_value}}}
   **/
  @ApiModelProperty(value = "{{{faq_response_relevancia_value}}}")
  public Integer getRelevancia() {
    return relevancia;
  }
  public void setRelevancia(Integer relevancia) {
    this.relevancia = relevancia;
  }

  
  /**
   * {{{faq_response_plataforma_value}}}
   **/
  @ApiModelProperty(value = "{{{faq_response_plataforma_value}}}")
  public String getPlataforma() {
    return plataforma;
  }
  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
  }

  
  /**
   * {{{faq_response_categoria_value}}}
   **/
  @ApiModelProperty(value = "{{{faq_response_categoria_value}}}")
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  
  /**
   * {{{faq_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{faq_response_status_value}}}")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaqResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  pergunta: ").append(pergunta).append("\n");
    sb.append("  resposta: ").append(resposta).append("\n");
    sb.append("  relevancia: ").append(relevancia).append("\n");
    sb.append("  plataforma: ").append(plataforma).append("\n");
    sb.append("  categoria: ").append(categoria).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
