package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the TypeOperation Resource
 **/
@ApiModel(description = "Response Representation of the TypeOperation Resource")
public class TipoOperacaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("tipoOperacao")
  private String tipoOperacao = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("excedentePermitido")
  private BigDecimal excedentePermitido = null;
  @SerializedName("tipoExcedentePermitido")
  private String tipoExcedentePermitido = null;
  @SerializedName("valorMinimo")
  private BigDecimal valorMinimo = null;
  @SerializedName("valorMaximo")
  private BigDecimal valorMaximo = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;
  @SerializedName("flagTiraTac")
  private Integer flagTiraTac = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("tarifa")
  private BigDecimal tarifa = null;
  @SerializedName("remuneracaoEmissor")
  private BigDecimal remuneracaoEmissor = null;
  @SerializedName("planoMaximo")
  private Integer planoMaximo = null;
  @SerializedName("planoMinimo")
  private Integer planoMinimo = null;

  
  /**
   * Identifier Code of the OperationType
   **/
  @ApiModelProperty(required = true, value = "Identifier Code of the OperationType")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * OperationType Code
   **/
  @ApiModelProperty(required = true, value = "OperationType Code")
  public String getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   * Name of the Operationtype
   **/
  @ApiModelProperty(required = true, value = "Name of the Operationtype")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Decri??o of the OperationType
   **/
  @ApiModelProperty(required = true, value = "Decri??o of the OperationType")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Exceed allowed for the TypeOperation
   **/
  @ApiModelProperty(value = "Exceed allowed for the TypeOperation")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   * Type of the allowed exceeded for the OperationType
   **/
  @ApiModelProperty(value = "Type of the allowed exceeded for the OperationType")
  public String getTipoExcedentePermitido() {
    return tipoExcedentePermitido;
  }
  public void setTipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
  }

  
  /**
   * Minimum value for the transaction of OperationType
   **/
  @ApiModelProperty(required = true, value = "Minimum value for the transaction of OperationType")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * Maximum valuie for the transaction of the OperationType
   **/
  @ApiModelProperty(required = true, value = "Maximum valuie for the transaction of the OperationType")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * TAC value of the transaction of OperationType
   **/
  @ApiModelProperty(value = "TAC value of the transaction of OperationType")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Flag stripe TAC of the OperationType
   **/
  @ApiModelProperty(value = "Flag stripe TAC of the OperationType")
  public Integer getFlagTiraTac() {
    return flagTiraTac;
  }
  public void setFlagTiraTac(Integer flagTiraTac) {
    this.flagTiraTac = flagTiraTac;
  }

  
  /**
   * Identifier of the TypeOperation of Product
   **/
  @ApiModelProperty(required = true, value = "Identifier of the TypeOperation of Product")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identifier of the Merchant of OperationType
   **/
  @ApiModelProperty(required = true, value = "Identifier of the Merchant of OperationType")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * OperationType fee
   **/
  @ApiModelProperty(value = "OperationType fee")
  public BigDecimal getTarifa() {
    return tarifa;
  }
  public void setTarifa(BigDecimal tarifa) {
    this.tarifa = tarifa;
  }

  
  /**
   * Remunaration of the Issuer for the OperatioType
   **/
  @ApiModelProperty(value = "Remunaration of the Issuer for the OperatioType")
  public BigDecimal getRemuneracaoEmissor() {
    return remuneracaoEmissor;
  }
  public void setRemuneracaoEmissor(BigDecimal remuneracaoEmissor) {
    this.remuneracaoEmissor = remuneracaoEmissor;
  }

  
  /**
   * Maximum Plan of the OperationType
   **/
  @ApiModelProperty(required = true, value = "Maximum Plan of the OperationType")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * Minimum Plan of the OperationType
   **/
  @ApiModelProperty(required = true, value = "Minimum Plan of the OperationType")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOperacaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  tipoOperacao: ").append(tipoOperacao).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  excedentePermitido: ").append(excedentePermitido).append("\n");
    sb.append("  tipoExcedentePermitido: ").append(tipoExcedentePermitido).append("\n");
    sb.append("  valorMinimo: ").append(valorMinimo).append("\n");
    sb.append("  valorMaximo: ").append(valorMaximo).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("  flagTiraTac: ").append(flagTiraTac).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  tarifa: ").append(tarifa).append("\n");
    sb.append("  remuneracaoEmissor: ").append(remuneracaoEmissor).append("\n");
    sb.append("  planoMaximo: ").append(planoMaximo).append("\n");
    sb.append("  planoMinimo: ").append(planoMinimo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
