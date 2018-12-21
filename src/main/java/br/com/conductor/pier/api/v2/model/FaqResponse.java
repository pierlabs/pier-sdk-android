package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object FAQ
 **/
@ApiModel(description = "Object FAQ")
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
   * Identification Code of the FAQ (id)
   **/
  @ApiModelProperty(value = "Identification Code of the FAQ (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Content of the question
   **/
  @ApiModelProperty(value = "Content of the question")
  public String getPergunta() {
    return pergunta;
  }
  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  
  /**
   * Content of the question
   **/
  @ApiModelProperty(value = "Content of the question")
  public String getResposta() {
    return resposta;
  }
  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  
  /**
   * Relevance Level of the question
   **/
  @ApiModelProperty(value = "Relevance Level of the question")
  public Integer getRelevancia() {
    return relevancia;
  }
  public void setRelevancia(Integer relevancia) {
    this.relevancia = relevancia;
  }

  
  /**
   * Platform which the FAQ fits
   **/
  @ApiModelProperty(value = "Platform which the FAQ fits")
  public String getPlataforma() {
    return plataforma;
  }
  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
  }

  
  /**
   * Category of the subject which the FAQ refers
   **/
  @ApiModelProperty(value = "Category of the subject which the FAQ refers")
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  
  /**
   * Status describing the current situation of the FAQ
   **/
  @ApiModelProperty(value = "Status describing the current situation of the FAQ")
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
