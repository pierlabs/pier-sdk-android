package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso atualizar cart\u00C3\u00A3o
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso atualizar cart\u00C3\u00A3o")
public class CartaoPayPersist  {
  
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("cvv")
  private String cvv = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("chavePublicaDevice")
  private String chavePublicaDevice = null;

  
  /**
   * N\u00C3\u00BAmero do cart\u00C3\u00A3o criptografado
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero do cart\u00C3\u00A3o criptografado")
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
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * CVV do cart\u00C3\u00A3o criptografado
   **/
  @ApiModelProperty(value = "CVV do cart\u00C3\u00A3o criptografado")
  public String getCvv() {
    return cvv;
  }
  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  
  /**
   * CPF do portador do cart\u00C3\u00A3o criptografado
   **/
  @ApiModelProperty(value = "CPF do portador do cart\u00C3\u00A3o criptografado")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
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
   * Chave p\u00C3\u00BAblica do dispositivo criptografada
   **/
  @ApiModelProperty(required = true, value = "Chave p\u00C3\u00BAblica do dispositivo criptografada")
  public String getChavePublicaDevice() {
    return chavePublicaDevice;
  }
  public void setChavePublicaDevice(String chavePublicaDevice) {
    this.chavePublicaDevice = chavePublicaDevice;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoPayPersist {\n");
    
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  cvv: ").append(cvv).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  chavePublicaDevice: ").append(chavePublicaDevice).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
