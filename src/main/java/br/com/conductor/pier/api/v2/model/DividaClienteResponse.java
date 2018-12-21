package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Debt of the client
 **/
@ApiModel(description = "Debt of the client")
public class DividaClienteResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("dataVencimentoFaturaAtraso")
  private String dataVencimentoFaturaAtraso = null;
  @SerializedName("quantidadeDiasAtraso")
  private Long quantidadeDiasAtraso = null;
  @SerializedName("dataVencimentoAcordo")
  private String dataVencimentoAcordo = null;
  @SerializedName("quantidadeDiasAtrasoCorrigido")
  private Long quantidadeDiasAtrasoCorrigido = null;
  @SerializedName("valorSaldoDevedor")
  private BigDecimal valorSaldoDevedor = null;
  @SerializedName("taxaCorrecao")
  private BigDecimal taxaCorrecao = null;
  @SerializedName("valorCorrecao")
  private BigDecimal valorCorrecao = null;
  @SerializedName("valorIOF")
  private BigDecimal valorIOF = null;
  @SerializedName("valorSaldoCorrigido")
  private BigDecimal valorSaldoCorrigido = null;
  @SerializedName("idStatusConta")
  private Long idStatusConta = null;
  @SerializedName("descricaoStatusConta")
  private String descricaoStatusConta = null;
  @SerializedName("idStatusAcordo")
  private Long idStatusAcordo = null;
  @SerializedName("descricaoStatusAcordo")
  private String descricaoStatusAcordo = null;
  @SerializedName("idEscritorioCobranca")
  private Long idEscritorioCobranca = null;
  @SerializedName("nomeEscritorioCobranca")
  private String nomeEscritorioCobranca = null;
  @SerializedName("emailPessoaConta")
  private String emailPessoaConta = null;

  
  /**
   * Identification code of the account (id)
   **/
  @ApiModelProperty(value = "Identification code of the account (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Expiration date of the collection
   **/
  @ApiModelProperty(value = "Expiration date of the collection")
  public String getDataVencimentoFaturaAtraso() {
    return dataVencimentoFaturaAtraso;
  }
  public void setDataVencimentoFaturaAtraso(String dataVencimentoFaturaAtraso) {
    this.dataVencimentoFaturaAtraso = dataVencimentoFaturaAtraso;
  }

  
  /**
   * Quantity of days in delay until the expiration date of the collection
   **/
  @ApiModelProperty(value = "Quantity of days in delay until the expiration date of the collection")
  public Long getQuantidadeDiasAtraso() {
    return quantidadeDiasAtraso;
  }
  public void setQuantidadeDiasAtraso(Long quantidadeDiasAtraso) {
    this.quantidadeDiasAtraso = quantidadeDiasAtraso;
  }

  
  /**
   * Expiration date of the agreement
   **/
  @ApiModelProperty(value = "Expiration date of the agreement")
  public String getDataVencimentoAcordo() {
    return dataVencimentoAcordo;
  }
  public void setDataVencimentoAcordo(String dataVencimentoAcordo) {
    this.dataVencimentoAcordo = dataVencimentoAcordo;
  }

  
  /**
   * Quantity of days in delay until the expiration date of the agreement
   **/
  @ApiModelProperty(value = "Quantity of days in delay until the expiration date of the agreement")
  public Long getQuantidadeDiasAtrasoCorrigido() {
    return quantidadeDiasAtrasoCorrigido;
  }
  public void setQuantidadeDiasAtrasoCorrigido(Long quantidadeDiasAtrasoCorrigido) {
    this.quantidadeDiasAtrasoCorrigido = quantidadeDiasAtrasoCorrigido;
  }

  
  /**
   * Value of the debtor balande until the expiration date of the collection
   **/
  @ApiModelProperty(value = "Value of the debtor balande until the expiration date of the collection")
  public BigDecimal getValorSaldoDevedor() {
    return valorSaldoDevedor;
  }
  public void setValorSaldoDevedor(BigDecimal valorSaldoDevedor) {
    this.valorSaldoDevedor = valorSaldoDevedor;
  }

  
  /**
   * Correction Percentage
   **/
  @ApiModelProperty(value = "Correction Percentage")
  public BigDecimal getTaxaCorrecao() {
    return taxaCorrecao;
  }
  public void setTaxaCorrecao(BigDecimal taxaCorrecao) {
    this.taxaCorrecao = taxaCorrecao;
  }

  
  /**
   * Value of the collection
   **/
  @ApiModelProperty(value = "Value of the collection")
  public BigDecimal getValorCorrecao() {
    return valorCorrecao;
  }
  public void setValorCorrecao(BigDecimal valorCorrecao) {
    this.valorCorrecao = valorCorrecao;
  }

  
  /**
   * Value of the IOF debt
   **/
  @ApiModelProperty(value = "Value of the IOF debt")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Value of the debtor balance of the debt until the expiration date of the agreement
   **/
  @ApiModelProperty(value = "Value of the debtor balance of the debt until the expiration date of the agreement")
  public BigDecimal getValorSaldoCorrigido() {
    return valorSaldoCorrigido;
  }
  public void setValorSaldoCorrigido(BigDecimal valorSaldoCorrigido) {
    this.valorSaldoCorrigido = valorSaldoCorrigido;
  }

  
  /**
   * Identification code of the account status (id)
   **/
  @ApiModelProperty(value = "Identification code of the account status (id)")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Description of the account status
   **/
  @ApiModelProperty(value = "Description of the account status")
  public String getDescricaoStatusConta() {
    return descricaoStatusConta;
  }
  public void setDescricaoStatusConta(String descricaoStatusConta) {
    this.descricaoStatusConta = descricaoStatusConta;
  }

  
  /**
   * Identification Code of the agreement status (id)
   **/
  @ApiModelProperty(value = "Identification Code of the agreement status (id)")
  public Long getIdStatusAcordo() {
    return idStatusAcordo;
  }
  public void setIdStatusAcordo(Long idStatusAcordo) {
    this.idStatusAcordo = idStatusAcordo;
  }

  
  /**
   * Description of the agreement status
   **/
  @ApiModelProperty(value = "Description of the agreement status")
  public String getDescricaoStatusAcordo() {
    return descricaoStatusAcordo;
  }
  public void setDescricaoStatusAcordo(String descricaoStatusAcordo) {
    this.descricaoStatusAcordo = descricaoStatusAcordo;
  }

  
  /**
   * Identification Code of the collection office
   **/
  @ApiModelProperty(value = "Identification Code of the collection office")
  public Long getIdEscritorioCobranca() {
    return idEscritorioCobranca;
  }
  public void setIdEscritorioCobranca(Long idEscritorioCobranca) {
    this.idEscritorioCobranca = idEscritorioCobranca;
  }

  
  /**
   * Office name of the collection
   **/
  @ApiModelProperty(value = "Office name of the collection")
  public String getNomeEscritorioCobranca() {
    return nomeEscritorioCobranca;
  }
  public void setNomeEscritorioCobranca(String nomeEscritorioCobranca) {
    this.nomeEscritorioCobranca = nomeEscritorioCobranca;
  }

  
  /**
   * Email of the debtor
   **/
  @ApiModelProperty(value = "Email of the debtor")
  public String getEmailPessoaConta() {
    return emailPessoaConta;
  }
  public void setEmailPessoaConta(String emailPessoaConta) {
    this.emailPessoaConta = emailPessoaConta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DividaClienteResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  dataVencimentoFaturaAtraso: ").append(dataVencimentoFaturaAtraso).append("\n");
    sb.append("  quantidadeDiasAtraso: ").append(quantidadeDiasAtraso).append("\n");
    sb.append("  dataVencimentoAcordo: ").append(dataVencimentoAcordo).append("\n");
    sb.append("  quantidadeDiasAtrasoCorrigido: ").append(quantidadeDiasAtrasoCorrigido).append("\n");
    sb.append("  valorSaldoDevedor: ").append(valorSaldoDevedor).append("\n");
    sb.append("  taxaCorrecao: ").append(taxaCorrecao).append("\n");
    sb.append("  valorCorrecao: ").append(valorCorrecao).append("\n");
    sb.append("  valorIOF: ").append(valorIOF).append("\n");
    sb.append("  valorSaldoCorrigido: ").append(valorSaldoCorrigido).append("\n");
    sb.append("  idStatusConta: ").append(idStatusConta).append("\n");
    sb.append("  descricaoStatusConta: ").append(descricaoStatusConta).append("\n");
    sb.append("  idStatusAcordo: ").append(idStatusAcordo).append("\n");
    sb.append("  descricaoStatusAcordo: ").append(descricaoStatusAcordo).append("\n");
    sb.append("  idEscritorioCobranca: ").append(idEscritorioCobranca).append("\n");
    sb.append("  nomeEscritorioCobranca: ").append(nomeEscritorioCobranca).append("\n");
    sb.append("  emailPessoaConta: ").append(emailPessoaConta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
