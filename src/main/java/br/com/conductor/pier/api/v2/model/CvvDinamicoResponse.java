package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta do CVV din\u00E2mico
 **/
@ApiModel(description = "Objeto de resposta do CVV din\u00E2mico")
public class CvvDinamicoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("dataExpiracao")
  private String dataExpiracao = null;
  @SerializedName("dataGeracao")
  private String dataGeracao = null;
  @SerializedName("cvv2")
  private String cvv2 = null;

  
  /**
   * Identificador da entidade
   **/
  @ApiModelProperty(value = "Identificador da entidade")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador do cart\u00E3o
   **/
  @ApiModelProperty(value = "Identificador do cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Data de expira\u00E7\u00E3o do CVV din\u00E2mico
   **/
  @ApiModelProperty(value = "Data de expira\u00E7\u00E3o do CVV din\u00E2mico")
  public String getDataExpiracao() {
    return dataExpiracao;
  }
  public void setDataExpiracao(String dataExpiracao) {
    this.dataExpiracao = dataExpiracao;
  }

  
  /**
   * Data de gera\u00E7\u00E3o do CVV din\u00E2mico
   **/
  @ApiModelProperty(value = "Data de gera\u00E7\u00E3o do CVV din\u00E2mico")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * CVV2
   **/
  @ApiModelProperty(value = "CVV2")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CvvDinamicoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  dataExpiracao: ").append(dataExpiracao).append("\n");
    sb.append("  dataGeracao: ").append(dataGeracao).append("\n");
    sb.append("  cvv2: ").append(cvv2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
