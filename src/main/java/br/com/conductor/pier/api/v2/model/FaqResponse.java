package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto FAQ
 **/
@ApiModel(description = "Objeto FAQ")
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
   * C\u00F3digo de identifica\u00E7\u00E3o da FAQ (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da FAQ (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Conte\u00FAdo da pergunta
   **/
  @ApiModelProperty(value = "Conte\u00FAdo da pergunta")
  public String getPergunta() {
    return pergunta;
  }
  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  
  /**
   * Conte\u00FAdo da resposta
   **/
  @ApiModelProperty(value = "Conte\u00FAdo da resposta")
  public String getResposta() {
    return resposta;
  }
  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  
  /**
   * N\u00EDvel de relev\u00E2ncia da pergunta
   **/
  @ApiModelProperty(value = "N\u00EDvel de relev\u00E2ncia da pergunta")
  public Integer getRelevancia() {
    return relevancia;
  }
  public void setRelevancia(Integer relevancia) {
    this.relevancia = relevancia;
  }

  
  /**
   * Plataforma em que a FAQ se encaixa
   **/
  @ApiModelProperty(value = "Plataforma em que a FAQ se encaixa")
  public String getPlataforma() {
    return plataforma;
  }
  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
  }

  
  /**
   * Categoria de assunto do qual a FAQ se trata
   **/
  @ApiModelProperty(value = "Categoria de assunto do qual a FAQ se trata")
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  
  /**
   * Status descrevendo a situa\u00E7\u00E3o atual da FAQ
   **/
  @ApiModelProperty(value = "Status descrevendo a situa\u00E7\u00E3o atual da FAQ")
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
