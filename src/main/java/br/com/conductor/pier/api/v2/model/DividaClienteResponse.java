package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * D\u00EDvida do cliente
 **/
@ApiModel(description = "D\u00EDvida do cliente")
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
   * C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Data de vencimento da cobran\u00E7a
   **/
  @ApiModelProperty(value = "Data de vencimento da cobran\u00E7a")
  public String getDataVencimentoFaturaAtraso() {
    return dataVencimentoFaturaAtraso;
  }
  public void setDataVencimentoFaturaAtraso(String dataVencimentoFaturaAtraso) {
    this.dataVencimentoFaturaAtraso = dataVencimentoFaturaAtraso;
  }

  
  /**
   * Quantidade de dias em atraso at\u00E9 a data de vencimento da cobran\u00E7a
   **/
  @ApiModelProperty(value = "Quantidade de dias em atraso at\u00E9 a data de vencimento da cobran\u00E7a")
  public Long getQuantidadeDiasAtraso() {
    return quantidadeDiasAtraso;
  }
  public void setQuantidadeDiasAtraso(Long quantidadeDiasAtraso) {
    this.quantidadeDiasAtraso = quantidadeDiasAtraso;
  }

  
  /**
   * Data de vencimento do acordo
   **/
  @ApiModelProperty(value = "Data de vencimento do acordo")
  public String getDataVencimentoAcordo() {
    return dataVencimentoAcordo;
  }
  public void setDataVencimentoAcordo(String dataVencimentoAcordo) {
    this.dataVencimentoAcordo = dataVencimentoAcordo;
  }

  
  /**
   * Quantidade de dias em atraso at\u00E9 a data de vencimento do acordo
   **/
  @ApiModelProperty(value = "Quantidade de dias em atraso at\u00E9 a data de vencimento do acordo")
  public Long getQuantidadeDiasAtrasoCorrigido() {
    return quantidadeDiasAtrasoCorrigido;
  }
  public void setQuantidadeDiasAtrasoCorrigido(Long quantidadeDiasAtrasoCorrigido) {
    this.quantidadeDiasAtrasoCorrigido = quantidadeDiasAtrasoCorrigido;
  }

  
  /**
   * Valor do saldo devedor at\u00E9 a data de vencimento da cobran\u00E7a
   **/
  @ApiModelProperty(value = "Valor do saldo devedor at\u00E9 a data de vencimento da cobran\u00E7a")
  public BigDecimal getValorSaldoDevedor() {
    return valorSaldoDevedor;
  }
  public void setValorSaldoDevedor(BigDecimal valorSaldoDevedor) {
    this.valorSaldoDevedor = valorSaldoDevedor;
  }

  
  /**
   * Percentual de corre\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Percentual de corre\u00E7\u00E3o")
  public BigDecimal getTaxaCorrecao() {
    return taxaCorrecao;
  }
  public void setTaxaCorrecao(BigDecimal taxaCorrecao) {
    this.taxaCorrecao = taxaCorrecao;
  }

  
  /**
   * Valor da corre\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Valor da corre\u00E7\u00E3o")
  public BigDecimal getValorCorrecao() {
    return valorCorrecao;
  }
  public void setValorCorrecao(BigDecimal valorCorrecao) {
    this.valorCorrecao = valorCorrecao;
  }

  
  /**
   * Valor do IOF devido
   **/
  @ApiModelProperty(value = "Valor do IOF devido")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor do saldo devedor corrido da d\u00EDvida at\u00E9 a data de vencimento do acordo
   **/
  @ApiModelProperty(value = "Valor do saldo devedor corrido da d\u00EDvida at\u00E9 a data de vencimento do acordo")
  public BigDecimal getValorSaldoCorrigido() {
    return valorSaldoCorrigido;
  }
  public void setValorSaldoCorrigido(BigDecimal valorSaldoCorrigido) {
    this.valorSaldoCorrigido = valorSaldoCorrigido;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do status da conta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do status da conta (id)")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Descri\u00E7\u00E3o do status da conta
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do status da conta")
  public String getDescricaoStatusConta() {
    return descricaoStatusConta;
  }
  public void setDescricaoStatusConta(String descricaoStatusConta) {
    this.descricaoStatusConta = descricaoStatusConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do status do acordo (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do status do acordo (id)")
  public Long getIdStatusAcordo() {
    return idStatusAcordo;
  }
  public void setIdStatusAcordo(Long idStatusAcordo) {
    this.idStatusAcordo = idStatusAcordo;
  }

  
  /**
   * Descri\u00E7\u00E3o do status do acordo
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do status do acordo")
  public String getDescricaoStatusAcordo() {
    return descricaoStatusAcordo;
  }
  public void setDescricaoStatusAcordo(String descricaoStatusAcordo) {
    this.descricaoStatusAcordo = descricaoStatusAcordo;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do escrit\u00F3rio de cobran\u00E7a
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do escrit\u00F3rio de cobran\u00E7a")
  public Long getIdEscritorioCobranca() {
    return idEscritorioCobranca;
  }
  public void setIdEscritorioCobranca(Long idEscritorioCobranca) {
    this.idEscritorioCobranca = idEscritorioCobranca;
  }

  
  /**
   * Nome do escrit\u00F3rio de cobran\u00E7a
   **/
  @ApiModelProperty(value = "Nome do escrit\u00F3rio de cobran\u00E7a")
  public String getNomeEscritorioCobranca() {
    return nomeEscritorioCobranca;
  }
  public void setNomeEscritorioCobranca(String nomeEscritorioCobranca) {
    this.nomeEscritorioCobranca = nomeEscritorioCobranca;
  }

  
  /**
   * Email do devedor
   **/
  @ApiModelProperty(value = "Email do devedor")
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
