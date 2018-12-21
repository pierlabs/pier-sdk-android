package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object of Purchase
 **/
@ApiModel(description = "Object of Purchase")
public class CompraResponse  {
  
  @SerializedName("mcc")
  private Long mcc = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("idCompra")
  private Long idCompra = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("valorTotalCompra")
  private BigDecimal valorTotalCompra = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("primeiraParcela")
  private BigDecimal primeiraParcela = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("numeroParcelasAntecipaveis")
  private Integer numeroParcelasAntecipaveis = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("tipoOrigemTransacao")
  private String tipoOrigemTransacao = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("pais")
  private String pais = null;
  @SerializedName("latitude")
  private String latitude = null;
  @SerializedName("longitude")
  private String longitude = null;
  @SerializedName("idGrupoMCC")
  private Long idGrupoMCC = null;
  @SerializedName("descricaoGrupoMCC")
  private String descricaoGrupoMCC = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("descricaoProduto")
  private String descricaoProduto = null;
  @SerializedName("cartao")
  private String cartao = null;
  @SerializedName("nomePortadorCartao")
  private String nomePortadorCartao = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Identification Code of the shop
   **/
  @ApiModelProperty(value = "Identification Code of the shop")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * Description status of the shop authorization
   **/
  @ApiModelProperty(value = "Description status of the shop authorization")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Date of the shop
   **/
  @ApiModelProperty(value = "Date of the shop")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Total value of the shop
   **/
  @ApiModelProperty(value = "Total value of the shop")
  public BigDecimal getValorTotalCompra() {
    return valorTotalCompra;
  }
  public void setValorTotalCompra(BigDecimal valorTotalCompra) {
    this.valorTotalCompra = valorTotalCompra;
  }

  
  /**
   * Parcel value of the shop
   **/
  @ApiModelProperty(value = "Parcel value of the shop")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * First parcel value of the shop
   **/
  @ApiModelProperty(value = "First parcel value of the shop")
  public BigDecimal getPrimeiraParcela() {
    return primeiraParcela;
  }
  public void setPrimeiraParcela(BigDecimal primeiraParcela) {
    this.primeiraParcela = primeiraParcela;
  }

  
  /**
   * Number of parcels of the shop
   **/
  @ApiModelProperty(value = "Number of parcels of the shop")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Number of of the antecipated parcels of the shops
   **/
  @ApiModelProperty(value = "Number of of the antecipated parcels of the shops")
  public Integer getNumeroParcelasAntecipaveis() {
    return numeroParcelasAntecipaveis;
  }
  public void setNumeroParcelasAntecipaveis(Integer numeroParcelasAntecipaveis) {
    this.numeroParcelasAntecipaveis = numeroParcelasAntecipaveis;
  }

  
  /**
   * Establishment name of the shop
   **/
  @ApiModelProperty(value = "Establishment name of the shop")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Type of transaction of the shop
   **/
  @ApiModelProperty(value = "Type of transaction of the shop")
  public String getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(String tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
  }

  
  /**
   * City where the shop was made
   **/
  @ApiModelProperty(value = "City where the shop was made")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * country where the shop was made
   **/
  @ApiModelProperty(value = "country where the shop was made")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Latitudinal Coordinate of the shop location
   **/
  @ApiModelProperty(value = "Latitudinal Coordinate of the shop location")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitudinal Coordinate of the shop location
   **/
  @ApiModelProperty(value = "Longitudinal Coordinate of the shop location")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   * Identification Code of MCC Group of the shop
   **/
  @ApiModelProperty(value = "Identification Code of MCC Group of the shop")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Description of MCC group of the shop
   **/
  @ApiModelProperty(value = "Description of MCC group of the shop")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * Identification Code of the account
   **/
  @ApiModelProperty(value = "Identification Code of the account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the product of purchase
   **/
  @ApiModelProperty(value = "Identification Code of the product of purchase")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Description of the product of purchase
   **/
  @ApiModelProperty(value = "Description of the product of purchase")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * Card number of the shop
   **/
  @ApiModelProperty(value = "Card number of the shop")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   * Cardholder name of the shop
   **/
  @ApiModelProperty(value = "Cardholder name of the shop")
  public String getNomePortadorCartao() {
    return nomePortadorCartao;
  }
  public void setNomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraResponse {\n");
    
    sb.append("  mcc: ").append(mcc).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  idCompra: ").append(idCompra).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  valorTotalCompra: ").append(valorTotalCompra).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  primeiraParcela: ").append(primeiraParcela).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  numeroParcelasAntecipaveis: ").append(numeroParcelasAntecipaveis).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  tipoOrigemTransacao: ").append(tipoOrigemTransacao).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  pais: ").append(pais).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  idGrupoMCC: ").append(idGrupoMCC).append("\n");
    sb.append("  descricaoGrupoMCC: ").append(descricaoGrupoMCC).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  descricaoProduto: ").append(descricaoProduto).append("\n");
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("  nomePortadorCartao: ").append(nomePortadorCartao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
