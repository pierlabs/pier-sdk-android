package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Resposta da requisi\u00C3\u00A7\u00C3\u00A3o para confirma\u00C3\u00A7\u00C3\u00A3o da chave de criptograma
 **/
@ApiModel(description = "Resposta da requisi\u00C3\u00A7\u00C3\u00A3o para confirma\u00C3\u00A7\u00C3\u00A3o da chave de criptograma")
public class CartaoPayConfirmarChaveResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("dataValidadeCartao")
  private String dataValidadeCartao = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("idEntidade")
  private Long idEntidade = null;
  @SerializedName("nomeEntidade")
  private String nomeEntidade = null;
  public enum StatusEnum {
     ATIVO,  INATIVO,  BLOQUEADO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("dataValidadeChaveCriptograma")
  private String dataValidadeChaveCriptograma = null;
  @SerializedName("chaveCriptograma")
  private String chaveCriptograma = null;

  
  /**
   * Id do cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Id do cart\u00C3\u00A3o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * N\u00C3\u00BAmero do cart\u00C3\u00A3o real criptografado
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do cart\u00C3\u00A3o real criptografado")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Data de validade do cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Data de validade do cart\u00C3\u00A3o")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * Nome impresso no cart\u00C3\u00A3o criptografado
   **/
  @ApiModelProperty(value = "Nome impresso no cart\u00C3\u00A3o criptografado")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Identificador do emissor do cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Identificador do emissor do cart\u00C3\u00A3o")
  public Long getIdEntidade() {
    return idEntidade;
  }
  public void setIdEntidade(Long idEntidade) {
    this.idEntidade = idEntidade;
  }

  
  /**
   * Nome do emissor do cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Nome do emissor do cart\u00C3\u00A3o")
  public String getNomeEntidade() {
    return nomeEntidade;
  }
  public void setNomeEntidade(String nomeEntidade) {
    this.nomeEntidade = nomeEntidade;
  }

  
  /**
   * Status do cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Status do cart\u00C3\u00A3o")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Data de validade da chave do criptograma
   **/
  @ApiModelProperty(value = "Data de validade da chave do criptograma")
  public String getDataValidadeChaveCriptograma() {
    return dataValidadeChaveCriptograma;
  }
  public void setDataValidadeChaveCriptograma(String dataValidadeChaveCriptograma) {
    this.dataValidadeChaveCriptograma = dataValidadeChaveCriptograma;
  }

  
  /**
   * Chave de gera\u00C3\u00A7\u00C3\u00A3o de transa\u00C3\u00A7\u00C3\u00A3o criptografada
   **/
  @ApiModelProperty(value = "Chave de gera\u00C3\u00A7\u00C3\u00A3o de transa\u00C3\u00A7\u00C3\u00A3o criptografada")
  public String getChaveCriptograma() {
    return chaveCriptograma;
  }
  public void setChaveCriptograma(String chaveCriptograma) {
    this.chaveCriptograma = chaveCriptograma;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoPayConfirmarChaveResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  dataValidadeCartao: ").append(dataValidadeCartao).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  idEntidade: ").append(idEntidade).append("\n");
    sb.append("  nomeEntidade: ").append(nomeEntidade).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataValidadeChaveCriptograma: ").append(dataValidadeChaveCriptograma).append("\n");
    sb.append("  chaveCriptograma: ").append(chaveCriptograma).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


