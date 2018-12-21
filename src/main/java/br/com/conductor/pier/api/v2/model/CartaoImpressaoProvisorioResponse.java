package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Provisory Card
 **/
@ApiModel(description = "Object Provisory Card")
public class CartaoImpressaoProvisorioResponse  {
  
  @SerializedName("flagVirtual")
  private Integer flagVirtual = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("nomePlastico")
  private String nomePlastico = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * Show the identification code of the account (id) which the created card belongs
   **/
  @ApiModelProperty(value = "Show the identification code of the account (id) which the created card belongs")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Show the Identification Code of the Person (id) cardholder of the card created
   **/
  @ApiModelProperty(value = "Show the Identification Code of the Person (id) cardholder of the card created")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Show the Identification Code of the Card (id) that was created
   **/
  @ApiModelProperty(value = "Show the Identification Code of the Card (id) that was created")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Show the card number
   **/
  @ApiModelProperty(value = "Show the card number")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Show the name of the Cardholder
   **/
  @ApiModelProperty(value = "Show the name of the Cardholder")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * Show the expiration date of the card
   **/
  @ApiModelProperty(value = "Show the expiration date of the card")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoImpressaoProvisorioResponse {\n");
    
    sb.append("  flagVirtual: ").append(flagVirtual).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  nomePlastico: ").append(nomePlastico).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
