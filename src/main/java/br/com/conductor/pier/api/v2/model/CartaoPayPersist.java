package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{cartao_pay_persist_description}}}
 **/
@ApiModel(description = "{{{cartao_pay_persist_description}}}")
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
   * {{{cartao_pay_persist_numero_cartao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{cartao_pay_persist_numero_cartao_value}}}")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{cartao_pay_persist_data_validade_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_pay_persist_data_validade_value}}}")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{cartao_pay_persist_cvv_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_pay_persist_cvv_value}}}")
  public String getCvv() {
    return cvv;
  }
  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  
  /**
   * {{{cartao_pay_persist_numero_receita_federal_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_pay_persist_numero_receita_federal_value}}}")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{cartao_pay_persist_nome_impresso_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_pay_persist_nome_impresso_value}}}")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{cartao_pay_persist_chave_publica_device_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{cartao_pay_persist_chave_publica_device_value}}}")
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
