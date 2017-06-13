package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto FAQ
 **/
@ApiModel(description = "Objeto FAQ")
public class FAQ  {
  
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
     ATIVO,  INATIVO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da FAQ (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da FAQ (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Conte\u00C3\u00BAdo da pergunta.
   **/
  @ApiModelProperty(value = "Conte\u00C3\u00BAdo da pergunta.")
  public String getPergunta() {
    return pergunta;
  }
  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  
  /**
   * Conte\u00C3\u00BAdo da resposta.
   **/
  @ApiModelProperty(value = "Conte\u00C3\u00BAdo da resposta.")
  public String getResposta() {
    return resposta;
  }
  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  
  /**
   * N\u00C3\u00ADvel de relev\u00C3\u00A2ncia da pergunta.
   **/
  @ApiModelProperty(value = "N\u00C3\u00ADvel de relev\u00C3\u00A2ncia da pergunta.")
  public Integer getRelevancia() {
    return relevancia;
  }
  public void setRelevancia(Integer relevancia) {
    this.relevancia = relevancia;
  }

  
  /**
   * Plataforma em que a FAQ se encaixa.
   **/
  @ApiModelProperty(value = "Plataforma em que a FAQ se encaixa.")
  public String getPlataforma() {
    return plataforma;
  }
  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
  }

  
  /**
   * Categoria de assunto do qual a FAQ se trata.
   **/
  @ApiModelProperty(value = "Categoria de assunto do qual a FAQ se trata.")
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  
  /**
   * Status descrevendo a situa\u00C3\u00A7\u00C3\u00A3o atual da FAQ.
   **/
  @ApiModelProperty(value = "Status descrevendo a situa\u00C3\u00A7\u00C3\u00A3o atual da FAQ.")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FAQ {\n");
    
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


